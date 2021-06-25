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
public class LibretaClienteSQL {
     ConexionBD Conexion = new ConexionBD();
    public void InsertarLibretaCliente(String nombre, String apellido,String celular,String telefono, String direccion) {
        try {
            try (Statement statement = (Statement) Conexion.getConnection().createStatement()) {
                statement.execute("INSERT INTO libretacliente(Nombre, Apellido, Celular, Telefono, Direccion) VALUES ('" + nombre + "','" + apellido + "','" + celular + "','" + telefono + "',,'" + direccion + "')");
                JOptionPane.showMessageDialog(null, "Cliente añedida a la lista");
            }
            Conexion.getConnection().close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO AGREGAR CLIENTE");
        }
    }
    
    public void EliminarLibretaCliente(String nombre, String apellido,String celular,String telefono, String direccion) {
        try {
            try (Statement statement = (Statement) Conexion.getConnection().createStatement()) {
                statement.execute("INSERT INTO libretacliente(Nombre, Apellido, Celular, Telefono, Direccion) VALUES ('" + nombre + "','" + apellido + "','" + celular + "','" + telefono + "',,'" + direccion + "')");
                JOptionPane.showMessageDialog(null, "Cliente añedida a la lista");
            }
            Conexion.getConnection().close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO AGREGAR CLIENTE");
        }
    }
}
