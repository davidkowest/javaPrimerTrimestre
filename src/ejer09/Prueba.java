package ejer09;

public class Prueba {

	public static void main(String[] args) {
		Direccion d1 = new Direccion("Falsa", 123, "tercero", "Springfield");
		Direccion d2 = new Direccion("verdadera", 456, "primero", "Shellbiville");
		Direccion d3 = new Direccion("un poco falsa", 789, "bajo", "Capital City");
		
		Empleado e1 = new Empleado("Homer", 1800, d1);
		Empleado e2 = new Empleado("Moe", 1100, d2);
		Empleado e3 = new Empleado("Lenny", 1500, d3);
		
		e1.muestraEmpleado();
		e2.muestraEmpleado();
		e3.muestraEmpleado();
		
	}

}
