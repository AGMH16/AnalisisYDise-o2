/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Clases.ColorearComponenteNegro;
import Clases.ColorearInterfazBlanco;
import Clases.ColorearInterfazNegro;
import Clases.Componente;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import javax.swing.ImageIcon;
import sun.security.util.Password;
import java.awt.Color;
import java.awt.Frame;
import java.awt.geom.RoundRectangle2D;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author jenif
 */
public class Cliente extends javax.swing.JFrame {

    ColorearInterfazNegro pintarInterfazNegro = new ColorearInterfazNegro();
    ColorearInterfazBlanco pintarInterfazBlanco = new ColorearInterfazBlanco();
    String nombres = "", apellidos = "", direccion = "";
    int telefonoMovil = 0, telefonocasa = 0;
    Password contraseña3;
    String pass_concatenada;
    boolean modoOscuro = false;

    /**
     * Creates new form Menu
     */
    public Cliente() {

        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        transparenciButton();
    }

    public void transparenciButton() {
        jButton2.setOpaque(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setBorderPainted(false);
        Actualizarbtn.setOpaque(false);
        Actualizarbtn.setContentAreaFilled(false);
        Actualizarbtn.setBorderPainted(false);
        GuardarClientebtn.setOpaque(false);
        GuardarClientebtn.setContentAreaFilled(false);
        GuardarClientebtn.setBorderPainted(false);
        Regresarbtn.setOpaque(false);
        Regresarbtn.setContentAreaFilled(false);
        Regresarbtn.setBorderPainted(false);

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
        jPanel2 = new javax.swing.JPanel();
        NombreClientetxt = new javax.swing.JTextField();
        ApellidoClientetxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CelularClientetxt = new javax.swing.JTextField();
        DireccionClientetxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TelefonoClientetxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        GuardarClientebtn = new javax.swing.JButton();
        Actualizarbtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        btn_oscuro = new javax.swing.JButton();
        Regresarbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(242, 253, 250));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        NombreClientetxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NombreClientetxt.setForeground(new java.awt.Color(102, 102, 102));
        NombreClientetxt.setText("Nombres");
        NombreClientetxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        NombreClientetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreClientetxtActionPerformed(evt);
            }
        });
        NombreClientetxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NombreClientetxtKeyPressed(evt);
            }
        });

        ApellidoClientetxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ApellidoClientetxt.setForeground(new java.awt.Color(102, 102, 102));
        ApellidoClientetxt.setText("Apellidos");
        ApellidoClientetxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ApellidoClientetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidoClientetxtActionPerformed(evt);
            }
        });
        ApellidoClientetxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ApellidoClientetxtKeyPressed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/telefono-inteligente.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario (2).png"))); // NOI18N

        CelularClientetxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CelularClientetxt.setForeground(new java.awt.Color(102, 102, 102));
        CelularClientetxt.setText("Teléfono Móvil");
        CelularClientetxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CelularClientetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CelularClientetxtActionPerformed(evt);
            }
        });
        CelularClientetxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CelularClientetxtKeyPressed(evt);
            }
        });

        DireccionClientetxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        DireccionClientetxt.setForeground(new java.awt.Color(102, 102, 102));
        DireccionClientetxt.setText("Dirección");
        DireccionClientetxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DireccionClientetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DireccionClientetxtActionPerformed(evt);
            }
        });
        DireccionClientetxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DireccionClientetxtKeyPressed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/hogar.png"))); // NOI18N

        TelefonoClientetxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TelefonoClientetxt.setForeground(new java.awt.Color(102, 102, 102));
        TelefonoClientetxt.setText("Teléfono Casa");
        TelefonoClientetxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TelefonoClientetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefonoClientetxtActionPerformed(evt);
            }
        });
        TelefonoClientetxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TelefonoClientetxtKeyPressed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/telefono-de-casa (1).png"))); // NOI18N

        GuardarClientebtn.setBackground(new java.awt.Color(102, 102, 102));
        GuardarClientebtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        GuardarClientebtn.setForeground(new java.awt.Color(102, 102, 102));
        GuardarClientebtn.setText("Guardar Cliente");
        GuardarClientebtn.setBorder(null);
        GuardarClientebtn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aprovechar.png"))); // NOI18N
        GuardarClientebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarClientebtnActionPerformed(evt);
            }
        });

        Actualizarbtn.setBackground(new java.awt.Color(102, 102, 102));
        Actualizarbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Actualizarbtn.setForeground(new java.awt.Color(102, 102, 102));
        Actualizarbtn.setText("Guardar Actualización");
        Actualizarbtn.setBorder(null);
        Actualizarbtn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aprovechar.png"))); // NOI18N
        Actualizarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarbtnActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 51, 102));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("DATOS DEL CLIENTE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 63, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ApellidoClientetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NombreClientetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(Actualizarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(34, 34, 34)
                            .addComponent(GuardarClientebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(DireccionClientetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TelefonoClientetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CelularClientetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(75, 75, 75))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(NombreClientetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(ApellidoClientetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(CelularClientetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(TelefonoClientetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(DireccionClientetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GuardarClientebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Actualizarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar-sesion.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btn_oscuro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/darkmode_1.png"))); // NOI18N
        btn_oscuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_oscuroActionPerformed(evt);
            }
        });

        Regresarbtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Regresarbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-de-regreso.png"))); // NOI18N
        Regresarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(162, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_oscuro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Regresarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Regresarbtn))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_oscuro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void NombreClientetxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreClientetxtKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            nombres = NombreClientetxt.getText();
            ApellidoClientetxt.setText("");
            ApellidoClientetxt.requestFocus();
        }
    }//GEN-LAST:event_NombreClientetxtKeyPressed

    private void NombreClientetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreClientetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreClientetxtActionPerformed

    private void ApellidoClientetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoClientetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApellidoClientetxtActionPerformed

    private void ApellidoClientetxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ApellidoClientetxtKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            apellidos = ApellidoClientetxt.getText();
            CelularClientetxt.setText("");
            CelularClientetxt.requestFocus();
        }
    }//GEN-LAST:event_ApellidoClientetxtKeyPressed

    private void CelularClientetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CelularClientetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CelularClientetxtActionPerformed

    private void CelularClientetxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CelularClientetxtKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            telefonoMovil = Integer.parseInt(CelularClientetxt.getText());
            TelefonoClientetxt.setText("");
            TelefonoClientetxt.requestFocus();
        }
    }//GEN-LAST:event_CelularClientetxtKeyPressed

    private void DireccionClientetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DireccionClientetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DireccionClientetxtActionPerformed

    private void DireccionClientetxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DireccionClientetxtKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            direccion = DireccionClientetxt.getText();
        }
    }//GEN-LAST:event_DireccionClientetxtKeyPressed

    private void TelefonoClientetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefonoClientetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelefonoClientetxtActionPerformed

    private void TelefonoClientetxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TelefonoClientetxtKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            telefonocasa = Integer.parseInt(TelefonoClientetxt.getText());
            DireccionClientetxt.setText("");
            DireccionClientetxt.requestFocus();
        }
    }//GEN-LAST:event_TelefonoClientetxtKeyPressed

    private void GuardarClientebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarClientebtnActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        nombres = NombreClientetxt.getText();
        apellidos = ApellidoClientetxt.getText();
        telefonoMovil = Integer.parseInt(CelularClientetxt.getText());
        telefonocasa = Integer.parseInt(TelefonoClientetxt.getText());
        direccion = DireccionClientetxt.getText();

        System.out.println("Nombres del cliente:" + nombres);
        System.out.println("Apellido del cliente:" + apellidos);
        System.out.println("Celular:" + telefonoMovil);
        System.out.println("Telefono:" + telefonocasa);
        System.out.println("Dirección:" + direccion);
    }//GEN-LAST:event_GuardarClientebtnActionPerformed

    private void ActualizarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ActualizarbtnActionPerformed

    private void btn_oscuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_oscuroActionPerformed
        if (!modoOscuro) {
            pintarInterfazNegro.ColorearClienteNegro(jPanel1, jPanel2, GuardarClientebtn, Actualizarbtn, btn_oscuro, NombreClientetxt, ApellidoClientetxt, CelularClientetxt, TelefonoClientetxt, DireccionClientetxt);
            modoOscuro = true;
        } else if (modoOscuro == true) {
            pintarInterfazBlanco.ColorearClienteBlanco(jPanel1, jPanel2, GuardarClientebtn, Actualizarbtn, btn_oscuro, NombreClientetxt, ApellidoClientetxt, CelularClientetxt, TelefonoClientetxt, DireccionClientetxt);

            modoOscuro = false;
        }
    }//GEN-LAST:event_btn_oscuroActionPerformed

    private void RegresarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegresarbtnActionPerformed

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
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizarbtn;
    private javax.swing.JTextField ApellidoClientetxt;
    private javax.swing.JTextField CelularClientetxt;
    private javax.swing.JTextField DireccionClientetxt;
    private javax.swing.JButton GuardarClientebtn;
    private javax.swing.JTextField NombreClientetxt;
    private javax.swing.JButton Regresarbtn;
    private javax.swing.JTextField TelefonoClientetxt;
    private javax.swing.JButton btn_oscuro;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
