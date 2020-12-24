package ejer16;
/**
 * 
 * @author Davidkowest
 *Esta clase hereda de la clase Personaje
 */
public class Mago extends Personaje {
	//Atributos
		private String poder;
		
	//Constructores
	/**
	 * Constructor vacio que inicializa la clase Mago y la energia a 100
	 */
		Mago () {
			this.energia=100;
		}
		/**
		 * Constructor que inicializa la clase Mago con los siguientes parametros, la energia se inicia en 100
		 * @param nombre
		 * @param poder
		 */
		Mago (String nombre, String poder) {
			this.energia=100;
			this.nombre=nombre;
			this.poder=poder;
		}

		
	//Métodos
		
		public String getPoder() {
			return poder;
		}

		public void setPoder(String poder) {
			this.poder = poder;
		}
		/**
		 * Metodo que imprime por pantalla el ataque del mago y le resta 2 de energia
		 * @return
		 */
		public String encantar () {
			this.energia-=2;
			return "El mago "+getNombre()+" ha utilizado su poder "+poder+" y ha gastado 2 de energia, "
    		+ "aun le quedan "+getEnergia();
		}
		
}
