/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botones;

import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import javax.swing.JLabel;
import javax.swing.JPanel;  
import javax.swing.border.LineBorder;

/**
 *
 * @author Jorge Duran
 * @author Albert Charry
 */
public class PanelImagen extends JPanel{
    
    private JLabel etiquetaImagen;
    
    public PanelImagen() {
        //crea carga y muestra la imagen del logo de la Universidad con los nombres
        setBackground(Color.WHITE);
        setBorder(new LineBorder (Color.GRAY));
        ImageIcon icon = new ImageIcon("imagenes/logo.JPG");
        etiquetaImagen = new JLabel();
        etiquetaImagen.setIcon(icon);
        
        add(etiquetaImagen);
   
}
    
}