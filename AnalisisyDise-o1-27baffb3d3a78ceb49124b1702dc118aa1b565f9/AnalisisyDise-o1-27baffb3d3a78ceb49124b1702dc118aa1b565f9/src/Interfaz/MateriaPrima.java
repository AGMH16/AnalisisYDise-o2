/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Clases.ColorearComponenteBlanco;
import Clases.ColorearInterfazBlanco;
import Clases.ColorearInterfazNegro;
import ClasesSQL.ProveedorSQL;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import javax.swing.ImageIcon;
import sun.security.util.Password;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sun.security.util.Password;

/**
 *
 * @author jenif
 */
public class MateriaPrima extends javax.swing.JFrame {
//HOLA ANDREEEEEEEEEEEEEEEE
    String loteAverio = "";
    String nombreproveedor = "", proveedor = "";
    int cantidad = 0;
    float total;
    ProveedorSQL proveedores = new ProveedorSQL();
    ArrayList<Clases.Proveedor> listaProveedores = proveedores.ConsultaProveedorNombre();

    ColorearInterfazNegro pintarInterfaz = new ColorearInterfazNegro();
    ColorearInterfazBlanco pintarInterfazBlanco = new ColorearInterfazBlanco();

    /*crud thecrud = new crud();
    Connection con = (Connection) ConexionBD.GetConnection();*/
    /**
     * Creates new form Menu
     */
    public MateriaPrima() {

        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        transparenciButton();
        for (Clases.Proveedor prov : listaProveedores) {
            Proveedorjcmb.addItem(prov.getNombre());
        }

    }

    public void transparenciButton() {

        Guardarbtn.setOpaque(false);
        Guardarbtn.setContentAreaFilled(false);
        Guardarbtn.setBorderPainted(false);
        jButton3.setOpaque(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setBorderPainted(false);
        jButton5.setOpaque(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setBorderPainted(false);
        Actualizarbtn.setOpaque(false);
        Actualizarbtn.setContentAreaFilled(false);
        Actualizarbtn.setBorderPainted(false);
        Eliminarbtn.setOpaque(false);
        Eliminarbtn.setContentAreaFilled(false);
        Eliminarbtn.setBorderPainted(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Actualizarbtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Guardarbtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Cantidadtxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Totaltxt = new javax.swing.JTextField();
        Eliminarbtn = new javax.swing.JButton();
        FechaCalendar = new com.toedter.calendar.JCalendar();
        jLabel4 = new javax.swing.JLabel();
        Proveedorjcmb = new javax.swing.JComboBox<>();
        CodigoAveriotxt = new javax.swing.JTextField();
        btn_oscuro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(921, 670));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(242, 253, 250));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(921, 670));
        jPanel1.setVerifyInputWhenFocusTarget(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 102, 102));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar-sesion.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, 40, -1));

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton5.setForeground(new java.awt.Color(102, 102, 102));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-de-regreso.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 60, 40, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Actualizarbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Actualizarbtn.setForeground(new java.awt.Color(102, 102, 102));
        Actualizarbtn.setText("Actualizar");
        Actualizarbtn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aprovechar.png"))); // NOI18N
        Actualizarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarbtnActionPerformed(evt);
            }
        });
        jPanel2.add(Actualizarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 460, -1, -1));

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("MATERIA PRIMA ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 30, -1, -1));

        Guardarbtn.setBackground(new java.awt.Color(102, 102, 102));
        Guardarbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Guardarbtn.setForeground(new java.awt.Color(102, 102, 102));
        Guardarbtn.setText("Guardar");
        Guardarbtn.setBorder(null);
        Guardarbtn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aprovechar.png"))); // NOI18N
        Guardarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarbtnActionPerformed(evt);
            }
        });
        jPanel2.add(Guardarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, 109, 35));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/quetzal_1.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 540, -1, -1));

        Cantidadtxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Cantidadtxt.setForeground(new java.awt.Color(102, 102, 102));
        Cantidadtxt.setText("Cantidad");
        Cantidadtxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Cantidadtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantidadtxtActionPerformed(evt);
            }
        });
        Cantidadtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CantidadtxtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CantidadtxtKeyTyped(evt);
            }
        });
        jPanel2.add(Cantidadtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 265, 253, 43));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/calendario.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 383, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Fecha de Ingreso");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 342, -1, -1));

        Totaltxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Totaltxt.setForeground(new java.awt.Color(102, 102, 102));
        Totaltxt.setText("Total");
        Totaltxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Totaltxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotaltxtActionPerformed(evt);
            }
        });
        Totaltxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TotaltxtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TotaltxtKeyTyped(evt);
            }
        });
        jPanel2.add(Totaltxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 540, 253, 43));

        Eliminarbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Eliminarbtn.setForeground(new java.awt.Color(102, 102, 102));
        Eliminarbtn.setText("Eliminar");
        Eliminarbtn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aprovechar.png"))); // NOI18N
        Eliminarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarbtnActionPerformed(evt);
            }
        });
        jPanel2.add(Eliminarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 109, -1));
        jPanel2.add(FechaCalendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 383, -1, 125));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario (2).png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 177, -1, -1));

        Proveedorjcmb.setBackground(new java.awt.Color(244, 253, 251));
        Proveedorjcmb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Proveedorjcmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Proveedor", " ", " " }));
        Proveedorjcmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProveedorjcmbActionPerformed(evt);
            }
        });
        jPanel2.add(Proveedorjcmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 186, 253, 42));

        CodigoAveriotxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CodigoAveriotxt.setForeground(new java.awt.Color(102, 102, 102));
        CodigoAveriotxt.setText("Código de averío");
        CodigoAveriotxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CodigoAveriotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodigoAveriotxtActionPerformed(evt);
            }
        });
        CodigoAveriotxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CodigoAveriotxtKeyPressed(evt);
            }
        });
        jPanel2.add(CodigoAveriotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 104, 253, 43));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 0, 620, 670));

        btn_oscuro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/darkmode_1.png"))); // NOI18N
        btn_oscuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_oscuroActionPerformed(evt);
            }
        });
        jPanel1.add(btn_oscuro, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 30, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void TotaltxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TotaltxtKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            total = Integer.parseInt(Totaltxt.getText());

        }
    }//GEN-LAST:event_TotaltxtKeyPressed

    private void TotaltxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotaltxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotaltxtActionPerformed

    private void CantidadtxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CantidadtxtKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cantidad = Integer.parseInt(Cantidadtxt.getText());

        }
    }//GEN-LAST:event_CantidadtxtKeyPressed

    private void CantidadtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantidadtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CantidadtxtActionPerformed
    List Proveedores = new ArrayList();

    static void obtener_proveedor(ArrayList<Integer> id, ArrayList<String> Proveedor) {
        int ID = 0;
        String proveedor = "";
        id.get(ID);
        Proveedor.get(Integer.parseInt(proveedor));
    }
    private void GuardarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarbtnActionPerformed
        loteAverio = CodigoAveriotxt.getText();
        proveedor = (String) Proveedorjcmb.getSelectedItem();
        cantidad = Integer.parseInt(Cantidadtxt.getText());
        total = Integer.parseInt(Totaltxt.getText());
        System.out.println(loteAverio);
        System.out.println(proveedor);
        System.out.println(cantidad);
        System.out.println(total);
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        String fecha;
        fecha = f.format(FechaCalendar.getDate());
        System.out.println(fecha);


    }//GEN-LAST:event_GuardarbtnActionPerformed

    private void ActualizarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarbtnActionPerformed

    }//GEN-LAST:event_ActualizarbtnActionPerformed

    private void EliminarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarbtnActionPerformed


    }//GEN-LAST:event_EliminarbtnActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed
    boolean modoOscuro = false;
    private void ProveedorjcmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProveedorjcmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProveedorjcmbActionPerformed

    private void CodigoAveriotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodigoAveriotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodigoAveriotxtActionPerformed

    private void CodigoAveriotxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CodigoAveriotxtKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodigoAveriotxtKeyPressed

    private void btn_oscuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_oscuroActionPerformed
        if (!modoOscuro) {
            pintarInterfaz.ColorearMateriaPrima(jPanel1, jPanel2, btn_oscuro, Proveedorjcmb, Cantidadtxt, Totaltxt, CodigoAveriotxt, Eliminarbtn, Actualizarbtn, Guardarbtn);
            modoOscuro = true;
        } else if (modoOscuro == true) {
            pintarInterfazBlanco.ColorearMateriaPrima(jPanel1, jPanel2, btn_oscuro, Proveedorjcmb, Cantidadtxt, Totaltxt, CodigoAveriotxt, Eliminarbtn, Actualizarbtn, Guardarbtn);

            modoOscuro = false;
        }
    }//GEN-LAST:event_btn_oscuroActionPerformed

    private void CantidadtxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CantidadtxtKeyTyped
        // TODO add your handling code here:
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_CantidadtxtKeyTyped

    private void TotaltxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TotaltxtKeyTyped
        // TODO add your handling code here:
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_TotaltxtKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MateriaPrima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MateriaPrima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MateriaPrima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MateriaPrima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MateriaPrima().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizarbtn;
    private javax.swing.JTextField Cantidadtxt;
    private javax.swing.JTextField CodigoAveriotxt;
    private javax.swing.JButton Eliminarbtn;
    private com.toedter.calendar.JCalendar FechaCalendar;
    private javax.swing.JButton Guardarbtn;
    private javax.swing.JComboBox<String> Proveedorjcmb;
    private javax.swing.JTextField Totaltxt;
    private javax.swing.JButton btn_oscuro;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
