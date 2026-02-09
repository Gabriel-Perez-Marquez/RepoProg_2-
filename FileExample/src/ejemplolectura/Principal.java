package ejemplolectura;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) {
		String texto = "";
		
		try {
			FileReader flE = new FileReader("Agenda.txt");
			BufferedReader fE = new BufferedReader(flE);
			while(texto != null) {
				texto = fE.readLine();
				if(texto != null) {
					int posi = texto.indexOf(",");
					String nombre = texto.substring(0, posi);
					String telefono = texto.substring(posi+1);
					System.out.println("Nombre: " + nombre);
					System.out.println("Telefono: " + telefono);
				}
			}
			fE.close();
		} catch (IOException e) {
			// TODO: handle exception
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
