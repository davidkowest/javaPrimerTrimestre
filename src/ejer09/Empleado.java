package ejer09;
/**
 * 
 * @author Davidkowest
 *
 */
public class Empleado {
	
	//Atributos
	
	private String nombre;
	private int salario;
	private Direccion direccion;
	private static int numEmpCont=0;
	private int numEmpleado;
	
	//Constructores
	
	/**
	 * Constructor que inicializa la clase Empleado con los siguientes parametros
	 * @param nombre
	 * @param salario
	 * @param direccion
	 */
	Empleado (String nombre, int salario, Direccion direccion) {
		
		this.nombre=nombre;
		this.salario=salario;
		this.direccion=direccion;
		numEmpCont++;
		numEmpleado=numEmpCont;
		
	}
	
	//Metodos

	public String getNombre() {
		
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	/**
	 * Constructor que imprime por pantalla los datos del empleado
	 */
	public void muestraEmpleado () {
		System.out.println("Empleado: "+numEmpleado+"\nNombre: "+nombre+"\nSalario: "+salario+"\nDirección:\n\tCalle: "+direccion.getCalle()+
				"\n\tNúmero: "+direccion.getNumero()+"\n\tPiso: "+direccion.getPiso()+"\n\tCiudad: "+direccion.getCiudad());
	}
	
}
