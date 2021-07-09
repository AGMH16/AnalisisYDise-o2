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
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author jenif
 */
public class InventarioSQL {
    Connection connection = ConexionBD.getConnection();
     public void InsertarInventario(String nombre,int existencia,String fechaIngreso,int total,int Dimensional_idDimensional,int intUsuario_idUsuario) {
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                statement.execute("INSERT INTO insumouso(Nombre,Existencia,FechaIngreso,Total,Dimensional_idDimensional,Usuario_idUsuario) VALUES ('" + nombre + "'," + existencia + ",'" + fechaIngreso + "'," + total + "," + Dimensional_idDimensional + "," + intUsuario_idUsuario + ")");
                JOptionPane.showMessageDialog(null, "Insumo añedida a la lista");
            }
            connection.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO AGREGAR ESTE INSUMO");
        }
    }

}
