/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Toshiba
 */
public class ColorearComponenteNegro extends Componente {

    public void PintarBotonActivar() {
        /*componente.*/
        getBotonActivador().setIcon(new ImageIcon(getClass().getResource("/Imagenes/darkmode_2.png")));
    }

    public void PintarBoton() {
        getBoton().setForeground(Color.decode("#FFFFE0"));
    }

    public void PintarLabel() {
        getLabel().setForeground(Color.decode("#666666"));
    }

    public void PintarTexto() {
        getText().setForeground(Color.decode("#FFFFE0"));
    }

    public void PintarContraseña() {
        getContraseña().setForeground(Color.decode("#FFFFE0"));
    }

    public void PintarPanelFondo() {
        getPanelFondo().setBackground(Color.decode("#212b41"));
    }

    public void PintarPanelBase() {
        getPanelBase().setBackground(Color.decode("#2e3951"));
    }
}
