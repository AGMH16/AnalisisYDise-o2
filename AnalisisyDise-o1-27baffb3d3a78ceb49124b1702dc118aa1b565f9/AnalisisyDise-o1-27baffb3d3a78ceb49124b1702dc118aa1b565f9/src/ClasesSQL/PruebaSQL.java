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
    String LoteAverio2 = "";
    int val, unidadExistente2;

    public String getLoteAverio2() {
        return LoteAverio2;
    }

    public void setLoteAverio2(String LoteAverio2) {
        this.LoteAverio2 = LoteAverio2;
    }

    public int getUnidadExistente2() {
        return unidadExistente2;
    }

    public void setUnidadExistente2(int unidadExistente2) {
        this.unidadExistente2 = unidadExistente2;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
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

    public String LotePollo(String LoteAverio2) {
        String LoteAverio = "";
        int unidadExistente = 0;
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                ResultSet clr = statement.executeQuery("select LoteAverio,UnidadExistente from lotepollo");
                while (clr.next()) {
                    LoteAverio = clr.getString("LoteAverio");
                    unidadExistente = clr.getInt("UnidadExistente");

                    if ((LoteAverio2.equals(LoteAverio))) {
                        System.out.println("LOTES IGUALES!");
                        LoteAverio2 = LoteAverio;
                        unidadExistente2 = unidadExistente;
                        System.out.println("Var a usar"+LoteAverio2);
                        System.out.println("Var a usar"+unidadExistente2);
                    }

                }
            }
            //Conexion.getConnection().close();
        } catch (Exception e) {
        }
        return LoteAverio;
    }

}
