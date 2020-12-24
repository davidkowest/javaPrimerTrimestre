package ejer06;
/**
 * 
 * @author Davidkowest
 *
 */
public class Persona {
	//Atributos
	 protected String nombre;
	 protected int edad;
	 
	 //Constructores
	 
	 //Metodos
	 /**
	  * Metodo que carga la clase persona con los siguientes parametros
	  * @param nombre
	  * @param edad
	  */
	 public void cargarDatos(String nombre, int edad) {
		 this.nombre=nombre;
		 this.edad=edad;
	 }
	 /**
	  * Metodo que imprime por pantalla la informacion de la persona
	  */
	public void printDatos() {
		System.out.println("El nombre es: "+nombre+" y la edad es: "+edad);
	}

	 
}
