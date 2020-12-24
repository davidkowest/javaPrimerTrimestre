package ejer12;
/**
 * 
 * @author Davidkowest
 *
 */
public class Empleado {
	
	//Atributos
	
	private String nombre;
	private int nhoras;
	private double tarifa;
	
	//Constructor
	/**
	 * Constructor que inicializa la clase Empleado con los siguientes parametros
	 * @param nombre
	 * @param nhoras
	 * @param tarifa
	 */
	Empleado (String nombre, int nhoras, double tarifa){
		this.nombre=nombre;
		this.nhoras=nhoras;
		this.tarifa=tarifa;
	}
	
	//Metodos
	/**
	 * Metodo que nos imprime por pantalla los datos del empleado y el sueldo dependiendo si ha trabajado mas de 40 horas o no
	 */
	public void muestraEmpleado () {
	
		if (nhoras>40) {
			System.out.println(nombre+" trabajó "+nhoras+" horas, cobra "+tarifa+" euros la hora por lo que le corresponde un sueldo de "+(40*tarifa+(nhoras-40)*(tarifa/2))+" euros");
		} else {
			System.out.println(nombre+" trabajó "+nhoras+" horas, cobra "+tarifa+" euros la hora por lo que le corresponde un sueldo de "+(nhoras*tarifa)+" euros");
		}
		
	}
	
}
