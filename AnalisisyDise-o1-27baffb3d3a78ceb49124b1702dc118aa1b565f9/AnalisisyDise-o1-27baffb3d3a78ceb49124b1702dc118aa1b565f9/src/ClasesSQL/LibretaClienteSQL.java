/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesSQL;

import Conexion.ConexionBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author jenif
 */
public class LibretaClienteSQL {

    ConexionBD Conexion = new ConexionBD();

    public void InsertarLibretaCliente(String nombre, String apellido, String celular, String telefono, String direccion) {
        try {
            try (Statement statement = (Statement) Conexion.getConnection().createStatement()) {
                statement.execute("INSERT INTO libretacliente(Nombre, Apellido, Celular, Telefono, Direccion) VALUES ('" + nombre + "','" + apellido + "','" + celular + "','" + telefono + "','" + direccion + "')");
                JOptionPane.showMessageDialog(null, "Cliente añedida a la lista");
            }
            Conexion.getConnection().close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO AGREGAR CLIENTE");
            System.out.println(e);
        }
    }

    public void EliminarLibretaCliente(int nocliente) {
        try {
            try (Statement statement = (Statement) Conexion.getConnection().createStatement()) {
                statement.execute("DELETE FROM libretacliente WHERE NoCliente=('" + nocliente+ "')");
                JOptionPane.showMessageDialog(null, "Cliente eliminado");
            }
            Conexion.getConnection().close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO ELIMINAR CLIENTE");
        }
    }

    public int BuscarClientePorTelefono(JTextField NombreClientetxt, JTextField ApellidoClientetxt, JTextField CelularClientetxt, JTextField TelefonoClientetxt, JTextField DireccionClientetxt, String telefonoReferencia) {
        int NoCliente = 0;
        try {
            try (Statement statement = (Statement) Conexion.getConnection().createStatement()) {
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
            Conexion.getConnection().close();
        } catch (Exception e) {
        }

        return NoCliente;
    }

    

    public int BuscarClientePorCelular(JTextField NombreClientetxt, JTextField ApellidoClientetxt, JTextField CelularClientetxt, JTextField TelefonoClientetxt, JTextField DireccionClientetxt, String celularReferencia) {
        int NoCliente = 0;
        try {
            try (Statement statement = (Statement) Conexion.getConnection().createStatement()) {
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
            Conexion.getConnection().close();
        } catch (Exception e) {
        }

        return NoCliente;
    }
}
