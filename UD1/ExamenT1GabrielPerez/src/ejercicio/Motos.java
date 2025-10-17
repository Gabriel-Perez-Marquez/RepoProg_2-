package ejercicio;

public class Motos extends Vehiculo {

	
	private double centimetrosCub;

	
	public Motos(String matricula, double minutos, double centimetrosCub) {
		super(matricula, minutos);
		this.centimetrosCub = centimetrosCub;
	}


	public double getCentimetrosCub() {
		return centimetrosCub;
	}


	public void setCentimetrosCub(double centimetrosCub) {
		this.centimetrosCub = centimetrosCub;
	}


	@Override
	public String toString() {
		return "Motos [centimetrosCub=" + centimetrosCub + ", toString()=" + super.toString() + "]";
	}


	@Override
	public double calcularPrecio(double precioMinuto, double plusMetro, double maxMetrosGratis) {
		double division = 2;
		double precioFinal = 0;
		
		if(centimetrosCub< 250) {
			precioFinal = super.calcularPrecio(precioMinuto, plusMetro, maxMetrosGratis)/division;
		}else {
			precioFinal = super.calcularPrecio(precioMinuto, plusMetro, maxMetrosGratis);
		}
		
		return precioFinal;
	}
	
	
	
	
	
	
}
