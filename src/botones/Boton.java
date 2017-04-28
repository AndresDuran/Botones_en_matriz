/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botones;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
/**
 *
 * @author Jorge Duran
 * @author Albert Charry
 */
public class Boton extends JButton implements ActionListener {     
    //constructor que contiene las coordenadas para el posicionamiento de los botones
    public Boton( int posx, int posy, int ancho, int alto ){ 
        //se ubica el boton y se le da un tamaño
        setBounds(posx, posy, ancho, alto);
        //se le asigna un color
        setBackground(java.awt.Color.WHITE);
        
        addActionListener( this );//Se agrega el action listener en este caso la misma clase
    }
  
    // Cambio de color de los botones creados
    public void actionPerformed( ActionEvent e ){
        //se asigna el negro al momento de darle click
        setBackground(Color.BLACK);
      
    }
}
