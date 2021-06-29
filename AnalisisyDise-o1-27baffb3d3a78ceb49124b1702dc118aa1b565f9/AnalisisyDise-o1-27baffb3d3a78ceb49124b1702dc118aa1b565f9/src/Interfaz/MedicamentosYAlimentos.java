/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Clases.ColorearInterfazBlanco;
import Clases.ColorearInterfazNegro;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import javax.swing.ImageIcon;
import sun.security.util.Password;
import java.awt.Color;
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

/**
 *
 * @author jenif
 */
public class MedicamentosYAlimentos extends javax.swing.JFrame {

     boolean medicamento, alimento, vacuna, inmunizador, vitamina, conceEngorde, conceCrecimiento, maiz;

    String nombreproveedor = "", tipoproducto = "", nombreProducto = "", nombreAlimento = "", proveedor = "", Dimensional = "",tipoDimensional="";
    int cantidad = 0;
    float total;
    ColorearInterfazNegro pintarInterfaz = new ColorearInterfazNegro();
    ColorearInterfazBlanco pintarInterfazBlanco = new ColorearInterfazBlanco();

    /*crud thecrud = new crud();
    Connection con = (Connection) ConexionBD.GetConnection();*/
    /**
     * Creates new form Menu
     */
    public MedicamentosYAlimentos() {

        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        transparenciButton();

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
        AgregarDimensionalbtn.setOpaque(false);
        AgregarDimensionalbtn.setContentAreaFilled(false);
        AgregarDimensionalbtn.setBorderPainted(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TipoInsumo = new javax.swing.ButtonGroup();
        Medicamentos = new javax.swing.ButtonGroup();
        Alimentos = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Actualizarbtn = new javax.swing.JButton();
        Guardarbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Cantidadtxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Totaltxt = new javax.swing.JTextField();
        Eliminarbtn = new javax.swing.JButton();
        Medicamentosrbtn = new javax.swing.JRadioButton();
        Alimentosrbtn = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Inmunizadorrbtn = new javax.swing.JRadioButton();
        ConCrecimientorbtn = new javax.swing.JRadioButton();
        FechaCalendar1 = new com.toedter.calendar.JCalendar();
        jLabel14 = new javax.swing.JLabel();
        FechaCalendar2 = new com.toedter.calendar.JCalendar();
        jLabel3 = new javax.swing.JLabel();
        Maizrbtn = new javax.swing.JRadioButton();
        Vitaminarbtn = new javax.swing.JRadioButton();
        Vacunarbtn = new javax.swing.JRadioButton();
        ConEngorderbtn = new javax.swing.JRadioButton();
        Dimensionaljcmb = new javax.swing.JComboBox<>();
        AgregarDimensionalbtn = new javax.swing.JButton();
        Proveedorjcmb = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        btn_oscuro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(242, 253, 250));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 700));

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar-sesion.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Actualizarbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Actualizarbtn.setForeground(new java.awt.Color(102, 102, 102));
        Actualizarbtn.setText("Actualizar");
        Actualizarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarbtnActionPerformed(evt);
            }
        });
        jPanel2.add(Actualizarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 580, 120, -1));

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
        jPanel2.add(Guardarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 630, 120, 35));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inyeccion.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

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
        jPanel2.add(Cantidadtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 570, 253, 43));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Tipo de Insumo");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Fecha de Vencimiento");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, -1, -1));

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
        jPanel2.add(Totaltxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 620, 253, 43));

        Eliminarbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Eliminarbtn.setForeground(new java.awt.Color(102, 102, 102));
        Eliminarbtn.setText("Eliminar");
        Eliminarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarbtnActionPerformed(evt);
            }
        });
        jPanel2.add(Eliminarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 530, 120, -1));

        Medicamentosrbtn.setBackground(new java.awt.Color(244, 253, 251));
        TipoInsumo.add(Medicamentosrbtn);
        Medicamentosrbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Medicamentosrbtn.setForeground(new java.awt.Color(51, 51, 51));
        Medicamentosrbtn.setText("Medicamentos");
        jPanel2.add(Medicamentosrbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, -1, -1));

        Alimentosrbtn.setBackground(new java.awt.Color(244, 253, 251));
        TipoInsumo.add(Alimentosrbtn);
        Alimentosrbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Alimentosrbtn.setText("Alimentos");
        jPanel2.add(Alimentosrbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/maiz.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Tipo de Medicamento");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Tipo de Alimento");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, -1, -1));

        Inmunizadorrbtn.setBackground(new java.awt.Color(244, 253, 251));
        Medicamentos.add(Inmunizadorrbtn);
        Inmunizadorrbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Inmunizadorrbtn.setText("Inmunizador");
        Inmunizadorrbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InmunizadorrbtnActionPerformed(evt);
            }
        });
        jPanel2.add(Inmunizadorrbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, -1, -1));

        ConCrecimientorbtn.setBackground(new java.awt.Color(244, 253, 251));
        Alimentos.add(ConCrecimientorbtn);
        ConCrecimientorbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ConCrecimientorbtn.setText("Concentrado de crecimiento");
        jPanel2.add(ConCrecimientorbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, -1, -1));
        jPanel2.add(FechaCalendar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, -1, 125));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Fecha de Ingreso");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, -1, -1));
        jPanel2.add(FechaCalendar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, -1, 125));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("MEDICAMENTOS Y ALIMENTOS");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 24, -1, -1));

        Maizrbtn.setBackground(new java.awt.Color(244, 253, 251));
        Alimentos.add(Maizrbtn);
        Maizrbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Maizrbtn.setText("Maiz");
        jPanel2.add(Maizrbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, -1, -1));

        Vitaminarbtn.setBackground(new java.awt.Color(244, 253, 251));
        Medicamentos.add(Vitaminarbtn);
        Vitaminarbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Vitaminarbtn.setText("Vitamina");
        Vitaminarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VitaminarbtnActionPerformed(evt);
            }
        });
        jPanel2.add(Vitaminarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, -1, -1));

        Vacunarbtn.setBackground(new java.awt.Color(244, 253, 251));
        Medicamentos.add(Vacunarbtn);
        Vacunarbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Vacunarbtn.setText("Vacuna");
        Vacunarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VacunarbtnActionPerformed(evt);
            }
        });
        jPanel2.add(Vacunarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, -1, -1));

        ConEngorderbtn.setBackground(new java.awt.Color(244, 253, 251));
        Alimentos.add(ConEngorderbtn);
        ConEngorderbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ConEngorderbtn.setText("Concentrado de engorde ");
        jPanel2.add(ConEngorderbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, -1, -1));

        Dimensionaljcmb.setBackground(new java.awt.Color(244, 253, 251));
        Dimensionaljcmb.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Dimensionaljcmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DimensionaljcmbActionPerformed(evt);
            }
        });
        jPanel2.add(Dimensionaljcmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 570, 140, 40));

        AgregarDimensionalbtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        AgregarDimensionalbtn.setText("+");
        AgregarDimensionalbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarDimensionalbtnActionPerformed(evt);
            }
        });
        jPanel2.add(AgregarDimensionalbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 570, -1, -1));

        Proveedorjcmb.setBackground(new java.awt.Color(244, 253, 251));
        Proveedorjcmb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Proveedorjcmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Proveedor", " ", " " }));
        Proveedorjcmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProveedorjcmbActionPerformed(evt);
            }
        });
        jPanel2.add(Proveedorjcmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 520, 250, 40));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton4.setForeground(new java.awt.Color(102, 102, 102));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-de-regreso.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btn_oscuro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/darkmode_1.png"))); // NOI18N
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
                .addContainerGap(71, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 976, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_oscuro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_oscuro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 60, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 860));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Menu3 menux = new Menu3();
        menux.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void ProveedorjcmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProveedorjcmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProveedorjcmbActionPerformed

    private void AgregarDimensionalbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarDimensionalbtnActionPerformed
        // TODO add your handling code here:
          tipoDimensional = JOptionPane.showInputDialog("Ingrese Producto");
         Dimensionaljcmb.addItem(tipoDimensional);
    }//GEN-LAST:event_AgregarDimensionalbtnActionPerformed

    private void DimensionaljcmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DimensionaljcmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DimensionaljcmbActionPerformed

    private void VacunarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VacunarbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VacunarbtnActionPerformed

    private void VitaminarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VitaminarbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VitaminarbtnActionPerformed

    private void InmunizadorrbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InmunizadorrbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InmunizadorrbtnActionPerformed

    private void EliminarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarbtnActionPerformed
       
    }//GEN-LAST:event_EliminarbtnActionPerformed

    private void TotaltxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TotaltxtKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

             total = Float.parseFloat(Totaltxt.getText());
        }
    }//GEN-LAST:event_TotaltxtKeyPressed

    private void TotaltxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotaltxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotaltxtActionPerformed

    private void CantidadtxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CantidadtxtKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cantidad = Integer.parseInt(Cantidadtxt.getText());

        }
    }//GEN-LAST:event_CantidadtxtKeyPressed

    private void CantidadtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantidadtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CantidadtxtActionPerformed

    private void GuardarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarbtnActionPerformed

          if (Medicamentosrbtn.isSelected()) {
            medicamento = true;
            tipoproducto = "Medicamentos";
            System.out.println("Tipo Medicamento" + tipoproducto);

            if (Vacunarbtn.isSelected()) {
                vacuna = true;
                nombreProducto = "Vacuna";
                System.out.println("Nombre Medicamento" + nombreProducto);

            }
            if (Inmunizadorrbtn.isSelected()) {
                inmunizador = true;
                nombreProducto = "Inmunizador";
                System.out.println("Nombre Medicamento" + nombreProducto);
            }
            if (Maizrbtn.isSelected()) {
                inmunizador = true;
                nombreProducto = "Inmunizador";
                System.out.println("Nombre Medicamento" + nombreProducto);
            }
        } else {
            medicamento = false;
        }

        if (Alimentosrbtn.isSelected()) {
            alimento = true;
            tipoproducto = "Alimentos";
            System.out.println("Tipo Medicamento" + tipoproducto);

            if (ConEngorderbtn.isSelected()) {
                conceEngorde = true;
                nombreAlimento = "Concentrado de Engorde";
                System.out.println("Tipo Medicamento" + nombreAlimento);
            }
            if (ConCrecimientorbtn.isSelected()) {
                conceCrecimiento = true;
                nombreAlimento = "Concentrado de Crecimiento";
                System.out.println("Tipo Medicamento" + nombreAlimento);
            }
            if (Maizrbtn.isSelected()) {
                maiz = true;
                nombreAlimento = "Maiz";
                System.out.println("Tipo Medicamento" + nombreAlimento);
            }

        } else {
            alimento = false;
        }
        proveedor = (String) Proveedorjcmb.getSelectedItem();
        cantidad = Integer.parseInt(Cantidadtxt.getText());
        Dimensional = (String) Dimensionaljcmb.getSelectedItem();
          total = Float.parseFloat(Totaltxt.getText());
        System.out.println(proveedor);
        System.out.println(cantidad);
        System.out.println(total);
    }//GEN-LAST:event_GuardarbtnActionPerformed

    private void ActualizarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarbtnActionPerformed
       
    }//GEN-LAST:event_ActualizarbtnActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btn_oscuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_oscuroActionPerformed
        if (!modoOscuro) {
            pintarInterfaz.ColorearMedicamentosYAlimentos(jPanel1, jPanel2, btn_oscuro, Proveedorjcmb, Dimensionaljcmb, Cantidadtxt, Totaltxt, AgregarDimensionalbtn, Eliminarbtn, Actualizarbtn, Guardarbtn);
            modoOscuro = true;
        } else if (modoOscuro == true) {
            pintarInterfazBlanco.ColorearMedicamentosYAlimentos(jPanel1, jPanel2, btn_oscuro, Proveedorjcmb, Dimensionaljcmb, Cantidadtxt, Totaltxt, AgregarDimensionalbtn, Eliminarbtn, Actualizarbtn, Guardarbtn);

            modoOscuro = false;
        }
    }//GEN-LAST:event_btn_oscuroActionPerformed
    List Proveedores = new ArrayList();

    static void obtener_proveedor(ArrayList<Integer> id, ArrayList<String> Proveedor) {
        int ID = 0;
        String proveedor = "";
        id.get(ID);
        Proveedor.get(Integer.parseInt(proveedor));
    }
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
            java.util.logging.Logger.getLogger(MedicamentosYAlimentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MedicamentosYAlimentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MedicamentosYAlimentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MedicamentosYAlimentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MedicamentosYAlimentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizarbtn;
    private javax.swing.JButton AgregarDimensionalbtn;
    private javax.swing.ButtonGroup Alimentos;
    private javax.swing.JRadioButton Alimentosrbtn;
    private javax.swing.JTextField Cantidadtxt;
    private javax.swing.JRadioButton ConCrecimientorbtn;
    private javax.swing.JRadioButton ConEngorderbtn;
    private javax.swing.JComboBox<String> Dimensionaljcmb;
    private javax.swing.JButton Eliminarbtn;
    private com.toedter.calendar.JCalendar FechaCalendar1;
    private com.toedter.calendar.JCalendar FechaCalendar2;
    private javax.swing.JButton Guardarbtn;
    private javax.swing.JRadioButton Inmunizadorrbtn;
    private javax.swing.JRadioButton Maizrbtn;
    private javax.swing.ButtonGroup Medicamentos;
    private javax.swing.JRadioButton Medicamentosrbtn;
    private javax.swing.JComboBox<String> Proveedorjcmb;
    private javax.swing.ButtonGroup TipoInsumo;
    private javax.swing.JTextField Totaltxt;
    private javax.swing.JRadioButton Vacunarbtn;
    private javax.swing.JRadioButton Vitaminarbtn;
    private javax.swing.JButton btn_oscuro;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
