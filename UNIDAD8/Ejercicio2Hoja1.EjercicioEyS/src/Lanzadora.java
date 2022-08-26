import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.IOException;
import java.util.Scanner;

public class Lanzadora {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
			 
			 Scanner sc = new Scanner (System.in);
			 
			 int  num1=0 , num2=0;
			 boolean correcto=false;
			 do {
				 try {
					 System.out.println("Numero 1:");
					 num1 = sc.nextInt();
					 System.out.println("Numero 2");
					 num2 = sc.nextInt();
					 if (num1==num2){
						 
						 System.out.println("Los numeros Son iguales");
					 }else {
						 
						 System.out.println("Los numeros son Distintos");
					 }
					 correcto=true;
				 }catch(InputMismatchException e) {
					 System.out.println("Deben ser números");
					 sc.nextLine();
				 }
			 }while(!correcto);
			 
			 
			 sc.close();
		
		 }
		
	}
