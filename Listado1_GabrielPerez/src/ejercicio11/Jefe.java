package ejercicio11;

public class Jefe extends PuestoTrabajo	{
	
	private double horas;
	private double horasExtra;
	private double extraJefe;
	
	
	public Jefe(double precioHora, double precioHoraExtra, double horas, double horasExtra, double extraJefe) {
		super(precioHora, precioHoraExtra);
		this.horas = horas;
		this.horasExtra = horasExtra;
		this.extraJefe = extraJefe;
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


	public double getExtraJefe() {
		return extraJefe;
	}


	public void setExtraJefe(double extraJefe) {
		this.extraJefe = extraJefe;
	}


	@Override
	public String toString() {
		return "Jefe [horas=" + horas + ", horasExtra=" + horasExtra + ", extraJefe=" + extraJefe + "]";
	}


	@Override
	public double calcularSueldo() {
		double sueldo = 0;
		
		
		return 0;
	}
	
	
	
	
	
	
	
	
}
