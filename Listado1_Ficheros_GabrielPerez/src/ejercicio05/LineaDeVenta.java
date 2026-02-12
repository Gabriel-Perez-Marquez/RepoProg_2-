package ejercicio05;

public class LineaDeVenta {
	
	private Producto p;
	private int cantidad;
	
	
	
	//Constructor
	public LineaDeVenta(Producto p, int cantidad) {
		super();
		this.p = p;
		this.cantidad = cantidad;
	}



	
	//Getter and setter
	public Producto getP() {
		return p;
	}



	public void setP(Producto p) {
		this.p = p;
	}



	public int getCantidad() {
		return cantidad;
	}



	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	

	
	//To String 
	@Override
	public String toString() {
		return "LineaDeVenta [p=" + p + ", cantidad=" + cantidad + "]";
	}
	
	
	
	
	//Metodos
	public double calcularSubtotal(double iva, double descuento, int topeCantidad ) {
		return p.calcularPVP(iva, descuento, topeCantidad)*cantidad;
	}
	
	
	
	
	
	
	
	
	

}
