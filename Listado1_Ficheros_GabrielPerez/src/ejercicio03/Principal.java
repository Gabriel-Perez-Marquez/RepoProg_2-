package ejercicio03;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		FileWriter fw = null;
		
		int numPuestos;
		String nombreCarrera;
		String nombreBarco;
		int posicionBarco;
		float tiempoBarco;
		
		
		
		try {
			
			fw = new FileWriter("src/ejercicio03/carrera.txt");
			
			System.out.println("Diga el nombre de la carrera: ");
			nombreCarrera = sc.nextLine();

			System.out.println("Diga el número de puestos: ");
			numPuestos = Integer.parseInt(sc.nextLine());
			
			fw.write("Carrera: " + nombreCarrera);
			
			for( int i = 0; i < numPuestos; i++) {
				System.out.println("Diga el nombre del barco " + (i+1));
				nombreBarco = sc.nextLine();
				System.out.println("Diga la posición del barco " + (i+1));
				posicionBarco = Integer.parseInt(sc.nextLine());
				System.out.println("Diga el tiempo que ha hecho el barco " + (i+1) + " en la carrera");
				tiempoBarco = Float.parseFloat(sc.nextLine());
				
				
				fw.write("\n-Barco:" + (i+1));
				fw.write("\n\tNombre: " + nombreBarco);
				fw.write("\n\tPosición: " + posicionBarco);
				fw.write("\n\tTiempo: " + tiempoBarco);
				System.out.println("Datos de la carrera registrados con exito!");
			}
		} catch (IOException e) {
			System.err.println(e.getMessage());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
			sc.close();
			fw.close();
		}
		
		
		
		
		
		
		
		
		
	}  

}	