package ejercicio01TipoExamen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int respuesta = 0;
		List<Habitacion> habitaciones = new ArrayList<Habitacion>();
		Habitacion h1 = new Suite(500, false, null, 0, 0, 50, 150);
		Habitacion h2 = new Suite(520, true, "Antonio Carrasco", 5, 2, 53, 160);
		Habitacion h3 = new Suite(500, true, "Pepe Pérez", 0, 0, 50, 150);
		
		habitaciones.add(h1);
		habitaciones.add(h2);
		habitaciones.add(h3);
		
		System.out.println("Bienvenido a este programa que te gestiona las reservas de unas habitaciones");
		
		do {
			
			System.out.println("""
					Menú
					----
					0. Salir
					1. Calcular el precio de una habitación
					2. Calcular el total recaudado
					3. Mostrar factura
					4. Mostrar habitaciones ocupadas
					""");
			
			respuesta = Integer.parseInt(sc.nextLine());
			
			
			
		} while (respuesta != 0);
		

	}

}
