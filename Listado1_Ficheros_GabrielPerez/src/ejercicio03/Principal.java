package ejercicio03;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		FileWriter fw = new FileWriter("palindromos.txt");
		        
		System.out.print("Introduce un número para verificar: ");
        String numero = sc.nextLine();
		
		if (esPalindromo(numero)) {
            System.out.println("¡Es un palíndromo! Guardando en el archivo...");
		    
		} else {
            System.out.println("No es un palíndromo.");
        }
        
	       sc.close();
	}
		
		    // Lógica para verificar si el texto es igual al derecho y al revés
		    public static boolean esPalindromo(String texto) {
		        String invertido = new StringBuilder(texto).reverse().toString();
		        return texto.equals(invertido);
		    }
		
		    

}	