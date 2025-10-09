package ejercicio02TipoExamen;

public class Espada extends Producto{

	private String tipo;

	public Espada(double precioBase, int numProductos, String nombre, boolean vendido, String tipo) {
		super(precioBase, numProductos, nombre, vendido);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Espada [tipo=" + tipo + ", toString()=" + super.toString() + "]";
	}

	@Override
	public double calcularPVP(double porcentaje) {
		double precioFinal = 0;
		int cien = 100;
		
		precioFinal = getPrecioBase() + (porcentaje * getPrecioBase() / cien);
		
		return precioFinal;
	}
	
	
	
	
	
}
