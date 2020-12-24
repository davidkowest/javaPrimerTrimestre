package ejer15;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		int x = 0, saldo = 0;
		boolean c = false, d = false, continua;
		Cuenta[] cuentas = new Cuenta[2];
		Scanner entrada = new Scanner(System.in);

		do {
			do {
				try {
					continua = false;
					System.out.println("Elige una acción:\n");
					System.out.println("1.- Crear cuenta vacía.");
					System.out.println("2.- Crear cuenta con saldo inicial.");
					System.out.println("3.- Ingresar dinero.");
					System.out.println("4.- Sacar dinero.");
					System.out.println("5.- Ver saldo.");
					System.out.println("6.- Salir.");
					x = entrada.nextInt();
				} catch (Exception e) {
					continua = true;
					System.err.println("Formato no valido");
					entrada.next();
				}

			} while (continua);
			switch (x) {
			case 1:

				if (c || d) {
					System.out.println("Ya existe una cuenta creada");
				} else {
					cuentas[0] = new Cuenta();
					c = true;
				}

				break;

			case 2:

				if (d || c) {
					System.out.println("Ya existe una cuenta creada");

				} else {
					do {
						do {

							try {
								continua = false;
								System.out.println("Introduce el saldo de la cuenta");
								saldo = entrada.nextInt();

							} catch (Exception e) {
								continua = true;
								System.err.println("Formato no valido");
								entrada.next();
							}
						} while (continua);
					} while (saldo < 0);
					cuentas[1] = new Cuenta(saldo);
					d = true;
				}

				break;

			case 3:
				if (c || d == true) {
					do {
						do {
							try {
								continua = false;
								System.out.println("Introduce el saldo que quieres añadir");
								saldo = entrada.nextInt();
							} catch (Exception e) {
								continua = true;
								System.err.println("Formato no valido");
								entrada.next();
							}

						} while (continua);
					} while (saldo < 0);

					if (c) {

						cuentas[0].ingresar(saldo);
					} else if (d) {
						cuentas[1].ingresar(saldo);
					}
				} else {
					System.out.println("Primero debes crear una cuenta");
				}

				break;

			case 4:
				if (c || d == true) {

					do {
						do {

							try {
								continua = false;
								System.out.println("Introduce el saldo que quieres retirar");
								saldo = entrada.nextInt();
							} catch (Exception e) {
								continua = true;
								System.err.println("Formato no valido");
								entrada.next();
							}

						} while (continua);
					} while (saldo < 0);
					if (c) {
						cuentas[0].extraer(saldo);
					} else if (d) {
						cuentas[1].extraer(saldo);
					}
				} else {
					System.out.println("Primero debes crear una cuenta");
				}

				break;

			case 5:
				if (c) {
					System.out.println("Tu saldo actual es" + cuentas[0].getSaldo());
				}
				if (d) {
					System.out.println("Tu saldo actual es" + cuentas[1].getSaldo());
				} else {
					System.out.println("Primero debes crear una cuenta");
				}
				break;
			}

		} while (x != 6);

	}

}
