package ejer08;

public class Prueba {

	public static void main(String[] args) {
		
		Alumno a1 = new Alumno("Carlos", 25);
		Alumno a2 = new Alumno("David", 26);
		Alumno a3 = new Alumno("Pepe", 32);
		
		Asignatura [] asignaturas = {new Asignatura("L.Marcas", 8),new Asignatura("Programacion", 6)};
		Asignatura [] asignaturas2 = {new Asignatura("FOL", 10),new Asignatura("Entornos", 7)};
		Asignatura [] asignaturas3 = {new Asignatura("sistemas", 4),new Asignatura("Programacion", 2)};
		
		a1.muestraAlumno(asignaturas);
		a2.muestraAlumno(asignaturas2);
		a3.muestraAlumno(asignaturas3);
		

	}

}
