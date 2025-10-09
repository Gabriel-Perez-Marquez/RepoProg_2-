package ejercicio11;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Programador p1 = new Programador(20, 27, 160, 7, 25);
		
		
		Vendedor v1 = new Vendedor(20, 27, 10, 160, 7, 100);
		
		
		System.out.println(p1.calcularSueldo());
		System.out.println(v1.calcularSueldo());
		
	}

}
