package ejercicio01TipoExamen;

public class Apartamento extends Habitacion{

	
	private double precioServicioLimp;

	public Apartamento(double precioBase, boolean ocupada, String nombre, int numDiasReserva, int numOcupantes,
			double precioServicioLimp) {
		super(precioBase, ocupada, nombre, numDiasReserva, numOcupantes);
		this.precioServicioLimp = precioServicioLimp;
	}

	public double getPrecioServicioLimp() {
		return precioServicioLimp;
	}

	public void setPrecioServicioLimp(double precioServicioLimp) {
		this.precioServicioLimp = precioServicioLimp;
	}

	@Override
	public String toString() {
		return "Apartamento [precioServicioLimp=" + precioServicioLimp + ", toString()=" + super.toString() + "]";
	}

	@Override
	public double calcularPrecioHab() {
		// TODO Auto-generated method stub
		return super.calcularPrecioHab() + precioServicioLimp;
	}
	
	
	
	
	
	
}
