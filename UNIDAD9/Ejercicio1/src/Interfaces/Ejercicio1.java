package Interfaces;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ejercicio1 extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField tf;
	JPanel contenedor;
	JMenuBar mb;
	JButton send;
	JButton reset; 
	JTextArea ta;
	public Ejercicio1() {
		this.setTitle("Chat Frame");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        this.setSize(400, 400);
        initComponents();  
	}
	private void initComponents() {
		
		 contenedor= (JPanel) this.getContentPane();
		 
		 //cargamos las opciones del menú
		 mb = new JMenuBar();       
	     JMenu m1 = new JMenu("ARCHIVO");       
	     JMenu m2 = new JMenu("Ayuda");       
	     mb.add(m1); //añadimos menu 1       
	     mb.add(m2); //añadimos menu 2   
	     JMenuItem m11 = new JMenuItem("Abrir");       
	     JMenuItem m22 = new JMenuItem("Guardar como");       
	     m1.add(m11);  //añadimos menu 1        
	     m1.add(m22);   //añadimos menu 2        

	    //cargamos objetos gráficos parte inferior 
	    JPanel panel = new JPanel();
		JLabel label = new JLabel("Introducir texto");
		tf = new JTextField(8);// longitud campo texto
		send = new JButton("Enviar");
		reset = new JButton("Restablecer");
		panel.add(label);
		panel.add(tf);
		panel.add(send);
		send.addActionListener(this);
		panel.add(reset);
	       
	     
		//parte central
	    ta = new JTextArea();        
        ta.setEnabled(false);
	        
	    contenedor.add(BorderLayout.SOUTH, panel);       
	    contenedor.add(BorderLayout.NORTH, mb);       
	    contenedor.add(BorderLayout.CENTER, ta);       
	      
	        
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==send) {
			
			String cadena = tf.getText();
			ta.setText(cadena);
		}
		
		
	}

}
