/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Clases.ColorearInterfazBlanco;
import Clases.ColorearInterfazNegro;
import ClasesSQL.MercaderiaSQL;
import ClasesSQL.PruebaSQL;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import javax.swing.ImageIcon;
import sun.security.util.Password;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import sun.security.util.Password;
import ClasesSQL.PruebaSQL;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.mail.internet.ParseException;

/**
 *
 * @author jenif
 */
public class Mercaderia extends javax.swing.JFrame {

    PruebaSQL pruebasql = new PruebaSQL();
    MercaderiaSQL mercaderiasql = new MercaderiaSQL();
    LotePollo lote = new LotePollo();
    String proveedor = "", producto = "", loteAverio = "";
    String nombreproveedor = "", tipoproducto = "", agregarProducto = "", fecha1;
    int cantidad = 0, año = 0, dia = 0, mes = 0, stock = 0;
    float total;
    ColorearInterfazNegro pintarInterfaz = new ColorearInterfazNegro();
    ColorearInterfazBlanco pintarInterfazBlanco = new ColorearInterfazBlanco();

    public Mercaderia() {

        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        transparenciButton();
        Productojcmb.addItem("Pollo");
        Productojcmb.addItem("Maíz");
        Productojcmb.addItem("Vacuna");
        Productojcmb.addItem("Inmunizador");
        Productojcmb.addItem("Concentrado de engorde");
        Productojcmb.addItem("Concentrado de crecimiento");
        codigojlbl.setText(lote.getLoteAverio());
    }

    public void transparenciButton() {

        Guardarbtn.setOpaque(false);
        Guardarbtn.setContentAreaFilled(false);
        Guardarbtn.setBorderPainted(false);
        jButton3.setOpaque(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setBorderPainted(false);
        AgregaMercaderiabtn.setOpaque(false);
        AgregaMercaderiabtn.setContentAreaFilled(false);
        AgregaMercaderiabtn.setBorderPainted(false);
        jButton4.setOpaque(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setBorderPainted(false);
        Actualizarbtn.setOpaque(false);
        Actualizarbtn.setContentAreaFilled(false);
        Actualizarbtn.setBorderPainted(false);
        Eliminarbtn.setOpaque(false);
        Eliminarbtn.setContentAreaFilled(false);
        Eliminarbtn.setBorderPainted(false);
        Buscarbtn.setOpaque(false);
        Buscarbtn.setContentAreaFilled(false);
        Buscarbtn.setBorderPainted(false);
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
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Actualizarbtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Guardarbtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Cantidadtxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Productojcmb = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        Totaltxt = new javax.swing.JTextField();
        Eliminarbtn = new javax.swing.JButton();
        FechaCalendar2 = new com.toedter.calendar.JCalendar();
        Stocktxt = new javax.swing.JTextField();
        Buscarbtn = new javax.swing.JButton();
        codigojlbl = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        AgregaMercaderiabtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btn_oscuro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(242, 253, 250));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 102, 102));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar-sesion.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton4.setForeground(new java.awt.Color(102, 102, 102));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-de-regreso.png"))); // NOI18N
        jButton4.setToolTipText("");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

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
        jPanel2.add(Actualizarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, 117, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 224));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("MERCADERÍA");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 16, -1, -1));

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
        jPanel2.add(Guardarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 430, 117, 35));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/quetzal_1.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, -1, -1));

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
        });
        jPanel2.add(Cantidadtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 250, 43));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/calendario.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        Productojcmb.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel2.add(Productojcmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 253, 42));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Fecha");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, -1));

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
        });
        jPanel2.add(Totaltxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, 260, 43));

        Eliminarbtn.setBackground(new java.awt.Color(255, 255, 224));
        Eliminarbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Eliminarbtn.setForeground(new java.awt.Color(102, 102, 102));
        Eliminarbtn.setText("Eliminar");
        Eliminarbtn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aprovechar.png"))); // NOI18N
        Eliminarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarbtnActionPerformed(evt);
            }
        });
        jPanel2.add(Eliminarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, 117, -1));
        jPanel2.add(FechaCalendar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, -1, 125));

        Stocktxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Stocktxt.setForeground(new java.awt.Color(102, 102, 102));
        Stocktxt.setText("Stock");
        Stocktxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Stocktxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StocktxtActionPerformed(evt);
            }
        });
        Stocktxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                StocktxtKeyPressed(evt);
            }
        });
        jPanel2.add(Stocktxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 140, 43));

        Buscarbtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Buscarbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar (1).png"))); // NOI18N
        Buscarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarbtnActionPerformed(evt);
            }
        });
        jPanel2.add(Buscarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        codigojlbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        codigojlbl.setForeground(new java.awt.Color(102, 102, 102));
        codigojlbl.setText("....");
        jPanel2.add(codigojlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 50, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Buscar código de Lote");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pierna-de-pollo.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        AgregaMercaderiabtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        AgregaMercaderiabtn.setForeground(new java.awt.Color(102, 102, 102));
        AgregaMercaderiabtn.setText("+");
        jPanel2.add(AgregaMercaderiabtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Tipo de Pieza");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));

        btn_oscuro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/darkmode_1.png"))); // NOI18N
        btn_oscuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_oscuroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(172, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_oscuro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(btn_oscuro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addGap(0, 459, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

        producto = (String) Productojcmb.getSelectedItem();
        cantidad = Integer.parseInt(Cantidadtxt.getText());
        total = Float.parseFloat(Totaltxt.getText());
        stock = Integer.parseInt(Stocktxt.getText());
        System.out.println(producto);
        System.out.println(cantidad);
        System.out.println(total);
        loteAverio = lote.getLoteAverio();
        año = FechaCalendar2.getCalendar().get(Calendar.YEAR);
        mes = FechaCalendar2.getCalendar().get(Calendar.MARCH);
        dia = FechaCalendar2.getCalendar().get(Calendar.DAY_OF_MONTH);

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaDate = null;
        try {
            fechaDate = formato.parse(fecha1);
        } catch (java.text.ParseException ex) {
            Logger.getLogger(Mercaderia.class.getName()).log(Level.SEVERE, null, ex);
        }

      //  fecha1 = (año + "/" + mes + "/" + dia);
       // System.out.println(fecha1);
          //mercaderiasql.InsertarLibretaCliente(producto, cantidad, fecha1, total, loteAverio, stock);

    }//GEN-LAST:event_GuardarbtnActionPerformed

    private void ActualizarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarbtnActionPerformed
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
           año = FechaCalendar2.getCalendar().get(Calendar.YEAR);
        mes = FechaCalendar2.getCalendar().get(Calendar.MARCH);
        dia = FechaCalendar2.getCalendar().get(Calendar.DAY_OF_MONTH);
        fecha1 = (año + "-" + mes + "-" + dia);
       // System.out.println(fecha1);
        Date fechaDate = null;
        try {
            fechaDate = formato.parse(fecha1);
            System.out.println(fecha1);
        } catch (java.text.ParseException ex) {
            Logger.getLogger(Mercaderia.class.getName()).log(Level.SEVERE, null, ex);
        }

      
    }//GEN-LAST:event_ActualizarbtnActionPerformed

    private void EliminarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarbtnActionPerformed


    }//GEN-LAST:event_EliminarbtnActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Menu3 menux = new Menu3();
        menux.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btn_oscuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_oscuroActionPerformed
        if (!modoOscuro) {
            pintarInterfaz.ColorearMercaderiaNegro(jPanel1, jPanel2, btn_oscuro, Productojcmb, Cantidadtxt, Totaltxt, AgregaMercaderiabtn, Guardarbtn, Actualizarbtn, Eliminarbtn);
            modoOscuro = true;
        } else if (modoOscuro == true) {
            pintarInterfazBlanco.ColorearMercaderiaBlanco(jPanel1, jPanel2, btn_oscuro, Productojcmb, Cantidadtxt, Totaltxt, AgregaMercaderiabtn, Guardarbtn, Actualizarbtn, Eliminarbtn);
            modoOscuro = false;
        }
    }//GEN-LAST:event_btn_oscuroActionPerformed

    private void StocktxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StocktxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StocktxtActionPerformed

    private void StocktxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_StocktxtKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_StocktxtKeyPressed

    private void BuscarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarbtnActionPerformed
        // TODO add your handling code here:
        LotePollo lotepollo = new LotePollo();
        lotepollo.setVisible(true);
        dispose();
    }//GEN-LAST:event_BuscarbtnActionPerformed
    boolean modoOscuro = false;

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
            java.util.logging.Logger.getLogger(Mercaderia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mercaderia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mercaderia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mercaderia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mercaderia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizarbtn;
    private javax.swing.JButton AgregaMercaderiabtn;
    private javax.swing.JButton Buscarbtn;
    private javax.swing.JTextField Cantidadtxt;
    private javax.swing.JButton Eliminarbtn;
    private com.toedter.calendar.JCalendar FechaCalendar2;
    private javax.swing.JButton Guardarbtn;
    private javax.swing.JComboBox<String> Productojcmb;
    private javax.swing.JTextField Stocktxt;
    private javax.swing.JTextField Totaltxt;
    private javax.swing.JButton btn_oscuro;
    private javax.swing.JLabel codigojlbl;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
