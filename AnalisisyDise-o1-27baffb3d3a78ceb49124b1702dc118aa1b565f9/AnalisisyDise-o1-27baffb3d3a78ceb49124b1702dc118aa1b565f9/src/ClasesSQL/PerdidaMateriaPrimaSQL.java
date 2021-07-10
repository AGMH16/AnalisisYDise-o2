/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesSQL;

import Conexion.ConexionBD;
import Clases.PerdidaMateriaPrima;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Toshiba
 */
public class PerdidaMateriaPrimaSQL {

    Connection connection = ConexionBD.getConnection();

    public void InsertarPerdidaMateriaPrima(PerdidaMateriaPrima Datos) {
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                statement.execute("INSERT INTO perdidamateriaprima(Muerto,Enfermo,EnObservacion,UnidadAfectada,Fecha,DetallePerdida) VALUES ('" + Datos.isMuerto() + "','" + Datos.isEnfermo()+ "','" + Datos.isEnObservacion() + "','" + Datos.getUnidadesAfectadas() + "','" + Datos.getFecha() + "','" + Datos.getDetallePerdida() + "')");
                
                JOptionPane.showMessageDialog(null, "Perdida añadida a la lista");
            }
            connection.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO AGREGAR AL PROVEEDOR");
        }
    }
}
