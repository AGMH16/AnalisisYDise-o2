/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Toshiba
 */
public class ColorComponente {

    private Componente componente;

    public Componente getComponente() {
        return componente;
    }

    public void setComponente(Componente componente) {
        this.componente = componente;
    }

    public void ClienteModoObscuro() {
        componente.getPanelFondo().setBackground(Color.decode("#212b41"));
        componente.getPanelBase().setBackground(Color.decode("#2e3951"));
        componente.getText().setForeground(Color.decode("#FFFFE0"));
        componente.getText2().setForeground(Color.decode("#FFFFE0"));
        componente.getText3().setForeground(Color.decode("#FFFFE0"));
        componente.getText4().setForeground(Color.decode("#FFFFE0"));
        componente.getText5().setForeground(Color.decode("#FFFFE0"));
        componente.getBoton().setIcon(new ImageIcon(getClass().getResource("/images/darkmode_2.png")));
        componente.getBoton2().setForeground(Color.decode("#FFFFE0"));
        componente.getBoton3().setForeground(Color.decode("#FFFFE0"));
        componente.getLabel().setForeground(Color.decode("#FFFFE0"));
    }
    public void ClienteModoClaro(){
        componente.getPanelFondo().setBackground(Color.decode("#F2FDFA"));
        componente.getPanelBase().setBackground(Color.WHITE);
        componente.getText().setForeground(Color.WHITE);
        componente.getText2().setForeground(Color.WHITE);
        componente.getText3().setForeground(Color.WHITE);
        componente.getText4().setForeground(Color.WHITE);
        componente.getText5().setForeground(Color.WHITE);
        componente.getBoton().setIcon(new ImageIcon(getClass().getResource("/images/darkmode_1.png")));
        componente.getBoton2().setForeground(Color.decode("#66646C"));
        componente.getBoton3().setForeground(Color.decode("#66646C"));
        componente.getLabel().setForeground(Color.decode("#666666"));
    
    }
    public void PintarColaborador(){
        componente.getPanelFondo().setBackground(Color.decode("#212b41"));
        componente.getPanelBase().setBackground(Color.decode("#2e3951"));
        componente.getText().setForeground(Color.decode("#FFFFE0"));
        componente.getBoton().setIcon(new ImageIcon(getClass().getResource("/images/darkmode_2.png")));
  
    }
    private void PintarBoton() {
        componente.getBoton().setForeground(Color.decode("#FFFFE0"));
    }

    private void PintarLabel() {
        componente.getLabel().setForeground(Color.decode("#666666"));
    }

    private void PintarTexto() {
        componente.getText().setForeground(Color.decode("#FFFFE0"));
    }

    private void PintarContraseña() {
        componente.getContraseña().setForeground(Color.decode("#FFFFE0"));
    }

    private void PintarPanelFondo() {
        componente.getPanelFondo().setBackground(Color.decode("#212b41"));
    }

    private void PintarPanelBase() {
        componente.getPanelBase().setBackground(Color.decode("#2e3951"));
    }
}
