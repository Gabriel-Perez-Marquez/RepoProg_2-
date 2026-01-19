package ejercicio04;

public class Calculador {
	
	public Calculador() {
		
	}
	
	
	public double calcularSuma (int a, int b) throws SumaIncorrectaException {
		int suma;
		suma = a + b;
		if(suma > 10) {
			throw new SumaIncorrectaException("La suma de los dos números no puede ser mayor que 10");
		}
		
		return suma;
	}

}
