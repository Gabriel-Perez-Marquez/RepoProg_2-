package ejercicio02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Principal {

	public static void main(String[] args) throws IOException {
		File fichero = new File("src/ejercicio02/fichero.txt");
		FileWriter fw = null;
		FileReader fr = null;
		int valor = 0;
		
		try {
			fw = new FileWriter(fichero);
			fr = new FileReader(fichero);
			
			fw.write("Hola, buenas\r\n");
			fw.write("Me llamo Gabriel\r\n");
			fw.write("Estoy en DAM\r\n");
			fw.write("En concreto en la optativa\r\n");
			
			fw.flush();
		    

		    while( (valor=fr.read()) != -1) {
		    	System.out.print((char)valor);
		    }
		   
		    
		   
		    
		} catch (FileNotFoundException e) {
		    e.printStackTrace();
		} finally {
		    if (fw != null) {
		        fw.close();
		    }
		}
		

	}

}
