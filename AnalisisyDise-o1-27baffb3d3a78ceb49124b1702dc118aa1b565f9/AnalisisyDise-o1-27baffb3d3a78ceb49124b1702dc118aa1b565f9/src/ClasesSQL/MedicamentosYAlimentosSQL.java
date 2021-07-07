/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesSQL;

import Clases.InsumoUso;
import Clases.MateriaPrima;
import Conexion.ConexionBD;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Toshiba
 */
public class MedicamentosYAlimentosSQL {
        ConexionBD Conexion = new ConexionBD();

    public void InsertarMedicamentosyAlimentos(InsumoUso Datos) {
        try {
            try (Statement statement = (Statement) Conexion.getConnection().createStatement()) {
                statement.execute("INSERT INTO insumouso(Nombre,Existencia,FechaIngreso,Total) VALUES ('" + Datos.getNombre()+ "'," + Datos.getExistencia()+ ",'" + Datos.getFechaIngreso() + "'," + Datos.getTotal() +","+ Datos.getDimensional().getIdDimensional()+","+Datos.getUsuario().getIdUsuario() +")");
                JOptionPane.showMessageDialog(null, "Proveedor añadido a la lista");
            }
            Conexion.getConnection().close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO AGREGAR AL PROVEEDOR");
        }
    }
}
