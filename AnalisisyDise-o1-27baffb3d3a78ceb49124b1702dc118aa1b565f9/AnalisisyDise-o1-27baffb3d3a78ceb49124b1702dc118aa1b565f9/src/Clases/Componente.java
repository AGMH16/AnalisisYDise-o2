/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Toshiba
 */
public class Componente {
    private JButton boton,boton2,boton3,boton4,boton5,boton6;
    private JLabel label,label2,label3,label4,label5;
    private JTextField text,text2,text3,text4,text5;
    private JPasswordField contraseña,contraseña2;
    private JComboBox combo,combo2,combo3;
    private JPanel panelFondo, panelBase;
    private JRadioButton radiobtn;

   /* public Componente(JButton boton, JButton boton2, JButton boton3, JButton boton4, JButton boton5, JButton boton6, JLabel label, JLabel label2, JLabel label3, JLabel label4, JLabel label5, JTextField text, JTextField text2, JTextField text3, JTextField text4, JTextField text5, JPasswordField contraseña, JPasswordField contraseña2, JComboBox combo, JComboBox combo2, JComboBox combo3, JPanel panelFondo, JPanel panelBase, JRadioButton radiobtn) {
        this.boton = boton;
        this.boton2 = boton2;
        this.boton3 = boton3;
        this.boton4 = boton4;
        this.boton5 = boton5;
        this.boton6 = boton6;
        this.label = label;
        this.label2 = label2;
        this.label3 = label3;
        this.label4 = label4;
        this.label5 = label5;
        this.text = text;
        this.text2 = text2;
        this.text3 = text3;
        this.text4 = text4;
        this.text5 = text5;
        this.contraseña = contraseña;
        this.contraseña2 = contraseña2;
        this.combo = combo;
        this.combo2 = combo2;
        this.combo3 = combo3;
        this.panelFondo = panelFondo;
        this.panelBase = panelBase;
        this.radiobtn = radiobtn;
    }*/
    
    public void ComponentesCliente(JButton boton_obscuro, JButton boton2, JButton boton3, JLabel label, JTextField text, JTextField text2, JTextField text3, JTextField text4, JTextField text5, JPanel panelFondo, JPanel panelBase){
    this.text = text;
        this.text2 = text2;
        this.text3 = text3;
        this.text4 = text4;
        this.text5 = text5;
        this.panelFondo = panelFondo;
        this.panelBase = panelBase;
        this.boton = boton_obscuro;
        this.boton2 = boton2;
        this.boton3 = boton3;
        this.label = label;
    }
    public JButton getBoton2() {
        return boton2;
    }

    public void setBoton2(JButton boton2) {
        this.boton2 = boton2;
    }

    public JButton getBoton3() {
        return boton3;
    }

    public void setBoton3(JButton boton3) {
        this.boton3 = boton3;
    }

    public JButton getBoton4() {
        return boton4;
    }

    public void setBoton4(JButton boton4) {
        this.boton4 = boton4;
    }

    public JButton getBoton5() {
        return boton5;
    }

    public void setBoton5(JButton boton5) {
        this.boton5 = boton5;
    }

    public JLabel getLabel2() {
        return label2;
    }

    public void setLabel2(JLabel label2) {
        this.label2 = label2;
    }

    public JLabel getLabel3() {
        return label3;
    }

    public void setLabel3(JLabel label3) {
        this.label3 = label3;
    }

    public JLabel getLabel4() {
        return label4;
    }

    public void setLabel4(JLabel label4) {
        this.label4 = label4;
    }

    public JLabel getLabel5() {
        return label5;
    }

    public void setLabel5(JLabel label5) {
        this.label5 = label5;
    }

    public JTextField getText2() {
        return text2;
    }

    public void setText2(JTextField text2) {
        this.text2 = text2;
    }

    public JTextField getText3() {
        return text3;
    }

    public void setText3(JTextField text3) {
        this.text3 = text3;
    }

    public JTextField getText4() {
        return text4;
    }

    public void setText4(JTextField text4) {
        this.text4 = text4;
    }

    public JTextField getText5() {
        return text5;
    }

    public void setText5(JTextField text5) {
        this.text5 = text5;
    }

    public JPasswordField getContraseña2() {
        return contraseña2;
    }

    public void setContraseña2(JPasswordField contraseña2) {
        this.contraseña2 = contraseña2;
    }

    public JComboBox getCombo2() {
        return combo2;
    }

    public void setCombo2(JComboBox combo2) {
        this.combo2 = combo2;
    }

    public JComboBox getCombo3() {
        return combo3;
    }

    public void setCombo3(JComboBox combo3) {
        this.combo3 = combo3;
    }
    
    
    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    public JComboBox getCombo() {
        return combo;
    }

    public void setCombo(JComboBox combo) {
        this.combo = combo;
    }

    public JTextField getText() {
        return text;
    }

    public void setText(JTextField text) {
        this.text = text;
    }

    public JButton getBoton() {
        return boton;
    }

    public void setBoton(JButton boton) {
        this.boton = boton;
    }

    public JRadioButton getRadiobtn() {
        return radiobtn;
    }

    public void setRadiobtn(JRadioButton radiobtn) {
        this.radiobtn = radiobtn;
    }

    public JPasswordField getContraseña() {
        return contraseña;
    }

    public void setContraseña(JPasswordField contraseña) {
        this.contraseña = contraseña;
    }

    public JPanel getPanelFondo() {
        return panelFondo;
    }

    public void setPanelFondo(JPanel panelFondo) {
        this.panelFondo = panelFondo;
    }

    public JPanel getPanelBase() {
        return panelBase;
    }

    public void setPanelBase(JPanel panelBase) {
        this.panelBase = panelBase;
    }
    
}
