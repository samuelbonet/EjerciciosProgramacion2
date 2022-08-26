import java.io.*;

public class Lanzadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] menu = { "Salir", "Crea Fichero pares", "Mostrar Fichero pares" };

		int opcion;
		do {
			opcion = Leer.pedirEntero(menu);
			switch (opcion) {
			case 1: // crear fichero pares
				crearFicheroPares();
				break;
			case 2: // mostrar fichero pares
				mostrarFicheroPares();
				break;
			}

		} while (opcion == 1 || opcion == 2);

	}// fin main

	public static void crearFicheroPares() { // 10 numeros pares //0 2 4 6 8 10 12 14 16 118
		FileOutputStream flujoEscritura = null;
		
		try {
			flujoEscritura = new FileOutputStream("pares.dat");
			for (int i = 0; i < 19; i++) {
				if (i % 2 == 0) {
				}
				flujoEscritura.write(i);
			}
		

			// Para separar las frases
			flujoEscritura.close();

			System.out.println("TERMINÉ DE ESCRIBIR");

		} catch (FileNotFoundException ex) {
			System.out.println("El fichero no existe: " + ex.getMessage());

		} // fin crearFicheroPares
		catch (IOException ex) {
			System.out.println("Error de entrada/salida: " + ex.getMessage());

		} finally {
			try {
				if (flujoEscritura != null)
					flujoEscritura.close();
			} catch (IOException ex) {
				System.out.println("Error al cerrar fichero: " + ex.getMessage());
			}
		}

	}

	public static void mostrarFicheroPares() {

		int c;
		FileInputStream f = null;
		File fil;

		String ruta = "pares.dat";

		try {
			fil = new File(ruta);
			f = new FileInputStream(fil); // Se puede poner / o \\

			System.out.println("El contenido del fichero es: ");
			while ((c = f.read()) != -1) {
				System.out.print(c);
			}
			/*
			 * Si no hacemos la conversion visualizaría el código ASCII de cada character
			 * que hay guardado en el fichero
			 */

			f.close();
			System.out.println("FIN");
		} catch (FileNotFoundException e) {
			System.out.println("El fichero no existe.");
		} catch (IOException e) {
			System.out.println("Error de lectura: " + e.getMessage());

		} finally {
			try {
				if (f != null) {
					f.close();
				}
			} catch (IOException ex) {
				System.out.println("Error al cerrar el fichero: " + ex.getMessage());
			}
		}

	}// fin mostrarFicheroPares

}// fin class
