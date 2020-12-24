package ejer16;
/**
 * 
 * @author Davidkowest
 *Esta clase hereda de la clase personaje
 */
public class Guerrero extends Personaje {
	//Atributos
	private String arma;
	
	//Constructor
	/**
	 * Constructor vacio que inicializa la clase Guerrero
	 */
	Guerrero () {
		
	}
	/**
	 * Constructor que inicializa la clase Guerrero con los siguientes parametros
	 * @param nombre
	 * @param energia
	 * @param arma
	 */
	Guerrero (String nombre, int energia, String arma) {
		this.nombre=nombre;
		this.energia=energia;
		this.arma=arma;
	}


	//Métodos
	
	public String getArma() {
		return arma;
	}

	public void setArma(String arma) {
		this.arma = arma;
	}
	/**
	 * Metodo que imprime por pantalla el ataque del guerrero y le resta el coste de energia que cueste el ataque
	 * @param energia
	 * @return
	 */
	public String combatir (int energia) {
		this.energia-=energia;	
		return "El guerrero "+getNombre()+" ha realizado un ataque con su arma "+arma+" y ha gastado \r\n"+energia+" energia, le queda "+getEnergia()+" energia para atacar]";
	}

	
}
