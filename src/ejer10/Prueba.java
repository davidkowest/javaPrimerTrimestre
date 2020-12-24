package ejer10;

public class Prueba {

	public static void main(String[] args) {
		
		Almacen a1 = new Almacen();
		
		a1.addChocos(10);
		a1.addPapas(30);
		
		System.out.println(a1.getComensales());
		
		Almacen a2 = new Almacen();
		
		a2.addChocos(5);
		a2.addPapas(20);
		
		System.out.println(a2.getComensales());

	}

}
