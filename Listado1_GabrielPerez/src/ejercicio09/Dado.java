package ejercicio09;

import java.util.ArrayList;
import java.util.List;

public class Dado {

	private int numMax;
	private int numMin;

	public Dado(int numMax, int numMin) {
		super();
		this.numMax = numMax;
		this.numMin = numMin;
	}

	public int getNumMax() {
		return numMax;
	}

	public void setNumMax(int numMax) {
		this.numMax = numMax;
	}

	public int getNumMin() {
		return numMin;
	}

	public void setNumMin(int numMin) {
		this.numMin = numMin;
	}

	public int lanzarDado() {
		int num;

		num = (int) (Math.random() * (numMax - numMin + 1)) + numMin;
		return num;

	}

	public int buscarMayor(int[] numeros) {
		int mayor = numeros[0];
		for (int i : numeros) {
			if (i > mayor) {
				mayor = i;
			}
		}

		return mayor;
	}

	public int buscarMenor(int[] numeros) {
		int menor = numeros[0];
		for (int i : numeros) {
			if (i < menor) {
				menor = i;
			}
		}

		return menor;
	}

	public int encontrarMaximaFrecuencia(int[] frecuencias) {
		int maxFrecuencia = 0;
		for (int i = 0; i < 6; i++) {
			if (frecuencias[i] > maxFrecuencia) {
				maxFrecuencia = frecuencias[i];
			}
		}

		return maxFrecuencia;

	}

	public List<Integer> buscarMasRepetidos(int[] frecuencias, int maxFrecuencia) {
		List<Integer> masRepetidos = new ArrayList<>();
		for (int i = 0; i < 6; i++) {
			if (frecuencias[i] == maxFrecuencia) {
				masRepetidos.add(i + 1);
			}
		}

		return masRepetidos;
	}

}
