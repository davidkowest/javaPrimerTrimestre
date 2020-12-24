package ejer13;

public class Prueba {

	public static void main(String[] args) {
		Alimento a1 = new Alimento("Platano", 0.3, 20, 1.2, false, 'A', 'M');
		System.out.println(a1.muestraAlimento());
		System.out.println(a1.esDietetico());
		
		Alimento a2 = new Alimento("Hamburguesa", 0.3, 20, 1.2, true, 'B', 'B');
		System.out.println(a2.muestraAlimento());
		System.out.println(a2.esDietetico());

	}

}
