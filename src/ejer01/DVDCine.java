package ejer01;

/**
 * 
 * @author Davidkowest
 *
 */

public class DVDCine {
	
	//Atributos
	
	private String nombre;
	private String director;
	private String protagonistas;
	private String genero;
	private String duracion;
	private String resumen;
	
	//Constructor
	/**
	 * Constructor que inicializa la clase con estos parametros
	 * @param nombre
	 * @param director
	 * @param protagonistas
	 * @param genero
	 * @param duracion
	 * @param resumen
	 */
	public DVDCine(String nombre, String director, String protagonistas, String genero, String duracion, String resumen) {
		this.nombre=nombre;
		this.director=director;
		this.protagonistas=protagonistas;
		this.genero=genero;
		this.duracion=duracion;
		this.resumen=resumen;
	}
	
	//metodos
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getProtagonistas() {
		return protagonistas;
	}

	public void setProtagonistas(String protagonistas) {
		this.protagonistas = protagonistas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public String getResumen() {
		return resumen;
	}

	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

	/**
	 *metodo que devuelve una descripcion completa de la pelicula
	 * @return
	 */
	
	public String muestraDVDCine() {
		return nombre + " De: " + director + "\nCon:" + protagonistas + "\n"
				+ genero + " - " + duracion + "\nResumen: " + resumen;
	}
	
	/**
	 * metodo que devuelve true si la pelicula es Thriller
	 * @return
	 */
	
	public boolean esThriller() {
		if (genero=="Thriller") {
			return true;
		} else {
			return false;
		}
		
	}
	/**
	 * metodo que devuelve true si la pelicula tiene resumen
	 * @return
	 */
	public boolean tieneResumen() {
		if (resumen!=null) {
			return true;
		} else {
			return false;
		}
	}
	/**
	 * Metodo que devuelve la duracion de la pelicula
	 * @return
	 */
	public String muestraDuracion() {
		return duracion;
	}
	
}
