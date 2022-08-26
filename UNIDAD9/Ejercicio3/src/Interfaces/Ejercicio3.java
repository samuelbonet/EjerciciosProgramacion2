package Interfaces;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.FontMetrics;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;

public class Ejercicio3 extends JFrame {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5586859645968342556L;
	private JPanel contentPane;
	private JTextField tfCiudad;
	private JLabel lblCiudad;
	private JComboBox<String> cbCiudad;
	private JLabel lblCiudadSeleccionada;
	private JButton btnAnadir;
	private JButton btnEliminar;

	
	public Ejercicio3() {
		setFont(new Font("Arial", Font.PLAIN, 12));
		setSize(new Dimension(15, 9));
		setTitle("Frame");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 722, 157);
		centrarJFrame();
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblCiudad = new JLabel("Selecciona ciudad");
		lblCiudad.setForeground(Color.BLUE);
		lblCiudad.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCiudad.setBounds(10, 11, 102, 19);
		contentPane.add(lblCiudad);
		
		cbCiudad = new JComboBox<String>();
		
		cbCiudad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ciudad=(String) cbCiudad.getSelectedItem();
				lblCiudadSeleccionada.setText(ciudad+ " seleccionada");
			}
		});
		cbCiudad.setModel(new DefaultComboBoxModel(new String[] {"Huesca", "Zaragoza", "Teruel"}));
		cbCiudad.setBounds(112, 10, 86, 20);
		contentPane.add(cbCiudad);
		
		lblCiudadSeleccionada = new JLabel("");
		lblCiudadSeleccionada.setForeground(Color.MAGENTA);
		lblCiudadSeleccionada.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCiudadSeleccionada.setBounds(208, 11, 148, 19);
		contentPane.add(lblCiudadSeleccionada);
		lblCiudadSeleccionada.setText((String) cbCiudad.getSelectedItem()+" seleccionada");
		
		btnAnadir = new JButton("A\u00F1adir");
		btnAnadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cbCiudad.addItem(tfCiudad.getText());
			}
		});
		btnAnadir.setBounds(508, 10, 89, 23);
		contentPane.add(btnAnadir);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean encontrada=false;
				
				for(int i=0; i<cbCiudad.getItemCount(); i++){
					if(cbCiudad.getItemAt(i).equals(tfCiudad.getText())) {
						cbCiudad.removeItem(tfCiudad.getText());
						JOptionPane.showMessageDialog(null,"Ciudad Borrada");
						i=cbCiudad.getItemCount();
						encontrada=true;
					}
				}
				
				if (!encontrada)
					JOptionPane.showMessageDialog(null,"Ciudad No Encontrada");
			}
		});
		btnEliminar.setBounds(607, 10, 89, 23);
		contentPane.add(btnEliminar);
		
		tfCiudad = new JTextField();
		tfCiudad.setBounds(373, 11, 125, 20);
		contentPane.add(tfCiudad);
		tfCiudad.setColumns(10);
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

	
	

