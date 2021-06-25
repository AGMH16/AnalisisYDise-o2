/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Toshiba
 */
public class ColorearInterfazNegro extends ColorearComponenteNegro {

    private ColorearComponenteNegro colorear = IniciarColorear();

    public void ColorearClienteNegro(JPanel jPanel1, JPanel jPanel2, JButton GuardarClientebtn, JButton Actualizarbtn, JButton Activador, JTextField nombre, JTextField apellido, JTextField movil, JTextField telefono, JTextField direccion) {
        ColorearComponentesBase(jPanel1, jPanel2, Activador);
        ColorearTextos(nombre, apellido, movil, telefono, direccion);
        ColorearBotones(Actualizarbtn, GuardarClientebtn, null, null, null);

    }

    //Esta función se utiliza en la interfaz de colaborador y de libreta
    public void ColorearConsultasNegro(JPanel jPanel1, JPanel jPanel2, JButton Eliminarbtn, JButton Actualizarbtn, JButton Activador, JTextField buscarTxt) {
        ColorearComponentesBase(jPanel1, jPanel2, Activador);
        ColorearBotones(Actualizarbtn, Eliminarbtn, null, null, null);
        colorear.setText(buscarTxt);
        colorear.PintarTexto();
    }

    public void ColorearCrearCuentaNegro(JPanel jPanel1, JPanel jPanel2, JButton Activador, JButton CrearCuenta, JTextField nombre, JTextField apellido, JTextField correo, JTextField puesto, JTextField usuario, JPasswordField contraseña, JPasswordField contraseña2) {
        ColorearComponentesBase(jPanel1, jPanel2, Activador);
        ColorearTextos(nombre, apellido, correo, puesto, usuario);
        colorear.setBoton(CrearCuenta);
        colorear.PintarBoton();
        colorear.setContraseña(contraseña);
        colorear.PintarContraseña();
        colorear.setContraseña(contraseña2);
        colorear.PintarContraseña();
    }

    public void ColorearIngresoNegro(JPanel jPanel1, JPanel jPanel2, JButton Activador, JTextField usuario, JPasswordField contraseña, JButton Entrar, JButton Registrar, JButton Recuperar) {
        ColorearComponentesBase(jPanel1, jPanel2, Activador);
        colorear.setText(usuario);
        colorear.PintarTexto();
        colorear.setContraseña(contraseña);
        colorear.PintarContraseña();
        ColorearBotones(Registrar, Recuperar, Entrar, null, null);
    }

    public void ColorearInventarioNegro(JPanel jPanel1, JPanel jPanel2, JButton Activador, JComboBox producto, JComboBox proveedor, JComboBox dimensional, JTextField Cantidad, JTextField Total, JButton add1, JButton add2, JButton eliminar, JButton actualizar, JButton guardar) {
        ColorearComponentesBase(jPanel1, jPanel2, Activador);
        colorear.setCombo(producto);
        colorear.PintarCombo();
        colorear.setCombo(proveedor);
        colorear.PintarCombo();
        colorear.setCombo(dimensional);
        colorear.PintarCombo();
        ColorearTextos(Cantidad, Total, null, null, null);
        ColorearBotones(add1, add2, eliminar, actualizar, guardar);
    }

    public void ColorearMateriaPrima(JPanel jPanel1, JPanel jPanel2, JButton Activador, JComboBox proveedor, JTextField Cantidad, JTextField Total, JTextField CodigoAverio, JButton eliminar, JButton actualizar, JButton guardar) {
        ColorearComponentesBase(jPanel1, jPanel2, Activador);
        colorear.setCombo(proveedor);
        colorear.PintarCombo();
        ColorearBotones(guardar, eliminar, actualizar, null, null);
        ColorearTextos(CodigoAverio, Cantidad, Total, null, null);

    }

    public void ColorearMedicamentosYAlimentos(JPanel jPanel1, JPanel jPanel2, JButton Activador, JComboBox proveedor, JComboBox dimensional, JTextField Cantidad, JTextField total, JButton add1) {
        ColorearComponentesBase(jPanel1, jPanel2, Activador);
        ColorearTextos(null, Cantidad, total, null, null);
        colorear.setBoton(add1);
        colorear.PintarBoton();
        colorear.setCombo(proveedor);
        colorear.PintarCombo();
        colorear.setCombo(dimensional);
        colorear.PintarCombo();
    }

    public void ColorearMercaderiaNegro(JPanel jPanel1, JPanel jPanel2, JButton Activador, JComboBox producto, JTextField Cantidad, JTextField Total, JButton add1, JButton guardar, JButton actualizar, JButton eliminar) {
        ColorearComponentesBase(jPanel1, jPanel2, Activador);
        colorear.setCombo(producto);
        ColorearTextos(Total, Cantidad, null, null, null);
        ColorearBotones(add1, guardar, actualizar, eliminar, null);
    }

    public void ColorearPanelMailNegro(JPanel jPanel1, JPanel jPanel2, JButton Activador, JTextField correo, JTextField codigo, JButton Enviar, JButton Verificar) {
        ColorearComponentesBase(jPanel1, null, Activador);
        ColorearTextos(correo, codigo, null, null, null);
        ColorearBotones(Enviar, Verificar, null, null, null);
    }

    public void ColorearPerdidaMateriaPrima(JPanel jPanel1, JPanel jPanel2, JButton Activador, JTextField codigoAverio, JTextField cantidad, JButton guardar, JButton actualizar, JButton eliminar) {
        ColorearComponentesBase(jPanel1, jPanel2, Activador);
        ColorearTextos(codigoAverio, cantidad, null, null, null);
        ColorearBotones(guardar, eliminar, actualizar, null, null);
    }

    public void ColorearProveedorNegro(JPanel jPanel1, JPanel jPanel2, JButton Activador, JTextField nombre, JTextField telefono, JTextField direccion, JTextField empresa, JButton guardar, JButton actualizar, JButton eliminar) {
        ColorearComponentesBase(jPanel1, jPanel2, Activador);
        ColorearTextos(nombre, telefono, empresa, direccion,null);
        ColorearBotones(guardar,eliminar,actualizar,null,null);
    }
    public void ColorearRecuperarContraseña(JPanel jPanel1, JPanel jPanel2, JButton Activador,JTextField usuario,JPasswordField contraseña,JPasswordField contraseña2 , JButton Confirmar){
        ColorearComponentesBase(jPanel1, jPanel2, Activador);
        colorear.setText(usuario);
        colorear.PintarTexto();
        colorear.setContraseña(contraseña);
        colorear.PintarContraseña();
        colorear.setContraseña(contraseña2);
        colorear.PintarContraseña();
        colorear.setBoton(Confirmar);
        colorear.PintarBoton();
    }
    private ColorearComponenteNegro IniciarColorear() {
        Componente componente = new Componente();
        ColorearComponenteNegro colorear = new ColorearComponenteNegro();
        return colorear;
    }

    private void ColorearComponentesBase(JPanel jPanel1, JPanel jPanel2, JButton Activador) {
        colorear.setPanelFondo(jPanel1);
        colorear.PintarPanelFondo();
        colorear.setPanelBase(jPanel2);
        colorear.PintarPanelBase();
        colorear.setBotonActivador(Activador);
        colorear.PintarBotonActivar();
    }

    private void ColorearTextos(JTextField texto1, JTextField texto2, JTextField texto3, JTextField texto4, JTextField texto5) {
        colorear.setText(texto1);
        colorear.PintarTexto();
        colorear.setText(texto2);
        colorear.PintarTexto();
        colorear.setText(texto3);
        colorear.PintarTexto();
        colorear.setText(texto4);
        colorear.PintarTexto();
        colorear.setText(texto5);
        colorear.PintarTexto();
    }

    private void ColorearBotones(JButton boton1, JButton boton2, JButton boton3, JButton boton4, JButton boton5) {

        colorear.setBoton(boton1);
        colorear.PintarBoton();
        colorear.setBoton(boton2);
        colorear.PintarBoton();
        colorear.setBoton(boton3);
        colorear.PintarBoton();
        colorear.setBoton(boton4);
        colorear.PintarBoton();
        colorear.setBoton(boton5);
        colorear.PintarBoton();
    }
}
