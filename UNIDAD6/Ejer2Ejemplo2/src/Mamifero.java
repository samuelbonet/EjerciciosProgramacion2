import utilidades.Leer;

public class Mamifero extends Animal {
	private int numhuesos;
	private int numextremidades;

	public Mamifero(int numcrias,int numhuesos,int numextremidades) {
		super(numcrias);
		this.numhuesos=numhuesos;
		this.numextremidades=numextremidades;
	}

	

	public void insertarDatosMamifero() {
		insertarDatos();
		numhuesos = Leer.pedirEntero("\t\tN�mero de huesos (como mam�fero que es)");
		numextremidades = Leer.pedirEntero("\t\tN�mero de extremidades (como mam�fero que es): ");
	}

	public void visualizarDatosMamifero() {
		visualizarDatosAnimal();
		Leer.mostrarEnPantalla("\n\t Huesos: " + numhuesos);
		Leer.mostrarEnPantalla("\n\t Extremidades: " + numextremidades);
	}
}
