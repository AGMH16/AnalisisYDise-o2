/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Clases.Usuario;
import ClasesInterfaz.ComponenteBoton;
import ClasesInterfaz.ComponenteBotonIcon;
import ClasesInterfaz.ComponenteLabelText;
import ClasesInterfaz.ComponentePanel;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import sun.security.util.Password;

/**
 *
 * @author jenif
 */
public class MenuMateriaPrima extends javax.swing.JFrame {

    private boolean modoOscuro;
    ComponentePanel panel = new ComponentePanel();
    ComponenteLabelText text = new ComponenteLabelText();
    ComponenteLabelText label = new ComponenteLabelText();
    ComponenteBoton boton = new ComponenteBoton();
    ComponenteBotonIcon botonIcon = new ComponenteBotonIcon();

    /**
     * Creates new form Menu
     */
    public MenuMateriaPrima() {

        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        transparenciButton();
    }

    public MenuMateriaPrima(int numeroboton) {

        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        transparenciButton();
    }

    public MenuMateriaPrima(Usuario usuario) {

        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        transparenciButton();
    }

    public void transparenciButton() {
        Accion1btn.setOpaque(false);
        Accion1btn.setContentAreaFilled(false);
        Accion1btn.setBorderPainted(false);
        jButton2.setOpaque(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setBorderPainted(false);
        Accion2btn.setOpaque(false);
        Accion2btn.setContentAreaFilled(false);
        Accion2btn.setBorderPainted(false);
        Accion3btn.setOpaque(false);
        Accion3btn.setContentAreaFilled(false);
        Accion3btn.setBorderPainted(false);
        Accion4btn.setOpaque(false);
        Accion4btn.setContentAreaFilled(false);
        Accion4btn.setBorderPainted(false);

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
        jButton2 = new javax.swing.JButton();
        btn_oscuro = new javax.swing.JButton();
        Regresarbtn = new javax.swing.JButton();
        Accion1btn = new javax.swing.JButton();
        Accion2btn = new javax.swing.JButton();
        Accion3btn = new javax.swing.JButton();
        Accion4btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(429, 325));
        setPreferredSize(new java.awt.Dimension(429, 325));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(242, 253, 250));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar-sesion.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btn_oscuro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/darkmode_1.png"))); // NOI18N
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

        Accion1btn.setBackground(new java.awt.Color(0, 0, 102));
        Accion1btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Accion1btn.setForeground(new java.awt.Color(102, 102, 102));
        Accion1btn.setText("REGISTRAR MATERIA PRIMA");
        Accion1btn.setBorder(null);
        Accion1btn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aprovechar.png"))); // NOI18N
        Accion1btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Accion1btnActionPerformed(evt);
            }
        });

        Accion2btn.setBackground(new java.awt.Color(0, 0, 102));
        Accion2btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Accion2btn.setForeground(new java.awt.Color(102, 102, 102));
        Accion2btn.setText("REGISTRAR PERDIDA");
        Accion2btn.setBorder(null);
        Accion2btn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aprovechar.png"))); // NOI18N
        Accion2btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Accion2btnActionPerformed(evt);
            }
        });

        Accion3btn.setBackground(new java.awt.Color(0, 0, 102));
        Accion3btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Accion3btn.setForeground(new java.awt.Color(102, 102, 102));
        Accion3btn.setText("REGISTRAR RECUPERACION");
        Accion3btn.setBorder(null);
        Accion3btn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aprovechar.png"))); // NOI18N
        Accion3btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Accion3btnActionPerformed(evt);
            }
        });

        Accion4btn.setBackground(new java.awt.Color(0, 0, 102));
        Accion4btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Accion4btn.setForeground(new java.awt.Color(102, 102, 102));
        Accion4btn.setText("VER MATERIA PRIMA");
        Accion4btn.setBorder(null);
        Accion4btn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aprovechar.png"))); // NOI18N
        Accion4btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Accion4btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Accion2btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Accion1btn, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                    .addComponent(Accion3btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Accion4btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_oscuro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Regresarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(404, 404, 404))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(Accion1btn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Accion4btn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Accion2btn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Accion3btn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(btn_oscuro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Regresarbtn)))
                .addContainerGap(311, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-230, 0, 1060, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_oscuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_oscuroActionPerformed
        if (!modoOscuro) {
            Pintar(Color.decode("#FFFFE0"), "/Imagenes/darkmode_2.png", Color.decode("#212b41"));

            modoOscuro = true;
        } else if (modoOscuro == true) {
            Pintar(Color.decode("#66646C"), "/Imagenes/darkmode_1.png", Color.decode("#F2FDFA"));
            modoOscuro = false;
        }
    }//GEN-LAST:event_btn_oscuroActionPerformed

    private void RegresarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarbtnActionPerformed
        // TODO add your handling code here:
        Menu3 menu = new Menu3();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_RegresarbtnActionPerformed

    private void Accion2btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Accion2btnActionPerformed
        // TODO add your handling code here:
        PerdidaMateriaPrima materiaPrima = new PerdidaMateriaPrima();
        // MateriaPrima materiaPrima = new MateriaPrima(usuario);
        materiaPrima.setVisible(true);
        dispose();
    }//GEN-LAST:event_Accion2btnActionPerformed

    private void Accion1btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Accion1btnActionPerformed
        MateriaPrima materiaPrima = new MateriaPrima();
        // MateriaPrima materiaPrima = new MateriaPrima(usuario);
        materiaPrima.setVisible(true);
        dispose();

    }//GEN-LAST:event_Accion1btnActionPerformed

    private void Accion3btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Accion3btnActionPerformed
        // TODO add your handling code here:
        PerdidaRecuperada recuperacion = new PerdidaRecuperada();
        recuperacion.setVisible(true);
        dispose();
    }//GEN-LAST:event_Accion3btnActionPerformed

    private void Accion4btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Accion4btnActionPerformed
        // TODO add your handling code here:
        LotePollo lote = new LotePollo();
        lote.setVisible(true);
        dispose();
    }//GEN-LAST:event_Accion4btnActionPerformed
    private void Pintar(Color colorbotones, String imagen, Color colorfondo) {

        panel.setPanelFondo(jPanel1);
        panel.setColorFondo(colorfondo);
        panel.getPanelFondo();
        boton.setBoton(Accion1btn);
        boton.setColorBoton(colorbotones);
        boton.getBoton();
        boton.setBoton(Accion2btn);
        boton.setColorBoton(colorbotones);
        boton.getBoton();
        boton.setBoton(Accion3btn);
        boton.setColorBoton(colorbotones);
        boton.getBoton();
        boton.setBoton(Accion4btn);
        boton.setColorBoton(colorbotones);
        boton.getBoton();
        botonIcon.setBotonActivador(btn_oscuro);
        botonIcon.setNombreimagen(imagen);
        botonIcon.getBotonActivador();
    }

    private void nombrarmenu(int numeromenu) {
        if (numeromenu == 1) {
            Accion1btn.setText("Agregar Cliente");
            Accion2btn.setText("Ver Libreta");

        } else if (numeromenu == 2) {

        }
        Inventario inventario = new Inventario();
        inventario.setVisible(true);
        dispose();
    }

    private void direccionarmenu(int numeromenu, int accion) {
        if (numeromenu == 1) {
            if (accion == 1) {
                Cliente cliente = new Cliente();
                cliente.setVisible(true);
                dispose();
            } else if (accion == 2) {
                Libreta libreta = new Libreta();
                libreta.setVisible(true);
                dispose();
            }
        } else if (numeromenu == 2) {

        }
    }

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
            java.util.logging.Logger.getLogger(MenuMateriaPrima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuMateriaPrima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuMateriaPrima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuMateriaPrima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuMateriaPrima().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Accion1btn;
    private javax.swing.JButton Accion2btn;
    private javax.swing.JButton Accion3btn;
    private javax.swing.JButton Accion4btn;
    private javax.swing.JButton Regresarbtn;
    private javax.swing.JButton btn_oscuro;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}