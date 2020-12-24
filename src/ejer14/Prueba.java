package ejer14;

public class Prueba {

	public static void main(String[] args) {
		Marciano m1 = new Marciano("ET");
		Marciano m2 = new Marciano("Kang");
		m1.cuentaMarcianos();
		m1.muere();
		m1.estaVivo();
		m2.estaVivo();
		m1.cuentaMarcianos();

	}

}
