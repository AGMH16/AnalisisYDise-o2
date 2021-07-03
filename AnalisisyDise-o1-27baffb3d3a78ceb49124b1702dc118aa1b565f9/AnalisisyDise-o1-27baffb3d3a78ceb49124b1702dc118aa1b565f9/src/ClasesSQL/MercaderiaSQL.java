/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesSQL;
import Conexion.ConexionBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MercaderiaSQL {
      ConexionBD Conexion = new ConexionBD();

    public void InsertarLibretaCliente(String tipoPieza, int cantidadLibra, String fechaVenta, float total, String lotepollo_loteAverio,int stock) {
        try {
            try (Statement statement = (Statement) Conexion.getConnection().createStatement()) {
                statement.execute("INSERT INTO mercaderia(TipoPieza,CantidadLibra,FechaVenta,Total,LotePollo_LoteAverio,Stock) VALUES ('" + tipoPieza + "'," + cantidadLibra + ",'" + fechaVenta + "'," + total + ",'" + lotepollo_loteAverio + "'," + stock + ")");
                JOptionPane.showMessageDialog(null, "Mercaderia ñedida a la lista");
            }
            Conexion.getConnection().close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO AGREGAR");
            System.out.println(e);
        }
    }

}
