import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

public class Ej1BufferedReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre, apellido;

		try {

			// Notar que readLine() nos obliga a declarar IOException
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Ya tenemos el "lector"

			System.out.println("Dame tu nombre");// Se pide el nombre al usuario

			nombre = br.readLine(); // Se lee el nombre con readLine() que retorna un String con el dato

			System.out.println("Dame tu apellido");

			apellido = br.readLine(); // Se guarda la entrada (Apellido) en una variable

			System.out.println("Hola " + nombre + " " + apellido);

		} catch (IOException ex) {
			JOptionPane.showMessageDialog(null, "Error de entrada/salida: " + ex.getMessage());
		}
	}
}
