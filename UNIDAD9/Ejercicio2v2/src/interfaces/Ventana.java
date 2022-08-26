package interfaces;



import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	private JPanel contentPane;
	private JLabel lblRojo;
	private JComboBox<Integer> comboBoxRojo;
	private JComboBox<Integer> comboBoxVerde;
	private JComboBox<Integer> comboBoxAzul;
	private JLabel lblAzul;
	private JLabel lblVerde;
	private JButton btnFijar;

	
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		initComponents();
	}
	private void initComponents(){	
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		lblRojo = new JLabel("Rojo");
		lblRojo.setBounds(10, 5, 59, 14);
		contentPane.add(lblRojo);
		
		comboBoxRojo = new JComboBox<Integer>();
		comboBoxRojo.setBounds(95, 1, 69, 22);
		contentPane.add(comboBoxRojo);
		
		lblVerde = new JLabel("Verde");
		lblVerde.setBounds(10, 45, 46, 14);
		contentPane.add(lblVerde);
		
		comboBoxVerde = new JComboBox<Integer>();
		comboBoxVerde.setBounds(95, 41, 69, 22);
		contentPane.add(comboBoxVerde);
		
		lblAzul = new JLabel("Azul");
		lblAzul.setBounds(10, 90, 46, 14);
		contentPane.add(lblAzul);
		
		comboBoxAzul = new JComboBox<Integer>();
		comboBoxAzul.setBounds(95, 86, 69, 22);
		contentPane.add(comboBoxAzul);
		for (int i=0;i<=255;i++) {
			comboBoxRojo.addItem(i);
			comboBoxAzul.addItem(i);
			comboBoxVerde.addItem(i);
		}
		
		btnFijar = new JButton("Fijar Color");
		btnFijar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Color c=new Color((Integer) comboBoxRojo.getSelectedItem(),
						(Integer) comboBoxVerde.getSelectedItem(),
						(Integer) comboBoxAzul.getSelectedItem());
						
				btnFijar.setBackground(c);
				
			}
		});
		btnFijar.setBounds(36, 150, 89, 23);
		contentPane.add(btnFijar);
	}

	public JComboBox getComboBoxRojo() {
		return comboBoxRojo;
	}
	public JComboBox getComboBoxVerde() {
		return comboBoxVerde;
	}
	public JComboBox getComboBoxAzul() {
		return comboBoxAzul;
	}
	public JLabel getLblAzul() {
		return lblAzul;
	}
	public JLabel getLblVerde() {
		return lblVerde;
	}
	public JLabel getLblRojo() {
		return lblRojo;
	}
	public JButton getBtnFijar() {
		return btnFijar;
	}
}
