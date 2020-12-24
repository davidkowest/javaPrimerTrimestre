package ejer16;
/**
 * 
 * @author Davidkowest
 *
 */
public class Personaje {
	//Atributos
		protected String nombre;
		protected int energia;
	//Constructores
		/**
		 * Constructor vacio que inicializa la clase Personaje
		 */
		Personaje(){
			
		}
		/**
		 * Constructor que inicializa la clase Personaje con los siguientes parametros
		 * @param nombre
		 * @param energia
		 */
		Personaje (String nombre, int energia) {
			this.energia=energia;
			this.nombre=nombre;
		}
		
	//Métodos
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public int getEnergia() {
			return energia;
		}
		public void setEnergia(int energia) {
			this.energia = energia;
		}
		/**
		 * Metodo que aumenta la energia del personaje
		 * @param energia
		 */
		public void alimentarse (int energia) {
			this.energia+=energia;
		}
		
		
}		
