package ejercicio08;

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
		
		
		
		
		System.out.println("Hola, este programa de una plataforma de TV gestiona los pagos de las suscripciones asi como las ofertas disponibles.\n");
		
		
		do {
			
			System.out.println("Menú");
			System.out.println("----");
			System.out.println("0. Salir");
			System.out.println("1. Mirar distintas suscripciones");
			System.out.println("2. Cancelar suscripcion");
			System.out.println("3. Mirar cuanta gente tiene la suscripcion");
			
		} while (respuesta != 0);
		
	}

}
