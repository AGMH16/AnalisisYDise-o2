/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Toshiba
 */
public class ColorearInterfazNegro extends ColorearComponenteNegro {

    public void ColorearClienteNegro(JButton Actualizarbtn,JPanel jPanel2,JButton GuardarClientebtn) {
        Componente componente = new Componente();
        ColorearComponenteNegro colorear = new ColorearComponenteNegro();

        colorear.setBoton(Actualizarbtn);
        colorear.PintarBoton();
        colorear.setPanelBase(jPanel2);
        colorear.PintarPanelBase();
        colorear.setBoton(GuardarClientebtn);
        colorear.PintarBoton();
        System.out.println("Entro");
    }
}
