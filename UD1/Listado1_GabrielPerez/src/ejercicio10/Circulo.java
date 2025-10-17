package ejercicio10;

public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    
    
   
    public double getRadio() {
		return radio;
	}


	public void setRadio(double radio) {
		this.radio = radio;
	}


	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}




	@Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularVolumen() {
        return 0; // Un círculo no tiene volumen
    }
}