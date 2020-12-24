package ejer14;
/**
 * 
 * @author Davidkowest
 *
 */
public class Marciano {
	//Atributos
	private boolean vivo=false;
	private String nombre;
	private static int numMarcianos;
	
	//Constructor
	/**
	 * Constructor que nos inicializa la clase Marciano con los siguientes datos
	 * @param nombre
	 */
	Marciano (String nombre){
		this.vivo=true;
		this.nombre=nombre;
		numMarcianos ++;
		nace();
	}
	
	//Metodos
	/**
	 * Metodo que imprime por pantalla un mensaje de nacimiento del marciano
	 */
	public void nace() {
		System.out.println("Hola, he nacido y soy el marciano "+nombre);
	}
	/**
	 * Metodo que mata a un marciano y nos informa a traves de la pantalla de quien ha muerto
	 */
	public void muere () {
		if (vivo) {
			vivo=false;
			numMarcianos --;
			System.out.println("El marciano "+nombre+" ha muerto");
		}
		else {
			System.out.println("El marciano ya está muerto");
		}
	}
	/**
	 * Metodo que nos informa si on marciano esta vivo o esta muerto
	 */
	public void estaVivo () {
		if (vivo) {
			System.out.println("El marciano "+nombre+" está vivo");
		} else {
			System.out.println("El marciano "+nombre+" está muerto");
		}
	}
	/**
	 * Un metodo que nos imprime por pantalla el numero de marcianos que hay actualmente vivos
	 */
	public void cuentaMarcianos () {
		System.out.println("hay "+numMarcianos+" marcianos vivos en este momento");
	}
	
	
}
