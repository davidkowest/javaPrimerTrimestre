package ejer01;

public class Prueba {

	public static void main(String[] args) {
		DVDCine p1 = new DVDCine("UN FINAL MADE IN HOLLYWOOD (HOLLYWOOD ENDING)", "Woody Allen", 
				"Woody Allen y George Hamilton", "Comedia", "114 min", 
				"Los Oscars ganados en el pasado por el ex-genio del cine ...");
		
		System.out.println(p1.muestraDVDCine());
		
		System.out.println(p1.esThriller());
		
		System.out.println(p1.tieneResumen());

	}

}
