package ejercicio11;

public class Vendedor extends PuestoTrabajo {
	
	private int numVentas;
	private double horas;
	private double horasExtra;
	private double extraVenta;
	
	
	public Vendedor(double precioHora, double precioHoraExtra, int numVentas, double horas, double horasExtra,
			double extraVenta) {
		super(precioHora, precioHoraExtra);
		this.numVentas = numVentas;
		this.horas = horas;
		this.horasExtra = horasExtra;
		this.extraVenta = extraVenta;
	}

	

	public int getNumVentas() {
		return numVentas;
	}

	public void setNumVentas(int numVentas) {
		this.numVentas = numVentas;
	}

	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		this.horas = horas;
	}

	public double getHorasExtra() {
		return horasExtra;
	}

	public void setHorasExtra(double horasExtra) {
		this.horasExtra = horasExtra;
	}

	public double getExtraVenta() {
		return extraVenta;
	}

	public void setExtraVenta(double extraVenta) {
		this.extraVenta = extraVenta;
	}
	


	@Override
	public String toString() {
		return "Vendedor [numVentas=" + numVentas + ", horas=" + horas + ", horasExtra=" + horasExtra + ", extraVenta="
				+ extraVenta + ", toString()=" + super.toString() + "]";
	}



	@Override
	public double calcularSueldo() {
		double sueldo = 0;
		
		sueldo += (horas*getPrecioHora() + horasExtra*getPrecioHoraExtra()) + (extraVenta * numVentas);
		
		
		return sueldo;
	}
	
	
	
	
	
	
	
}
