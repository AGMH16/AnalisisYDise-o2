/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesSQL;

import Clases.Proveedor;
import Clases.MateriaPrima;
import Conexion.ConexionBD;
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

    ConexionBD Conexion = new ConexionBD();

    public void Buscar(JTable jTable) {
        String sql = "SELECT LoteAverio, UnidadExistente, FechaIngreso FROM lotepollo";
        Statement st;
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("LoteAverio");
        model.addColumn("UnidadExistente");
        model.addColumn("FechaIngreso");
        jTable.setModel(model);

        String[] dato = new String[3];
        try {

            st = Conexion.getConnection().createStatement();
            ResultSet result = st.executeQuery(sql);
            while (result.next()) {
                dato[0] = result.getString(1);
                dato[1] = result.getString(2);
                dato[2] = result.getString(3);

                model.addRow(dato);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MateriaPrima.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
    }

    public int BuscarCodigoLote(JComboBox idLotejcbx) {
        int loteAverio = 0;
        try {
            try (Statement statement = (Statement) Conexion.getConnection().createStatement()) {
                ResultSet clr = statement.executeQuery("select LoteAverio FROM lotepollo");
                while (clr.next()) {
                    loteAverio = clr.getInt("idDimensional");
                    String dimensional1 = clr.getString("Dimensional");

                    idLotejcbx.setToolTipText(dimensional1);

                }

            }
            Conexion.getConnection().close();
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "NO SE PUDO ELIMINAR DIMENSIONAL");
        }

        return loteAverio;
    }

    public ArrayList<MateriaPrima> ConsultaCodigoLotePollo() {
        ArrayList<MateriaPrima> lotePollo = new ArrayList<MateriaPrima>();
        try {
            try (Statement statement = (Statement) Conexion.getConnection().createStatement()) {
                ResultSet clr = statement.executeQuery("SELECT LoteAverio, UnidadExistente, FechaIngreso FROM lotepollo");

                while (clr.next()) {

                    MateriaPrima lotepollo = new MateriaPrima();

                    lotepollo.setLoteAverio(clr.getString("LoteAverio"));
                    lotepollo.setUnidadExistente(clr.getInt("UnidadExistente"));
                    lotepollo.setFechaIngreso(clr.getDate("FechaIngreso"));
                    lotePollo.add(lotepollo);

                }
            }
            Conexion.getConnection().close();
        } catch (Exception e) {
        }

        return lotePollo;
    }
}
