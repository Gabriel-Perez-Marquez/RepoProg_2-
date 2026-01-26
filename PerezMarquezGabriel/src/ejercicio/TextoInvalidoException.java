package ejercicio;

public class TextoInvalidoException extends RuntimeException{
	
	public TextoInvalidoException() {
		super();
	}
	
	public TextoInvalidoException(String info) {
		super(info);
	}

}
