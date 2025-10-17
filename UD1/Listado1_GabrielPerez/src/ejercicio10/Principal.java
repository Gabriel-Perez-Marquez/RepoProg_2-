package ejercicio10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int opcion;
        Figura figura;
        double lado;
        double radioE;
        double altura;
        double base;
        double radioC;
        
        double sumaAreas = 0;
        
        Circulo c1;
        Rectangulo r1;
        Esfera e1;
        Cubo cu1;
        
        Figura c2 = new Circulo(10);
        Figura r2 = new Rectangulo(10, 10);
        Figura e2 = new Esfera(10);
        Figura cu2 = new Cubo(10);
        
        List<Figura> figuras = new ArrayList<Figura>();
        
        figuras.add(c2);
        figuras.add(r2);
        figuras.add(e2);
        figuras.add(cu2);
        
        


        do {
            System.out.println("\n--- CALCULADORA GEOMÉTRICA ---");
            System.out.println("1. Calcular área de un círculo");
            System.out.println("2. Calcular área de un rectángulo");
            System.out.println("3. Calcular área y volumen de una esfera");
            System.out.println("4. Calcular área y volumen de un cubo");
            System.out.println("5. Calcular media de áreas");
            System.out.println("0. Salir");
            System.out.println("Selecciona una opción: ");
            opcion = sc.nextInt();

            
            switch (opcion) {
                case 1:
                    System.out.println("Introduce el radio del círculo: ");
                    radioC = sc.nextDouble();
                    c1 = new Circulo(radioC);
                    figuras.add(c1);
                    System.out.printf("Área del círculo: %.2f", c1.calcularArea());
                    break;

                case 2:
                    System.out.println("Introduce la base del rectángulo: ");
                    base = sc.nextDouble();
                    System.out.println("Introduce la altura del rectángulo: ");
                    altura = sc.nextDouble();
                    r1 = new Rectangulo(base, altura);
                    figuras.add(r1);
                    System.out.printf("Área del rectángulo: %.2f", r1.calcularArea());
                    break;

                case 3:
                    System.out.println("Introduce el radio de la esfera: ");
                    radioE = sc.nextDouble();
                    e1 = new Esfera(radioE);
                    figuras.add(e1);
                    System.out.printf("Área de la esfera: %.2f", e1.calcularArea());
                    System.out.printf("Volumen de la esfera: %.2f", e1.calcularVolumen());
                    break;

                case 4:
                    System.out.println("Introduce el lado del cubo: ");
                    lado = sc.nextDouble();
                    cu1 = new Cubo(lado);
                    figuras.add(cu1);
                    System.out.printf("Área del cubo: %.2f", cu1.calcularArea());
                    System.out.printf("Volumen del cubo: %.2f", cu1.calcularVolumen());
                    break;

                 
                case 5:
                	
                 
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
