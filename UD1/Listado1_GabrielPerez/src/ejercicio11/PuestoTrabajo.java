package ejercicio11;

public abstract class PuestoTrabajo {
	
	private double precioHora;
	private double precioHoraExtra;
	
	
	
	
	public PuestoTrabajo(double precioHora, double precioHoraExtra) {
		super();
		this.precioHora = precioHora;
		this.precioHoraExtra = precioHoraExtra;
	}


	public double getPrecioHora() {
		return precioHora;
	}


	public void setPrecioHora(double precioHora) {
		this.precioHora = precioHora;
	}


	public double getPrecioHoraExtra() {
		return precioHoraExtra;
	}


	public void setPrecioHoraExtra(double precioHoraExtra) {
		this.precioHoraExtra = precioHoraExtra;
	}



	@Override
	public String toString() {
		return "PuestoTrabajo [precioHora=" + precioHora + ", precioHoraExtra=" 
				+ precioHoraExtra +"]";
	}
	
	
	
	
	public abstract double calcularSueldo();
	
	
	

}
