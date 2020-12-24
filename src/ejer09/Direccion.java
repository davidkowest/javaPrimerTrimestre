package ejer09;
/**
 * 
 * @author Davidkowest
 *
 */
public class Direccion {
	
	//Atributos
	private String calle;
	private int numero;
	private String piso;
	private String ciudad;
	
	//Constructores
	/**
	 * Constructor que inicializa la clase direccion con los siguientes parametros
	 * @param calle
	 * @param numero
	 * @param piso
	 * @param ciudad
	 */
	public Direccion (String calle, int numero, String piso, String ciudad) {
		this.calle=calle;
		this.numero=numero;
		this.piso=piso;
		this.ciudad=ciudad;
	}
	
		//Metodos
		
	
	

	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getPiso() {
		return piso;
	}
	public void setPiso(String piso) {
		this.piso = piso;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	
	
	
	
}
