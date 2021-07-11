/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesSQL;

import Conexion.ConexionBD;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Toshiba
 */
public class UpdateMateriaPrimaSQL {

    Connection connection = ConexionBD.getConnection();

    public void ActualizarExistenciasDeMateriaPrima(int ExistenciasActualizadas, String codigo) {
        try {
            Statement consulta = connection.createStatement(); //Objeto para las consultas
            consulta.executeUpdate("UPDATE lotepollo set UnidadExistente = '"+ExistenciasActualizadas+"'WHERE LoteAverio ='"+codigo+"'");//Consulta
            JOptionPane.showMessageDialog(null, "Materia prima ACTUALIZADA en existencias");

           // connection.close();
        } catch (Exception e) {
            System.out.println("actualizar "+e);
            JOptionPane.showMessageDialog(null, "NO SE PUDO ACTUALIZAR LA MATERIA PRIMA");
        }
    }
}
