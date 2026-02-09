package ejemplocopiarypegar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader flE = new FileReader("Origen.txt");
			BufferedReader fE = new BufferedReader(flE);
			
			FileWriter flS = new FileWriter("Destino.txt");
			BufferedWriter fS = new BufferedWriter(flS);
			String texto = "";
			while (texto != null) {
				texto = fE.readLine();
				if(texto != null) {
					fS.write(texto);
					fS.newLine();
				}
			}
			
			//Este cierre se debe de hacer en un finally
			fS.close();
			fE.close();
			 
		} catch (IOException e) {
			// TODO: handle exception
		}

	}

}
