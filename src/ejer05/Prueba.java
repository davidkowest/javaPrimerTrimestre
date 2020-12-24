package ejer05;

public class Prueba {

	public static void main(String[] args) {
		Empleado e1 = new Empleado ();
		Empleado e2 = new Empleado ();
		
		
		e1.setNif("28789547Q");
		e1.setNhijos(2);
		e1.setCasado(true);
		e1.setPagohoraextra(20);
		e1.setHorasextras(10);
		e1.setSbase(1500);
		e1.setIrpf(15);
		
		System.out.println(e1.println()); 
		System.out.println(e1.printall());
		
		e2.copia(e1);
		System.out.println("Copiamos e2 con los datos de e1");
		System.out.println(e2.printall());
		
	}

}
