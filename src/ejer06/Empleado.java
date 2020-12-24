package ejer06;
/**
 * 
 * @author Davidkowest
 *
 *
 *Esta clase hereda de la clase persona
 */
public class Empleado extends Persona {
	
	//Atributos
	private float sueldo;
	
	//Metodos
	/**
	 * Metodo que carga el sueldo de la clase empleado
	 * @param sueldo
	 */
	public void cargarSueldo(float sueldo) {
		 this.sueldo=sueldo;
	 }
	/**
	 * metodo que imprime el sueldo del empleado
	 */
	public void printSueldo() {
		System.out.println("El sueldo es: "+sueldo);
	}
	
}
