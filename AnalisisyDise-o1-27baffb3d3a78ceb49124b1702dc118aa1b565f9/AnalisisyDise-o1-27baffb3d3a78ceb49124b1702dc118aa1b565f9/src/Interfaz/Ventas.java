/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import ClasesSQL.MercaderiaSQL;
import Usuario.Compresor;
import ClasesSQL.PruebaSQL;
import ClasesSQL.VentaSQL;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import sun.security.util.Password;

public class Ventas extends javax.swing.JFrame {

    DefaultTableModel model;
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> Cantidad = new ArrayList();
    ArrayList<String> Producto = new ArrayList();
    ArrayList<Float> Total = new ArrayList();
    java.util.Date date = new java.util.Date();
    SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
    PruebaSQL pruebasql = new PruebaSQL();
    MercaderiaSQL mercaderia2 = new MercaderiaSQL();
    VentaSQL ventasql = new VentaSQL();
    boolean aDomicilio, puntoDeVenta;
    int cantidad = 0, cantidad2 = 0, cantidadProducto, ciclo;
    float total = 0, total2;
    String Usuario = "", pass_concatenada = "", nombreproveedor = "", tipoproducto = "", producto = "", xx, xx2, fecha, usuarioReferencia = "", contraseñaReferencia = "", nombreProducto;
    char[] password;
    // Definimos el largo de la casilla para la contraseña
    JPasswordField passwordField = new JPasswordField(15);
    JTextField jtextField = new JTextField(15);

    public Ventas() {

        try {
            this.setUndecorated(true);
            initComponents();
            model = new DefaultTableModel();
            model.addColumn("Producto");
            model.addColumn("Cantidad");
            model.addColumn("Total");
            this.jTable1.setModel(model);
            this.setLocationRelativeTo(null);
            transparenciButton();
            mercaderia2.ConsultaDeMercaderia(ProductoJcmbx);
        } catch (SQLException ex) {
            Logger.getLogger(Ventas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void transparenciButton() {
        jButton1.setOpaque(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setBorderPainted(false);
        Salirbtn.setOpaque(false);
        Salirbtn.setContentAreaFilled(false);
        Salirbtn.setBorderPainted(false);
        jButton5.setOpaque(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setBorderPainted(false);
        Salirbtn.setOpaque(false);
        Salirbtn.setContentAreaFilled(false);
        Salirbtn.setBorderPainted(false);
        Salirbtn.setOpaque(false);
        Salirbtn.setContentAreaFilled(false);
        Salirbtn.setBorderPainted(false);
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
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ProductoJcmbx = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Adomijbtn = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        FechaCalendar = new com.toedter.calendar.JCalendar();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        cantidadtxt = new javax.swing.JTextField();
        totaltxt = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        Salirbtn = new javax.swing.JButton();
        btn_oscuro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(242, 253, 250));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("VENTAS");

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

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/entrega-de-bienes-a-domicilio.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("TIPO DE PEDIDO");

        ProductoJcmbx.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        ProductoJcmbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductoJcmbxActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton5.setText("+");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("PRODUCTO");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("FECHA");

        Adomijbtn.setText("A domicilio");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mercado.png"))); // NOI18N

        jRadioButton2.setText("Punto de venta");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Producto", "Cantidad", "Total"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        cantidadtxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cantidadtxt.setForeground(new java.awt.Color(102, 102, 102));
        cantidadtxt.setText("Cantidad");
        cantidadtxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cantidadtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadtxtActionPerformed(evt);
            }
        });
        cantidadtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cantidadtxtKeyPressed(evt);
            }
        });

        totaltxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        totaltxt.setForeground(new java.awt.Color(102, 102, 102));
        totaltxt.setText("Total");
        totaltxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        totaltxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totaltxtActionPerformed(evt);
            }
        });
        totaltxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                totaltxtKeyPressed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 102, 102));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ver.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton4.setForeground(new java.awt.Color(102, 102, 102));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/anadir-al-carrito.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton6.setForeground(new java.awt.Color(102, 102, 102));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/signo-de-interrogacion.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(30, 30, 30)
                                .addComponent(Adomijbtn)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12)
                                .addGap(43, 43, 43)
                                .addComponent(jRadioButton2))
                            .addComponent(jLabel8)
                            .addComponent(jLabel11)
                            .addComponent(FechaCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cantidadtxt)
                            .addComponent(totaltxt)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(ProductoJcmbx, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(Adomijbtn)
                            .addComponent(jRadioButton2))
                        .addGap(21, 21, 21))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ProductoJcmbx, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton5))
                            .addComponent(jButton6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cantidadtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(totaltxt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FechaCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton4))
                .addGap(41, 41, 41))
        );

        Salirbtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Salirbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar-sesion.png"))); // NOI18N
        Salirbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirbtnActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_oscuro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Salirbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Salirbtn)
                    .addComponent(btn_oscuro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (Adomijbtn.isSelected()) {
            aDomicilio = true;
            System.out.println("Adomicilio" + aDomicilio);
        }
        if (jRadioButton2.isSelected()) {
            puntoDeVenta = true;
            System.out.println("Punto de Venta" + puntoDeVenta);
        }
        tipoproducto = (String) ProductoJcmbx.getSelectedItem();
        System.out.println(tipoproducto);
        cantidad = Integer.parseInt(cantidadtxt.getText());
        System.out.println(cantidad);
        total = Float.parseFloat(totaltxt.getText());
        System.out.println(total);

        fecha = f.format(FechaCalendar.getDate());
        System.out.println(fecha);

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
        //   xx=String.valueOf(password);
        //  System.out.println(xx);
        //  pruebasql.BuscarUsuario(Usuario, xx2);
        //   pruebasql.BuscarUsuario(usuarioReferencia,contraseñaReferencia);
        System.out.println("Var para meter en el insert:" + pruebasql.getVal());
        ventasql.InsertarVenta(aDomicilio, puntoDeVenta, tipoproducto, cantidad, total, fecha, pruebasql.getVal());
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /*      do {
            System.out.println("Introduce la cantidad de cada producto");
            System.out.println("Cantidad: ");
            cantidadProducto = Integer.parseInt(cantidadtxt.getText());
            System.out.println("Introduce el producto");
            System.out.println("Producto: ");
            nombreProducto = (String) ProductoJcmbx.getSelectedItem();
            System.out.println("Introduce el total de cada producto");
            System.out.println("Total: ");
            total2 = Float.parseFloat(totaltxt.getText());
            if (cantidadProducto != 0) {
                Cantidad.add(cantidadProducto);
                Producto.add(nombreProducto);
                Total.add(total2);
            }
        } while (cantidadProducto != 0);

        System.out.println("Ha introducido: " + Cantidad.size() + " números:");
        System.out.println("Ha introducido: " + Producto.size() + " cantidad:");
        System.out.println("Ha introducido: " + Total.size() + " total:");
        //mostrar el arrayList completo
        System.out.println(Cantidad);
        System.out.println(Producto);
        System.out.println(Total);
        //recorrido usando un iterador para mostrar un elemento por línea                                         
        Iterator it = Cantidad.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        Iterator it2 = Producto.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }
        Iterator it3 = Total.iterator();
        while (it3.hasNext()) {
            System.out.println(it3.next());
        }
        //recorrido usando foreach para sumar los elementos
        double suma = 0;
        for (Float i : Total) {
            suma = suma + i;
        }
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + suma / Total.size());*/

    }//GEN-LAST:event_jButton1ActionPerformed
    private String comprimir(String frase) {
        Compresor compresor = new Compresor();
        String Cadena_en_binario = compresor.CodigoAscii_a_binario(frase);
        String cadena_simple = compresor.cadena_RLE(Cadena_en_binario);
        String ultima_cadena = compresor.rle_a_Ascii(cadena_simple);
        return ultima_cadena;
    }
    private void SalirbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirbtnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_SalirbtnActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        producto = JOptionPane.showInputDialog("Ingrese Producto");
        ProductoJcmbx.addItem(producto);

    }//GEN-LAST:event_jButton5ActionPerformed

    private void btn_oscuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_oscuroActionPerformed
        /*  if (!modoOscuro) {
            jPanel1.setBackground(Color.decode("#212b41"));
            jPanel2.setBackground(Color.decode("#2e3951"));
            txtOperacion.setForeground(Color.decode("#0db387"));
            txtResultado.setForeground(Color.decode("#0db387"));
            cambiarColorBtn1(btn_multi);
            cambiarColorBtn1(btn_suma);
            cambiarColorBtn1(btn_resta);
            cambiarColorBtn1(btn_exp);
            cambiarColorBtn1(btn_division);
            cambiarColorBtn1(btn_c);
            cambiarColorBtn1(btn_porcentaje);
            cambiarColorBtn2(btn_1);
            cambiarColorBtn2(btn_2);
            cambiarColorBtn2(btn_3);
            cambiarColorBtn2(btn_4);
            cambiarColorBtn2(btn_5);
            cambiarColorBtn2(btn_6);
            cambiarColorBtn2(btn_7);
            cambiarColorBtn2(btn_8);
            cambiarColorBtn2(btn_9);
            cambiarColorBtn2(btn_0);
            cambiarColorBtn2(btn_dot);

            btn_oscuro.setIcon(new ImageIcon(getClass().getResource("/images/darkmode_2.png")));
            btn_igual.setIcon(new ImageIcon(getClass().getResource("/images/btn3_dark.png")));
            btn_igual.setPressedIcon(new ImageIcon(getClass().getResource("/images/btn3_dark.png")));
            btn_igual.setRolloverIcon(new ImageIcon(getClass().getResource("/images/btn3_pressed_dark.png")));
            btn_igual.setForeground(Color.decode("#2e3951"));
            modoOscuro = true;
        } else {
            Calculadora frame = new Calculadora();
            this.dispose();
            frame.setVisible(true);
        }*/
    }//GEN-LAST:event_btn_oscuroActionPerformed

    private void cantidadtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadtxtActionPerformed

    private void cantidadtxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadtxtKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cantidad = Integer.parseInt(cantidadtxt.getText());
            totaltxt.setText("");
            totaltxt.requestFocus();
        }
    }//GEN-LAST:event_cantidadtxtKeyPressed

    private void totaltxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totaltxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totaltxtActionPerformed

    private void totaltxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totaltxtKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            total = Float.parseFloat(totaltxt.getText());
        }
    }//GEN-LAST:event_totaltxtKeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String[] info = new String[3];
        info[0] = tipoproducto = (String) ProductoJcmbx.getSelectedItem();
        info[1] = cantidadtxt.getText();
        info[2] = totaltxt.getText();
        model.addRow(info);


    }//GEN-LAST:event_jButton3ActionPerformed

    private void ProductoJcmbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductoJcmbxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductoJcmbxActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        for (int i = 0; i <= (ciclo - 1); i++) {
            //System.out.println("Introduce el producto");
            // System.out.println("Producto: ");
            nombreProducto = (String) ProductoJcmbx.getSelectedItem();
            // System.out.println("Introduce la cantidad de cada producto");
            //System.out.println("Cantidad: ");
            cantidadProducto = Integer.parseInt(cantidadtxt.getText());
            //System.out.println("Introduce el total de cada producto");
            //  System.out.println("Total: ");
            total = Float.parseFloat(totaltxt.getText());
            Producto.add(nombreProducto);
            Cantidad.add(cantidadProducto);
            Total.add(total);
        }

        //  System.out.println("Ha introducido: " + Cantidad.size() + " números:");
        // System.out.println("Ha introducido: " + Producto.size() + " cantidad:");
        //System.out.println("Ha introducido: " + Total.size() + " total:");
        //mostrar el arrayList completo
        System.out.println(Cantidad);
        System.out.println(Producto);
        System.out.println(Total);
        //recorrido usando un iterador para mostrar un elemento por línea                                         
        Iterator it = Cantidad.iterator();

        while (it.hasNext()) {
            //System.out.println(it.next());
        }
        Iterator it2 = Producto.iterator();
        while (it2.hasNext()) {
            //   System.out.println(it2.next());
        }
        Iterator it3 = Total.iterator();
        while (it3.hasNext()) {
            // System.out.println(it3.next());
        }
        //recorrido usando foreach para sumar los elementos
        /*double suma = 0;
        for (Float i : Total) {
            suma = suma + i;
        }
        System.out.println("Suma: " + suma);*/
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        ciclo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de productos a ingresar:"));
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Ventas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Adomijbtn;
    private com.toedter.calendar.JCalendar FechaCalendar;
    private javax.swing.JComboBox<String> ProductoJcmbx;
    private javax.swing.JButton Salirbtn;
    private javax.swing.JButton btn_oscuro;
    private javax.swing.JTextField cantidadtxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField totaltxt;
    // End of variables declaration//GEN-END:variables
}
