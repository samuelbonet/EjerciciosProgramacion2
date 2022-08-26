import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej3BufferedReader {

	public static void main(String[] args) throws NumberFormatException,IOException  {
		// TODO Auto-generated method stub
		int num1=-1;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
			try {
				System.out.println("dime un numero");
				num1=Integer.parseInt(br.readLine());
				if(num1<0) 
					System.err.println("Error");
			}catch(IOException e) {
				System.out.println("Error. "+e.getMessage());
			}catch(NumberFormatException e) { 
				System.out.println("dame un numero" +e.getMessage());
			}
		}while(num1<0);		

		System.out.println("El area del cuadrado es:"+num1*num1);
		System.out.println("Adios");

			
	}//fin main
}//fin class
