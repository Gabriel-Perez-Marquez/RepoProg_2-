package ejercicio02;

public class Conversor {

	public Conversor() {
		super();
	}
	
	public double convertirTemperatura (double temp) throws TemperaturaBajaException {
		double tempMin = -273;
		if(temp < tempMin) {
			throw new TemperaturaBajaException();
		}
		return (temp*9/5) + 32;
	}

}
