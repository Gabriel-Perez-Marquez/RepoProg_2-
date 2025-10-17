package ejercicio01TipoExamen;

import java.util.List;

public class GestionHabitaciones {

	private List<Habitacion> habitaciones;

	public GestionHabitaciones(List<Habitacion> habitaciones) {
		super();
		this.habitaciones = habitaciones;
	}

	public List<Habitacion> getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(List<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}

	@Override
	public String toString() {
		return "GestionHabitaciones [habitaciones=" + habitaciones + "]";
	}
	
	
	public Habitacion findByID(int id) {
		return habitaciones.get(id - 1);
	}
	
}
