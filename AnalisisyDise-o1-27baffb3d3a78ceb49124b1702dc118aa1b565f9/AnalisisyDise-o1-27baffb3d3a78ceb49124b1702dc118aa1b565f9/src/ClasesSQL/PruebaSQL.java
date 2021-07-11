/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesSQL;

import Clases.Proveedor;
import Clases.MateriaPrima;
import Conexion.ConexionBD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jenif
 */
public class PruebaSQL {

    Connection connection = ConexionBD.getConnection();
    int val;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public void Buscar(JTable jTable) {
        String sql = "SELECT LoteAverio, UnidadExistente, FechaIngreso FROM lotepollo";
        Statement st;
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("LoteAverio");
        model.addColumn("UnidadExistente");
        model.addColumn("FechaIngreso");
        jTable.setModel(model);

        String[] dato = new String[3];
        try {

            st = connection.createStatement();
            ResultSet result = st.executeQuery(sql);
            while (result.next()) {
                dato[0] = result.getString(1);
                dato[1] = result.getString(2);
                dato[2] = result.getString(3);

                model.addRow(dato);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MateriaPrima.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
    }

   


    public int BuscarUsuario(String usuario, String contraseña) {
        int IdUsuario = 0;
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                ResultSet clr = statement.executeQuery("SELECT idUsuario,Usuario, Contraseña from usuario");
                while (clr.next()) {
                    IdUsuario = clr.getInt("idUsuario");
                    String Usuario = clr.getString("Usuario");
                    String Contraseña = clr.getString("Contraseña");

                    if ((usuario.equals(Usuario))) {

                        val = IdUsuario;
                        System.out.println(val);

                    }
                }
            }
            //Conexion.getConnection().close();
        } catch (Exception e) {
        }

        return IdUsuario;
    }
    
   
 
}
