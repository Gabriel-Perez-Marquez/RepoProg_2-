package ejercicio02;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		int numNotas = 10;
		
		double [] notas = new double[numNotas];
		
		int numAprobados = 0;
		int numSuspensos= 0;
		double notaMedia;
		
		 
		for(int i = 0; i<numNotas; i++) {
			notas[i] = (Math.random() * 10) + 0;
		}
		
		
		for (int i = 0; i< numNotas; i++) {
			if(notas[i] >= 5) {
				numAprobados++;
			} else if (notas[i] <= 5) {
				numSuspensos--;
			}
		}
		 
		
		 
	}

}
