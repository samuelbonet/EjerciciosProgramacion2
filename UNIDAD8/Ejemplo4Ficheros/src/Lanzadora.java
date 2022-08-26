
import java.io.*;


public class Lanzadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] menu = {"Salir", "Alta Alumno", "Mostrar Alumno"};
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
		
	}
	
	public static void altaAlumno() {
		FileOutputStream f=null;
		ObjectOutputStream objSt=null;
		File fl=new File ("alumnos.dat");;
		
		try {
			
			f=new FileOutputStream("alumnos.dat", true);
			if((fl.length())==0) {
				objSt=new ObjectOutputStream(f);
			}else {
				objSt=new MyObjectOutputStream(f);	
			}

			objSt.writeObject(new Alumno (Leer.pedirCadena("Nombre: "), Leer.pedirEntero("Edad: "), Leer.pedirDouble("Nota; ")));
			f.close();
			objSt.close();
			
		} catch (FileNotFoundException ex) {
		   	 System.out.println("El fichero no existe: "+ex.getMessage());
		} catch (IOException ex) {
		   	 System.out.println("Error de entrada/salida: "+ex.getMessage());
		} finally {
			try {
				if(f!=null)
					f.close();
				if (objSt!=null)
					objSt.close();
			}catch (IOException ex) {
		    	   System.out.println("Error al cerrar fichero: " + ex.getMessage());
			}
		}
	}
	
	public static void mostrarAlumnos() {
		FileInputStream f=null;
		ObjectInputStream objSt=null;
		boolean hayDatos=true;
		Alumno a;
		
		try {
			f=new FileInputStream("alumnos.dat");
			objSt=new ObjectInputStream(f);
			
			while(hayDatos) {
				try {
					a = (Alumno) objSt.readObject();
					System.out.println(a);
				} catch(EOFException e) {
					hayDatos = false;
				}
			}
				
				
			f.close();
			objSt.close();
				
		} catch (IOException ex) {
       	 System.out.println("Error de entrada/salida: "+ex.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("La clase no existe: "+e.getMessage());
		} finally {
           try {
               if(f!=null)
                   f.close();
               if (objSt!=null)
            	   objSt.close();
           } catch (IOException ex) {
           	 System.out.println("Error al cerrar fichero: " + ex.getMessage());
           }

       }
	}
}
