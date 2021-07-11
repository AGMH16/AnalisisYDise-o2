/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesSQL;

import Conexion.ConexionBD;
import Clases.MateriaPrima;
import Clases.Proveedor;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Toshiba
 */
public class MateriaPrimaSQL {

    Connection connection = ConexionBD.getConnection();

    public void InsertarMateriaPrima(MateriaPrima Datos) {
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                statement.execute("INSERT INTO lotepollo(LoteAverio,UnidadExistente,FechaIngreso,Total,Proveedor,Usuario_idUsuario) VALUES ('" + Datos.getLoteAverio() + "'," + Datos.getUnidadExistente() + ",'" + Datos.getFechaIngreso() + "'," + Datos.getTotal() + "," + Datos.getProveedor().getIdProveedor() +","+Datos.getUsuario().getIdUsuario() + ")");
                JOptionPane.showMessageDialog(null, "Proveedor añadido a la lista");
            }
      //      connection.close();
        } catch (Exception e) {
            System.out.println("ESTO IMPORTA"+e);
            JOptionPane.showMessageDialog(null, "NO SE PUDO GUARDAR LA MATERIA PRIMA");
        }
    }

    public void DeleteMateriaPrima(String codigo) {
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                statement.execute("DELETE FROM lotepollo WHERE LotePollo=('" + codigo + "')");
                JOptionPane.showMessageDialog(null, "Proveedor añedido a la lista");
            }
      //      connection.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO AGREGAR AL PROVEEDOR");
        }
    }

    public ArrayList<MateriaPrima> ConsultaMateraPrimaCodigo() {
        ArrayList<MateriaPrima> listamateriaprima = new ArrayList<MateriaPrima>();
        Proveedor proveedor=new Proveedor();
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                ResultSet clr = statement.executeQuery("select * from lotepollo");

                while (clr.next()) {
                    MateriaPrima materiaprima=new MateriaPrima();
                    materiaprima.setLoteAverio(clr.getString("LoteAverio"));
                    materiaprima.setUnidadExistente(clr.getInt("UnidadExistente"));
                    materiaprima.setFechaIngreso(clr.getString("FechaIngreso"));//debería devolver un date no un string
                    materiaprima.setTotal(clr.getFloat("Total"));
                    proveedor.setIdProveedor(clr.getInt("Proveedor"));
                    materiaprima.setProveedor(proveedor);
                    //materiaprima.getUsuario().setIdUsuario(clr.getInt("Usuario_idUsuario"));
                    listamateriaprima.add(materiaprima);
                }
            }
      //      connection.close();
        } catch (Exception e) {
        }

        return listamateriaprima;
    }
    
       
}
