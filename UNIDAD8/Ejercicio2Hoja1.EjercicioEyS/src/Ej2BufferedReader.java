import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Ej2BufferedReader {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		boolean correcto=false;
		do {
			try {
				distincionNumeros();
				correcto=true;
			} 
			catch (NumberFormatException e) {
				System.out.println("Error. Deben ser datos númericos");
			} 
			catch (IOException e) {
				System.out.println("Error al introducir datos");
			}//FIN DEL CATCH
		}while(!correcto);
	}//FIN DEL MAIN

	//MÉTODO PARA DISTINGUIR DOS NÚMEROS
	
	public static void distincionNumeros() throws NumberFormatException, IOException {
		
		int numero1, numero2;
		
		BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Introduzca el primer número: ");
		numero1= Integer.parseInt(entrada.readLine());
		
		System.out.println("Introduzca el segundo número: ");
		numero2= Integer.parseInt(entrada.readLine());

		if(numero1== numero2 ) {
			
			System.out.println("Ambos números son iguales");
			
		} else {
			
			System.out.println("Ambos números son diferentes");
			
		}
	}
	}


