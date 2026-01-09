package ejercicio04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Empleado> empleados = new ArrayList<Empleado>();
		
		Empleado e1 = new Empleado(1L, "Juanillo", "Limpieza", 700, true, 4);
		
		empleados.add(e1);
		
		Administracion a = new Administracion(empleados);
		
		int opcion= -1;
		double salarioPromedio;
		String nombreEmpleado;
		String departamento;
		int aniosAnt;
		Scanner sc = new Scanner(System.in);
		
		do {
			 System.out.println();
			 System.out.println("Menú");
			 System.out.println("----");
			 System.out.println("0. Salir");
			 System.out.println("1. Obtener empleados activos con salario superior al promedio general");
			 System.out.println("2. Buscar un empleado por nombre");
			 System.out.println("3. Obtener el empleado con mayor salario por departamento");
			 System.out.println("4. Calcular el salario total de empleados activos con más de X años");
			 System.out.println("5. Obtener un ranking ordenado de empleados por salario y antigüedad");
			 
			 opcion = Integer.parseInt(sc.nextLine());
			 
			 switch (opcion) {
				 case 0:
					 System.out.println("Saliendo...");
					 break;
					 
				case 1: 
					System.out.println("Diga cuál es el promedio general de salario: ");
					salarioPromedio = Double.parseDouble(sc.nextLine());
					System.out.println("Los empleados con un salario mayor a "+ salarioPromedio + " € son:\n" +a.obtenerEmpActivoSalarioMayor(salarioPromedio));
					break;
					
					
				case 2:
					System.out.println("Diga el nombre del empleado que quiere buscar: ");
					nombreEmpleado = sc.nextLine();
					if(a.buscarPorNombre(nombreEmpleado).isPresent()) {
						System.out.println(a.buscarPorNombre(nombreEmpleado));
					} else {
						System.out.println("No existe ningún empleado con ese nombre");
					}
					break;
					
				case 3:
					System.out.println("Diga el departamento del que quiere ver que empleado tiene mayor salario: ");
					departamento = sc.nextLine();
					System.out.println("El empleado con mayor salario del departamento de "+ departamento +" es: \n" + a.obtenerEmpleadoMayorSalarioPorDepart(departamento));
					break;
					
				case 4:
					System.out.println("Diga cuántos años de experiencia tienen que tener los empleados para calcular su salario: ");
					aniosAnt = Integer.parseInt(sc.nextLine());
					System.out.println(a.calcularSalarioEmpActConAnios(aniosAnt));
					break;
					
				case 5:
					break;
					
				default:
					throw new IllegalArgumentException("Unexpected value: " + opcion);
			}
			 
		} while (opcion != 0);
		sc.close();
		
		
		
		
		
	}

}
