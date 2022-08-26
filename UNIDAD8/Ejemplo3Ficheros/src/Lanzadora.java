import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class Lanzadora {
	static File archivo= new File("alumnos.dat");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] menu= {"Salir","Alta Alumno","Mostrar Alumnos"};
		int opcion;
	
		do {
			opcion=Leer.pedirEntero(menu);
			switch (opcion) {
			
			case 1: 	
				altaAlumno();
				break;
				
			case 2: 
				mostrarAlumnos();
				break;
			
			}
		}while (opcion!=0);
	}//fin-main

	public static void altaAlumno() {
		FileOutputStream f=null;
		DataOutputStream salida=null;
		String nombre;
		int edad;
		double nota;
		try {
			f= new FileOutputStream(archivo,true);
			salida=new DataOutputStream(f);
			System.out.println("Alta alumno:");
			nombre=Leer.pedirCadena("Nombre del alumno: ");
			edad=Leer.pedirEntero("Edad: ");
			nota=Leer.pedirDouble("Nota: ");
			
			salida.writeUTF(nombre);
			salida.writeInt(edad);
			salida.writeDouble(nota);
			f.close();
			salida.close();
			
		}catch(FileNotFoundException e) {
			System.out.println("Error archivo no existe "+ e.getMessage());
		}catch(IOException e) {
			System.out.println("Error entrada/salida datos "+ e.getMessage());
		}finally {
			try {
				if (f!=null)
					f.close();
				if (salida!=null)
					salida.close();
			}catch(IOException e) {
				System.out.println("Error al cerrar el fichero");
			}
		}
		
		
		
	}
	public static void mostrarAlumnos() {
		FileInputStream f=null;
		DataInputStream entrada=null;
		String nombre;
		int edad,contador=1;
		double nota, notaMedia=0;
		
		try {
				f=new FileInputStream("alumnos.dat");
				entrada=new DataInputStream(f);
				
				while ((nombre=entrada.readUTF())!=null) {
					edad=entrada.readInt();
					nota=entrada.readDouble();
					System.out.println("Alumno "+contador);
					System.out.println("Nombre: "+nombre+" Edad: "+edad+
										" Nota: "+nota);
					contador++;
					notaMedia+=nota;
				}
				f.close();
				entrada.close();
				
		} catch (FileNotFoundException ex) {
       	 System.out.println("El fichero no existe: "+ex.getMessage());
		}catch (EOFException e) {
			notaMedia=notaMedia/(contador-1);
			System.out.println("\nLa nota media de los alumnos es "+notaMedia);
			System.out.println("Final del fichero\n");
		} catch (IOException ex) {
       	 System.out.println("Error de entrada/salida: "+ex.getMessage());
		} finally {
           try {
               if(f!=null)
                   f.close();
               if (entrada!=null)
            	   entrada.close();
           } catch (IOException ex) {
           	 System.out.println("Error al cerrar fichero: " + ex.getMessage());
           }

       }
		
	}//fin-mostrarAlumnos
	
}//fin-class
