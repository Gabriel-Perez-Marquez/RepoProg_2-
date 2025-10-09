package ejercicio02TipoExamen;

public abstract class Producto {
	
	private double precioBase;
	private int numProductos;
	private String nombre;
	private boolean vendido;
	
	
	public Producto(double precioBase, int numProductos, String nombre, boolean vendido) {
		super();
		this.precioBase = precioBase;
		this.numProductos = numProductos;
		this.nombre = nombre;
		this.vendido = vendido;
	}


	public double getPrecioBase() {
		return precioBase;
	}


	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}


	public int getNumProductos() {
		return numProductos;
	}


	public void setNumProductos(int numProductos) {
		this.numProductos = numProductos;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public boolean isVendido() {
		return vendido;
	}


	public void setVendido(boolean vendido) {
		this.vendido = vendido;
	}


	@Override
	public String toString() {
		return "Producto [precioBase=" + precioBase + ", numProductos=" + numProductos + ", nombre=" + nombre
				+ ", vendido=" + vendido + "]";
	}
	
	
	
	public abstract double calcularPVP(double porcentaje);
	
	
}
