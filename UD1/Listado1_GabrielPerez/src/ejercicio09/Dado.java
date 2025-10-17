package ejercicio09;

import java.util.ArrayList;
import java.util.List;

public class Dado {

	private int numMax;
	private int numMin;
	private List<Integer> tiradas;
	private int [] frecuencias;

	public Dado(int numMax, int numMin, List<Integer> tiradas, int [] frecuencias) {
		super();
		this.numMax = numMax;
		this.numMin = numMin;
		this.tiradas = tiradas;
		this.frecuencias = frecuencias;
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
	
	

	public List<Integer> getTiradas() {
		return tiradas;
	}

	public void setTiradas(List<Integer> tiradas) {
		this.tiradas = tiradas;
	}

	
	public int[] getFrecuencias() {
		return frecuencias;
	}

	public void setFrecuencias(int[] frecuencias) {
		this.frecuencias = frecuencias;
	}

	
	
	public List<Integer> lanzarDado() {
		int num;
		int numTiradas = 10;
		for(int i = 0; i < numTiradas; i++) {
			num = (int) (Math.random() * (numMax - numMin + 1)) + numMin;
			tiradas.add(num);
			frecuencias[num - 1]++;
			
		}
		return tiradas;

	}

	public int buscarMayor() {
		int mayor = tiradas.get(0);
		for (int i : tiradas) {
			if (i > mayor) {
				mayor = i;
			}
		}

		return mayor;
	}

	public int buscarMenor() {
		int menor = tiradas.get(0);
		for (int i : tiradas) {
			if (i < menor) {
				menor = i;
			}
		}

		return menor;
	}

	public int encontrarMaximaFrecuencia() {
		int maxFrecuencia = 0;
		for (int i = 0; i < frecuencias.length; i++) {
			if (frecuencias[i] > maxFrecuencia) {
				maxFrecuencia = frecuencias[i];
			}
		}

		return maxFrecuencia;

	}

	public List<Integer> buscarMasRepetidos(int maxFrecuencia) {
		List<Integer> masRepetidos = new ArrayList<>();
		for (int i = 0; i < frecuencias.length; i++) {
			if (frecuencias[i] == maxFrecuencia) {
				masRepetidos.add(i + 1);
			}
		}

		return masRepetidos;
	}

	
	
//	public int competirContraOtroDato(Dado dado2, int rondas) {
//		dado2.setTiradas(dado2.lanzarDado());
//	}
	
	
}
