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
import ClasesInterfaz.ComponenteRadioButon;
import ClasesSQL.MateriaPrimaSQL;
import ClasesSQL.PerdidaMateriaPrimaSQL;
import ClasesSQL.UpdateMateriaPrimaSQL;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import javax.swing.ImageIcon;
import sun.security.util.Password;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sun.security.util.Password;

/**
 *
 * @author jenif
 */
public class PerdidaMateriaPrima extends javax.swing.JFrame {

    String codigo = "", codigoperdida = "";
    int cantidad = 0;
    SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

    ComponentePanel panel = new ComponentePanel();
    ComponenteLabelText text = new ComponenteLabelText();
    ComponenteLabelText label = new ComponenteLabelText();
    ComponenteBoton boton = new ComponenteBoton();
    ComponenteBotonIcon botonIcon = new ComponenteBotonIcon();
    ComponenteRadioButon radio = new ComponenteRadioButon();
    MateriaPrimaSQL SQLlamateriaprima = new MateriaPrimaSQL();
    Clases.MateriaPrima materiaprima = new Clases.MateriaPrima();
    ArrayList<Clases.MateriaPrima> listaMateriaPrima = SQLlamateriaprima.ConsultaMateraPrimaCodigo();
    Clases.PerdidaMateriaPrima perdidamateriaprima = new Clases.PerdidaMateriaPrima();
    Clases.MovimientoLotePerdida movimientoperdida = new Clases.MovimientoLotePerdida();
    PerdidaMateriaPrimaSQL SQLPerdidaMateriaPrima = new PerdidaMateriaPrimaSQL();
    UpdateMateriaPrimaSQL SQLupdateMateriaPrima=new UpdateMateriaPrimaSQL();
    /*crud thecrud = new crud();
    Connection con = (Connection) ConexionBD.GetConnection();*/
    /**
     * Creates new form Menu
     */
    public PerdidaMateriaPrima() {

        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        transparenciButton();
        Eliminarbtn.setVisible(false);
        Actualizarbtn.setVisible(false);
        for (Clases.MateriaPrima materia : listaMateriaPrima) {
            CodigoAveriocmb.addItem(materia.getLoteAverio());
        }
    }

    public void transparenciButton() {

        Guardarbtn.setOpaque(false);
        Guardarbtn.setContentAreaFilled(false);
        Guardarbtn.setBorderPainted(false);
        jButton7.setOpaque(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setBorderPainted(false);

        jButton4.setOpaque(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setBorderPainted(false);
        Actualizarbtn.setOpaque(false);
        Actualizarbtn.setContentAreaFilled(false);
        Actualizarbtn.setBorderPainted(false);
        Eliminarbtn.setOpaque(false);
        Eliminarbtn.setContentAreaFilled(false);
        Eliminarbtn.setBorderPainted(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Perdidas = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Actualizarbtn = new javax.swing.JButton();
        Guardarbtn = new javax.swing.JButton();
        CodigoPerdidatxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Eliminarbtn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        Enfermorbtn = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        FechaCalendar2 = new com.toedter.calendar.JCalendar();
        jLabel3 = new javax.swing.JLabel();
        Observacionbtn = new javax.swing.JRadioButton();
        Muertosrbtn = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        CodigoAveriocmb = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        Cantidadtxt = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        btn_oscuro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1110, 515));
        setPreferredSize(new java.awt.Dimension(1110, 480));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(242, 253, 250));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1110, 500));

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar-sesion.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(920, 500));
        jPanel2.setPreferredSize(new java.awt.Dimension(920, 500));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Actualizarbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Actualizarbtn.setForeground(new java.awt.Color(102, 102, 102));
        Actualizarbtn.setText("Actualizar");
        Actualizarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarbtnActionPerformed(evt);
            }
        });
        jPanel2.add(Actualizarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 370, 120, -1));

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
        jPanel2.add(Guardarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 410, 120, 35));

        CodigoPerdidatxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CodigoPerdidatxt.setForeground(new java.awt.Color(153, 153, 153));
        CodigoPerdidatxt.setText("Codigo de la perdida");
        CodigoPerdidatxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CodigoPerdidatxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodigoPerdidatxtActionPerformed(evt);
            }
        });
        CodigoPerdidatxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CodigoPerdidatxtKeyPressed(evt);
            }
        });
        jPanel2.add(CodigoPerdidatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 253, 43));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/calendario.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, -1, -1));

        Eliminarbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Eliminarbtn.setForeground(new java.awt.Color(102, 102, 102));
        Eliminarbtn.setText("Eliminar");
        Eliminarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarbtnActionPerformed(evt);
            }
        });
        jPanel2.add(Eliminarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 330, 120, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Cantidad");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, -1, -1));

        Enfermorbtn.setBackground(new java.awt.Color(244, 253, 251));
        Perdidas.add(Enfermorbtn);
        Enfermorbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Enfermorbtn.setForeground(new java.awt.Color(51, 51, 51));
        Enfermorbtn.setText("Enfermo");
        Enfermorbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnfermorbtnActionPerformed(evt);
            }
        });
        jPanel2.add(Enfermorbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Fecha de la perdida");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, -1, -1));
        jPanel2.add(FechaCalendar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 400, 150));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("PERDIDA DE LA MATERIA PRIMA");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 24, -1, -1));

        Observacionbtn.setBackground(new java.awt.Color(244, 253, 251));
        Perdidas.add(Observacionbtn);
        Observacionbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Observacionbtn.setForeground(new java.awt.Color(51, 51, 51));
        Observacionbtn.setText("En observacion");
        Observacionbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ObservacionbtnActionPerformed(evt);
            }
        });
        jPanel2.add(Observacionbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, -1, -1));

        Muertosrbtn.setBackground(new java.awt.Color(244, 253, 251));
        Perdidas.add(Muertosrbtn);
        Muertosrbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Muertosrbtn.setForeground(new java.awt.Color(51, 51, 51));
        Muertosrbtn.setText("Muerto");
        Muertosrbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MuertosrbtnActionPerformed(evt);
            }
        });
        jPanel2.add(Muertosrbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Tipo de Perdida");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        CodigoAveriocmb.setEditable(true);
        CodigoAveriocmb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CodigoAveriocmb.setForeground(new java.awt.Color(51, 51, 51));
        jPanel2.add(CodigoAveriocmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 260, 50));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Código de averío afectado");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        Cantidadtxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Cantidadtxt.setForeground(new java.awt.Color(153, 153, 153));
        Cantidadtxt.setText("Unidades afectadas");
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
        jPanel2.add(Cantidadtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 253, 43));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 943, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jButton7)
                    .addComponent(btn_oscuro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Menu3 menux = new Menu3();
        menux.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void CodigoPerdidatxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CodigoPerdidatxtKeyPressed
        // TODO add your handling code here:
        /* if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cantidad = Integer.parseInt(CodigoPerdidatxt.getText());

        }*/
    }//GEN-LAST:event_CodigoPerdidatxtKeyPressed

    private void CodigoPerdidatxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodigoPerdidatxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodigoPerdidatxtActionPerformed
    /* List Proveedores = new ArrayList();

    static void obtener_proveedor(ArrayList<Integer> id, ArrayList<String> Proveedor) {
        int ID = 0;
        String proveedor = "";
        id.get(ID);
        Proveedor.get(Integer.parseInt(proveedor));
    }*/
    private void GuardarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarbtnActionPerformed
        codigoperdida = CodigoPerdidatxt.getText();
        codigo = (String) CodigoAveriocmb.getSelectedItem();
        System.out.println(codigo);
        perdidamateriaprima.setMuerto(Muertosrbtn.isSelected());
        perdidamateriaprima.setEnfermo(Enfermorbtn.isSelected());
        perdidamateriaprima.setEnObservacion(Observacionbtn.isSelected());
        perdidamateriaprima.setUnidadesAfectadas(Integer.parseInt(Cantidadtxt.getText()));
        perdidamateriaprima.setFecha(formato.format(FechaCalendar2.getDate()));
        materiaprima.setLoteAverio(codigo);
        movimientoperdida.setCodigolotePollo(materiaprima);
        movimientoperdida.setCodigoperdidaMateriaPrima(perdidamateriaprima);
        movimientoperdida.setPerdidaMateriaPrima(true);
        for (Clases.MateriaPrima materia : listaMateriaPrima) {
            CodigoAveriocmb.addItem(materia.getLoteAverio());
            if (materia.getLoteAverio().equals(materiaprima.getLoteAverio())) {
                if (materia.getUnidadExistente() >= Integer.parseInt(Cantidadtxt.getText())) {
                    SQLPerdidaMateriaPrima.InsertarPerdidaMateriaPrima(perdidamateriaprima);
                    SQLPerdidaMateriaPrima.InsertarPerdidaMovimientoLote(movimientoperdida);
                    int existenciasActualizadas = materia.getUnidadExistente() - Integer.parseInt(Cantidadtxt.getText());
                    SQLupdateMateriaPrima.ActualizarExistenciasDeMateriaPrima(existenciasActualizadas, codigo);
                } else {
                    JOptionPane.showMessageDialog(null, "No se pueden perder lo que no se tiene. Verifique la cantidad");
                }
            } 
        }

        //Actualizar las existencias de materia prima

    }//GEN-LAST:event_GuardarbtnActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void ActualizarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarbtnActionPerformed

    }//GEN-LAST:event_ActualizarbtnActionPerformed

    private void EliminarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarbtnActionPerformed

    }//GEN-LAST:event_EliminarbtnActionPerformed

    private void EnfermorbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnfermorbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnfermorbtnActionPerformed

    private void ObservacionbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ObservacionbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ObservacionbtnActionPerformed

    private void MuertosrbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MuertosrbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MuertosrbtnActionPerformed
    boolean modoOscuro = false;
    private void btn_oscuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_oscuroActionPerformed
        if (!modoOscuro) {
            Pintar(Color.decode("#FFFFE0"), "/Imagenes/darkmode_2.png", Color.decode("#666666"), Color.decode("#666666"), Color.decode("#2e3951"), Color.decode("#212b41"));
            modoOscuro = true;
        } else if (modoOscuro == true) {
            Pintar(Color.decode("#66646C"), "/Imagenes/darkmode_1.png", Color.decode("#666666"), Color.decode("#666666"), Color.WHITE, Color.decode("#F2FDFA"));
            modoOscuro = false;
        }

    }//GEN-LAST:event_btn_oscuroActionPerformed

    private void CantidadtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantidadtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CantidadtxtActionPerformed

    private void CantidadtxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CantidadtxtKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_CantidadtxtKeyPressed
    private void Pintar(Color colorbotones, String imagen, Color colortexto, Color colorlabel, Color colorbase, Color colorfondo) {
        panel.setPanelBase(jPanel2);
        panel.setColorBase(colorbase);
        panel.getPanelBase();
        panel.setPanelFondo(jPanel1);
        panel.setColorFondo(colorfondo);
        panel.getPanelFondo();
        boton.setBoton(Actualizarbtn);
        boton.setColorBoton(colorbotones);
        boton.getBoton();
        boton.setBoton(Eliminarbtn);
        boton.setColorBoton(colorbotones);
        boton.getBoton();
        boton.setBoton(Guardarbtn);
        boton.setColorBoton(colorbotones);
        boton.getBoton();
        botonIcon.setBotonActivador(btn_oscuro);
        botonIcon.setNombreimagen(imagen);
        botonIcon.getBotonActivador();
        text.setText(CodigoPerdidatxt);
        text.setColorTexto(colortexto);
        text.getText();
        text.setText(Cantidadtxt);
        text.setColorTexto(colortexto);
        text.getText();
        text.setText(CodigoPerdidatxt);
        text.setColorTexto(colortexto);
        text.getText();
        label.setLabel(jLabel3);
        label.setColorLabel(colorlabel);
        label.getLabel();
        label.setLabel(jLabel13);
        label.setColorLabel(colorlabel);
        label.getLabel();
        label.setLabel(jLabel12);
        label.setColorLabel(colorlabel);
        label.getLabel();
        label.setLabel(jLabel14);
        label.setColorLabel(colorlabel);
        label.getLabel();
        radio.setRadiobtn(Muertosrbtn);
        radio.setColorradio(colortexto);
        radio.getRadiobtn();
        radio.setRadiobtn(Enfermorbtn);
        radio.setColorradio(colortexto);
        radio.getRadiobtn();
        radio.setRadiobtn(Observacionbtn);
        radio.setColorradio(colortexto);
        radio.getRadiobtn();
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
            java.util.logging.Logger.getLogger(PerdidaMateriaPrima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PerdidaMateriaPrima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PerdidaMateriaPrima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerdidaMateriaPrima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new PerdidaMateriaPrima().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizarbtn;
    private javax.swing.JTextField Cantidadtxt;
    private javax.swing.JComboBox<String> CodigoAveriocmb;
    private javax.swing.JTextField CodigoPerdidatxt;
    private javax.swing.JButton Eliminarbtn;
    private javax.swing.JRadioButton Enfermorbtn;
    private com.toedter.calendar.JCalendar FechaCalendar2;
    private javax.swing.JButton Guardarbtn;
    private javax.swing.JRadioButton Muertosrbtn;
    private javax.swing.JRadioButton Observacionbtn;
    private javax.swing.ButtonGroup Perdidas;
    private javax.swing.JButton btn_oscuro;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
