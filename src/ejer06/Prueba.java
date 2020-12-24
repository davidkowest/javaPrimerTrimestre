package ejer06;

public class Prueba {

	public static void main(String[] args) {
		Persona p1 = new Persona ();
		Empleado e1 = new Empleado();
		
		p1.cargarDatos("Perico", 32);
		p1.printDatos();
		
		e1.cargarDatos("Javi", 25);
		e1.cargarSueldo(1500);
		
		e1.printDatos();
		e1.printSueldo();
	}

}
