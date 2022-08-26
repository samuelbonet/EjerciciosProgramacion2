package Interfaces;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JCheckBox;

public class Ejercicio4 extends JFrame implements ActionListener {

	JCheckBox Chrome,FireFox,Opera;
	JButton boton;
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	public Ejercicio4() {
		setFont(new Font("Arial", Font.PLAIN, 12));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(385, 300);
		centrarJFrame();
		getContentPane().setLayout(null);
		initComponents();
		
	}

	private void initComponents() {
		
		Chrome=new JCheckBox();
		Chrome.setText("Chrome");
		Chrome.setBounds(20,30,120,40);
		getContentPane().add(Chrome);
		
		FireFox = new JCheckBox("FireFox");
		FireFox.setBounds(20, 73, 97, 23);
		getContentPane().add(FireFox);
		
		Opera = new JCheckBox("Opera");
		Opera.setBounds(20, 102, 97, 23);
		getContentPane().add(Opera);
		
		
		boton=new JButton();
		boton.setText("Confirmar");
		boton.setBounds(20,157,120,40);
		boton.addActionListener(this);
		
		getContentPane().add(boton);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==boton) {
			validarSeleccion();
			centrarJFrame();
			
		}
			
	}

	private void validarSeleccion() {
		
		String seleccion="";
		
		if (Chrome.isSelected()) {
			setTitle(seleccion+="Chrome-");
		}
		if (FireFox.isSelected()) {
			setTitle(seleccion+="FireFox-");
		}
		if (Opera.isSelected()) {
			setTitle(seleccion+="Opera-");
		}
		
		//JOptionPane.showMessageDialog(null, seleccion);
		
		
	}
	private void centrarJFrame() {

		Font font = this.getFont();

		String titulo = this.getTitle();
		FontMetrics fm = this.getFontMetrics(font);

		int anchoFrame = this.getWidth();
		System.out.println(anchoFrame);
		int anchoTitulo = fm.stringWidth(titulo);
		int anchoEspacio = fm.stringWidth(" ");
		int PosicionCentral = (anchoFrame / 2) - (anchoTitulo / 2);
		int contadorEspacios = PosicionCentral  / anchoEspacio ;
		for(int i=0;i<contadorEspacios-14;i++) {
		titulo=" "+titulo;
		}
		this.setTitle(titulo);
		}
}
