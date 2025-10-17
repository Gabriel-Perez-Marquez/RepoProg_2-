package ejercicio08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/* 
		 * Crea un programa para gestionar los pagos de una plataforma de tv. Deciude que atributos, 
		 * como se calcilas los distintos precios, por ejemplo, con o sin anuncios, basico o con 
		 * paquetes extra como el futbol, descuentos por contratar varias cosas.... Intenta que sea 
		 * lo mas completo posible 
		 * 
		 * */
		
		
		Scanner sc = new Scanner(System.in);
		int respuesta = 0;
		List<Programa> suscripciones = new ArrayList<Programa>();
		
		suscripciones.add(new Programa("Básico", 5.66, "Cine", true));
		suscripciones.add(new Programa("Básico sin anuncios", 7.00, "Cine", false));
		suscripciones.add(new Programa("Deporte", 7.50, "Cine", false));
		suscripciones.add(new Programa("Cine + deporte", 11.99, "Cine", false));
		
		
		
		System.out.println("Hola, este programa de una plataforma de TV gestiona los pagos de las suscripciones asi como las ofertas disponibles.\n");
		
		
		do {
			System.out.println();
			System.out.println("Menú");
			System.out.println("----");
			System.out.println("0. Salir");
			System.out.println("1. Mirar distintas suscripciones");
			System.out.println("2. Cancelar suscripcion");
			System.out.println("3. Mirar cuanta gente tiene la suscripcion");
			System.out.println("4. Editar suscripciones");
			System.out.println("5. Contratar suscipción");
			
			respuesta = Integer.parseInt(sc.nextLine());
			
			switch (respuesta) {
				case 1:
					
					suscripciones.stream()
						.forEach(p -> System.out.println(p));
					
					break;
					
					
				case 2:
					
					
					break;
					
					
				case 3:
					
					
					break;
					
					
				case 4:
					
					
					break;
					
					
				case 5:
					
					suscripciones.stream()
						.forEach(p -> System.out.println(p));
					
					System.out.println("¿Qué suscripción quieres contratar?");
					respuesta = Integer.parseInt(sc.nextLine());
					
					suscripciones.get(respuesta - 1).setNumSusc(suscripciones.get(respuesta).getNumSusc()+1);
					
					break;
						
						
				default:
					throw new IllegalArgumentException("Unexpected value: " + respuesta);
			}
			
			
		} while (respuesta != 0);
		
	}

}
