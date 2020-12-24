package ejer16;

public class Prueba {

	public static void main(String[] args) {
		Guerrero g1 = new Guerrero("Aragorn", 1500, "Espada");
		Mago m1 = new Mago("Gandalf", "Magia blanca");
		
		System.out.println(g1.combatir(1900));
		g1.alimentarse(900);
		System.out.println("El guerrero tiene actualmente "+g1.getEnergia()+" energia");  
		System.out.println(m1.encantar()); 
        System.out.println(m1.encantar());
        System.out.println(m1.encantar());
	}

}
