/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botones;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JToolBar;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
/**
 *
 * @author Jorge Duran
 * @author Albert Charry
 */
public class Ventana extends JFrame implements ActionListener {
    private JPanel panelImagen;
    private JTextField Filas;
    private JTextField  Columnas;
    private JButton Crear;
    private JLabel leeFilas;
    private JLabel leeColumnas;
    private JPanel panel;
    
    
    public Ventana() {
        
        JToolBar barra = new JToolBar();
                
	leeFilas = new JLabel();//  Crea el cuadro para las filas
	leeColumnas= new JLabel();//  Crea el cuadro para las columnas
	Filas = new JTextField(); //  Crea el espacio para introducir los datos de filas
	Columnas = new JTextField(); //  Crea el espacio para introducir los datos de columnas
		
	panel = new JPanel( null );
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Cambio De Color Botones");
        getContentPane().setLayout(new BorderLayout());
                
                
        panelImagen = new PanelImagen();
        getContentPane().add(panelImagen, BorderLayout.NORTH);
        
        leeFilas.setText("Filas");
	barra.add(leeFilas);
	Filas.setPreferredSize(new Dimension(250, 25));// tamaño del cuadro para el ingreso de datos en filas
	barra.add(Filas);

        leeColumnas.setText("Columnas");
	barra.add(leeColumnas);

	Columnas.setPreferredSize(new Dimension(250, 25));// tamaño del caudro para el ingreso de datos en columnas
	barra.add(Columnas);
	Crear = new JButton("CREAR");
	Crear.addActionListener(this);
        barra.add(Crear);
	this.add(barra, BorderLayout.PAGE_END);//Colocamos el JToolBar en la parte de abajo del JFrame
        this.add(panel, BorderLayout.CENTER);//Se agrega el panel a boton en el centro
        this.setSize(1000, 600); //tamaño de la pantalla
	this.setLocationRelativeTo(null);//Permite que la ventana se coloque al centro de la pantalla
        setVisible(true);//la hace visible

    }
    
    public void actionPerformed( ActionEvent evt ) {
        //Se obtiene la cantidad de filas a crear como una cadena de caracter
        String f = Filas.getText();
        //Se obtiene la cantidad de columnas a crear como una cadena de caracter
        String c = Columnas.getText();
        //Se cambia de cadena de caracteres a numeros
        int filas = Integer.parseInt(f);
        int columnas = Integer.parseInt(c);
        //Eliminamos los anteriores botones
        panel.removeAll();
        //Se crea una matriz de botones segun las filas y columnas entrantes
        Boton [][] botones = new Boton[ filas ][ columnas ];
        //Se recorren las filas
        for( int fila = 0 ; fila < filas; fila++ ){//Estando en la fila se recorrer las columnas
            for( int columna = 0 ; columna < columnas; columna++ ){ //Se crea el boton y se agrega a las celda de la matriz
                botones[fila][columna] = new Boton( 90 * columna, 20 * fila, 90, 20 );
                panel.add( botones[fila][columna] );
            }
        }//Se actualiza el panel para que se vean los botones
	panel.updateUI();
            
    }      
}
