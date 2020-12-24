package ejer03;
/**
 * 
 * @author Davidkowest
 *
 */
public class Cuenta {
	//atributos
	
	private long ncuenta=100000;
	private static int contador=0;
	private String dni;
	private float saldo;
	private float interes;
	
	//Constructores
	/**
	 * Constructor vacio que inicializa con valores por defectos la clase cuenta
	 */
	Cuenta () {
		contador++;
		this.ncuenta+=contador;
		this.dni="123456989Q";
		this.saldo=0;
		this.interes=0;
	}
	/**
	 * Constructor que inicializa la clase Cuenta con los siguientes parametros
	 * @param dni
	 * @param saldo
	 * @param interes
	 */
	Cuenta (String dni, double saldo, double interes) {
		contador++;
		this.ncuenta+=contador;
		this.dni=dni;
		this.saldo=(float) saldo;
		this.interes=(float) interes;
	}
	
	//Metodos
	/**
	 * metodo que actualiza el saldo añadiendole el interes diario
	 * @param dias
	 */
	public void actualizarSaldo (int dias) {
		this.saldo=saldo*(interes*dias/100/365+1);
	}
	/**
	 * metodo que añade saldo a la cuenta
	 * @param saldo
	 */
	public void ingresarSaldo (double saldo) {
		this.saldo=this.saldo+(float)saldo;
	}
	/**
	 * metodo que resta saldo a la cuenta
	 * @param saldo
	 */
	public void retirarSaldo (double saldo) {
		if (this.saldo>saldo) {
			this.saldo=this.saldo-(float)saldo;
		} else {
			System.out.println("No tiene saldo suficiente");
		}
	}
	/**
	 * metodo que imprime por pantalla los datos de la cuenta
	 */
	public void muestraCuenta () {
		System.out.println("El numero de cuenta es "+ncuenta);
		System.out.println("El DNI del cliente es "+dni);
		System.out.println("El saldo del cliente es "+saldo);
		System.out.println("El interés de la cuenta es "+interes+"%");
	}
	
	
	
	public long getNcuenta() {
		return ncuenta;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = (float) saldo;
	}

	public float getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = (float) interes;
	}
	
	
	
	
	
	
}
