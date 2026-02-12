package ejercicio05;

public class Electronica extends Producto {

	
	private boolean lujo;

	
	//Constructor
	public Electronica(double precioUni, String nombre, int codigoId, boolean lujo) {
		super(precioUni, nombre, codigoId);
		this.lujo = lujo;
	}

	

	//getter and setter
	public boolean isLujo() {
		return lujo;
	}


	public void setLujo(boolean lujo) {
		this.lujo = lujo;
	}


	
	//To String 
	@Override
	public String toString() {
		return "Electronica [lujo=" + lujo + "]";
	}



	//Metodos
	public double calcularPVP(double iva, double descuento, int topeCaducidad) {
		if(lujo) {
			return super.calcularPVP(iva, descuento, topeCaducidad)+(super.calcularPVP(iva, descuento, topeCaducidad)*descuento/100);
		}else {
			return super.calcularPVP(iva, descuento, topeCaducidad);
		}
		
	}
	
	
	
}
