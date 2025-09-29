package ejercicio09;

import java.util.ArrayList;
import java.util.List;

public class Dado {

	public Dado() {
		super();
	}
	
	public int lanzarDado() {
		int num;
		
		num = (int) (Math.random() * (6 - 1 + 1)) + 1;
		return num;
		
	}
	
	public int buscarMayor (int [] numeros) {
		int mayor = numeros[0];
		for (int i : numeros) {
			if(i > mayor) {
				mayor = i;
			}
		} 
		
		return mayor;
	} 
	
	
	public int buscarMenor (int [] numeros) {
		int menor = numeros[0];
		for (int i : numeros) {
			if(i < menor) {
				menor = i;
			}
		} 
		
		return menor;
	}
	
	 
	// Encontrar la frecuencia máxima
    public int encontrarMaximaFrecuencia (int [] frecuencias) {
    	int maxFrecuencia = 0;
        for (int i = 0; i < 6; i++) {
            if (frecuencias[i] > maxFrecuencia) {
                maxFrecuencia = frecuencias[i];
            }
        }
        
        return maxFrecuencia;

    }
    
    
    
 // Recoger los números que tienen esa frecuencia máxima (puede haber empate)
    public List<Integer> buscarMasRepetidos(int [] frecuencias, int maxFrecuencia){
    	List<Integer> masRepetidos= new ArrayList<>();
    	for (int i = 0; i < 6; i++) {
            if (frecuencias[i] == maxFrecuencia) {
                masRepetidos.add(i + 1);
            }
        }
    	
    	return masRepetidos;
    }
    
	
}
