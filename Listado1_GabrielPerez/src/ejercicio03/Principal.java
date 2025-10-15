package ejercicio03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double respuesta = 0;
		Scanner sc = new Scanner(System.in);
		double porcentajeDescuento = 10;
		double precioFinal;
		double cien = 100;
		
		
		System.out.println("Bienvenido a mi programa que calcula el precio de los productos "
				+ "cuyo precio tú le pases");
		System.out.println("Para parar el programa introduce 0");
		
		
		do {
			System.out.println("Diga el precio del producto");
			respuesta = Double.parseDouble(sc.nextLine());
			
			if(respuesta > 100) {
				precioFinal = respuesta - (respuesta*porcentajeDescuento/cien);
				System.out.printf("El precio final del producto es de %.2f €", precioFinal);
			} else {
				System.out.printf("El precio final del producto es de %.2f €", respuesta);
			}
			
		} while (respuesta != 0);
		
		sc.close();
	}

}
