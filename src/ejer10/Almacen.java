package ejer10;
/**
 * 
 * @author Davidkowest
 *
 */
public class Almacen {
	
	private float chocos;
	private int papas;
	
	
	//Constructores
	/**
	 * Constructor vacio que inicializa las papas y los chocos a 0
	 */
	Almacen (){
		this.chocos=0;
		this.papas=0;
	}
	
	//Metodos
	/**
	 * Metodo que añade chocos al almacen
	 * @param chocos
	 */
	public void addChocos (float chocos) {
		this.chocos+=chocos;
	}
	/**
	 * Metodo que añade papas al almacen
	 * @param papas
	 */
	public void addPapas (int papas) {
		this.papas+=papas;
	}
	/**
	 * metodo que nos devuelve los comensales posibles segun las papas y los chocos restantes
	 * @return
	 */
	public int getComensales() {
		int i=0;
		while (papas>=1 && chocos>=0.5 ) {
			papas-=1;
			chocos-=0.5;
			i+=3;
		}
		return i;
	}
	/**
	 * Metodo que nos dice cuantos chocos nos quedan
	 */
	public void showChocos() {
		System.out.println("Quedan "+chocos+" kilos de chocos");
	}
	/**
	 * Metodo que nos dice los kilos de papas restantes
	 */
	public void showPapas() {
		System.out.println("Quedan "+papas+" kilos de papas");
	}
}
