package ejer07;

public class Prueba {

	public static void main(String[] args) {
		
		Asignatura a1 = new Asignatura("FOL", 7);
		
		
		a1.setNota(10);
		System.out.println("La nota de "+a1.getNombre()+" es un " +a1.getNota());
		
		System.out.println("Estas"+a1.calificacion());
		
		a1.setNota(4);
		System.out.println("La nota de "+a1.getNombre()+" es un " +a1.getNota());
		
		System.out.println("Estas"+a1.calificacion());
		
	}

}
