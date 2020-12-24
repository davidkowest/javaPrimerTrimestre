package ejer03;

public class prueba {

	public static void main(String[] args) {
		Cuenta c1=new Cuenta();
		c1.muestraCuenta();
		System.out.println("");
		Cuenta c2=new Cuenta("28935601Z", 3500.8, 15);
		c2.muestraCuenta();
		System.out.println("");
		
		c1.ingresarSaldo(200);
		c1.muestraCuenta();
		System.out.println("");
		c2.retirarSaldo(300);
		c2.muestraCuenta();
		System.out.println();
		c2.actualizarSaldo(64);
		c2.muestraCuenta();

	}

}
