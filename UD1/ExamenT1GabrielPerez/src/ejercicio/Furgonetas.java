package ejercicio;

public class Furgonetas extends Vehiculo {
	
	private double longitud;

	public Furgonetas(String matricula, double minutos, double longitud) {
		super(matricula, minutos);
		this.longitud = longitud;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	@Override
	public String toString() {
		return "Furgonetas [longitud=" + longitud + ", toString()=" + super.toString() + "]";
	}

	@Override
	public double calcularPrecio(double precioMinuto, double plusMetro, double maxMetrosGratis) {
		double precioFinal = 0;
		if(longitud> maxMetrosGratis) {
			precioFinal = super.calcularPrecio(precioMinuto, plusMetro, maxMetrosGratis) + ((longitud-4) * plusMetro );
		} else {
			precioFinal = super.calcularPrecio(precioMinuto, plusMetro, maxMetrosGratis);
		}
		
		return  precioFinal;
	}
	
	
	public void avisarLongitud(double maxMetrosGratis) {
		if(longitud>maxMetrosGratis) {
			System.out.println("Furgoneta con matricula " + getMatricula() + ". ¡Cuidado, aparcar en zona especial!");
		}
	}
	
	
	
	
}
