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
    int val;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
    
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

    
    
    public int BuscarUsuario(String usuario, String contraseña) {
        int IdUsuario = 0;
        try {
            try (Statement statement = (Statement) Conexion.getConnection().createStatement()) {
                ResultSet clr = statement.executeQuery("SELECT idUsuario,Usuario, Contraseña from usuario");
                while (clr.next()) {
                    IdUsuario = clr.getInt("idUsuario");
                    String Usuario = clr.getString("Usuario");
                    String Contraseña = clr.getString("Contraseña");

                    if ((usuario.equals(Usuario))&&(contraseña.equals(Contraseña))) {
                        
                        val= IdUsuario;
                        //jTextField1.setText(Integer.parseInt(IdUsuario));
                       /* NombreProveedortxt1.setText(nombre);
                        TelefonoProveedortxt.setText(direccion);
                        TelefonoProveedortxt1.setText(telefono);
                        EmpresaProveedortxt.setText(empresa);*/
                        System.out.println(val);

                    }
                }
            }
            //Conexion.getConnection().close();
        } catch (Exception e) {
        }

        return IdUsuario;
    }
}
