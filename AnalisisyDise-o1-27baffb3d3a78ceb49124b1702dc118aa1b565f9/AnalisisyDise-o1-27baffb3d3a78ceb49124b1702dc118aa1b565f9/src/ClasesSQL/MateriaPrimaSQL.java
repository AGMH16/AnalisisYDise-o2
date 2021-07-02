/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesSQL;

import Conexion.ConexionBD;
import Clases.MateriaPrima;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Toshiba
 */
public class MateriaPrimaSQL {

    ConexionBD Conexion = new ConexionBD();

    public void InsertarMateriaPrima(MateriaPrima Datos) {
        try {
            try (Statement statement = (Statement) Conexion.getConnection().createStatement()) {
                statement.execute("INSERT INTO lotepollo(LoteAverio,UnidadExistente,FechaIngreso,Total,Proveedor,Usuario_idUsuario) VALUES ('" + Datos.getLoteAverio() + "'," + Datos.getUnidadExistente()+ ",'" + Datos.getFechaIngreso() + "'," + Datos.getTotal() +",'"+ Datos.getProveedor()+"',"+Datos.getUsuario().getIdUsuario() +")");
                JOptionPane.showMessageDialog(null, "Proveedor añadido a la lista");
            }
            Conexion.getConnection().close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO AGREGAR AL PROVEEDOR");
        }
    }
}
