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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author jenif
 */
public class PruebaSQL {
     ConexionBD Conexion = new ConexionBD();

    
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
}
