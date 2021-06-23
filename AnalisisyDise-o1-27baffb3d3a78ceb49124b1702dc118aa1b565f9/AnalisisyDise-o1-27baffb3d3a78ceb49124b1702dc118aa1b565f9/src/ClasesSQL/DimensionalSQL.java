/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesSQL;

import Conexion.ConexionBD;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Toshiba
 */
public class DimensionalSQL {

    ConexionBD Conexion = new ConexionBD();

    public void Insertar(String dimensional) {
        try {
            try (Statement statement = (Statement) Conexion.getConnection().createStatement()) {
                statement.execute("INSERT INTO dimensional(Dimensional) VALUES('" + dimensional + "')");
                JOptionPane.showMessageDialog(null, "DIMENSIONAL añedida a la lista");
            }
            Conexion.getConnection().close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO AGREGAR EL USUARIO");
        }
    }
}
