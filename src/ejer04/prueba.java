package ejer04;

public class prueba {

	public static void main(String[] args) {
		
		Cafetera c1 = new Cafetera ();
		System.out.println("cafetera1"+c1);
		Cafetera c2 = new Cafetera (1200);
		System.out.println("cafetera2"+c2);
		Cafetera c3 = new Cafetera (1500,500);
		System.out.println("cafetera3"+c3);
		
		c1.llenarCafetera();
		System.out.println("cafetera1"+c1);
		
		c1.servirTaza(200);
		System.out.println("cafetera1"+c1);
		
		c3.servirTaza(700);
		System.out.println("cafetera3"+c3);
		
		c1.vaciarCafetera();
		System.out.println("cafetera1"+c1);
		
		c1.agregarCafe(200);
		System.out.println("cafetera1"+c1);
		
		c1.agregarCafe(1500);
		System.out.println("cafetera1"+c1);

	}

}
