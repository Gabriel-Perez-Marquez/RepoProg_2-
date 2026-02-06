package ejemplo3;

import java.io.File;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		File [] lista = File.listRoots();
		
		for(File root : lista) {
			System.out.println("Root: " + root.getAbsolutePath());
		}
		
	}

}
