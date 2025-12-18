package ejercicio02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		
		List<String> listaCadenas = new ArrayList<String>();
		
		listaCadenas.add("Hola");
		listaCadenas.add("me");
		listaCadenas.add("llamo");
		listaCadenas.add("Pepe");
		listaCadenas.add("Pequeño");
		listaCadenas.add("Avión");
		
		
		GestorCadenas gestorCadenas = new GestorCadenas(listaCadenas);
		
		int respuesta = 0;
		String cadenaABuscar = "";
		
		do {
			
			System.out.println("\n--- MENÚ GESTOR DE CADENAS ---");
            System.out.println("1. Mostrar todas las cadenas");
            System.out.println("2. Ordenar alfabéticamente");
            System.out.println("3. Buscar una cadena");
            System.out.println("4. Crear string con iniciales");
            System.out.println("5. Borrar cadenas de longitud impar");
            System.out.println("6. Pasar todo a mayúsculas");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            respuesta = Integer.parseInt(sc.nextLine());
            
            switch (respuesta) {
			case 1: 
				
				for(String s : gestorCadenas.getListaCadenas()) {
					System.out.println(s);
				}
				
				break;
				
			case 2:
				
				for(String s : gestorCadenas.ordenarCadenasOrdenAlf()) {
					System.out.println(s);
				}
				break;
				
			case 3:
				System.out.println("Diga la cadena a buscar en la lista");
				cadenaABuscar = sc.nextLine();
				
				for(String s : gestorCadenas.buscarCadena(cadenaABuscar)) {
					System.out.println(s);
				}
				break;
				
				
			case 4:
				System.out.println("La palabra creada con la inicial de cada cadena de la lista es: " + gestorCadenas.crearStringConIniciales());
				break;
				
				
			default:
				throw new IllegalArgumentException("Unexpected value: " + respuesta);
			}
			
		} while (respuesta != 0);
		

	}

}
