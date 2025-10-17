package ejercicio11;

public class Programador extends PuestoTrabajo {
	
 	private double horas;
	private double horasExtra;
	private double extraProgramador;
	
	
	
	public Programador(double precioHora, double precioHoraExtra, double horas, double horasExtra,
			double extraProgramador) {
		super(precioHora, precioHoraExtra);
		this.horas = horas;
		this.horasExtra = horasExtra;
		this.extraProgramador = extraProgramador;
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



	public double getExtraProgramador() {
		return extraProgramador;
	}



	public void setExtraProgramador(double extraProgramador) {
		this.extraProgramador = extraProgramador;
	}



	@Override
	public String toString() {
		return "Programador [horas=" + horas + ", horasExtra=" + horasExtra + ", extraProgramador=" + extraProgramador
				+ ", toString()=" + super.toString() + "]";
	}



	@Override
	public double calcularSueldo() {
		// TODO Auto-generated method stub
		int cien = 100;
		double sueldo = 0;
		
		sueldo += horas*getPrecioHora();
		
		sueldo += horasExtra*getPrecioHoraExtra();
		
		sueldo += extraProgramador * sueldo /cien;
		
		return sueldo;
	}



	
	
	
	
	
	
	
	
	
	

}
