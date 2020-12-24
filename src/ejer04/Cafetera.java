package ejer04;
/**
 * 
 * @author Davidkowest
 *
 */
public class Cafetera {
	
	//Atributos
	private int capacidadMaxima;
	private int cantidadActual;
	
	//Constructores
	/**
	 * Constructor vacio que inicializa la clase cafetera y la capacidad maxima la marca en 1000 y la actual en 0
	 */
	public Cafetera (){
		capacidadMaxima=1000;
		cantidadActual=0;
	}
	/**
	 * Constructor que inicializa la cafetera con el siguiente parametro
	 * @param capacidadMaxima
	 */
	public Cafetera (int capacidadMaxima){
		this.capacidadMaxima=capacidadMaxima;
		this.cantidadActual=capacidadMaxima;
	}
	/**
	 * Constructor que inicializa la cafetera con los siguientes parametros
	 * @param capacidadMaxima
	 * @param capacidadActual
	 * si la capacidad actual es mayor, la iguala a la capacidad maxima
	 */
	public Cafetera (int capacidadMaxima, int capacidadActual){
		this.cantidadActual=capacidadActual;
		this.capacidadMaxima=capacidadMaxima;
		
		if (capacidadActual>capacidadMaxima) {
			capacidadActual=capacidadMaxima;
		}
	}
	
	//Metodos

	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	public int getCapacidadActual() {
		return cantidadActual;
	}

	public void setCapacidadActual(int capacidadActual) {
		this.cantidadActual = capacidadActual;
	}
	
	/**
	 * Metodo que llena la cafetera
	 */
	public void llenarCafetera() {
		cantidadActual=capacidadMaxima;
	}
	/**
	 * Metodo que sirve una taza, si la cantidad actual es menor a la taza, le echa lo que pueda.
	 * @param taza
	 */
	public void servirTaza (int taza) {
		if (taza>cantidadActual) {
			cantidadActual=0;
		} else {
			cantidadActual-=taza;
		}
	}
	/**
	 * Metodo que vacia la cafetera
	 */
	public void vaciarCafetera() {
		cantidadActual=0;
	}
	/**
	 * Metodo que llena la cafetera con la cantidad indicada
	 * @param llenarCafe
	 */
	public void agregarCafe(int llenarCafe) {
		if (cantidadActual+llenarCafe>capacidadMaxima) {
			cantidadActual=capacidadMaxima;
		} else {
			cantidadActual+=llenarCafe;
		}
	}
	
	/**
	 * Metodo toString que devuelve los datos de la cafetera
	 */
	public String toString() {
		return "[capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + "]";
	}
	
	
	
}
