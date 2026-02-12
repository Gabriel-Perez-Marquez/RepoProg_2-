package ejercicio04;

public class Producto {

	
	private double precioUni;
	private String nombre;
	private int codigoId;
	
	
	//Constructor
	public Producto(double precioUni, String nombre, int codigoId) {
		super();
		this.precioUni = precioUni;
		this.nombre = nombre;
		this.codigoId = codigoId;
	}


	
	
	//getter and setter
	public double getPrecioUni() {
		return precioUni;
	}


	public void setPrecioUni(double precioUni) {
		this.precioUni = precioUni;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getCodigoId() {
		return codigoId;
	}


	public void setCodigoId(int codigoId) {
		this.codigoId = codigoId;
	}



	//To String 
	@Override
	public String toString() {
		return "Producto [precioUni=" + precioUni + ", nombre=" + nombre + ", codigoId=" + codigoId + "]";
	}
	
	
	
	
	//Metodos
	public double calcularPVP(double iva, double descuento, int topeCaducidad) {
		return precioUni+(precioUni*iva/100);
	}
	
	
	
	
	
	
}
