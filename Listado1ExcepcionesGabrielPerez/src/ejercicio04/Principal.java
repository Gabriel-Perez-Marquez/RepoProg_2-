package ejercicio04;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 0;
		int b = 0;
		boolean valido = false;
		Scanner sc = new Scanner(System.in);
		Calculador c = new Calculador();
		

		System.out.println("Si quiere salir del programa introduzca -1");
		
		do {
			try {
				System.out.println("Introduce a continuacion dos números que no sumen más de 10");
				System.out.println("Introduzca el primer número:");
				a = Integer.parseInt(sc.nextLine());
				System.out.println("Introduzca el segundo número:");
				b = Integer.parseInt(sc.nextLine());
				System.out.println(c.calcularSuma(a, b));
				valido = true;
			} catch (SumaIncorrectaException e) {
				System.err.println(e.getMessage());
			}catch (NumberFormatException e) {
				System.err.println("El valor introducido no es valido");
			} catch (Exception e) {
				System.err.println("Ha ocurrido un problema inesperado");
			}
		} while (!valido);
		sc.close();

	}

}
