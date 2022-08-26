import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero=0;
		boolean correcto=false;
		do {
			try {
				numero=pedirNumero();
				correcto=true;
			}catch (InputMismatchException e) {
				System.err.println("Dato erroneo. Introduce un n�");
			}
			}while(!correcto);
		System.out.println("El n� es "+numero);
	}
	public static int pedirNumero() {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Dame un n�mero: ");
		num=sc.nextInt();
		return num;
	}
}
