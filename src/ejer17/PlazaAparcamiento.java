package ejer17;

import java.util.Scanner;
/**
 * 
 * @author Davidkowest
 *
 */
public class PlazaAparcamiento {
	Scanner teclado = new Scanner (System.in);
	
	//Atributos
	
	private int nplaza;
	private Coche coche;
	private boolean disponible=true;
	private static int ncoches;
	
	//Constructor
	/**
	 * Constructor que inicializa la plaza aparcamiento con el nplaza
	 * @param nplaza
	 */
	public PlazaAparcamiento(int nplaza) {
		
		this.nplaza = nplaza;
		
	}
	
	//Metodos


	public int getNplaza() {
		return nplaza;
	}


	public void setNplaza(int nplaza) {
		this.nplaza = nplaza;
	}


	public Coche getCoche() {
		return coche;
	}


	public void setCoche(Coche coche) {
		this.coche = coche;
	}


	public boolean isDisponible() {
		return disponible;
	}


	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}


	public static int getNcoches() {
		return ncoches;
	}


	public static void setNcoches(int ncoches) {
		PlazaAparcamiento.ncoches = ncoches;
	}

	/**
	 * Metodo que nos devuelve la informacion de la plazaAparcamiento
	 * @return
	 */
	public String muestraValores() {
		return "PlazaAparcamiento [nplaza=" + nplaza + ", coche=" + coche + ", disponible=" + disponible + "]";
	}
	/**
	 * Metodo que nos imprime por pantalla el menu del programa
	 */
	public void muestraMenu() {
		System.out.println("PLAZA APARCAMIENTO\n1.\tAparcar coche\n2.\tSacar coche\n3.\tVer coche aparcado\n4.\tSalir aplicacion\nOPCION:");
	}
	/**
	 * Metodo que os recoge los datos del coche, pidiendo al usuario que nos meta por teclado la informacion, 
	 * aumenta el contador de numero de coches. Si ya hay un coche aparcado nos da la 
	 * informacion de que la plaza no está disponible
	 */
	public void aparcarCoche () {
		if (disponible) {
			this.coche=new Coche();
			System.out.println("Introduzca la marca del coche");
			this.coche.setMarca(teclado.next());
			System.out.println("Introduzca el modelo del coche");
			this.coche.setModelo(teclado.next());
			System.out.println("Introduzca el matrícula del coche");
			this.coche.setMatricula(teclado.next());
			
			ncoches++;
			disponible=false;
			System.out.println("EL COCHE SE HA APARCADO");
		} else {
			System.out.println("PLAZA YA OCUPADA POR OTRO COCHE");
		}
	}
	/**
	 * Metodo que saca el coche de la plaza, marcando el coche como nulo y la plaza disponible. 
	 * Si no hay coche en la plaza, nos informa de que la plaza esta libre
	 */
	public void sacarCoche () {
		if (disponible) {
			System.out.println("ERROR, NO HAY COCHE EN LA PLAZA DE GARAJE, LA PLAZA ESTÁ LIBRE");
		} else {
					System.out.println("EL COCHE MARCA: "+this.coche.getMarca()+" MODELO: "+this.coche.getModelo()+" Y MATRÍCULA "
				+this.coche.getMatricula()+" HA ABANDONADO EL APARCAMIENTO");
		this.coche=null;
		
			
		disponible=true;
		}
	}
	/**
	 * Metodo que nos imprime por pantalla la informacion del coche aparcado. 
	 * si no hay coche nos infroma de que la plaza esta libre
	 */
	public void verCoche () {
		if (disponible) {
			System.out.println("LA PLAZA ESTÁ LIBRE");
		} else {
			System.out.println("Marca:\t"+this.coche.getMarca()+"\nModelo:\t"+this.coche.getModelo()+"\nMatricula:\t"+this.coche.getMatricula());
		}
	}
	/**
	 * Metodo que nos imprime por pantalla la informacion de la plaza 
	 * en el momento de finalizar la ejecicion del programa
	 */
	public void salirPrograma () {
		
		if (disponible) {
			System.out.println("LA PLAZA ESTÁ LIBRE \nEL NÚMERO DE COCHES QUE HAN APARCADO EN LA PLAZA ES "+ncoches);
		} else {
			System.out.println("LA PLAZA ESTÁ OCUPADA\nMarca:\t"+this.coche.getMarca()+"\nModelo:\t"+this.coche.getModelo()+"\nMatricula:\t"+this.coche.getModelo()+"\nEL NUMERO DE COCHES QUE HAN PASADO POR LA PLAZA ES: "+ncoches);

		}
	}
}
