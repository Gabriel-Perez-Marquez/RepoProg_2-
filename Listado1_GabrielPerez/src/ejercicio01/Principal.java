package ejercicio01;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int codigoSecreto;
		int respuesta;
		int numIntentos = 3;
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		int min = 1000;
	    int max = 9999;
		
		System.out.println("Bienvenido a mi programa que trata de acceder a la habitación de un hotel "
				+ "turístico.");
		
		codigoSecreto = rnd.nextInt((max - min) + 1) + min;
				
				
		do {
			System.out.println("Tienes " + numIntentos + " intentos.");
			System.out.println("Dime el código:");
			respuesta = Integer.parseInt(sc.nextLine());
			
			if(respuesta == codigoSecreto) {
				System.out.println("Has acertado. Puerta abierta!");
			} else {
				System.out.println("Código incorrecto.");
				numIntentos--;
			}
			
		} while (numIntentos > 0);
		
		sc.close();

	}

}
