package ejercicio05;

public class ContrasenaInseguraException extends Exception{
	
	public ContrasenaInseguraException () {
		super();
	}
	
	public ContrasenaInseguraException(String info) {
		super(info);
	}

}
