package ejer08;

/**
 * 
 * @author Davidkowest
 *
 */
public class Alumno {
	//Atributos 
	private String nombre;
	private int edad;
	
	//Constructores
	/**
	 * Constructor que inicializa la clase alumno con los siguientes parametros
	 * @param nombre
	 * @param edad
	 */
	Alumno (String nombre, int edad) {
		this.nombre=nombre;
		this.edad=edad;
	}

	//Metodos
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	/**
	 * Metodo que nos imprime por pantalla los datos de los alumnos y las notas de la asignatura
	 * @param asignatura
	 */
	public void muestraAlumno(Asignatura [] asignatura) {
		System.out.println("Nombre:\t"+nombre+"\nEdad:\t"+edad+"");
		for (int i = 0; i < asignatura.length; i++) {
			System.out.println(asignatura[i].getNombre()+"\t"+asignatura[i].getNota()+" Estas "+asignatura[i].calificacion()+"\n");
		}
	}

	
	
	
	
	
	
	
}
