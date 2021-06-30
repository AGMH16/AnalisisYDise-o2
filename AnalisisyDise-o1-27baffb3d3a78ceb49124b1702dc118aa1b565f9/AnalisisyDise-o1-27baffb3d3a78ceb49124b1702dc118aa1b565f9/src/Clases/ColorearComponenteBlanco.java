/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author Toshiba
 */
public class ColorearComponenteBlanco extends Componente {

    public void PintarBotonActivar() {
        getBotonActivador().setIcon(new ImageIcon(getClass().getResource("/Imagenes/darkmode_1.png")));
    }

    public void PintarBoton() {
        getBoton().setForeground(Color.decode("#66646C"));
    }

    public void PintarLabel() {
        getLabel().setForeground(Color.decode("#666666"));
    }

    public void PintarTexto() {
       getText().setForeground(Color.WHITE);
    }

    public void PintarContraseña() {
        getContraseña().setBackground(Color.decode("#FFFFE0"));
    }

    public void PintarPanelFondo() {
        getPanelFondo().setBackground(Color.decode("#F2FDFA"));
    }

    public void PintarPanelBase() {
        getPanelBase().setBackground(Color.WHITE);
    }
}
