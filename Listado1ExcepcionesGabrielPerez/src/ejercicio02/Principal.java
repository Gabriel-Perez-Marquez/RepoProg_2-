package ejercicio02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int respuesta = -1;
		Scanner sc = new Scanner(System.in);
		double grados;
		Conversor c = new Conversor();
		
		do {
			try {
				
				System.out.println("Bienvenido al conversor de grados celsius a fahrenheit");
				System.out.println("Diga los grados que quiere convertir");
				grados=Double.parseDouble(sc.nextLine());
				
				System.out.println(c.convertirTemperatura(grados));
				
				
			} catch (TemperaturaBajaException e) {
				System.err.println("La temperatura no puede ser menor de -273 ºC");
			} catch (NumberFormatException e) {
				System.err.println("Error en el formato que ha introducido los datos");
			} catch (Exception e) {
				System.err.println("Ha ocurrido un error");
			} 
			
		} while (respuesta != 0);
		
		sc.close();

	}

}
