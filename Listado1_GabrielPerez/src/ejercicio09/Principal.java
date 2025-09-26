package ejercicio09;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/* Crea una clase dado con algun metodo como lanzar que devuelva un numero alatorio entra 1 y 6. 
		 * Simula 10 tiradas y muestra la puntuacion mayor, la menor y que numero se ha repetido mas veces*/ 
		
		
		Dado dado = new Dado();
		int num;
		int tam = 5;
		int [] numeros = new int[tam];
		
		
		for(int i = 0; i< tam; i++) {
			num = dado.lanzarDado();
			
			numeros[i] = num;
			System.out.println(num);
		}
		
	}

}
