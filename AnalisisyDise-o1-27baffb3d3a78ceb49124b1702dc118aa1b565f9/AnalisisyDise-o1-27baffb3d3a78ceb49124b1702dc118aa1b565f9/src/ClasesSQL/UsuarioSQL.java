/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesSQL;

import Conexion.ConexionBD;
import java.sql.ResultSet;
import java.sql.Statement;
import javafx.scene.control.RadioButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author jenif
 */
public class UsuarioSQL {

    ConexionBD Conexion = new ConexionBD();

    public void InsertarUsuario(boolean supervisor, String usuario, String contraseña, String puesto, String correoElectronico) {
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

    public int BuscarUsuarioPorCorreo(RadioButton Supervisorrb, JTextField Usuariotxt, JTextField PuestoLaboraltxt, JTextField Correotxt, JTextField correoReferencia) {
        int IdUsuario = 0;
        try {
            try (Statement statement = (Statement) Conexion.getConnection().createStatement()) {
                ResultSet clr = statement.executeQuery("select idUsuario, Supervisor,Usuario,Puesto,CorreoElectronico from usuario");
                while (clr.next()) {
                    IdUsuario = clr.getInt("idUsuario");
                    boolean supervisor = clr.getBoolean("Supervisor");
                    String usuario = clr.getString("Usuario");
                    String puesto = clr.getString("Puesto");
                    String correoElectronico = clr.getString("CorreoElectronico");

                    if (correoReferencia.equals(correoElectronico)) {
                        //Supervisorrb.set

                        Usuariotxt.setText(usuario);
                        PuestoLaboraltxt.setText(puesto);
                        Correotxt.setText(correoElectronico);
                    }
                }
            }
            Conexion.getConnection().close();
        } catch (Exception e) {
        }

        return IdUsuario;
    }
}
