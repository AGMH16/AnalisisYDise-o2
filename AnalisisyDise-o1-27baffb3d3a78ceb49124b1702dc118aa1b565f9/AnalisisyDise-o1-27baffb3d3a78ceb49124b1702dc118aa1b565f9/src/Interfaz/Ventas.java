/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Clases.Lista;
import Clases.Venta;
import ClasesInterfaz.ComponenteBoton;
import ClasesInterfaz.ComponenteBotonIcon;
import ClasesInterfaz.ComponenteLabelText;
import ClasesInterfaz.ComponentePanel;
import ClasesSQL.MercaderiaSQL;
import Usuario.Compresor;
import ClasesSQL.PruebaSQL;
import ClasesSQL.VentaSQL;
import Conexion.ConexionBD;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
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

    Connection connection = ConexionBD.getConnection();
    Compresor compresor = new Compresor();
    DefaultTableModel model;
    Scanner sc = new Scanner(System.in);
    ArrayList<Venta> listaOriginal = new ArrayList<Venta>();
    java.util.Date date = new java.util.Date();
    SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
    PruebaSQL pruebasql = new PruebaSQL();
    MercaderiaSQL mercaderia2 = new MercaderiaSQL();
    VentaSQL ventasql = new VentaSQL();
    boolean aDomicilio, puntoDeVenta, modoOscuro;
    int cantidad = 0, cantidad2 = 0, cantidadProducto, ciclo;
    float total = 0, total2;
    String Usuario = "", pass_concatenada = "", nombreproveedor = "", tipoproducto = "", producto = "", fecha, nombreProducto;
    char[] password;

    // Definimos el largo de la casilla para la contraseña
    JPasswordField passwordField = new JPasswordField(15);
    JTextField jtextField = new JTextField(15);
    ComponentePanel panel = new ComponentePanel();
    ComponenteLabelText text = new ComponenteLabelText();
    ComponenteLabelText label = new ComponenteLabelText();
    ComponenteBoton boton = new ComponenteBoton();
    ComponenteBotonIcon botonIcon = new ComponenteBotonIcon();

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
        Guardarbtn.setOpaque(false);
        Guardarbtn.setContentAreaFilled(false);
        Guardarbtn.setBorderPainted(false);
        Salirbtn.setOpaque(false);
        Salirbtn.setContentAreaFilled(false);
        Salirbtn.setBorderPainted(false);
        AgregarProductobtn.setOpaque(false);
        AgregarProductobtn.setContentAreaFilled(false);
        AgregarProductobtn.setBorderPainted(false);
        Salirbtn.setOpaque(false);
        Salirbtn.setContentAreaFilled(false);
        Salirbtn.setBorderPainted(false);
        Verbtn.setOpaque(false);
        Verbtn.setContentAreaFilled(false);
        Verbtn.setBorderPainted(false);
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
        Guardarbtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ProductoJcmbx = new javax.swing.JComboBox<>();
        AgregarProductobtn = new javax.swing.JButton();
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
        Verbtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Verbtn1 = new javax.swing.JButton();
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

        Guardarbtn.setBackground(new java.awt.Color(102, 102, 102));
        Guardarbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Guardarbtn.setForeground(new java.awt.Color(102, 102, 102));
        Guardarbtn.setText("Guardar");
        Guardarbtn.setBorder(null);
        Guardarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarbtnActionPerformed(evt);
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

        AgregarProductobtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        AgregarProductobtn.setText("+");
        AgregarProductobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarProductobtnActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("PRODUCTO");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("FECHA");

        Adomijbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Adomijbtn.setForeground(new java.awt.Color(51, 51, 51));
        Adomijbtn.setText("A domicilio");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mercado.png"))); // NOI18N

        jRadioButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(51, 51, 51));
        jRadioButton2.setText("Punto de venta");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Adomicilio", "Punto De Venta", "Producto", "Cantidad", "Total", "Fecha"
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

        Verbtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Verbtn.setForeground(new java.awt.Color(102, 102, 102));
        Verbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ver.png"))); // NOI18N
        Verbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerbtnActionPerformed(evt);
            }
        });

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Verbtn1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Verbtn1.setForeground(new java.awt.Color(102, 102, 102));
        Verbtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/anadir-al-carrito.png"))); // NOI18N
        Verbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Verbtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Adomijbtn)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel8)
                            .addComponent(totaltxt, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FechaCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(ProductoJcmbx, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(44, 44, 44)
                                            .addComponent(AgregarProductobtn))
                                        .addComponent(jLabel9))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Verbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(cantidadtxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Guardarbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Verbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Verbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Guardarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Adomijbtn)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jRadioButton2)
                        .addGap(1, 1, 1)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(FechaCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ProductoJcmbx, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AgregarProductobtn))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Verbtn1)
                        .addGap(36, 36, 36)))
                .addComponent(cantidadtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(totaltxt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
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

    private void GuardarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarbtnActionPerformed

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

            pruebasql.BuscarUsuario(Usuario, pass_concatenada);
        } else {
            System.out.println("Ingreso de contraseña cancelada");

        }
      //  for (int i = 0; i < listaOriginal.size(); i++) {
      
      
      
      
      
    //}
            for(Clases.Venta lista2:listaOriginal){
              ventasql.InsertarVenta(lista2.isAdomicilio(),lista2.isPuntoVenta(), lista2.getProducto(), lista2.getCantidad(), lista2.getTotal(), lista2.getFecha(), pruebasql.getVal());
               
        }
        

      

    }//GEN-LAST:event_GuardarbtnActionPerformed

    private void SalirbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirbtnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_SalirbtnActionPerformed

    private void AgregarProductobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarProductobtnActionPerformed
        // TODO add your handling code here:
        producto = JOptionPane.showInputDialog("Ingrese Producto");
        ProductoJcmbx.addItem(producto);

    }//GEN-LAST:event_AgregarProductobtnActionPerformed

    private void btn_oscuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_oscuroActionPerformed
        if (!modoOscuro) {
            Pintar(Color.decode("#FFFFE0"), "/Imagenes/darkmode_2.png", Color.decode("#666666"), Color.decode("#666666"), Color.decode("#2e3951"), Color.decode("#212b41"));
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
        boton.setBoton(AgregarProductobtn);
        boton.setColorBoton(colorbotones);
        boton.getBoton();
        boton.setBoton(Guardarbtn);
        boton.setColorBoton(colorbotones);
        boton.getBoton();
        botonIcon.setBotonActivador(btn_oscuro);
        botonIcon.setNombreimagen(imagen);
        botonIcon.getBotonActivador();
        text.setText(cantidadtxt);
        text.setColorTexto(colortexto);
        text.getText();
        text.setText(totaltxt);
        text.setColorTexto(colortexto);
        text.getText();
        label.setLabel(jLabel3);
        label.setColorLabel(colorlabel);
        label.getLabel();
        label.setLabel(jLabel8);
        label.setColorLabel(colorlabel);
        label.getLabel();
        label.setLabel(jLabel9);
        label.setColorLabel(colorlabel);
        label.getLabel();
        label.setLabel(jLabel11);
        label.setColorLabel(colorlabel);
        label.getLabel();
    }

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

    private void VerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerbtnActionPerformed
        // TODO add your handling code here:
        /*    String[] info = new String[3];
        info[0] = tipoproducto = (String) ProductoJcmbx.getSelectedItem();
        info[1] = cantidadtxt.getText();
        info[2] = totaltxt.getText();
        model.addRow(info);*/

        mostrar();
        cantidadtxt.setText("Cantidad");
        totaltxt.setText("Total");

    }//GEN-LAST:event_VerbtnActionPerformed
    public void mostrar() {

        String matris[][] = new String[listaOriginal.size()][6];
        for (int i = 0; i < listaOriginal.size(); i++) {

            matris[i][0] = String.valueOf(listaOriginal.get(i).isAdomicilio());
            matris[i][1] = String.valueOf(listaOriginal.get(i).isPuntoVenta());
            matris[i][2] = listaOriginal.get(i).getProducto();
            matris[i][3] = String.valueOf(listaOriginal.get(i).getCantidad());
            matris[i][4] = String.valueOf(listaOriginal.get(i).getTotal());
            matris[i][5] = listaOriginal.get(i).getFecha();

        }

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                matris,
                new String[]{
                    "Adomicilio", "Punto De Venta", "Producto", "Cantidad", "Total", "Fecha"
                }
        ));

    }
    private void ProductoJcmbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductoJcmbxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductoJcmbxActionPerformed

    private void Verbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Verbtn1ActionPerformed
        // TODO add your handling code here:
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

        Venta venta = new Venta(aDomicilio, puntoDeVenta, tipoproducto, cantidad, total, fecha);
        listaOriginal.add(venta);


    }//GEN-LAST:event_Verbtn1ActionPerformed

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
    private javax.swing.JButton AgregarProductobtn;
    private com.toedter.calendar.JCalendar FechaCalendar;
    private javax.swing.JButton Guardarbtn;
    private javax.swing.JComboBox<String> ProductoJcmbx;
    private javax.swing.JButton Salirbtn;
    private javax.swing.JButton Verbtn;
    private javax.swing.JButton Verbtn1;
    private javax.swing.JButton btn_oscuro;
    private javax.swing.JTextField cantidadtxt;
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
