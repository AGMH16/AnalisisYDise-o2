/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Clases.ColorearInterfazBlanco;
import Clases.ColorearInterfazNegro;
import ClasesSQL.LibretaClienteSQL;
import ClasesSQL.ProveedorSQL;
import Usuario.Compresor;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import sun.security.util.Password;

/**
 *
 * @author jenif
 */
public class Proveedor extends javax.swing.JFrame {

    String nombre = "", telefono = "", direccion = "", empresa = "";
    ColorearInterfazNegro pintarInterfaz = new ColorearInterfazNegro();
    ColorearInterfazBlanco pintarInterfazBlanco = new ColorearInterfazBlanco();
    ProveedorSQL proveedorSQL = new ProveedorSQL();
    int IdProveedor = 0;

    /**
     * Creates new form Menu
     */
    public Proveedor() {

        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        transparenciButton();
    }

    public void transparenciButton() {
        jButton2.setOpaque(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setBorderPainted(false);
        CrearCuentabtn.setOpaque(false);
        CrearCuentabtn.setContentAreaFilled(false);
        CrearCuentabtn.setBorderPainted(false);
        jButton3.setOpaque(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setBorderPainted(false);
        EliminarCuentabtn.setOpaque(false);
        EliminarCuentabtn.setContentAreaFilled(false);
        EliminarCuentabtn.setBorderPainted(false);
        ActualizarCuentabtn.setOpaque(false);
        ActualizarCuentabtn.setContentAreaFilled(false);
        ActualizarCuentabtn.setBorderPainted(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        CrearCuentabtn = new javax.swing.JButton();
        TelefonoProveedortxt = new javax.swing.JTextField();
        EmpresaProveedortxt = new javax.swing.JTextField();
        EliminarCuentabtn = new javax.swing.JButton();
        ActualizarCuentabtn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        NombreProveedortxt1 = new javax.swing.JTextField();
        direcciontxt = new javax.swing.JTextField();
        Buscartxt = new javax.swing.JButton();
        btn_oscuro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 102, 102));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-de-regreso.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 40, -1, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 102, 102));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton-salir-a-la-aplicacion.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(242, 253, 250));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        CrearCuentabtn.setBackground(new java.awt.Color(0, 0, 102));
        CrearCuentabtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CrearCuentabtn.setForeground(new java.awt.Color(102, 102, 102));
        CrearCuentabtn.setText("Guardar");
        CrearCuentabtn.setBorder(null);
        CrearCuentabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearCuentabtnActionPerformed(evt);
            }
        });

        TelefonoProveedortxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TelefonoProveedortxt.setForeground(new java.awt.Color(102, 102, 102));
        TelefonoProveedortxt.setText("Telefono");
        TelefonoProveedortxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TelefonoProveedortxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefonoProveedortxtActionPerformed(evt);
            }
        });
        TelefonoProveedortxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TelefonoProveedortxtKeyPressed(evt);
            }
        });

        EmpresaProveedortxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        EmpresaProveedortxt.setForeground(new java.awt.Color(102, 102, 102));
        EmpresaProveedortxt.setText("Empresa");
        EmpresaProveedortxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        EmpresaProveedortxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpresaProveedortxtActionPerformed(evt);
            }
        });
        EmpresaProveedortxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EmpresaProveedortxtKeyPressed(evt);
            }
        });

        EliminarCuentabtn.setBackground(new java.awt.Color(0, 0, 102));
        EliminarCuentabtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        EliminarCuentabtn.setForeground(new java.awt.Color(102, 102, 102));
        EliminarCuentabtn.setText("Eliminar");
        EliminarCuentabtn.setBorder(null);
        EliminarCuentabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarCuentabtnActionPerformed(evt);
            }
        });

        ActualizarCuentabtn.setBackground(new java.awt.Color(0, 0, 102));
        ActualizarCuentabtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ActualizarCuentabtn.setForeground(new java.awt.Color(102, 102, 102));
        ActualizarCuentabtn.setText("Actualizar");
        ActualizarCuentabtn.setBorder(null);
        ActualizarCuentabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarCuentabtnActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("PROVEEDOR");

        NombreProveedortxt1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NombreProveedortxt1.setForeground(new java.awt.Color(102, 102, 102));
        NombreProveedortxt1.setText("Nombre Completo");
        NombreProveedortxt1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        NombreProveedortxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreProveedortxt1ActionPerformed(evt);
            }
        });
        NombreProveedortxt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NombreProveedortxt1KeyPressed(evt);
            }
        });

        direcciontxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        direcciontxt.setForeground(new java.awt.Color(102, 102, 102));
        direcciontxt.setText("Dirección");
        direcciontxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        direcciontxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direcciontxtActionPerformed(evt);
            }
        });
        direcciontxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                direcciontxtKeyPressed(evt);
            }
        });

        Buscartxt.setBackground(new java.awt.Color(102, 102, 102));
        Buscartxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Buscartxt.setForeground(new java.awt.Color(102, 102, 102));
        Buscartxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar (1).png"))); // NOI18N
        Buscartxt.setBorder(null);
        Buscartxt.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aprovechar.png"))); // NOI18N
        Buscartxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscartxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NombreProveedortxt1)
                            .addComponent(TelefonoProveedortxt)
                            .addComponent(EmpresaProveedortxt)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(ActualizarCuentabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(EliminarCuentabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CrearCuentabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(direcciontxt, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Buscartxt, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(Buscartxt, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(NombreProveedortxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TelefonoProveedortxt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(direcciontxt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EmpresaProveedortxt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ActualizarCuentabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EliminarCuentabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CrearCuentabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(186, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btn_oscuro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btn_oscuro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 510, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TelefonoProveedortxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefonoProveedortxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelefonoProveedortxtActionPerformed

    private void TelefonoProveedortxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TelefonoProveedortxtKeyPressed
        // TODO add your handling code here:
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            telefono = TelefonoProveedortxt.getText();
            direcciontxt.setText("");
            direcciontxt.requestFocus();
        }
    }//GEN-LAST:event_TelefonoProveedortxtKeyPressed

    private void CrearCuentabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearCuentabtnActionPerformed
        nombre = NombreProveedortxt1.getText();
        telefono = TelefonoProveedortxt.getText();
        direccion = direcciontxt.getText();
        empresa = EmpresaProveedortxt.getText();
        System.out.println(nombre);
        System.out.println(telefono);
        System.out.println(direccion);
        System.out.println(empresa);
        proveedorSQL.InsertarProveedor(nombre, direccion, telefono, empresa);

    }//GEN-LAST:event_CrearCuentabtnActionPerformed
    private String comprimir(String frase) {
        Compresor compresor = new Compresor();
        String Cadena_en_binario = compresor.CodigoAscii_a_binario(frase);
        String cadena_simple = compresor.cadena_RLE(Cadena_en_binario);
        String ultima_cadena = compresor.rle_a_Ascii(cadena_simple);
        return ultima_cadena;
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jPanel1.setBackground(Color.decode("#212b41"));
        /*   Ingreso menux = new Ingreso();
        menux.setVisible(true);
        dispose();*/
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void EmpresaProveedortxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpresaProveedortxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmpresaProveedortxtActionPerformed

    private void EmpresaProveedortxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EmpresaProveedortxtKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            empresa = EmpresaProveedortxt.getText();

        }
    }//GEN-LAST:event_EmpresaProveedortxtKeyPressed

    private void EliminarCuentabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarCuentabtnActionPerformed
        // TODO add your handling code here:
        proveedorSQL.DeleteProveedor(IdProveedor);
        NombreProveedortxt1.setText(null);
        TelefonoProveedortxt.setText(null);
        direcciontxt.setText(null);
        EmpresaProveedortxt.setText(null);
    }//GEN-LAST:event_EliminarCuentabtnActionPerformed

    private void ActualizarCuentabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarCuentabtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ActualizarCuentabtnActionPerformed

    private void NombreProveedortxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreProveedortxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreProveedortxt1ActionPerformed

    private void NombreProveedortxt1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreProveedortxt1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreProveedortxt1KeyPressed

    boolean modoOscuro = false;
    private void btn_oscuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_oscuroActionPerformed
        if (!modoOscuro) {
            pintarInterfaz.ColorearProveedorNegro(jPanel1, jPanel2, btn_oscuro, NombreProveedortxt1, TelefonoProveedortxt, EmpresaProveedortxt, direcciontxt, CrearCuentabtn, ActualizarCuentabtn, EliminarCuentabtn);
            modoOscuro = true;
        } else if (modoOscuro == true) {
            pintarInterfazBlanco.ColorearProveedorBlanco(jPanel1, jPanel2, btn_oscuro, NombreProveedortxt1, TelefonoProveedortxt, EmpresaProveedortxt, direcciontxt, CrearCuentabtn, ActualizarCuentabtn, EliminarCuentabtn);
            modoOscuro = false;
        }
    }//GEN-LAST:event_btn_oscuroActionPerformed

    private void direcciontxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direcciontxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direcciontxtActionPerformed

    private void direcciontxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_direcciontxtKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_direcciontxtKeyPressed

    private void BuscartxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscartxtActionPerformed
        // TODO add your handling code here:
        String nombreProveedor = JOptionPane.showInputDialog("Ingrese el nombre del Proveedor");
        IdProveedor = proveedorSQL.BuscarProveedorPorNombre(NombreProveedortxt1, TelefonoProveedortxt, direcciontxt, EmpresaProveedortxt, nombreProveedor);
        System.out.println("idProveedor" + IdProveedor);
    }//GEN-LAST:event_BuscartxtActionPerformed

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
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Proveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActualizarCuentabtn;
    private javax.swing.JButton Buscartxt;
    private javax.swing.JButton CrearCuentabtn;
    private javax.swing.JButton EliminarCuentabtn;
    private javax.swing.JTextField EmpresaProveedortxt;
    private javax.swing.JTextField NombreProveedortxt1;
    private javax.swing.JTextField TelefonoProveedortxt;
    private javax.swing.JButton btn_oscuro;
    private javax.swing.JTextField direcciontxt;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
