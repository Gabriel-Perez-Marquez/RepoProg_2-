package ejercicio11;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Programador p1 = new Programador(20, 27, 160, 7, 25);
		
		
		Vendedor v1 = new Vendedor(20, 27, 10, 160, 7, 100);
		
		Jefe j1 = new Jefe(30, 50, 150, 10, 400);
		
		
		System.out.printf("Sueldo del programador: %.2f € \n", p1.calcularSueldo());
		System.out.printf("Sueldo del vendedor: %.2f € \n", v1.calcularSueldo());
		System.out.printf("Sueldo del jefe: %.2f € \n", j1.calcularSueldo());
	}

}
