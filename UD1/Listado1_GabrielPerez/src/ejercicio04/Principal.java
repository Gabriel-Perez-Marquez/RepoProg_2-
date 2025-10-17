package ejercicio04;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int dias = 0;

        System.out.println("Dime el número de días que quedan para el evento: ");
        dias = Integer.parseInt(sc.nextLine());
        
        while(dias < 0) {
        	System.out.println("No puede ser un número negativo");
        	System.out.println("Dime el número de días que quedan para el evento: ");
            dias = Integer.parseInt(sc.nextLine());
        }
        

        if (dias == 0) {
            System.out.println("¡Hoy es el evento!");
            return;
        }

        for (int i = dias; i > 0; i--) {
                System.out.println("Quedan " + i + " días para el evento.");
        }

        System.out.println("¡Hoy es el evento!");
    }
}