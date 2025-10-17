package ejercicio01TipoExamen;

public class Suite extends Habitacion {

	private double metrosCuadrados;
	private double dineroServicioHab;
	
	
	public Suite(double precioBase, boolean ocupada, String nombre, int numDiasReserva, int numOcupantes,
			double metrosCuadrados, double dineroServicioHab) {
		super(precioBase, ocupada, nombre, numDiasReserva, numOcupantes);
		this.metrosCuadrados = metrosCuadrados;
		this.dineroServicioHab = dineroServicioHab;
	}


	public double getMetrosCuadrados() {
		return metrosCuadrados;
	}


	public void setMetrosCuadrados(double metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}


	public double getDineroServicioHab() {
		return dineroServicioHab;
	}


	public void setDineroServicioHab(double dineroServicioHab) {
		this.dineroServicioHab = dineroServicioHab;
	}



	@Override
	public String toString() {
		return "Suite [metrosCuadrados=" + metrosCuadrados + ", dineroServicioHab=" + dineroServicioHab + ", toString()=" + super.toString() + "]";
	}


	@Override
	public double calcularPrecioHab(double descuento) {
		double cien = 100;
		return super.calcularPrecioHab(descuento) + dineroServicioHab +(descuento*getPrecioBase()/cien);
	}
	
	
	
	
	
	
	
}
