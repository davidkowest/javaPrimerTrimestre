package ejer12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		
		String nombre;
		int nhoras=0;
		double tarifa=0;
		boolean continua;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("¿Como se llama el primer empleado?");
		nombre=entrada.next();
		do {
		try {
			continua=false;
			System.out.println("¿Cuantas horas ha trabajado?");
			nhoras=entrada.nextInt();
			
		} catch (InputMismatchException e) {
			System.err.println("Formato no valido");
			entrada.next();
			continua=true;
		}
		} while (continua);
		
		do {
			try {
				continua=false;
				System.out.println("¿Que tarifa tiene?");
				tarifa=entrada.nextDouble();
			} catch (InputMismatchException e) {
				System.err.println("Formato no valido");
				entrada.hasNext();
				continua=true;
			}
		} while (continua);
		
		
			
		Empleado e1 = new Empleado(nombre, nhoras, tarifa);

		
		System.out.println("¿Como se llama el primer empleado?");
		nombre=entrada.next();
		do {
		try {
			continua=false;
			System.out.println("¿Cuantas horas ha trabajado?");
			nhoras=entrada.nextInt();
			
		} catch (InputMismatchException e) {
			System.err.println("Formato no valido");
			entrada.next();
			continua=true;
		}
		} while (continua);
		
		do {
			try {
				continua=false;
				System.out.println("¿Que tarifa tiene?");
				tarifa=entrada.nextDouble();
			} catch (InputMismatchException e) {
				System.err.println("Formato no valido");
				entrada.hasNext();
				continua=true;
			}
		} while (continua);
		
		
			
		Empleado e2 = new Empleado(nombre, nhoras, tarifa);
		
		
		System.out.println("¿Como se llama el primer empleado?");
		nombre=entrada.next();
		do {
		try {
			continua=false;
			System.out.println("¿Cuantas horas ha trabajado?");
			nhoras=entrada.nextInt();
			
		} catch (InputMismatchException e) {
			System.err.println("Formato no valido");
			entrada.next();
			continua=true;
		}
		} while (continua);
		
		do {
			try {
				continua=false;
				System.out.println("¿Que tarifa tiene?");
				tarifa=entrada.nextDouble();
			} catch (InputMismatchException e) {
				System.err.println("Formato no valido");
				entrada.hasNext();
				continua=true;
			}
		} while (continua);
		
		
			
		Empleado e3 = new Empleado(nombre, nhoras, tarifa);
		
		e1.muestraEmpleado();
		e2.muestraEmpleado();
		e3.muestraEmpleado();
		
	}

}
