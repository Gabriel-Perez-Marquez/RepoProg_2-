package ejemplo1;

import java.io.File;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file1 = new File("fichero.txt");
		
		System.out.println("Se puede leer el archivo: " + file1.canRead());
		
		
	}

}
