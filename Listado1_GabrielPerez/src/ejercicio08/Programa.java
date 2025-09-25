package ejercicio08;


public class Programa {

	private String nombre;
	private double precio;
	private String categoria;
	private boolean anuncios;
	private int numSusc;
	
	
	
	public Programa(String nombre, double precio, String categoria, boolean anuncios) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.categoria = categoria;
		this.anuncios = anuncios;
		this.numSusc = 0;
	}



	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public boolean isAnuncios() {
		return anuncios;
	}


	public void setAnuncios(boolean anuncios) {
		this.anuncios = anuncios;
	}
	

	public int getNumSusc() {
		return numSusc;
	}


	public void setNumSusc(int numSusc) {
		this.numSusc = numSusc;
	}



	@Override
	public String toString() {
		return "Programa [nombre=" + nombre + ", precio=" + precio + ", categoria=" + categoria + ", anuncios="
				+ anuncios + "]";
	}
		
	
	
	
	
	
}
