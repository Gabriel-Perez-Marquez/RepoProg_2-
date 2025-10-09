package ejercicio02TipoExamen;

public class Movil extends Producto {

	private String marca;
	private int almacenamiento;
	private int ram;
	
	
	public Movil(double precioBase, int numProductos, String nombre, boolean vendido, String marca, int almacenamiento,
			int ram) {
		super(precioBase, numProductos, nombre, vendido);
		this.marca = marca;
		this.almacenamiento = almacenamiento;
		this.ram = ram;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public int getAlmacenamiento() {
		return almacenamiento;
	}


	public void setAlmacenamiento(int almacenamiento) {
		this.almacenamiento = almacenamiento;
	}


	public int getRam() {
		return ram;
	}


	public void setRam(int ram) {
		this.ram = ram;
	}


	@Override
	public String toString() {
		return "Movil [marca=" + marca + ", almacenamiento=" + almacenamiento + ", ram=" + ram + ", toString()="
				+ super.toString() + "]";
	}


	@Override
	public double calcularPVP(double porcentaje) {
		double precioFinal = 0;
		int cien = 100;
		
		precioFinal = getPrecioBase() + (porcentaje * getPrecioBase() / cien);
		
		return precioFinal;
	}
	
	
	
	
	
	
	
	
}