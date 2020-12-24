package ejer15;
/**
 * 
 * @author Davidkowest
 *
 */
public class Cuenta {
	//Atributos
	
	private float saldo;
	
	//Constructores
	/**
	 * Constructor que inicializa la clase Cuenta con el saldo a 0
	 */
	Cuenta (){
		this.saldo=0;
	}
	/**
	 * Cuenta que inicializa la clase Cuenta con el siguiente parametro
	 * @param saldo
	 */
	Cuenta (float saldo) {
		this.saldo=saldo;
	}
	
	//Metodos
	/**
	 * Metodo que ingresa saldo a la cuenta
	 * @param saldo
	 */
	public void ingresar(float saldo) {
		this.saldo+=saldo;
	}
	/**
	 * Metodo que extrae dinero a la cuenta
	 * @param saldo
	 */
	public void extraer(float saldo) {
		this.saldo-=saldo;
	}
	/**
	 * Metodo que nos devuelve el saldo actual de la cuenta
	 * @return
	 */
	public float getSaldo() {
		return saldo;
	}
	
}
