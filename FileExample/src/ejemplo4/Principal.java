package ejemplo4;

import java.io.File;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		File canal = new File("/Documentos/FileExample/src/ejemplo4");
		File [] lista = canal.listFiles();
		for(int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
		

	}

}
