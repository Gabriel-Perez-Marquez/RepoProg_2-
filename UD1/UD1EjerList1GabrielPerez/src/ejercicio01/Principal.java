package ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		int codigo=1234;
		int respuesta;
		String respStr;
		int cero=0;
		int numIntentosDisp=4;
		boolean acierto = false;
		
		while(numIntentosDisp > cero && !acierto ) {
			System.out.println("Introduce el código (4 digitos)");
			System.out.println("Tienes " + numIntentosDisp + " intentos disponibles");
			respStr = sc.nextLine();
			respuesta = Integer.parseInt(respStr);
			
			if (respStr.length() != 4 ) {
				System.out.println("Debe ser un código de 4 digitos");
			} else {
				if (respuesta == codigo) {
					System.out.println("Código correcto. Puerta abierta!");
					acierto = true;
				} else {
					System.out.println("Código incorrecto");
					numIntentosDisp--;					
				}
			
			}
					
		}
		
		if(numIntentosDisp == cero) {
			System.out.println("Has alcanzado el número de intentos. Acceso bloqueado");
		}
		
		
		sc.close();
		
	}
}
