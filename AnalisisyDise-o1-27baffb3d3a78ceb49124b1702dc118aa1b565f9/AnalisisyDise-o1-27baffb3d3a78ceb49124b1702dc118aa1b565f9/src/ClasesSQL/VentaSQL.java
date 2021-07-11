/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesSQL;
import javax.swing.table.DefaultTableModel;
import Conexion.ConexionBD;
import java.util.Date;
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
public class VentaSQL {
    Connection connection = ConexionBD.getConnection();

    public void InsertarVenta(boolean adomicilio,boolean puntoVenta,String producto, int cantidad,float total,  String fecha,int usuario_idUsuario ) {
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                statement.execute("INSERT INTO venta (Adomicilio,PuntoVenta,Producto,Cantidad,Total,Fecha,Usuario_idUsuario) VALUES ('" + adomicilio + "','" + puntoVenta + "','" + producto + "'," + cantidad + "," + total + ",'" + fecha + "'," +usuario_idUsuario + ")");
                JOptionPane.showMessageDialog(null, "Venta añedida a la lista");
            }
          //  connection.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO AGREGAR ESTA VENTA");
            System.out.println(e);
        }
    }
}
