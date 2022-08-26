import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ejercicio2 extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel etiqueta1, etiqueta2, etiqueta3; //son las etiquetas/rotulos
	private JComboBox<String> caja1, caja2, caja3; //son las cajas
	private JButton boton1; //boton

	//creamos el constructor
	public Ejercicio2() {
		setLayout(null);
		
		//para la etiqueta rojo
		etiqueta1 = new JLabel("Rojo:"); 
		etiqueta1.setBounds(8, 8, 100, 30);
		add(etiqueta1);
		
		//para la caja (cuenta desde 0 hasta el 255,dependiendo del color cambia el color final)
		caja1 = new JComboBox<String>();
		caja1.setBounds(100, 8, 120, 30);
		for (int num = 0; num <= 255; num++) {
			caja1.addItem(String.valueOf(num));
		}
		add(caja1);
		
		//para la etiqueta verde
		etiqueta2 = new JLabel("Verde:"); //para el nombre verde
		etiqueta2.setBounds(8,40, 100, 60);
		add(etiqueta2);
		
		//para la caja (cuenta desde 0 hasta el 255,dependiendo del color cambia el color final)
		caja2 = new JComboBox<String>();
		caja2.setBounds(100, 40, 120, 60);
		for (int num = 0; num <= 255; num++) {
			caja2.addItem(String.valueOf(num));
		}
		add(caja2);
		
		
		//para la etiqueta azul
		etiqueta3 = new JLabel("Azul:"); //para el nombre azul
		etiqueta3.setBounds(8, 70, 100, 80);
		add(etiqueta3);
		
		//para la caja (cuenta desde 0 hasta el 255,dependiendo del color cambia el color final)
		caja3 = new JComboBox<String>();
		caja3.setBounds(100, 70, 120, 80);
		for (int num = 0; num <= 255; num++) {
			caja3.addItem(String.valueOf(num));
		}
		add(caja3);
		
		//para crear boton fijar color
		boton1 = new JButton("Fijar Color"); 
		boton1.setBounds(8, 150, 100, 155);
		add(boton1);
		boton1.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton1) {
			String cadena1 = (String) caja1.getSelectedItem();//para seleccionar el item
			String cadena2 = (String) caja2.getSelectedItem();//para seleccionar el item
			String cadena3 = (String) caja3.getSelectedItem();//para seleccionar el item
			int rojo = Integer.parseInt(cadena1);
			int verde = Integer.parseInt(cadena2);
			int azul = Integer.parseInt(cadena3);
			Color color1 = new Color(rojo, verde, azul);
			boton1.setBackground(color1);
		}
	}

	public static void main(String[] ar) {
		Ejercicio2 formulario1 = new Ejercicio2();
		formulario1.setBounds(0, 0, 400, 300);
		formulario1.setVisible(true);
		formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//fin main
}//fin class