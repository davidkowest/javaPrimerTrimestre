package ejer17;
/**
 * 
 * @author Davidkowest
 *
 */
public class Coche {
	
	//Atributos
	private String matricula;
	private String marca;
	private String modelo;
	
	
	//Constructores
	/**
	 * Constructor que inicializa la clase Coche con los siguientes parametros
	 * @param matricula 
	 * @param marca 
	 * @param modelo 
	 */
	public Coche(String matricula, String marca, String modelo) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
	}
	/**
	 * Constructor vacio que inicializa la clase Coche
	 */
	public Coche () {
		
	}
	
	//Metodos
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	/**
	 * Metodo que nos devuelve los datos del coche
	 * @return
	 */
	public String muestraCoche() {
		return "Coche [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + "]";
	}
	
	
	
}
