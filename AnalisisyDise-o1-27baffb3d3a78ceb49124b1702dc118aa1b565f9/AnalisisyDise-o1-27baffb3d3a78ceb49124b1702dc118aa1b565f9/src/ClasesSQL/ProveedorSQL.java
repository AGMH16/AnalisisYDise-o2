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
 * @author jenif
 */
public class ProveedorSQL {
     ConexionBD Conexion = new ConexionBD();
      public void InsertarProveedor(String nombre, String direccion, String telefono, String empresa) {
        try {
            try (Statement statement = (Statement) Conexion.getConnection().createStatement()) {
                statement.execute("INSERT INTO proveedor(Nombre, Direccion, Telefono,Empresa) VALUES ('" + nombre + "','" + direccion + "','" + telefono + "','" + empresa + "')");
                JOptionPane.showMessageDialog(null, "Proveedor añedido a la lista");
            }
            Conexion.getConnection().close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO AGREGAR AL PROVEEDOR");
        }
    }
      
      //DELETE FROM proveedor WHERE Empresa='Pollo Feliz';
      public void DeleteProveedor(String empresa) {
        try {
            try (Statement statement = (Statement) Conexion.getConnection().createStatement()) {
                statement.execute("DELETE FROM proveedor WHERE Empresa=('" + empresa + "')");
                JOptionPane.showMessageDialog(null, "Proveedor añedido a la lista");
            }
            Conexion.getConnection().close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO AGREGAR AL PROVEEDOR");
        }
    }
}
