package ejercicio05;

public class Usuario {

	
	private Long id;
	private String nombre;
	
	
	public Usuario(Long id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
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


	@Override
	public String toString() {
		return "Alumno [id=" + id + ", nombre=" + nombre + "]";
	}
	
	
	
	
	
	
	
}
