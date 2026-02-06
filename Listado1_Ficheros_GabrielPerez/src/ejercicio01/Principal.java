package ejercicio01;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Principal {

	public static void main(String[] args) {
		
		PrintWriter fichero = null;
		try {
		    fichero = new PrintWriter("src/ejercicio01/fichero.txt");
		     
		    fichero.println("Hola, buenas");
		    fichero.println("Me llamo Gabriel");
		    fichero.println("Estoy en DAM");
		    fichero.println("En concreto en la optativa");
		     
		} catch (FileNotFoundException e) {
		    e.printStackTrace();
		} finally {
		    if (fichero != null) {
		        fichero.close();
		    }
		}
		

	}

}
