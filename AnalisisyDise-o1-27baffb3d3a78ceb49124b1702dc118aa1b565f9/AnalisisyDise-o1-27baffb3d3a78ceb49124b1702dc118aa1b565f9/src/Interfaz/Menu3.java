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
public class Menu3 extends javax.swing.JFrame {

    private boolean modoOscuro;
    ComponentePanel panel = new ComponentePanel();
    ComponenteLabelText text = new ComponenteLabelText();
    ComponenteLabelText label = new ComponenteLabelText();
    ComponenteBoton boton = new ComponenteBoton();
    ComponenteBotonIcon botonIcon = new ComponenteBotonIcon();
    Usuario usuario = new Usuario();

    /**
     * Creates new form Menu
     */
    public Menu3() {

        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        transparenciButton();
    }

    public Menu3(Usuario usuario) {

        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        transparenciButton();
        this.usuario=usuario;
    }

    public void transparenciButton() {
        Clientebtn.setOpaque(false);
        Clientebtn.setContentAreaFilled(false);
        Clientebtn.setBorderPainted(false);
        jButton2.setOpaque(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setBorderPainted(false);
        InsumoConsumobtn.setOpaque(false);
        InsumoConsumobtn.setContentAreaFilled(false);
        InsumoConsumobtn.setBorderPainted(false);
        InsumoUsobtn.setOpaque(false);
        InsumoUsobtn.setContentAreaFilled(false);
        InsumoUsobtn.setBorderPainted(false);
        Proveedorbtn.setOpaque(false);
        Proveedorbtn.setContentAreaFilled(false);
        Proveedorbtn.setBorderPainted(false);
        Ventabtn.setOpaque(false);
        Ventabtn.setContentAreaFilled(false);
        Ventabtn.setBorderPainted(false);
        Usuariobtn.setOpaque(false);
        Usuariobtn.setContentAreaFilled(false);
        Usuariobtn.setBorderPainted(false);
        MateriaPrimabtn.setOpaque(false);
        MateriaPrimabtn.setContentAreaFilled(false);
        MateriaPrimabtn.setBorderPainted(false);

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
        jPanel2 = new javax.swing.JPanel();
        Clientebtn = new javax.swing.JButton();
        InsumoUsobtn = new javax.swing.JButton();
        Ventabtn = new javax.swing.JButton();
        InsumoConsumobtn = new javax.swing.JButton();
        MateriaPrimabtn = new javax.swing.JButton();
        Usuariobtn = new javax.swing.JButton();
        Proveedorbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 604));
        setPreferredSize(new java.awt.Dimension(900, 604));
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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        Clientebtn.setBackground(new java.awt.Color(0, 0, 102));
        Clientebtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Clientebtn.setForeground(new java.awt.Color(102, 102, 102));
        Clientebtn.setText(" CLIENTE");
        Clientebtn.setBorder(null);
        Clientebtn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aprovechar.png"))); // NOI18N
        Clientebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientebtnActionPerformed(evt);
            }
        });

        InsumoUsobtn.setBackground(new java.awt.Color(0, 0, 102));
        InsumoUsobtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        InsumoUsobtn.setForeground(new java.awt.Color(102, 102, 102));
        InsumoUsobtn.setText("INSUMOS PARA USO");
        InsumoUsobtn.setBorder(null);
        InsumoUsobtn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aprovechar.png"))); // NOI18N
        InsumoUsobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsumoUsobtnActionPerformed(evt);
            }
        });

        Ventabtn.setBackground(new java.awt.Color(0, 0, 102));
        Ventabtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Ventabtn.setForeground(new java.awt.Color(102, 102, 102));
        Ventabtn.setText("VENTA");
        Ventabtn.setBorder(null);
        Ventabtn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aprovechar.png"))); // NOI18N
        Ventabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentabtnActionPerformed(evt);
            }
        });

        InsumoConsumobtn.setBackground(new java.awt.Color(0, 0, 102));
        InsumoConsumobtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        InsumoConsumobtn.setForeground(new java.awt.Color(102, 102, 102));
        InsumoConsumobtn.setText("INSUMO PARA CONSUMO");
        InsumoConsumobtn.setBorder(null);
        InsumoConsumobtn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aprovechar.png"))); // NOI18N
        InsumoConsumobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsumoConsumobtnActionPerformed(evt);
            }
        });

        MateriaPrimabtn.setBackground(new java.awt.Color(0, 0, 102));
        MateriaPrimabtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        MateriaPrimabtn.setForeground(new java.awt.Color(102, 102, 102));
        MateriaPrimabtn.setText(" MATERIA PRIMA");
        MateriaPrimabtn.setBorder(null);
        MateriaPrimabtn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aprovechar.png"))); // NOI18N
        MateriaPrimabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MateriaPrimabtnActionPerformed(evt);
            }
        });

        Usuariobtn.setBackground(new java.awt.Color(0, 0, 102));
        Usuariobtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Usuariobtn.setForeground(new java.awt.Color(102, 102, 102));
        Usuariobtn.setText("USUARIO");
        Usuariobtn.setBorder(null);
        Usuariobtn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aprovechar.png"))); // NOI18N
        Usuariobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuariobtnActionPerformed(evt);
            }
        });

        Proveedorbtn.setBackground(new java.awt.Color(0, 0, 102));
        Proveedorbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Proveedorbtn.setForeground(new java.awt.Color(102, 102, 102));
        Proveedorbtn.setText("PROVEEDOR");
        Proveedorbtn.setBorder(null);
        Proveedorbtn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aprovechar.png"))); // NOI18N
        Proveedorbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProveedorbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Clientebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(InsumoConsumobtn, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                            .addComponent(InsumoUsobtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Usuariobtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MateriaPrimabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ventabtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Proveedorbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(110, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(Clientebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(InsumoUsobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(InsumoConsumobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MateriaPrimabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Usuariobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Proveedorbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(Ventabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btn_oscuro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(167, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(btn_oscuro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClientebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientebtnActionPerformed
        // TODO add your handling code here:
        /* Libreta cliente = new Libreta();
        cliente.setVisible(true);
        dispose();*/
        Menu menu = new Menu(1);
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_ClientebtnActionPerformed

    private void InsumoUsobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsumoUsobtnActionPerformed
        // TODO add your handling code here:
        Inventario inventario = new Inventario();
        inventario.setVisible(true);
        dispose();
    }//GEN-LAST:event_InsumoUsobtnActionPerformed

    private void VentabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentabtnActionPerformed
        // TODO add your handling code here:
        Menu menu = new Menu(4);
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_VentabtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void InsumoConsumobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsumoConsumobtnActionPerformed
        // TODO add your handling code here:
        MedicamentosYAlimentos medicamentosYAlimentos = new MedicamentosYAlimentos();
        medicamentosYAlimentos.setVisible(true);
        dispose();
    }//GEN-LAST:event_InsumoConsumobtnActionPerformed

    private void MateriaPrimabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MateriaPrimabtnActionPerformed
        // TODO add your handling code here:
        MenuMateriaPrima materiaPrima = new MenuMateriaPrima();
        // MateriaPrima materiaPrima = new MateriaPrima(usuario);
        materiaPrima.setVisible(true);
        dispose();
    }//GEN-LAST:event_MateriaPrimabtnActionPerformed

    private void UsuariobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuariobtnActionPerformed
        // TODO add your handling code here:
        Menu menu = new Menu(2);
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_UsuariobtnActionPerformed

    private void ProveedorbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProveedorbtnActionPerformed
        // TODO add your handling code here:
        Menu menu = new Menu(3);
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_ProveedorbtnActionPerformed

    private void btn_oscuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_oscuroActionPerformed
        if (!modoOscuro) {
            Pintar(Color.decode("#FFFFE0"), "/Imagenes/darkmode_2.png", Color.decode("#2e3951"), Color.decode("#212b41"));

            modoOscuro = true;
        } else if (modoOscuro == true) {
            Pintar(Color.decode("#66646C"), "/Imagenes/darkmode_1.png", Color.WHITE, Color.decode("#F2FDFA"));
            modoOscuro = false;
        }
    }//GEN-LAST:event_btn_oscuroActionPerformed
    private void Pintar(Color colorbotones, String imagen, Color colorbase, Color colorfondo) {
        panel.setPanelBase(jPanel2);
        panel.setColorBase(colorbase);
        panel.getPanelBase();
        panel.setPanelFondo(jPanel1);
        panel.setColorFondo(colorfondo);
        panel.getPanelFondo();
        boton.setBoton(Clientebtn);
        boton.setColorBoton(colorbotones);
        boton.getBoton();
        boton.setBoton(InsumoConsumobtn);
        boton.setColorBoton(colorbotones);
        boton.getBoton();
        boton.setBoton(InsumoUsobtn);
        boton.setColorBoton(colorbotones);
        boton.getBoton();
        boton.setBoton(MateriaPrimabtn);
        boton.setColorBoton(colorbotones);
        boton.getBoton();
        boton.setBoton(Usuariobtn);
        boton.setColorBoton(colorbotones);
        boton.getBoton();
        boton.setBoton(Proveedorbtn);
        boton.setColorBoton(colorbotones);
        boton.getBoton();
        boton.setBoton(Ventabtn);
        boton.setColorBoton(colorbotones);
        boton.getBoton();
        botonIcon.setBotonActivador(btn_oscuro);
        botonIcon.setNombreimagen(imagen);
        botonIcon.getBotonActivador();
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
            java.util.logging.Logger.getLogger(Menu3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clientebtn;
    private javax.swing.JButton InsumoConsumobtn;
    private javax.swing.JButton InsumoUsobtn;
    private javax.swing.JButton MateriaPrimabtn;
    private javax.swing.JButton Proveedorbtn;
    private javax.swing.JButton Usuariobtn;
    private javax.swing.JButton Ventabtn;
    private javax.swing.JButton btn_oscuro;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
