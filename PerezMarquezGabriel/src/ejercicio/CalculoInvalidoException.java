package ejercicio;

public class CalculoInvalidoException extends RuntimeException{

	public CalculoInvalidoException() {
		super();
	}
	
	public CalculoInvalidoException(String info) {
		super(info);
	}
	
}
