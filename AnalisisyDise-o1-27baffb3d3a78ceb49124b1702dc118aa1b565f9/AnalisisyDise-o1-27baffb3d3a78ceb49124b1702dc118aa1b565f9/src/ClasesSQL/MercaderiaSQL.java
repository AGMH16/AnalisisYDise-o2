/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesSQL;

import Conexion.ConexionBD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MercaderiaSQL {

    Connection connection = ConexionBD.getConnection();

    public void InsertarMercaderia(String tipoPieza, int cantidadLibra, String fechaVenta, float total, String lotepollo_loteAverio, int stock) {
        try {
            connection.setAutoCommit(false);

            try (Statement statement = (Statement) connection.createStatement()) {
                statement.execute("INSERT INTO mercaderia(TipoPieza,CantidadLibra,FechaVenta,Total,LotePollo_LoteAverio,Stock) VALUES ('" + tipoPieza + "'," + cantidadLibra + ",'" + fechaVenta + "'," + total + ",'" + lotepollo_loteAverio + "'," + stock + ")");
                JOptionPane.showMessageDialog(null, "Mercaderia añadida a la lista");
            }

            try (Statement statement = (Statement) connection.createStatement()) {
                ResultSet clr = statement.executeQuery("SELECT  r.LotePollo_LoteAverio, r.Stock, r.idMercaderia,s.UnidadExistente FROM mercaderia r INNER JOIN lotepollo s ON r.LotePollo_LoteAverio = s.LoteAverio WHERE r.idMercaderia=5;");//IDMERCADERIA

                if (clr.next()) {
                    //   NoCliente = clr.getInt("NoCliente");
                    int stock2 = clr.getInt("r.Stock");
                    int unidadExistente = clr.getInt("s.UnidadExistente");
                    // clr.getInt("idProveedor");
                    String apellido = clr.getString("Apellido");
                    if (stock2 <= unidadExistente) {
                        //set UNIDAD=UNIDADEXISTENTE-STOCKM;
                         unidadExistente= unidadExistente-stock2;
                        //UPDATE lotepollo SET UnidadExistente=UNIDAD WHERE LoteAverio= LOTEPOLLO_LOTEAVERIO;
                    }
                }

            }
            connection.commit();

            connection.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO AGREGAR");
            System.out.println(e);
        }
    }

    public void ConsultaDeMercaderia(JComboBox ProductoJcmbx) throws SQLException {
        String producto = "", pn;
        try {
            Statement s = connection.createStatement();
            ResultSet clr = s.executeQuery("select TipoPieza from mercaderia");
            while (clr.next()) {
                producto = clr.getString("TipoPieza");
                ProductoJcmbx.addItem(producto);

            }
        } catch (SQLException ex) {
            Logger.getLogger(MercaderiaSQL.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
    }

}
