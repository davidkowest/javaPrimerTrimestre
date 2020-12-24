package ejer02;


/**
 * 
 * @author Davidkowest
 *
 */
public class Vehiculo {
	//Atributos
	private String modelo;
	private double potencia;
	private boolean cRuedas;
	
	//Constructores
	/**
	 * Constructor que inicializa la clase Vehiculo con el parámetro modelo
	 * @param modelo
	 */
	Vehiculo (String modelo) {
		this.modelo=modelo;
	}
	
	//Métodos
	
	public double getPotencia() {
		return potencia;
	}
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	public boolean iscRuedas() {
		return cRuedas;
	}
	public void setcRuedas(boolean cRuedas) {
		this.cRuedas = cRuedas;
	}
	
	/**
	 * Metodo que imprime por pantalla los datos del vehiculo
	 */
	public void printVehiculo(){
		if (cRuedas) {
			System.out.println("El modelo es: "+modelo+" La potencia es: "+potencia+" y tiene tracción en 4 ruedas");
		} else {
			System.out.println("El modelo es: "+modelo+" La potencia es: "+potencia+" y no tiene tracción en 4 ruedas");
		}
	}
	
	
	
	
	
}
