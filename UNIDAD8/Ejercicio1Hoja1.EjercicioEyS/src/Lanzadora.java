import java.util.Scanner;

public class Lanzadora {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String Nombre;
		String Apellido;
		System.out.println("Introduce el nombre");

		Nombre = entrada.nextLine();
		System.out.println("Introduce el apellido");
		Apellido = entrada.nextLine();
		System.out.println("Hola " + Nombre + " " + Apellido);

		entrada.close();
	}

}
