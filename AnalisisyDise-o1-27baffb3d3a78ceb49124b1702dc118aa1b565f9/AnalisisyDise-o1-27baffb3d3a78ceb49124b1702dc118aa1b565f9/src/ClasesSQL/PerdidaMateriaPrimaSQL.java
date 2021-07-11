/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesSQL;

import Clases.MovimientoLotePerdida;
import Conexion.ConexionBD;
import Clases.PerdidaMateriaPrima;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
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
                statement.execute("INSERT INTO perdidamateriaprima(Muerto,Enfermo,EnObservacion,UnidadAfectada,Fecha,DetallePerdida) VALUES ('" + Datos.isMuerto() + "','" + Datos.isEnfermo() + "','" + Datos.isEnObservacion() + "'," + Datos.getUnidadesAfectadas() + ",'" + Datos.getFecha() + "','" + Datos.getDetallePerdida() + "')");

                JOptionPane.showMessageDialog(null, "Perdida añadida a la lista");
            }
          //  connection.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO AGREGAR AL PROVEEDOR");
        }
    }

    public void InsertarPerdidaMovimientoLote(MovimientoLotePerdida Datos) {
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                statement.execute("INSERT INTO movimientolote(PerdidaMateriaPrima,PerdidaMateriaPrima_idPerdidaMateriaPrima,LotePollo_LoteAverio) VALUES ('" + Datos.isPerdidaMateriaPrima() + "','" + Datos.getCodigoperdidaMateriaPrima().getIdPerdidaMateriaPrima() + "','" + Datos.getCodigolotePollo().getLoteAverio() + "')");
                // statement.execute("INSERT INTO movimientolote(PerdidaMateriaPrima,PerdidaRecuperada,CantidadRecuperada,FechaRecuperacion,LotePollo_LoteAverio,PerdidaMateriaPrima_idPerdidaMateriaPrima) VALUES ('" + Datos.getLoteAverio() + "'," + Datos.getUnidadExistente() + ",'" + Datos.getFechaIngreso() + "'," + Datos.getTotal() + "," + Datos.getProveedor().getIdProveedor() + "," + Datos.getUsuario().getIdUsuario() + ")");

                JOptionPane.showMessageDialog(null, "Recuperación añadido a la lista");
            }
          //  connection.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO GUARDAR LA PERDIDA RECUPERADA");
        }
    }
 public ArrayList<PerdidaMateriaPrima> ConsultaPerdidaMateraPrima() {
        ArrayList<PerdidaMateriaPrima> listaperdidamateriaprima = new ArrayList<PerdidaMateriaPrima>();
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                ResultSet clr = statement.executeQuery("select * from perdidamateriaprima");

                while (clr.next()) {
                    PerdidaMateriaPrima perdidamateriaprima=new PerdidaMateriaPrima();
                    perdidamateriaprima.setIdPerdidaMateriaPrima(clr.getString("idPerdidaMateriaPrima"));
                    perdidamateriaprima.setEnObservacion(clr.getBoolean("EnObservacion"));
                    perdidamateriaprima.setMuerto(clr.getBoolean("Muerto"));
                    perdidamateriaprima.setEnfermo(clr.getBoolean("Enfermo"));
                    perdidamateriaprima.setUnidadesAfectadas(clr.getInt("UnidadAfectada"));
                    perdidamateriaprima.setFecha(clr.getString("Fecha"));//debería devolver un date no un string
                    listaperdidamateriaprima.add(perdidamateriaprima);
                }
            }
          //  connection.close();
        } catch (Exception e) {
        }

        return listaperdidamateriaprima;
    }
    
}
