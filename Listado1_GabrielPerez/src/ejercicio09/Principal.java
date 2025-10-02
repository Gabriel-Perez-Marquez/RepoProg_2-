package ejercicio09;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/* Crea una clase dado con algun metodo como lanzar que devuelva un numero alatorio entra 1 y 6. 
		 * Simula 10 tiradas y muestra la puntuacion mayor, la menor y que numero se ha repetido mas veces*/ 
		
		
		int numMax = 1;
		int numMin = 6;
		
		Dado dado = new Dado(numMax, numMin, new ArrayList<Integer>(), new int[6]);
		List<Integer> masRepetidos;
		
		dado.lanzarDado();
		
		for(int i : dado.getTiradas()) {
			System.out.println(i);
		}
		
		
		System.out.println();
		System.out.println("El número mayor es "+ dado.buscarMayor());
		System.out.println("\nEl número menor es "+ dado.buscarMenor());
		
		
		masRepetidos = dado.buscarMasRepetidos(dado.encontrarMaximaFrecuencia());
		
		
		if (masRepetidos.size() == 1) {
            System.out.println("\nNúmero que más se repite: " + masRepetidos.get(0) + " (" + dado.encontrarMaximaFrecuencia() + " veces)");
        } else {
            System.out.println("\nNúmeros que más se repiten: " + masRepetidos + " (" + dado.encontrarMaximaFrecuencia() + " veces cada uno)");
        }
		
		
		
		
	}

}
