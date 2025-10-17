package ejercicio;

import java.util.List;

public class Parking {
	
	private String direccion;
	private List<Vehiculo> vehiculos;
	
	
	public Parking(String direccion, List<Vehiculo> vehiculos) {
		super();
		this.direccion = direccion;
		this.vehiculos = vehiculos;
	}
	
	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public List<Vehiculo> getVehiculos() {
		return vehiculos;
	}
	public void setVehiculos(List<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}
	
	
	@Override
	public String toString() {
		return "Parking [direccion=" + direccion + ", vehiculos=" + vehiculos + "]";
	}
	
	
	public void comprobarTamanyo(double maxMetrosGratis) {
		for(Vehiculo v : vehiculos) {
			if(v instanceof Furgonetas) {
				((Furgonetas) v).avisarLongitud(maxMetrosGratis);
			}
		}
	}
	
	
	public double calcularRecaudadoMotos(double precioMinuto, double plusMetro, double maxMetrosGratis ) {
		double totalRecaudado = 0;
		for(Vehiculo v : vehiculos) {
			if(v instanceof Motos) {
				totalRecaudado += v.calcularPrecio(precioMinuto, plusMetro, maxMetrosGratis );
			}
		}
		
		return totalRecaudado;
	}
	
	
	
	public double calcularPrecioUnVehiculo(Vehiculo v, double precioMinuto, double plusMetro, double maxMetrosGratis ) {
		return v.calcularPrecio(precioMinuto, plusMetro, maxMetrosGratis);
	}
	
	public void mostrarDatos() {
		for(Vehiculo v : vehiculos) {
			System.out.println(v);
		}
	}
}
