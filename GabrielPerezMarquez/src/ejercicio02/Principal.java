package ejercicio02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

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
		boolean resultado = false;
		String aux = "";
		String cadenaABuscar = "";
		
		String expRegMatricula = "^\\d{4}[A-Z]{3}$";
		String expRegTelefono = "^\\+?34[67]\\d{8}$";
		
		Pattern patternMatricula = Pattern.compile(expRegMatricula);
		Pattern patternTelefono = Pattern.compile(expRegTelefono);
		
		
		
		do {
			
			System.out.println("\n--- MENÚ GESTOR DE CADENAS ---");
            System.out.println("1. Mostrar todas las cadenas");
            System.out.println("2. Ordenar alfabéticamente");
            System.out.println("3. Buscar una cadena");
            System.out.println("4. Crear string con iniciales");
            System.out.println("5. Borrar cadenas de longitud impar");
            System.out.println("6. Pasar todo a mayúsculas");
            System.out.println("7. Comprobar validez de las cadenas");
            System.out.println("0. Salir");
            System.out.println("Seleccione una opción: ");
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
					
				case 5:
					System.out.println("Se han borrado las cadenas impares. Resultado:");
					System.out.println(gestorCadenas.borrarCadenasImpares());
					break;
					
				case 6:
					System.out.println("Se han pasado a mayusculas todas las cadenas. Resultado: ");
					System.out.println(gestorCadenas.pasarCadenasAMayusculas());
					break;
					
				case 7:
					System.out.println("1. Comprobar matriculas");
					System.out.println("2. Comprobar números de telefono españoles");
					respuesta = Integer.parseInt(sc.nextLine());
					switch (respuesta){
						case 1: 
							System.out.println("Introduzca la matricula sin espacios:");
							aux = sc.nextLine();
							resultado = gestorCadenas.validarCadena(aux, patternMatricula);
							
							if(resultado) {
								System.out.println("La matricula "+ aux +" es valida!");
							} else {
								System.out.println("La matricula "+ aux +" no es valida");
							}
							break;
							
						case 2:
							System.out.println("Introduzca el número de telefono con el prefijo del pais y sin espacios:");
							aux = sc.nextLine();
							resultado = gestorCadenas.validarCadena(aux, patternTelefono);
							
							if(resultado) {
								System.out.println("El número de telefono "+ aux +" es valido!");
							} else {
								System.out.println("El número de telefono "+ aux +" no es valido");
							}
							break;
							
							
						default:
							System.out.println("Opción invalida!");
							break;
					}
					
					break;
					
				default:
					System.out.println("Opción invalida!");
			}
			
		} while (respuesta != 0);
		
		sc.close();
		

	}

}
