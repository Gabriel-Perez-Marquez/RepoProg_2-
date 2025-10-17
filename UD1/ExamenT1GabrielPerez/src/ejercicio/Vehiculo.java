package ejercicio;

public class Vehiculo {

	private String matricula;
	private double minutos;
	
	
	public Vehiculo(String matricula, double minutos) {
		super();
		this.matricula = matricula;
		this.minutos = minutos;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public double getMinutos() {
		return minutos;
	}


	public void setMinutos(double minutos) {
		this.minutos = minutos;
	}


	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", minutos=" + minutos + "]";
	}
	
	
	
	public double calcularPrecio(double precioMinuto, double plusMetro, double maxMetrosGratis) {
		return minutos * precioMinuto;
	}
	
	
	
}
