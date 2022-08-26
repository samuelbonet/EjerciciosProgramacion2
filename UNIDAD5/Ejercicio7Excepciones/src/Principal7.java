import java.util.Scanner;

public class Principal7 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int edad;
		Persona p=null,d=null;
		
		System.out.println("Prueba primera, crear objeto edad negativa:");
		try {
			p =new Persona("carl", -3);
		} catch (EdadInvalidaExcepcion e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			
			System.out.println("ERROR FATAL");
		}
		System.out.println(p);
		System.out.println("****************");
		System.out.println("Prueba primera, crear objeto y cambiar la edad a negativa:");
		
		try {		
			d=new Persona("Victor", 0);
				
			System.out.println("Porfavor dame la edad de la persona");
			edad = sc.nextInt();
			d.setEdad(edad);
				
		} catch (EdadInvalidaExcepcion e) {
				
				System.out.println(e.getMessage());
		}catch(Exception e) {
				
			System.out.println("ERROR FATAL");
		}
		System.out.println(d);	
		sc.close();
		

	}

}




/*Ejercicio 7
1. Crea una excepci�n personalizada llamada EdadInvalidaException, cuyo mensaje sea �No se
puede tener una edad menor que 0�.
2. Crea una clase llamada Persona que solo tenga dos atributos: nombre y edad. Con un
constructor que inicialice los dos atributos y con sus setters y getters.
Tanto en el constructor como en el m�todo setEdad(int edad) debes controlar que no se
introduzca una edad negativa. Para ello cuando se intente introducir una edad negativa (tanto
en el constructor como en setEdad) se lanzar� la excepci�n EdadInvalidaException.
Implementa tambi�n el m�todo sobreescrito toString().
3. En el m�todo principal del programa instancia dos personas, una con edad negativa y otra con
edad 0. A la segunda intenta asignarle despu�s una edad negativa con el m�todo setEdad.
Justo despu�s de instanciar cada una de las dos personas y de llamar al m�todo setEdad
muestra por pantalla sus datos por medio del m�todo toString().*/