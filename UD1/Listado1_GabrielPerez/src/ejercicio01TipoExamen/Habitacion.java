package ejercicio01TipoExamen;

public class Habitacion {

	private double precioBase;
	private boolean ocupada;
	private String nombre;
	private int numDiasReserva;
	private int numOcupantes;
	
	
	public Habitacion(double precioBase, boolean ocupada, String nombre, int numDiasReserva, int numOcupantes) {
		super();
		this.precioBase = precioBase;
		this.ocupada = ocupada;
		this.nombre = nombre;
		this.numDiasReserva = numDiasReserva;
		this.numOcupantes = numOcupantes;
	}


	public double getPrecioBase() {
		return precioBase;
	}


	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}


	public boolean isOcupada() {
		return ocupada;
	}


	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getNumDiasReserva() {
		return numDiasReserva;
	}


	public void setNumDiasReserva(int numDiasReserva) {
		this.numDiasReserva = numDiasReserva;
	}


	public int getNumOcupantes() {
		return numOcupantes;
	}


	public void setNumOcupantes(int numOcupantes) {
		this.numOcupantes = numOcupantes;
	}


	@Override
	public String toString() {
		return "Habitacion [precioBase=" + precioBase + ", ocupada=" + ocupada + ", nombre=" + nombre
				+ ", numDiasReserva=" + numDiasReserva + ", numOcupantes=" + numOcupantes + "]";
	}
	

	
	 public double calcularPrecioHab(double descuento) {
		 return numDiasReserva * precioBase;
	 }
	
	
	
}
