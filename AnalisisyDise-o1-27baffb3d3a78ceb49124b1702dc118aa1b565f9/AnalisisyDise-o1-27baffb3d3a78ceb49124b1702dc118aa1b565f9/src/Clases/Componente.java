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

    private JButton boton, botonActivador;
    private JLabel label;
    private JTextField text;
    private JPasswordField contraseña;
    private JComboBox combo;
    private JPanel panelFondo, panelBase;
    private JRadioButton radiobtn;

    public Componente() {
        this.boton = boton;
        this.botonActivador = botonActivador;
        this.label = label;
        this.text = text;
        this.contraseña = contraseña;
        this.combo = combo;
        this.panelFondo = panelFondo;
        this.panelBase = panelBase;
        this.radiobtn = radiobtn;
    }

    public Componente(JButton boton, JButton botonActivador, JLabel label, JTextField text, JPasswordField contraseña, JComboBox combo, JPanel panelFondo, JPanel panelBase, JRadioButton radiobtn) {
        this.boton = boton;
        this.botonActivador = botonActivador;
        this.label = label;
        this.text = text;
        this.contraseña = contraseña;
        this.combo = combo;
        this.panelFondo = panelFondo;
        this.panelBase = panelBase;
        this.radiobtn = radiobtn;
    }

    public JButton getBotonActivador() {
        return botonActivador;
    }

    public void setBotonActivador(JButton botonActivador) {
        this.botonActivador = botonActivador;
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
