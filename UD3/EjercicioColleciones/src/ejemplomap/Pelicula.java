package ejemplomap;

public class Pelicula {
	
	
	private Long id;
	private String nombre;
	private String descripcion;
	private double precio;
	private double duracion;
	
	
	
	public Pelicula(Long id, String nombre, String descripcion, double precio, double duracion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.duracion = duracion;
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


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public double getDuracion() {
		return duracion;
	}


	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}



	@Override
	public String toString() {
		return "Pelicula [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio
				+ ", duracion=" + duracion + "]";
	}
	
	
	
	
	
	
	
	
}
