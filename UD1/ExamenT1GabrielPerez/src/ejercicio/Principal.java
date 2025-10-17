package ejercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehiculo v1 = new Motos("1234GHJ", 45, 125);
		Vehiculo v2 = new Motos("4512FRZ", 60, 300);
		Vehiculo v3 = new Motos("2876WBN", 15, 900);
		Vehiculo v4 = new Furgonetas("3452HNM", 30, 5);
		Vehiculo v5 = new Furgonetas("3452HNM", 30, 3.5);
		Vehiculo v6 = new Furgonetas("5361TDC", 15, 4);
		
		List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
		
		vehiculos.add(v1);
		vehiculos.add(v2);
		vehiculos.add(v3);
		vehiculos.add(v4);
		vehiculos.add(v5);
		vehiculos.add(v6);
		
		Parking p = new Parking("Calle Condes de Bustillo, 17", vehiculos);
		
		int respuesta = 0;
		Scanner sc = new Scanner(System.in);
		
		double precioMinuto = 0;
		double plusMetro = 0;
		double maxMetrosGratis = 0;
		
		
		String matricula;
		double minutos;
		double centimetrosCub;
		double longitud;
		
		
		
		System.out.println("Bienvenido a este programa que se dedica a la gestión de un parking. "
				+ "Este programa trabaja con furgonetas y motos");
		System.out.println("Primero vamos a pedirle algunos datos necesarios para la gestión del parking");
		System.out.println("Diga cuánto va a ser la tarifa por minuto de este parking");
		precioMinuto = Double.parseDouble(sc.nextLine());
		while(precioMinuto <= 0 ) {
			if(precioMinuto == 0) {
				System.out.println("Este parking no es gratuito");
			} else {
				System.out.println("Precio invalido, no puede ser negativo.");
				System.out.println("Diga cuánto va a ser la tarifa por minuto de este parking");
				precioMinuto = Double.parseDouble(sc.nextLine());
			}
		}
		
		
		System.out.println("Diga la longitud máxima de las furgonetas para tener un aparcamiento normal");
		maxMetrosGratis = Double.parseDouble(sc.nextLine());
		
		
		System.out.println("Perfecto. Ahora diga cuánto va a ser el plus que va a cobrar a las furgonetas "
				+ "por sobrepasar los "+ maxMetrosGratis +" metros");
		plusMetro = Double.parseDouble(sc.nextLine());
		while(plusMetro < 0 ) {
			System.out.println("Precio invalido, no puede ser negativo.");
			System.out.println("Diga cuánto va a ser el plus por metro de este parking");
			plusMetro = Double.parseDouble(sc.nextLine());
		}
		
		
		
		
		
		do {
			System.out.println();
			System.out.println("""
					Menú
					----
					0. Salir del programa
					1. Comprobar tamaños furgonetas
					2. Calcular recaudado motos 
					3. Calcular el precio de un vehiculo nuevo
					4. Mostrar datos
					""");
			
			respuesta = Integer.parseInt(sc.nextLine());
			
			switch (respuesta) {
				case 1: 
					p.comprobarTamanyo(maxMetrosGratis);
					break;
					
				case 2:
					System.out.printf("El total recaudado con las motos es de %.2f €",
							p.calcularRecaudadoMotos(precioMinuto, plusMetro, maxMetrosGratis));
				
					break;
				
				case 3:
					System.out.println("Primero vamos a elegir que tipo de vehiculo quieres calcular");
					System.out.println("1. Moto\n2. Furgoneta");
					respuesta = Integer.parseInt(sc.nextLine());
					if(respuesta == 1) {
						System.out.println("Diga la matricula de la moto:");
						matricula = sc.nextLine();
						System.out.println("Diga los minutos que ha estado en el parking:");
						minutos = Double.parseDouble(sc.nextLine());
						System.out.println("Diga la cilindrada de la moto:");
						centimetrosCub = Double.parseDouble(sc.nextLine());
						
						System.out.printf("El precio de la estancia en el parking de esta moto es de %.2f €"
								, p.calcularPrecioUnVehiculo(new Motos(matricula, minutos, centimetrosCub), precioMinuto
										, plusMetro, maxMetrosGratis));
						
					}else if( respuesta == 2) {
						System.out.println("Diga la matricula de la furgoneta:");
						matricula = sc.nextLine();
						System.out.println("Diga los minutos que ha estado en el parking:");
						minutos = Double.parseDouble(sc.nextLine());
						System.out.println("Diga la longitud de la furgoneta:");
						longitud = Double.parseDouble(sc.nextLine());
						
						System.out.printf("El precio de la estancia en el parking de esta furgoneta es de %.2f €"
								, p.calcularPrecioUnVehiculo(new Furgonetas(matricula, minutos, longitud), precioMinuto,
										plusMetro, maxMetrosGratis));
					} else {
						System.out.println("Opción invalida!");
					}
					break;
						
						
				case 4:
					p.mostrarDatos();
					break;
					
				case 0:
					break;
					
				default:
					System.out.println("Opción invalida!");
			}
			
			
		} while (respuesta != 0);
		System.out.println("Hasta pronto!!");
		sc.close();
		
	}

}
