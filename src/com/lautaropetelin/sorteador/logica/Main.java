package com.lautaropetelin.sorteador.logica;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.lautaropetelin.sorteador.igu.Principal;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {
    
    public static void main(String[] args) {
        
        try {
            UIManager.setLookAndFeel(new FlatMacDarkLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            JOptionPane.showMessageDialog(null, "El Look And Feel no ha sido instalado o no es compatible con la versión de java que estás utilizando.", "Error con Look And Feel", JOptionPane.ERROR_MESSAGE);
        }
        
        Principal ventana = new Principal();
        ventana.setTitle("Sorteador by Lautaro Petelin");
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }
}