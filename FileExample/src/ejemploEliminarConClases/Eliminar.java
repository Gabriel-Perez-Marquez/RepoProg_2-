package ejemploEliminarConClases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Eliminar {
	
	public void borrarLinea(String file, String lineaABorrar) {
		try {
			File inFile = new File(file);
			if(!inFile.isFile()) {
				System.out.println("El parámetro no es un archivo");
				return;
			}
			
			File tempFile = new File(inFile.getAbsolutePath() + ".tmp");
			
			BufferedReader br = new BufferedReader(new FileReader(file));
			PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
			
			String line = null;
			
			while((line = br.readLine()) != null) {
				if(!line.trim().equals(lineaABorrar)) {
					pw.println(line);
					pw.flush();
				}
				
			}
			pw.close();
			br.close();
			
			if(!inFile.delete()) {
				System.out.println("No se ha podido borrar del archivo");
				return;
			}
			
			if(!tempFile.renameTo(inFile)) {
				System.out.println("No se ha podido renombrar el archivo");
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		
		}  catch (IOException e) {
			e.printStackTrace();
		}
	}

}
