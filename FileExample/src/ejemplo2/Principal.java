package ejemplo2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrintWriter writer = null;
		try {
		    //Esta linea crea el objeto PrintWriter
		    writer = new PrintWriter("fichero_texto.txt");
		     
		    //Escribimos las líneas de texto
		    writer.println("Esto es la primera linea de texto");
		    writer.println("Esto es otra linea de texto");
		    writer.println("Esto es la última línea de texto");
		     
		} catch (FileNotFoundException e) {
		    e.printStackTrace();
		}finally {
		    if (writer != null) {
		        //Cerramos el fichero
		        writer.close();
		    }
		}
		
		

	}

}
