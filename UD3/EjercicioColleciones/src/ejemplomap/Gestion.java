package ejemplomap;

import java.util.Map;

import ejemploset.Producto;

public class Gestion {
	
	private Map<Long, Pelicula> listPeliculas;

	public Gestion(Map<Long, Pelicula> listPeliculas) {
		super();
		this.listPeliculas = listPeliculas;
	}

	public Map<Long, Pelicula> getListProductos() {
		return listPeliculas;
	}

	public void setListProductos(Map<Long, Pelicula> listPeliculas) {
		this.listPeliculas = listPeliculas;
	}

	@Override
	public String toString() {
		return "Gestion [listProductos=" + listPeliculas + "]";
	}
	
	
	public Pelicula buscarPorId(Long id) {
		if(listPeliculas.get(id)!= null) {
			return listPeliculas.get(id);
		}else {
			return null;
		}
	}
	
	
	public void agregarPelicula(Pelicula p) {
		listPeliculas.put(p.getId(), p);
	}
	
	public void eliminarPelicula (Long id) {
		listPeliculas.remove(id);
	}
	
	
	
	public double calcularPrecioTotalPorStock (int stockMin) {
		double precioTotal = 0;
		
		for(Pelicula p : listPeliculas.values()) {
			if (p.getStock()) {
				
			}
		}
		
	}

}
