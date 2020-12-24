package ejer17;

import java.util.Scanner;

public class MainGestionPlaza {

	public static void main(String[] args) {
		
		int x;
		Scanner entrada = new Scanner(System.in);
		
		PlazaAparcamiento p1 = new PlazaAparcamiento(1);
		
		do {
			p1.muestraMenu();
			x=entrada.nextInt();
			switch (x) {
			case 1:
				
				p1.aparcarCoche();
				break;

			case 2:
				p1.sacarCoche();
				break;
			case 3:
				p1.verCoche();
				break;
			case 4:
				p1.salirPrograma();
				break;
			}
			
			
			
		} while (x!=4);
		

	}

}
