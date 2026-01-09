package ejercicio04;

public class Empleado {

	private Long id;
	private String nombre;
	private String departamento;
	private double salario;
	private boolean activo;
	private int aniosAnt;
	
	
	
	public Empleado(Long id, String nombre, String departamento, double salario, boolean activo, int aniosAnt) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.departamento = departamento;
		this.salario = salario;
		this.activo = activo;
		this.aniosAnt = aniosAnt;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getDepartamento() {
		return departamento;
	}



	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}



	public double getSalario() {
		return salario;
	}



	public void setSalario(double salario) {
		this.salario = salario;
	}



	public boolean isActivo() {
		return activo;
	}



	public void setActivo(boolean activo) {
		this.activo = activo;
	}



	public int getAniosAnt() {
		return aniosAnt;
	}



	public void setAniosAnt(int aniosAnt) {
		this.aniosAnt = aniosAnt;
	}



	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", departamento=" + departamento + ", salario=" + salario
				+ ", activo=" + activo + ", aniosAnt=" + aniosAnt + "]";
	}
	
	
	
	
	
	
	
	
}
