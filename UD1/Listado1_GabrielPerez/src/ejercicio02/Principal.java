package ejercicio02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		int numNotas = 10;
		
		double [] notas = new double[numNotas];
		
		int numAprobados = 0;
		int numSuspensos= 0;
		double suma = 0;
		double notaMedia;
		
		 
		for(int i = 0; i<numNotas; i++) {
			notas[i] = (Math.random() * 10) + 0;
		}
		
		
		for (int i = 0; i< notas.length; i++) {
			if(notas[i] >= 5) {
				numAprobados++;
			} else if (notas[i] <= 5) {
				numSuspensos--;
			}
		}
		
		for(int i = 0; i< notas.length; i++) {
			suma += notas[i];
		}
		notaMedia = suma / notas.length;
		
		System.out.println("El número de aprobados de todas las notas es de " + numAprobados + " aprobados");
		System.out.println("El número de suspensos de todas las notas es de " + numSuspensos + " aprobados");
		System.out.printf("La nota media es de un %.2f ", notaMedia);
		 
		
		sc.close();
		 
	}

}
