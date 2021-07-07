/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Clases.ColorearInterfazBlanco;
import Clases.ColorearInterfazNegro;
import Clases.Usuario;
import ClasesSQL.UsuarioSQL;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import javax.swing.ImageIcon;
import sun.security.util.Password;
import java.awt.Color;
import Conexion.ConexionBD;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import sun.security.util.Password;

/**
 *
 * @author jenif
 */
public class Ingreso extends javax.swing.JFrame {

    String usuario = "";
    Password contraseña3;
    String pass_concatenada;
    ConexionBD sQL = new ConexionBD();
    ColorearInterfazNegro pintarInterfaz = new ColorearInterfazNegro();
    ColorearInterfazBlanco pintarInterfazBlanco = new ColorearInterfazBlanco();
    ArrayList<Usuario> listaUsuarios=new ArrayList<Usuario>();
    UsuarioSQL usuariosql=new UsuarioSQL();
    /**
     * Creates new form Menu
     */
    public Ingreso() {

        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        transparenciButton();
        if (sQL.getConnection() != null) {
            JOptionPane.showMessageDialog(null, "Conexión Exitosa");
        }
        listaUsuarios=usuariosql.BuscarUsuario();
    }

    public void transparenciButton() {
        jButton2.setOpaque(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setBorderPainted(false);

        Registrarbtn.setOpaque(false);
        Registrarbtn.setContentAreaFilled(false);
        Registrarbtn.setBorderPainted(false);

        Entrarbtn.setOpaque(false);
        Entrarbtn.setContentAreaFilled(false);
        Entrarbtn.setBorderPainted(false);

        RecuperarContraseñiabtn.setOpaque(false);
        RecuperarContraseñiabtn.setContentAreaFilled(false);
        RecuperarContraseñiabtn.setBorderPainted(false);

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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Usuariotxt = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        Contraseñiatxt = new javax.swing.JPasswordField();
        Entrarbtn = new javax.swing.JButton();
        Registrarbtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        RecuperarContraseñiabtn = new javax.swing.JButton();
        btn_oscuro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Contraseña");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Usuario");

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        Usuariotxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Usuariotxt.setForeground(new java.awt.Color(153, 153, 153));
        Usuariotxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Usuariotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuariotxtActionPerformed(evt);
            }
        });
        Usuariotxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UsuariotxtKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Usuariotxt, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(Usuariotxt, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));

        Contraseñiatxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Contraseñiatxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ContraseñiatxtKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Contraseñiatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(Contraseñiatxt, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        Entrarbtn.setBackground(new java.awt.Color(0, 0, 102));
        Entrarbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Entrarbtn.setForeground(new java.awt.Color(102, 102, 102));
        Entrarbtn.setText("Entrar");
        Entrarbtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Entrarbtn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aprovechar.png"))); // NOI18N
        Entrarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarbtnActionPerformed(evt);
            }
        });

        Registrarbtn.setBackground(new java.awt.Color(0, 0, 102));
        Registrarbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Registrarbtn.setForeground(new java.awt.Color(102, 102, 102));
        Registrarbtn.setText("Registrarse");
        Registrarbtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Registrarbtn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aprovechar.png"))); // NOI18N
        Registrarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarbtnActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cuadro-de-contrasena-con-asteriscos.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/InicioS.png"))); // NOI18N

        RecuperarContraseñiabtn.setBackground(new java.awt.Color(0, 0, 102));
        RecuperarContraseñiabtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RecuperarContraseñiabtn.setForeground(new java.awt.Color(102, 102, 102));
        RecuperarContraseñiabtn.setText("Recuperar Contraseña");
        RecuperarContraseñiabtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        RecuperarContraseñiabtn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aprovechar.png"))); // NOI18N
        RecuperarContraseñiabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecuperarContraseñiabtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(109, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(RecuperarContraseñiabtn)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(Registrarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Entrarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jLabel2)
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(RecuperarContraseñiabtn)
                .addGap(68, 68, 68)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Registrarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Entrarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 263, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159)
                .addComponent(btn_oscuro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(btn_oscuro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsuariotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuariotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuariotxtActionPerformed

    private void UsuariotxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UsuariotxtKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            usuario = Usuariotxt.getText();
            Contraseñiatxt.setText("");
            Contraseñiatxt.requestFocus();
        }
    }//GEN-LAST:event_UsuariotxtKeyPressed

    private void ContraseñiatxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ContraseñiatxtKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            char[] contraseña = Contraseñiatxt.getPassword();

        }
    }//GEN-LAST:event_ContraseñiatxtKeyPressed

    private void EntrarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarbtnActionPerformed
        // TODO add your handling code here:
        usuario = Usuariotxt.getText();
        char[] contraseña = Contraseñiatxt.getPassword();
        System.out.println("1 Usuario" + usuario);
        System.out.println("2 Contraseña" + contraseña);
        for (Clases.Usuario usuario : listaUsuarios ) {
            if(usuario.equals(usuario.getUsuario()) && contraseña.equals(usuario.getContraseña())){
                Menu3 menu=new Menu3();
                menu.setVisible(true);
            }
        }
    }//GEN-LAST:event_EntrarbtnActionPerformed

    private void RegistrarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarbtnActionPerformed
        // TODO add your handling code here:
        CrearCuenta menux = new CrearCuenta();
        menux.setVisible(true);
        dispose();
    }//GEN-LAST:event_RegistrarbtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void RecuperarContraseñiabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecuperarContraseñiabtnActionPerformed
        // TODO add your handling code here:
        RecuperarContrasenia menux = new RecuperarContrasenia();
        menux.setVisible(true);
        dispose();
    }//GEN-LAST:event_RecuperarContraseñiabtnActionPerformed

    private void btn_oscuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_oscuroActionPerformed
        if (!modoOscuro) {
            pintarInterfaz.ColorearIngresoNegro(jPanel1, jPanel2, btn_oscuro, Usuariotxt, Contraseñiatxt, Entrarbtn, Registrarbtn, RecuperarContraseñiabtn);
            modoOscuro = true;
        } else if (modoOscuro == true) {
            pintarInterfazBlanco.ColorearIngresoBlanco(jPanel1, jPanel2, btn_oscuro, Usuariotxt, Contraseñiatxt, Entrarbtn, Registrarbtn, RecuperarContraseñiabtn);
            modoOscuro = false;
        }
    }//GEN-LAST:event_btn_oscuroActionPerformed
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
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingreso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Contraseñiatxt;
    private javax.swing.JButton Entrarbtn;
    private javax.swing.JButton RecuperarContraseñiabtn;
    private javax.swing.JButton Registrarbtn;
    private javax.swing.JTextField Usuariotxt;
    private javax.swing.JButton btn_oscuro;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
