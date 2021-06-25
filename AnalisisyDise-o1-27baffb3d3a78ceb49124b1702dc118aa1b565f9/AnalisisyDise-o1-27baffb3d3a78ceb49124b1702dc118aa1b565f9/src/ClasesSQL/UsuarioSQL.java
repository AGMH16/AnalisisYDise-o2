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
public class UsuarioSQL {
        ConexionBD Conexion = new ConexionBD();
        
        public void InsertarUsuario(boolean supervisor,String usuario, String contraseña,String puesto,String correoElectronico) {
        try {
            try (Statement statement = (Statement) Conexion.getConnection().createStatement()) {
                statement.execute("usuario(Supervisor,Usuario,Contraseña,Puesto,CorreoElectronico) values(" + supervisor + ",'" + usuario + "','" + contraseña + "','" + correoElectronico + "')");
                JOptionPane.showMessageDialog(null, "Usuario registrado");
            }
            Conexion.getConnection().close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO REGISTRAR EL USUARIO");
        }
    }
       
        //DELETE FROM usuario WHERE CorreoElectronico='JFFSDFDS';
         public void DeleteUsuario(String correoElectronico) {
        try {
            try (Statement statement = (Statement) Conexion.getConnection().createStatement()) {
                statement.execute("DELETE FROM usuario WHERE CorreoElectronico=('" + correoElectronico + "')");
                JOptionPane.showMessageDialog(null, "Usuario elimanado");
            }
            Conexion.getConnection().close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO ELIMINAR EL USUARIO");
        }
    }
        
}
