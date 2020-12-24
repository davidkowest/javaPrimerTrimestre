package ejer13;
/**
 * 
 * @author Davidkowest
 *
 */
public class Alimento {
	
	//Atributos
	
	private String nombre;
	private double lipidos;
	private double hidratos;
	private double proteinas;
	private boolean origenanimal;
	private char contenidoVitaminas;
	private char contenidoMinerales;
	
	//Constructores
	/**
	 * Constructor que inicializa la clase Alimento con el siguiente parametro
	 * @param nombre
	 */
	Alimento (String nombre){
		this.nombre=nombre;
	}
	
	/**
	 * Constructor que nos inicializa la clase Alimento con los siguientes parametros
	 * @param nombre
	 * @param lipidos
	 * @param hidratos
	 * @param proteinas
	 * @param origenanimal
	 * @param contenidoVitaminas
	 * @param contenidoMinerales
	 */
	public Alimento(String nombre, double lipidos, double hidratos, double proteinas, boolean origenanimal,
			char contenidoVitaminas, char contenidoMinerales) {
		this.nombre = nombre;
		this.lipidos = lipidos;
		this.hidratos = hidratos;
		this.proteinas = proteinas;
		this.origenanimal = origenanimal;
		this.contenidoVitaminas = contenidoVitaminas;
		this.contenidoMinerales = contenidoMinerales;
	}
	
	//metodos
	/**
	 * Metodo que nos devuelve un booleano en true si es dietetico
	 * @return
	 */
	public boolean esDietetico () {
		if (lipidos<20 && (contenidoVitaminas == 'M' || contenidoVitaminas == 'A')) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Metodo que nos devuelve la informacion del alimento
	 * @return
	 */
	public String muestraAlimento() {
		return "Alimento [nombre=" + nombre + ", lipidos=" + lipidos + ", hidratos=" + hidratos + ", proteinas="
				+ proteinas + ", origenanimal=" + origenanimal + ", contenidoVitaminas=" + contenidoVitaminas
				+ ", contenidoMinerales=" + contenidoMinerales + "]";
	}
	
	
	
}