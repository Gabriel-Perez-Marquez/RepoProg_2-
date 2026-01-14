package ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int respuesta = -1;
		int num1 = 0; 
		int num2 = 0;
		
		do {
			try {
                System.out.println("\nSeleccione una operación:");
                System.out.println("1. Sumar");
                System.out.println("2. Restar");
                System.out.println("3. Multiplicar");
                System.out.println("4. Dividir");
                System.out.println("5. Raíz Cuadrada");
                System.out.println("6. Salir");
                System.out.print("Opción: ");
                
                respuesta = Integer.parseInt(sc.nextLine());
                
                if (respuesta == 6) {
                    System.out.println("Saliendo...");
                    break; 
                }

                if (respuesta >= 1 && respuesta <= 4) {
                    System.out.println("Diga el primer número");
                    num1 = Integer.parseInt(sc.nextLine());
                    System.out.println("Diga el segundo número");
                    num2 = Integer.parseInt(sc.nextLine());
                } else if (respuesta == 5) {
                    System.out.println("Diga el número para la raíz");
                    num1 = Integer.parseInt(sc.nextLine());
                }
                
                switch(respuesta) {
                    case 1:
                        System.out.println("La suma es: " + (num1 + num2));
                        break;
                        
                    case 2:
                        System.out.println("La resta es: " + (num1 - num2));
                        break;
                        
                    case 3:
                        System.out.println("La multiplicación es: " + (num1 * num2));
                        break;
                        
                    case 4:
                        System.out.println("La división entera es: " + (num1 / num2));
                        break;
                        
                    case 5:
                        if (num1 < 0) {
                            throw new ArithmeticException("Raíz negativa");
                        }
                        System.out.println("La raíz cuadrada (parte entera) es: " + (int)Math.sqrt(num1));
                        break;
                        
                    default:
                        System.out.println("Opción no válida.");
                        break;
                }

            } catch (NumberFormatException e) {
                System.out.println("Error: Has introducido letras o caracteres no válidos. Solo números enteros.");
            } catch (ArithmeticException e) {
                if (e.getMessage() != null && e.getMessage().equals("Raíz negativa")) {
                    System.out.println("Error Matemático: No se puede hacer la raíz de un número negativo.");
                } else {
                    System.out.println("Error Matemático: No se puede dividir por cero.");
                }
                
            }
	        
		} while (respuesta != 0);
		sc.close();
		
	
	
		

	}
}
