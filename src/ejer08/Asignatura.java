package ejer08;
/**
 * 
 * @author Davidkowest
 *
 */
public class Asignatura {
	
	//Atributos
	private String nombre;
	private float nota;
	
	//Constructores
	/**
	 * Constructor que inicializa la clase asignatura con los siguientes parametros
	 * @param nombre
	 * @param nota
	 */
	Asignatura (String nombre, float nota) {
		this.nombre=nombre;
		this.nota=nota;
	}
	//Metodos
	
	public float getNota() {
		return nota;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}
	
	/**
	 * Metodo que nos devuelve aprobado o suspenso dependiendo si ha sacado mas de un 5
	 * @return
	 */
	
	public String calificacion() {
		if (nota>=5) {
			return " aprobado";
		}
		else {
			return " suspenso";
		}
	}
	
	
	
}
