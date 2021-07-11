/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesSQL;

import Clases.Usuario;
import Conexion.ConexionBD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javafx.scene.control.RadioButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author jenif
 */
public class UsuarioSQL {

     Connection connection = ConexionBD.getConnection();

    public void InsertarUsuario(String nombre, String apellido, boolean supervisor, String usuario, String contraseña, String puesto, String correoElectronico) {
        try {
            //insert into usuario(Nombre,Apellido,Supervisor,Usuario,Contraseña,Puesto,CorreoElectronico) values('Jenifer','Rabanales',0, 'jenirg','1234','Gerente','jeniferrabanales99@gmail.com');
            try (Statement statement = (Statement) connection.createStatement()) {
                statement.execute("insert into usuario(Nombre,Apellido,Supervisor,Usuario,Contraseña,Puesto,CorreoElectronico) values('" + nombre + "','" + apellido + "','" + supervisor + "','" + usuario + "','" + contraseña + "','"+puesto+ "','" + correoElectronico + "')");
                JOptionPane.showMessageDialog(null, "Usuario registrado");
            }
            connection.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO REGISTRAR EL USUARIO");
        }
    }

    //DELETE FROM usuario WHERE CorreoElectronico='JFFSDFDS';
    public void DeleteUsuario(String correoElectronico) {
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                statement.execute("DELETE FROM usuario WHERE CorreoElectronico=('" + correoElectronico + "')");
                JOptionPane.showMessageDialog(null, "Usuario elimanado");
            }
            connection.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO ELIMINAR EL USUARIO");
            System.out.println("Error:" + e);
        }
    }

    public int BuscarUsuarioPorCorreo(JTextField NombreColaboradortxt, JTextField ApellidoColaboradortxt, JTextField Usuariotxt, JComboBox PuestoLaboraltxt, JTextField Correotxt, String correoReferencia) {
        int IdUsuario = 0;
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                ResultSet clr = statement.executeQuery("select idUsuario, Nombre, Apellido,Usuario,Puesto,CorreoElectronico from usuario WHERE CorreoElectronico=('" + correoReferencia + "')");
                while (clr.next()) {
                    IdUsuario = clr.getInt("idUsuario");
                    String nombre = clr.getString("Nombre");
                    String apellido = clr.getString("Apelldio");
                    //  boolean supervisor = clr.getBoolean("Supervisor");
                    String usuario = clr.getString("Usuario");
                    String puesto = clr.getString("Puesto");
                    String correoElectronico = clr.getString("CorreoElectronico");

                    if (correoReferencia.equals(correoElectronico)) {
                        //Supervisorrb.set
                        NombreColaboradortxt.setText(nombre);
                        ApellidoColaboradortxt.setText(apellido);
                        Usuariotxt.setText(usuario);
                        PuestoLaboraltxt.setSelectedItem(puesto);
                        Correotxt.setText(correoElectronico);
                    }
                }
            }
            connection.close();
        } catch (Exception e) {
        }

        return IdUsuario;
    }

    public ArrayList<Usuario> BuscarUsuario() {
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                ResultSet clr = statement.executeQuery("select * from usuario");
                while (clr.next()) {
                    Usuario usuario = new Usuario();
                    usuario.setIdUsuario(clr.getInt("idUsuario"));
                    usuario.setNombre(clr.getString("Nombre"));
                    usuario.setApellido(clr.getString("Apellido"));
                    usuario.setSupervisor(clr.getBoolean("Supervisor"));
                    usuario.setUsuario(clr.getString("Usuario"));
                    usuario.setContraseña(clr.getString("Contraseña"));
                    usuario.setPuesto(clr.getString("Puesto"));
                    usuario.setCorreoElectronico(clr.getString("CorreoElectronico"));
                    usuarios.add(usuario);
                }
            }
            connection.close();
        } catch (Exception e) {
        }

        return usuarios;
    }
     public String ComparacioConOtroUsuarios(String usuario) {
        String Usuario="";
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                ResultSet clr = statement.executeQuery("SELECT Usuario from usuario");
                while (clr.next()) {
                    Usuario = clr.getString("Usuario");

                    if ((usuario.equals(Usuario))) {
                        JOptionPane.showMessageDialog(null, "Este usuario ya esta en uso, pruebe con otro");
                        

                    }
                }
            }
            //Conexion.getConnection().close();
        } catch (Exception e) {
        }

        return Usuario;
    }

}
