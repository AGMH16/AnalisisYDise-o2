/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesSQL;

import javax.swing.table.DefaultTableModel;
import Conexion.ConexionBD;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author jenif
 */
public class LibretaClienteSQL {

Connection connection = ConexionBD.getConnection();
    public void InsertarLibretaCliente(String nombre, String apellido, String celular, String telefono, String direccion) {
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                statement.execute("INSERT INTO libretacliente(Nombre, Apellido, Celular, Telefono, Direccion) VALUES ('" + nombre + "','" + apellido + "','" + celular + "','" + telefono + "','" + direccion + "')");
                JOptionPane.showMessageDialog(null, "Cliente añedida a la lista");
            }
            connection.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO AGREGAR CLIENTE");
            System.out.println(e);
        }
    }

    public void EliminarLibretaCliente(int nocliente) {
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                statement.execute("DELETE FROM libretacliente WHERE NoCliente=('" + nocliente + "')");
                JOptionPane.showMessageDialog(null, "Cliente eliminado");
            }
            connection.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO ELIMINAR CLIENTE");
        }
    }
    public void ActualizarLibreta( int noCliente, String nombre, String apellido, String celular, String telefono, String direccion) throws SQLException {

        try (CallableStatement cstmt = connection.prepareCall("{call mydb.ActualizarLibreta(?,?,?,?,?,?)}");) {
            cstmt.setInt(1, noCliente);
            cstmt.setString(2, nombre);
            cstmt.setString(3, apellido);
            cstmt.setString(4, celular);
            cstmt.setString(5, telefono);
            cstmt.setString(6, direccion);
            cstmt.execute();
            JOptionPane.showMessageDialog(null, "Actualizo de forma correcta");

        } catch (SQLException ex) {
            Logger.getLogger(LibretaClienteSQL.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
    }

    public int BuscarClientePorTelefono(JTextField NombreClientetxt, JTextField ApellidoClientetxt, JTextField CelularClientetxt, JTextField TelefonoClientetxt, JTextField DireccionClientetxt, String telefonoReferencia) {
        int NoCliente = 0;
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                ResultSet clr = statement.executeQuery("select NoCliente, Nombre, Apellido, Celular, Telefono, Direccion from libretacliente");
                while (clr.next()) {
                    NoCliente = clr.getInt("NoCliente");
                    String nombre = clr.getString("Nombre");
                    String apellido = clr.getString("Apellido");
                    String celular = clr.getString("Celular");
                    String telefono = clr.getString("Telefono");
                    String direccion = clr.getString("Direccion");

                    if (telefonoReferencia.equals(telefono)) {
                        NombreClientetxt.setText(nombre);
                        ApellidoClientetxt.setText(apellido);
                        CelularClientetxt.setText(celular);
                        TelefonoClientetxt.setText(telefono);
                        DireccionClientetxt.setText(direccion);

                    }
                }
            }
            //Conexion.getConnection().close();
        } catch (Exception e) {
        }

        return NoCliente;
    }

    public int BuscarClientePorCelular(JTextField NombreClientetxt, JTextField ApellidoClientetxt, JTextField CelularClientetxt, JTextField TelefonoClientetxt, JTextField DireccionClientetxt, String celularReferencia) {
        int NoCliente = 0;
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                ResultSet clr = statement.executeQuery("select NoCliente, Nombre, Apellido, Celular, Telefono, Direccion from libretacliente;");
                while (clr.next()) {
                    NoCliente = clr.getInt("NoCliente");
                    String nombre = clr.getString("Nombre");
                    String apellido = clr.getString("Apellido");
                    String celular = clr.getString("Celular");
                    String telefono = clr.getString("Telefono");
                    String direccion = clr.getString("Direccion");

                    if (celularReferencia.equals(celular)) {
                        NombreClientetxt.setText(nombre);
                        ApellidoClientetxt.setText(apellido);
                        CelularClientetxt.setText(celular);
                        TelefonoClientetxt.setText(telefono);
                        DireccionClientetxt.setText(direccion);

                    }
                }
            }
           // Conexion.getConnection().close();
        } catch (Exception e) {
        }

        return NoCliente;
    }

    public void Buscar(JTable jTable) {
        
        String sql = "select Nombre, Apellido, Celular, Telefono, Direccion from libretacliente";
        Statement st;
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("Celular");
        model.addColumn("Telefono");
        jTable.setModel(model);

        String[] dato = new String[5];
        try {

            st = connection.createStatement();
            ResultSet result = st.executeQuery(sql);
            while (result.next()) {
                dato[0] = result.getString(1);
                dato[1] = result.getString(2);
                dato[2] = result.getString(3);
                dato[3] = result.getString(4);
                dato[4] = result.getString(5);
                model.addRow(dato);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LibretaClienteSQL.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
    }
}
