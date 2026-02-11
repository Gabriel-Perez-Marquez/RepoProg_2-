package ejercicio04;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		FileWriter fw = null;
		String invertido = null;
		String numero = null;
		
		try {
			fw = new FileWriter("src/ejercicio04/palindromos.txt");
			System.out.println("Indtroduce -1 para terminar");
			
			do {	
				
				System.out.print("Introduce un número para verificar: ");
				numero = sc.nextLine();
				
				invertido = new StringBuilder(numero).reverse().toString();
				
				if(!invertido.isEmpty() && !numero.equals("-1") ) {
					if(numero.equals(invertido)) {
						
						fw.write(numero + "\r\n");
						System.out.println("Si es un palíndromo");
					} else {
						System.out.println("No es un palíndromo.");
					}
				}
				
			} while (!numero.equals("-1"));
			System.out.println("Saliendo...");
			
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


