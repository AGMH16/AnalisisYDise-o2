/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesSQL;

import Conexion.ConexionBD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Toshiba
 */
public class DimensionalSQL {

   Connection connection = ConexionBD.getConnection();

    public void InsertarDimensional(String dimensional) {
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                statement.execute("INSERT INTO dimensional(Dimensional) VALUES('" + dimensional + "')");
                JOptionPane.showMessageDialog(null, "Dimensional añedida a la lista");
            }
            connection.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO AGREGAR DIMENSIONAL");
        }
    }

    // //DELETE FROM dimensional WHERE Dimensional="Libras";
    public void EliminarDimensional(String dimensional) {
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                statement.execute("DELETE FROM dimensional WHERE dimensional=('" + dimensional + "')");
                JOptionPane.showMessageDialog(null, "DIMENSIONAL eliminada de la lista");
            }
            connection.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO ELIMINAR DIMENSIONAL");
        }
    }

//select idDimensional, Dimensional from dimensional;
    public int BuscarDimensional(JComboBox Dimensionaljcmb, String nombreDimensional) {
        int id = 0;
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                ResultSet clr = statement.executeQuery("select idDimensional,Dimensional from libreta");
                while (clr.next()) {
                    id = clr.getInt("idDimensional");
                    String dimensional1 = clr.getString("Dimensional");

                    if (nombreDimensional.equals(dimensional1)) {
                        Dimensionaljcmb.setToolTipText(dimensional1);

                    }
                }

            }
            connection.close();
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "NO SE PUDO ELIMINAR DIMENSIONAL");
        }

        return id;
    }

}
