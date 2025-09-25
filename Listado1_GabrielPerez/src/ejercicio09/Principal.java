package ejercicio09;

import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/* Crea una clase dado con algun metodo como lanzar que devuelva un numero alatorio entra 1 y 6. 
		 * Simula 10 tiradas y muestra la puntuacion mayor, la menor y que numero se ha repetido mas veces*/ 
		
		
		Dado dado = new Dado();
		int num;
		int tam = 10;
		int [] numerosTiradas = new int[tam];
		int[] frecuencias = new int[6];
		List<Integer> masRepetidos;
		
		for(int i = 0; i< tam; i++) {
			num = dado.lanzarDado();
			frecuencias[num - 1]++;
				
			numerosTiradas[i] = num;
			System.out.println(num);
		}
		
		System.out.println();
		System.out.println("El número mayor es "+ dado.buscarMayor(numerosTiradas));
		System.out.println("\nEl número menor es "+ dado.buscarMenor(numerosTiradas));
		
		
		masRepetidos = dado.buscarMasRepetidos(frecuencias, dado.encontrarMaximaFrecuencia(frecuencias));
		
		
		if (masRepetidos.size() == 1) {
            System.out.println("\nNúmero que más se repite: " + masRepetidos.get(0) + " (" + dado.encontrarMaximaFrecuencia(frecuencias) + " veces)");
        } else {
            System.out.println("\nNúmeros que más se repiten: " + masRepetidos + " (" + dado.encontrarMaximaFrecuencia(frecuencias) + " veces cada uno)");
        }
		
		
		
		
	}

}
