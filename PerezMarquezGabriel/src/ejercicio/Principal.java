package ejercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		
		Usuario u1 = new Usuario("Mauro", "mauroserrano@gmail.com", 19);
		Usuario u2 = new Usuario("Gabriel", "gabrielperez@gmail.com", 19);
		Usuario u3 = new Usuario("Cristina", "cristinarus@gmail.com", 21);
		
		usuarios.add(u1);
		usuarios.add(u2);
		usuarios.add(u3);
		
		GestionUsuarios gestion = new GestionUsuarios(usuarios);
		
		int respuesta = -1;
		String nombre;
		String email;
		int edad;
		int edadMinima = 18;
		int numCaracteresMin = 3;
		Scanner sc = new Scanner(System.in);
		
		
		
		do {
			try {
				
				System.out.println("""
						Menú
						----
						0. Salir
						1. Agregar usuario
						2. Mostrar lista usuarios
						3. Cambiar número mínimo de caracteres
						4. Cambiar edad mínima
						""");
				respuesta = Integer.parseInt(sc.nextLine());
				
				switch(respuesta) {
					case 1:
						System.out.println("Diga el nombre del nuevo usuario:");
						nombre = sc.nextLine();
						gestion.validarNombre(nombre, numCaracteresMin);
						
						
						System.out.println("Diga el email del nuevo usuario:");
						email = sc.nextLine();
						gestion.validarEmail(email);
						
						
						System.out.println("Diga la edad del nuevo usuario");
						edad = Integer.parseInt(sc.nextLine());
						gestion.validarEdad(edad, edadMinima);
						
						if(gestion.crearUsuario(new Usuario(nombre, email, edad))) {
							System.out.println("Usuario creado con exito!!");
						}
						
						break;
						
					case 2:
						gestion.mostrarUsuarios();
						
						break;
						
					case 3:
						System.out.println("Diga el número mínimo de caracteres para el nombre:");
						numCaracteresMin = Integer.parseInt(sc.nextLine());
						break;
						
					case 4:
						System.out.println("Diga la edad mínima para el usuario:");
						edadMinima = Integer.parseInt(sc.nextLine());
						break;
						
					case 0:
						System.out.println("Saliendo...");
						break;
						
					default:
						System.out.println("Opción invalida!");
				}
					
				
						
				
			} catch (TextoInvalidoException e) {
				System.err.println(e.getMessage());
			} catch (CalculoInvalidoException e) {
				System.err.println(e.getMessage());
			} catch (NumberFormatException e) {
				System.err.println("Formato de respuesta incorrecto");
			} catch (Exception e) {
				System.err.println("Ha ocurrido un error inesperado");
			}
		} while (respuesta != 0);
		
		sc.close();
		
	}

}
