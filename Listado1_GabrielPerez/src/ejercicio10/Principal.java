package ejercicio10;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int opcion;
        Figura figura;


        do {
            System.out.println("\n--- CALCULADORA GEOMÉTRICA ---");
            System.out.println("1. Calcular área de un círculo");
            System.out.println("2. Calcular área de un rectángulo");
            System.out.println("3. Calcular área y volumen de una esfera");
            System.out.println("4. Calcular área y volumen de un cubo");
            System.out.println("0. Salir");
            System.out.println("Selecciona una opción: ");
            opcion = sc.nextInt();

            
            switch (opcion) {
                case 1:
                    System.out.println("Introduce el radio del círculo: ");
                    double radioC = sc.nextDouble();
                    figura = new Circulo(radioC);
                    System.out.printf("Área del círculo: %.2f", figura.calcularArea());
                    break;

                case 2:
                    System.out.println("Introduce la base del rectángulo: ");
                    double base = sc.nextDouble();
                    System.out.println("Introduce la altura del rectángulo: ");
                    double altura = sc.nextDouble();
                    figura = new Rectangulo(base, altura);
                    System.out.printf("Área del rectángulo: %.2f", figura.calcularArea());
                    break;

                case 3:
                    System.out.println("Introduce el radio de la esfera: ");
                    double radioE = sc.nextDouble();
                    figura = new Esfera(radioE);
                    System.out.printf("Área de la esfera: %.2f", figura.calcularArea());
                    System.out.printf("Volumen de la esfera: %.2f", figura.calcularVolumen());
                    break;

                case 4:
                    System.out.println("Introduce el lado del cubo: ");
                    double lado = sc.nextDouble();
                    figura = new Cubo(lado);
                    System.out.printf("Área del cubo: %.2f", figura.calcularArea());
                    System.out.printf("Volumen del cubo: %.2f", figura.calcularVolumen());
                    break;

                case 0:
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 0);

        sc.close();

	}

}
