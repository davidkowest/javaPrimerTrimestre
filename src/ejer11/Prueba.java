package ejer11;

public class Prueba {

	public static void main(String[] args) {
		
		Triangulo t1 = new Triangulo(2, 2, 2);
		Triangulo t2 = new Triangulo(2, 2, 2);
		
		Triangulo [] triangulosDiferentes = new Triangulo [3];
		triangulosDiferentes [0] = new Triangulo(3, 4, 5);
		triangulosDiferentes [1] = new Triangulo(4, 4, 4);
		triangulosDiferentes [2] = new Triangulo(3, 4, 5);
		
		Triangulo [] triangulosIguales = new Triangulo [3];
		triangulosIguales [0] = new Triangulo(3, 4, 5);
		triangulosIguales [1] = new Triangulo(3, 4, 5);
		triangulosIguales [2] = new Triangulo(3, 4, 5);
		
		
		
		System.out.println(Triangulo.compareTo_Triangulos(t1, t2));
		System.out.println(Triangulo.compareTo_VTriangulos(triangulosDiferentes));
		System.out.println(Triangulo.compareTo_VTriangulos(triangulosIguales));
	}

}
