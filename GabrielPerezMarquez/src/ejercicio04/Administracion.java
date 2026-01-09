package ejercicio04;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Administracion {
	
	private List<Empleado> empleados;
	
	
	
	
	public Administracion(List<Empleado> empleados) {
		super();
		this.empleados = empleados;
	}
	
	

	public List<Empleado> getEmpleados() {
		return empleados;
	}



	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}


	

	@Override
	public String toString() {
		return "Administracion [empleados=" + empleados + "]";
	}

	
	


	public List<Empleado> obtenerEmpActivoSalarioMayor(double salarioPromedio){
		return empleados.stream().filter(e -> e.isActivo() && e.getSalario() >= salarioPromedio).toList();
	}
	
	public Optional<Empleado> buscarPorNombre (String nombre){
		return empleados.stream()
				.filter(e -> e.getNombre().equalsIgnoreCase(nombre))
				.findFirst();
	}
	
	public Empleado obtenerEmpleadoMayorSalarioPorDepart (String departamento) {
		return empleados.stream().filter(e -> e.getDepartamento().equalsIgnoreCase(departamento)).max(Comparator.comparingDouble(Empleado::getSalario)).get();
	}

	
	public double calcularSalarioEmpActConAnios(int anios) {
		return empleados.stream().filter(e -> e.isActivo() && e.getAniosAnt()>= anios).mapToDouble(e -> e.getSalario()).sum();
	}
	
}
