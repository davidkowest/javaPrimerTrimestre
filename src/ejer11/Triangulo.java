package ejer11;
/**
 * 
 * @author Davidkowest
 *
 */
public class Triangulo {
	//Atributos
	
	private double lado1;
	private double lado2;
	private double lado3;
	
	//Constructores
	/**
	 * Constructor que nos inicializa la clase Triangulo con los siguientes parametros
	 * @param lado1
	 * @param lado2
	 * @param lado3
	 */
	public Triangulo (double lado1, double lado2, double lado3) {
		this.lado1=lado1;
		this.lado2=lado2;
		this.lado3=lado3;
	}
	
	//Metodos
	/**
	 * Metodo que nos compara dos triangulos y nos dice si son iguales o no
	 * @param a
	 * @param b
	 * @return
	 */
	public static boolean compareTo_Triangulos(Triangulo a,Triangulo b) {
		if (a.lado1==b.lado1 && a.lado2==b.lado2 &&a.lado3==b.lado3) {
			return true;
		} else {
			return false;
		}
	}
	/**
	 * Metodo que nos compara dos array de triangulos y nos dice si son iguales o no
	 * @param v
	 * @return
	 */
	public static boolean compareTo_VTriangulos(Triangulo v[]) {
		for (int i = 0; i < v.length-1; i++) {
			if (!compareTo_Triangulos(v[i], v[i+1])) {
				return false;
			}
		}
		return true;
	}
	/**
	 * Metodo que nos devuelve un entero segun si tiene dos lados iguales,, los tres lados iguales, o los tres lados diferentes
	 * @return
	 */
	public int tipo_Triangulo () {
		if (lado1==lado2 && lado2==lado3) {
			return 1;
		} else {
			if (lado1==lado2 || lado1==lado3 || lado2==lado3) {
				return 2;
			} else {
				return 3;
			}

		}
	}
	
}
