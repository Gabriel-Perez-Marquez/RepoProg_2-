package ejercicio01TipoExamen;

public class Suite extends Habitacion {

	private double metrosCuadrados;
	private double dineroServicioHab;
	private double descuento;
	
	
	public Suite(double precioBase, boolean ocupada, String nombre, int numDiasReserva, int numOcupantes,
			double metrosCuadrados, double dineroServicioHab, double descuento) {
		super(precioBase, ocupada, nombre, numDiasReserva, numOcupantes);
		this.metrosCuadrados = metrosCuadrados;
		this.dineroServicioHab = dineroServicioHab;
		this.descuento = descuento;
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


	public double getDescuento() {
		return descuento;
	}


	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}


	@Override
	public String toString() {
		return "Suite [metrosCuadrados=" + metrosCuadrados + ", dineroServicioHab=" + dineroServicioHab + ", descuento="
				+ descuento + ", toString()=" + super.toString() + "]";
	}


	@Override
	public double calcularPrecioHab() {
		double cien = 100;
		return super.calcularPrecioHab() + dineroServicioHab +(descuento*getPrecioBase()/cien);
	}
	
	
	
	
	
	
	
}
