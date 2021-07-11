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
public class Menu extends javax.swing.JFrame {

    private boolean modoOscuro;
    int numeromenu;
    ComponentePanel panel = new ComponentePanel();
    ComponenteLabelText text = new ComponenteLabelText();
    ComponenteLabelText label = new ComponenteLabelText();
    ComponenteBoton boton = new ComponenteBoton();
    ComponenteBotonIcon botonIcon = new ComponenteBotonIcon();

    /**
     * Creates new form Menu
     */
    public Menu() {

        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        transparenciButton();
    }

    public Menu(int numeroboton) {

        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        transparenciButton();
        nombrarmenu(numeroboton);
        numeromenu=numeroboton;
    }

    public Menu(Usuario usuario) {

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(374, 186));
        setPreferredSize(new java.awt.Dimension(374, 186));
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
        Accion1btn.setText(" AGREGAR CLIENTE");
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
        Accion2btn.setText("VER LIBRETA");
        Accion2btn.setBorder(null);
        Accion2btn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aprovechar.png"))); // NOI18N
        Accion2btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Accion2btnActionPerformed(evt);
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
                    .addComponent(Accion1btn, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_oscuro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Regresarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(461, 461, 461))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btn_oscuro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Accion1btn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)))
                        .addComponent(Accion2btn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Regresarbtn)))
                .addGap(0, 441, Short.MAX_VALUE))
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
        direccionarmenu(numeromenu, 2);
    }//GEN-LAST:event_Accion2btnActionPerformed

    private void Accion1btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Accion1btnActionPerformed
        // TODO add your handling code here:
        /* Libreta cliente = new Libreta();
        cliente.setVisible(true);
        dispose();*/
        direccionarmenu(numeromenu, 1);

    }//GEN-LAST:event_Accion1btnActionPerformed
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
        botonIcon.setBotonActivador(btn_oscuro);
        botonIcon.setNombreimagen(imagen);
        botonIcon.getBotonActivador();
    }

    private void nombrarmenu(int numeromenu) {
        if (numeromenu == 1) {
            Accion1btn.setText("AGREGAR CLIENTE");
            Accion2btn.setText("VER LIBRETA");

        } else if (numeromenu == 2) {
            Accion1btn.setText("CREAR CUENTA");
            Accion2btn.setText("VER COLABORADORES");
        } else if (numeromenu == 3) {
            Accion1btn.setText("CREAR PROVEEDOR");
            Accion2btn.setText("VER PROVEEDORES");
        } else if (numeromenu == 4) {
            Accion1btn.setText("AÑADIR MERCADERIA");
            Accion2btn.setText("GENERAR VENTA");
        }
        
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
            if (accion == 1) {
                CrearCuenta crearcuenta = new CrearCuenta();
                crearcuenta.setVisible(true);
                dispose();
            } else if (accion == 2) {
                Colaborador colaborador = new Colaborador();
                colaborador.setVisible(true);
                dispose();
            }
        } else if (numeromenu == 3) {
            if (accion == 1) {
                Proveedor proveedor = new Proveedor();
                proveedor.setVisible(true);
                dispose();
            } else if (accion == 2) {
                ProveedorVista proveedor = new ProveedorVista();
                proveedor.setVisible(true);
                dispose();
            }
        } else if (numeromenu == 4) {
            if (accion == 1) {
                Mercaderia mercaderia = new Mercaderia();
                mercaderia.setVisible(true);
                dispose();
            } else if (accion == 2) {
                Ventas venta=new Ventas();
                venta.setVisible(true);
                dispose();
            }
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Accion1btn;
    private javax.swing.JButton Accion2btn;
    private javax.swing.JButton Regresarbtn;
    private javax.swing.JButton btn_oscuro;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}