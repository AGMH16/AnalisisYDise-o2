/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Clases.ColorearInterfazBlanco;
import Clases.ColorearInterfazNegro;
import ClasesSQL.UsuarioSQL;
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
public class CrearCuenta extends javax.swing.JFrame {

    int IdUsuario = 0;
    String usuario = "", correo_electronico = "", nombres = "", apellidos = "", puesto = "";
    Password contraseña3;
    String pass_concatenada = "", pass_concatenada2 = "";
    boolean verificacion;
    ColorearInterfazNegro pintarInterfaz = new ColorearInterfazNegro();
    ColorearInterfazBlanco pintarInterfazBlanco = new ColorearInterfazBlanco();
    UsuarioSQL usuarioSQL = new UsuarioSQL();

    /**
     * Creates new form Menu
     */
    public CrearCuenta() {

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
        CrearCuentabtn.setOpaque(false);
        CrearCuentabtn.setContentAreaFilled(false);
        CrearCuentabtn.setBorderPainted(false);
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
        CrearCuentabtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Usuariotxt = new javax.swing.JTextField();
        Contraseñatxt = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Correotxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        ApellidoColaboradortxt = new javax.swing.JTextField();
        NombreColaboradortxt = new javax.swing.JTextField();
        Supervisorrb = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        Contraseñatxt1 = new javax.swing.JPasswordField();
        Buscartxt = new javax.swing.JButton();
        PuestoLaboralcmbx = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        btn_oscuro = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(244, 253, 251));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 500));

        CrearCuentabtn.setBackground(new java.awt.Color(0, 0, 102));
        CrearCuentabtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CrearCuentabtn.setForeground(new java.awt.Color(102, 102, 102));
        CrearCuentabtn.setText("Crear Cuenta");
        CrearCuentabtn.setBorder(null);
        CrearCuentabtn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aprovechar.png"))); // NOI18N
        CrearCuentabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearCuentabtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Contraseña");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/campo-de-contrasena-con-asteriscos.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/campo-de-contrasena-con-asteriscos.png"))); // NOI18N

        Usuariotxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Usuariotxt.setForeground(new java.awt.Color(102, 102, 102));
        Usuariotxt.setText("Usuario");
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

        Contraseñatxt.setForeground(new java.awt.Color(102, 102, 102));
        Contraseñatxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Contraseñatxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContraseñatxtActionPerformed(evt);
            }
        });
        Contraseñatxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ContraseñatxtKeyPressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Confirmar Contraseña");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/correo-electronico (2).png"))); // NOI18N

        Correotxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Correotxt.setForeground(new java.awt.Color(102, 102, 102));
        Correotxt.setText("Correo Electronico");
        Correotxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Correotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorreotxtActionPerformed(evt);
            }
        });
        Correotxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CorreotxtKeyPressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("DATOS DEL COLABORADOR");

        ApellidoColaboradortxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ApellidoColaboradortxt.setForeground(new java.awt.Color(102, 102, 102));
        ApellidoColaboradortxt.setText("Apellidos");
        ApellidoColaboradortxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ApellidoColaboradortxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidoColaboradortxtActionPerformed(evt);
            }
        });
        ApellidoColaboradortxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ApellidoColaboradortxtKeyPressed(evt);
            }
        });

        NombreColaboradortxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NombreColaboradortxt.setForeground(new java.awt.Color(102, 102, 102));
        NombreColaboradortxt.setText("Nombres");
        NombreColaboradortxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        NombreColaboradortxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreColaboradortxtActionPerformed(evt);
            }
        });
        NombreColaboradortxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NombreColaboradortxtKeyPressed(evt);
            }
        });

        Supervisorrb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Supervisorrb.setForeground(new java.awt.Color(102, 102, 102));
        Supervisorrb.setText("Supervisor");
        Supervisorrb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupervisorrbActionPerformed(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario (2).png"))); // NOI18N

        Contraseñatxt1.setForeground(new java.awt.Color(102, 102, 102));
        Contraseñatxt1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Contraseñatxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Contraseñatxt1ActionPerformed(evt);
            }
        });
        Contraseñatxt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Contraseñatxt1KeyPressed(evt);
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

        PuestoLaboralcmbx.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PuestoLaboralcmbx.setForeground(new java.awt.Color(102, 102, 102));
        PuestoLaboralcmbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Puesto Laboral" }));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 102, 102));
        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Contraseñatxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(Contraseñatxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(56, 56, 56)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CrearCuentabtn, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                    .addComponent(Supervisorrb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Buscartxt, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(PuestoLaboralcmbx, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1))
                                    .addComponent(NombreColaboradortxt)
                                    .addComponent(ApellidoColaboradortxt)
                                    .addComponent(Correotxt, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
                                    .addComponent(Usuariotxt)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel11)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel11)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(34, Short.MAX_VALUE)
                        .addComponent(Buscartxt, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(NombreColaboradortxt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ApellidoColaboradortxt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(Usuariotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(PuestoLaboralcmbx, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1))
                                .addGap(18, 18, 18)
                                .addComponent(Correotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Contraseñatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(Supervisorrb))
                                .addGap(18, 18, 18)
                                .addComponent(CrearCuentabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(Contraseñatxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103))))
        );

        btn_oscuro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/darkmode_1.png"))); // NOI18N
        btn_oscuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_oscuroActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 102, 102));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-de-regreso.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 102, 102));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar-sesion.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 808, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_oscuro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jButton3))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_oscuro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(117, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 860));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsuariotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuariotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuariotxtActionPerformed

    private void UsuariotxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UsuariotxtKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            usuario = Usuariotxt.getText();
            //   PuestoLaboraltxt.setText("");
            //  PuestoLaboraltxt.requestFocus();
        }
    }//GEN-LAST:event_UsuariotxtKeyPressed

    private void ContraseñatxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ContraseñatxtKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            pass_concatenada = "";
            char[] contraseña = Contraseñatxt.getPassword();
            for (int i = 0; i < contraseña.length; i++) {
                pass_concatenada = pass_concatenada + contraseña[i];
                System.out.println(contraseña[i]);
                // System.out.println("pass   " + pass_concatenada);

            }
            // System.out.println("pass   " + pass_concatenada);
            Contraseñatxt1.setText("");
            Contraseñatxt1.requestFocus();
        }
    }//GEN-LAST:event_ContraseñatxtKeyPressed

    private void CrearCuentabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearCuentabtnActionPerformed
        // TODO add your handling code here:
        nombres = NombreColaboradortxt.getText();
        apellidos = ApellidoColaboradortxt.getText();
        usuario = Usuariotxt.getText();
        correo_electronico = Correotxt.getText();
        puesto = (String) PuestoLaboralcmbx.getSelectedItem();
        char[] contraseña1 = Contraseñatxt.getPassword();
        for (int i = 0; i < contraseña1.length; i++) {
            pass_concatenada2 = pass_concatenada2 + contraseña1[i];
        //    System.out.println(contraseña1[i]);
        }
        char[] contraseña2 = Contraseñatxt1.getPassword();
        for (int i = 0; i < contraseña2.length; i++) {
            pass_concatenada = pass_concatenada + contraseña2[i];
            System.out.println(contraseña2[i]);
        }

        System.out.println("Nombre:" + nombres);
        System.out.println("Apellidos" + apellidos);
        System.out.println("Usuario" + usuario);
        System.out.println("Puesto" + puesto);
        System.out.println("Correo Electronico" + correo_electronico);
        System.out.println("Contraseña" + pass_concatenada);
        System.out.println("Verificación" + verificacion);
        String xx;
        xx = comprimir(pass_concatenada);
        System.out.println("Esta si:"+xx);

        usuarioSQL.InsertarUsuario(nombres, apellidos, verificacion, usuario, xx, puesto, correo_electronico);


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

    private void ContraseñatxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContraseñatxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContraseñatxtActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void CorreotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorreotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CorreotxtActionPerformed

    private void CorreotxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CorreotxtKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            correo_electronico = Correotxt.getText();
            Contraseñatxt.setText("");
            Contraseñatxt.requestFocus();
        }
    }//GEN-LAST:event_CorreotxtKeyPressed

    private void ApellidoColaboradortxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoColaboradortxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApellidoColaboradortxtActionPerformed

    private void ApellidoColaboradortxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ApellidoColaboradortxtKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            apellidos = ApellidoColaboradortxt.getText();
            Usuariotxt.setText("");
            Usuariotxt.requestFocus();
        }
    }//GEN-LAST:event_ApellidoColaboradortxtKeyPressed

    private void NombreColaboradortxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreColaboradortxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreColaboradortxtActionPerformed

    private void NombreColaboradortxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreColaboradortxtKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            nombres = NombreColaboradortxt.getText();
            ApellidoColaboradortxt.setText("");
            ApellidoColaboradortxt.requestFocus();
        }
    }//GEN-LAST:event_NombreColaboradortxtKeyPressed
    boolean modoOscuro = false;
    private void btn_oscuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_oscuroActionPerformed
        // TODO add your handling code here:
        /* if (!modoOscuro) {
            pintarInterfaz.ColorearCrearCuentaNegro(jPanel1, jPanel2, btn_oscuro, CrearCuentabtn, NombreColaboradortxt, ApellidoColaboradortxt, Correotxt, PuestoLaboraltxt, Usuariotxt, Contraseñatxt, Contraseñatxt1);
            modoOscuro = true;
        } else {
            pintarInterfazBlanco.ColorearCrearCuentaBlanco(jPanel1, jPanel2, btn_oscuro, CrearCuentabtn, NombreColaboradortxt, ApellidoColaboradortxt, Correotxt, PuestoLaboraltxt, Usuariotxt, Contraseñatxt, Contraseñatxt1);
            modoOscuro = false;
        }*/
    }//GEN-LAST:event_btn_oscuroActionPerformed

    private void Contraseñatxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Contraseñatxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Contraseñatxt1ActionPerformed

    private void Contraseñatxt1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Contraseñatxt1KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            pass_concatenada2 = "";
            char[] contraseña2 = Contraseñatxt1.getPassword();
            for (int i = 0; i < contraseña2.length; i++) {
                pass_concatenada2 = pass_concatenada2 + contraseña2[i];
                System.out.println(contraseña2[i]);
            }

        }
    }//GEN-LAST:event_Contraseñatxt1KeyPressed

    private void BuscartxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscartxtActionPerformed
        // TODO add your handling code here:
        String correoReferencia = JOptionPane.showInputDialog("Ingrese el correo ");
        IdUsuario = usuarioSQL.BuscarUsuarioPorCorreo(NombreColaboradortxt, ApellidoColaboradortxt, Usuariotxt, PuestoLaboralcmbx, Correotxt, correoReferencia);
        // IdProveedor = proveedorSQL.BuscarProveedorPorNombre(NombreProveedortxt1, TelefonoProveedortxt, direcciontxt, EmpresaProveedortxt, nombreProveedor);
        System.out.println("idUsuario" + IdUsuario);
    }//GEN-LAST:event_BuscartxtActionPerformed

    private void SupervisorrbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupervisorrbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SupervisorrbActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String puesto = JOptionPane.showInputDialog("Ingrese el nuevo puesto");
        PuestoLaboralcmbx.addItem(puesto);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new CrearCuenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApellidoColaboradortxt;
    private javax.swing.JButton Buscartxt;
    private javax.swing.JPasswordField Contraseñatxt;
    private javax.swing.JPasswordField Contraseñatxt1;
    private javax.swing.JTextField Correotxt;
    private javax.swing.JButton CrearCuentabtn;
    private javax.swing.JTextField NombreColaboradortxt;
    private javax.swing.JComboBox<String> PuestoLaboralcmbx;
    private javax.swing.JRadioButton Supervisorrb;
    private javax.swing.JTextField Usuariotxt;
    private javax.swing.JButton btn_oscuro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
