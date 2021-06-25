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

    private void PintarBotonActivar() {
        getBoton().setIcon(new ImageIcon(getClass().getResource("/images/darkmode_1.png")));
    }

    private void PintarBoton() {
        getBoton().setForeground(Color.decode("#66646C"));
    }

    private void PintarLabel() {
        getLabel().setForeground(Color.decode("#666666"));
    }

    private void PintarTexto() {
       getText().setForeground(Color.WHITE);
    }

    private void PintarContraseña() {
        getContraseña().setBackground(Color.decode("#FFFFE0"));
    }

    private void PintarPanelFondo() {
        getPanelFondo().setBackground(Color.decode("#F2FDFA"));
    }

    private void PintarPanelBase() {
        getPanelBase().setBackground(Color.WHITE);
    }
}
