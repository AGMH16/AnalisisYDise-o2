/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import ClasesInterfaz.ComponenteBoton;
import ClasesInterfaz.ComponenteBotonIcon;
import ClasesInterfaz.ComponenteLabelText;
import ClasesInterfaz.ComponentePanel;
import ClasesSQL.InventarioSQL;
import ClasesSQL.PruebaSQL;
import Usuario.Compresor;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sun.security.util.Password;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import javax.swing.ImageIcon;
import sun.security.util.Password;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Inventario extends javax.swing.JFrame {

    String proveedor = "", AgregarProducto = "", producto = "", dimensional = "", dimensional2 = "", pass_concatenada = "", Usuario = "", xx, xx2;
    String nombreproveedor = "", tipoproducto = "", fecha;
    java.util.Date date = new java.util.Date();
    SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
    PruebaSQL pruebasql = new PruebaSQL();
    int cantidad = 0, total = 0, cantidad2 = 0;
    JPasswordField passwordField = new JPasswordField(15);
    JTextField jtextField = new JTextField(15);
    ComponentePanel panel = new ComponentePanel();
    ComponenteLabelText text = new ComponenteLabelText();
    ComponenteLabelText label = new ComponenteLabelText();
    ComponenteBoton boton = new ComponenteBoton();
    ComponenteBotonIcon botonIcon = new ComponenteBotonIcon();
    InventarioSQL inventarioSQL = new InventarioSQL();
    char[] password;

    public Inventario() {

        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        transparenciButton();

        pruebasql.BuscarDimesional(Dimensionaljcmb);

        Productojcmb.addItem("Pollo");
        Productojcmb.addItem("Maíz");
        Productojcmb.addItem("Vacuna");
        Productojcmb.addItem("Inmunizador");
        Productojcmb.addItem("Concentrado de engorde");
        Productojcmb.addItem("Concentrado de crecimiento");
    }

    public void transparenciButton() {
        AgregarDimensionalbtn.setOpaque(false);
        AgregarDimensionalbtn.setContentAreaFilled(false);
        AgregarDimensionalbtn.setBorderPainted(false);
        jButton1.setOpaque(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setBorderPainted(false);
        jButton7.setOpaque(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setBorderPainted(false);
        AgregarProductobtn.setOpaque(false);
        AgregarProductobtn.setContentAreaFilled(false);
        AgregarProductobtn.setBorderPainted(false);
        jButton4.setOpaque(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setBorderPainted(false);
        Guardarbtn.setOpaque(false);
        Guardarbtn.setContentAreaFilled(false);
        Guardarbtn.setBorderPainted(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Cantidadtxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Productojcmb = new javax.swing.JComboBox<>();
        AgregarProductobtn = new javax.swing.JButton();
        Dimensionaljcmb = new javax.swing.JComboBox<>();
        AgregarDimensionalbtn = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        FechaCalendar = new com.toedter.calendar.JCalendar();
        Guardarbtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Totaltxt = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btn_oscuro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(242, 253, 250));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("INVENTARIO");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 32, -1, -1));

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 102, 102));
        jButton1.setText("Guardar");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(681, 668, 82, 35));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bolsa-de-la-compra (1).png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/quetzal.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 648, -1, -1));

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
        jPanel2.add(Cantidadtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 253, 43));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/quetzal_1.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, -1, -1));

        Productojcmb.setBackground(new java.awt.Color(244, 253, 251));
        Productojcmb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Productojcmb.setForeground(new java.awt.Color(102, 102, 102));
        Productojcmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Producto" }));
        Productojcmb.setToolTipText("");
        jPanel2.add(Productojcmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 253, 42));

        AgregarProductobtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        AgregarProductobtn.setForeground(new java.awt.Color(102, 102, 102));
        AgregarProductobtn.setText("+");
        AgregarProductobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarProductobtnActionPerformed(evt);
            }
        });
        jPanel2.add(AgregarProductobtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, -1, -1));

        Dimensionaljcmb.setBackground(new java.awt.Color(244, 253, 251));
        Dimensionaljcmb.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Dimensionaljcmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DimensionaljcmbActionPerformed(evt);
            }
        });
        jPanel2.add(Dimensionaljcmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 187, 43));

        AgregarDimensionalbtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        AgregarDimensionalbtn.setForeground(new java.awt.Color(102, 102, 102));
        AgregarDimensionalbtn.setText("+");
        AgregarDimensionalbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarDimensionalbtnActionPerformed(evt);
            }
        });
        jPanel2.add(AgregarDimensionalbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 210, -1, -1));

        jTextField6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(153, 153, 153));
        jTextField6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField6KeyPressed(evt);
            }
        });
        jPanel2.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 660, 206, 43));
        jPanel2.add(FechaCalendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, 125));

        Guardarbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Guardarbtn.setForeground(new java.awt.Color(102, 102, 102));
        Guardarbtn.setText("Guardar");
        Guardarbtn.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aprovechar.png"))); // NOI18N
        Guardarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarbtnActionPerformed(evt);
            }
        });
        jPanel2.add(Guardarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 470, 100, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/calendario.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, -1));

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
        jPanel2.add(Totaltxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 253, 43));

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar-sesion.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton4.setForeground(new java.awt.Color(102, 102, 102));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-de-regreso.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

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
                .addGap(0, 109, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_oscuro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton7)
                            .addComponent(btn_oscuro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Menu3 menux = new Menu3();
        menux.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            total = Integer.parseInt(jTextField6.getText());

        }
    }//GEN-LAST:event_jTextField6KeyPressed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField6ActionPerformed

    private void AgregarDimensionalbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarDimensionalbtnActionPerformed
        // TODO add your handling code here:
        dimensional = JOptionPane.showInputDialog("Ingrese Producto");
        Dimensionaljcmb.addItem(dimensional);
    }//GEN-LAST:event_AgregarDimensionalbtnActionPerformed

    private void DimensionaljcmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DimensionaljcmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DimensionaljcmbActionPerformed

    private void AgregarProductobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarProductobtnActionPerformed
        // TODO add your handling code here:
        AgregarProducto = JOptionPane.showInputDialog("Ingrese Producto");
        Productojcmb.addItem(AgregarProducto);
    }//GEN-LAST:event_AgregarProductobtnActionPerformed

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
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        tipoproducto = (String) Productojcmb.getSelectedItem();
        cantidad2 = Integer.parseInt(Cantidadtxt.getText());
        dimensional2 = (String) Dimensionaljcmb.getSelectedItem();
        total = Integer.parseInt(jTextField6.getText());


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void GuardarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarbtnActionPerformed
        // TODO add your handling code here:

        producto = (String) Productojcmb.getSelectedItem();

        cantidad = Integer.parseInt(Cantidadtxt.getText());

        fecha = f.format(FechaCalendar.getDate());
        System.out.println(fecha);
        total = Integer.parseInt(Totaltxt.getText());
        System.out.println(producto);
        System.out.println(proveedor);
        System.out.println(cantidad);
        System.out.println(dimensional);
        System.out.println(total);
        dimensional = (String) Dimensionaljcmb.getSelectedItem();
        pruebasql.BuscarIdDimensional(dimensional);
        System.out.println("Var para meter en el insert:" + pruebasql.getVal2());
     
        //Para obtener ID del Usuario
        // usuarioReferencia = JOptionPane.showInputDialog("Ingrese su usuario");
        // contraseñaReferencia = JOptionPane.showInputDialog("Ingrese su usuario");
        //CONTRASEÑA
        JPanel panel = new JPanel();
        JLabel label2 = new JLabel("Usuario:");
        JLabel label = new JLabel("Contraseña:");
        // JTextField jtextfield = new JTextField();

        // Agregamos los componentes al panel
        panel.add(label2);
        panel.add(jtextField);
        panel.add(label);
        panel.add(passwordField);

        // Definimos el texto de las opciones para aceptar o cancelar
        String[] options = new String[]{"Aceptar", "Cancelar"};
        // Agregamos el panel y las opciones al dialogo
        int option = JOptionPane.showOptionDialog(null, panel, "Ingreso de datos usuario",
                JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options, options[1]);

        //CONTRASEÑA
        if (option == 0) // pressing OK button
        {
            Usuario = jtextField.getText();
            System.out.println("Usuario: " + Usuario);
            password = passwordField.getPassword();

            for (int i = 0; i < password.length; i++) {
                pass_concatenada = pass_concatenada + password[i];
                System.out.println(password[i]);
            }

            xx = comprimir(pass_concatenada);
            System.out.println(xx);
            xx2 = String.valueOf(password);
            pruebasql.BuscarUsuario(Usuario, xx2);
        } else {
            System.out.println("Ingreso de contraseña cancelada");

        }
        
        System.out.println("Var para meter en el insert:" + pruebasql.getVal());
        inventarioSQL.InsertarInventario(producto,cantidad, fecha, total,pruebasql.getVal2(), pruebasql.getVal());

    }//GEN-LAST:event_GuardarbtnActionPerformed
    private String comprimir(String frase) {
        Compresor compresor = new Compresor();
        String Cadena_en_binario = compresor.CodigoAscii_a_binario(frase);
        String cadena_simple = compresor.cadena_RLE(Cadena_en_binario);
        String ultima_cadena = compresor.rle_a_Ascii(cadena_simple);
        return ultima_cadena;
    }
    private void btn_oscuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_oscuroActionPerformed
        if (!modoOscuro) {
            Pintar(Color.decode("#FFFFE0"), "/Imagenes/darkmode_2.png",Color.decode("#666666"), Color.decode("#666666"), Color.decode("#2e3951"), Color.decode("#212b41"));
            //   Pintar(Color.yellow, "/Imagenes/darkmode_2.png", Color.blue,Color.red,Color.green, Color.MAGENTA);

            modoOscuro = true;
        } else if (modoOscuro == true) {
            Pintar(Color.decode("#66646C"), "/Imagenes/darkmode_1.png", Color.decode("#666666"), Color.decode("#666666"), Color.WHITE, Color.decode("#F2FDFA"));
            modoOscuro = false;
        }
    }//GEN-LAST:event_btn_oscuroActionPerformed
    private void Pintar(Color colorbotones, String imagen, Color colortexto, Color colorlabel, Color colorbase, Color colorfondo) {
        panel.setPanelBase(jPanel2);
        panel.setColorBase(colorbase);
        panel.getPanelBase();
        panel.setPanelFondo(jPanel1);
        panel.setColorFondo(colorfondo);
        panel.getPanelFondo();
        boton.setColorBoton(colorbotones);
        boton.getBoton();
        boton.setColorBoton(colorbotones);
        boton.getBoton();
        boton.setBoton(Guardarbtn);
        boton.setColorBoton(colorbotones);
        boton.getBoton();
        boton.setBoton(AgregarDimensionalbtn);
        boton.setColorBoton(colorbotones);
        boton.getBoton();
        boton.setBoton(AgregarProductobtn);
        boton.setColorBoton(colorbotones);
        boton.getBoton();
        botonIcon.setBotonActivador(btn_oscuro);
        botonIcon.setNombreimagen(imagen);
        botonIcon.getBotonActivador();
        text.setText(Cantidadtxt);
        text.setColorTexto(colortexto);
        text.getText();
        text.setText(Totaltxt);
        text.setColorTexto(colortexto);
        text.getText();
        label.setLabel(jLabel3);
        label.setColorLabel(colorlabel);
        label.getLabel();

    }
    private void TotaltxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotaltxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotaltxtActionPerformed

    private void TotaltxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TotaltxtKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotaltxtKeyPressed
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
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Inventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarDimensionalbtn;
    private javax.swing.JButton AgregarProductobtn;
    private javax.swing.JTextField Cantidadtxt;
    private javax.swing.JComboBox<String> Dimensionaljcmb;
    private com.toedter.calendar.JCalendar FechaCalendar;
    private javax.swing.JButton Guardarbtn;
    private javax.swing.JComboBox<String> Productojcmb;
    private javax.swing.JTextField Totaltxt;
    private javax.swing.JButton btn_oscuro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
