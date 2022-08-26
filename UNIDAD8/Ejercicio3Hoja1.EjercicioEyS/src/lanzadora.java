import java.util.InputMismatchException;
import java.util.Scanner;

public class lanzadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);

		int num1=-1;	
		do {
			try {
				System.out.println("dime un numero");
				num1=teclado.nextInt();
				if(num1<0) {
					System.err.println("Error");
				}
			}catch(InputMismatchException e) {
				System.out.println(e.getMessage());
				teclado.nextLine();
			}	
		}while(num1<0);		
		System.out.println("El area del cuadrado es:"+num1*num1);
		System.out.println("Adios");
		teclado.close();
	}

}
