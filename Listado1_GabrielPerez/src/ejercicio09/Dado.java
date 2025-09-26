package ejercicio09;

public class Dado {

	public Dado() {
		super();
	}
	
	public int lanzarDado() {
		int num;
		
		num = (int) (Math.random() * (6 - 1 + 1)) + 1;
		return num;
		
	}
	
	public int buscarMayor (int [] numeros) {
		int mayor = numeros[0];
		for (int i : numeros) {
			if(i > mayor) {
				mayor = i;
			}
		} 
		
		return mayor;
	} 

}
