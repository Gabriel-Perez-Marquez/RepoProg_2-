package ejercicio05;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int respuesta = 0;
		
		do {
			System.out.println("""
					Menú
					----
					0. Salir
					1. Listar Productos
					2. Escribir ticket
					3. Imprimir ticket
					""");
			respuesta = Integer.parseInt(sc.nextLine());
		} while (respuesta != 0);

	}

}
