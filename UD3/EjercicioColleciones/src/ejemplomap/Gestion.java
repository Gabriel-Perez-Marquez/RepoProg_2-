package ejemplomap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

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
	
	
	
	
	
	public Map<Long, String> verPeliculasPorGenero(String genero) {
        Map<Long, String> peliculasPorGenero = new HashMap<Long, String>();
        
        Long nextId = 1L;
        
        for(Pelicula p : listPeliculas.values()) {
        	if(p.getGenero().equalsIgnoreCase(genero)) {
        		peliculasPorGenero.put(nextId, p.getNombre());
        		nextId++;
        	}
        }
        
        return peliculasPorGenero;
        
    }
	
	public Map<Long, Pelicula> ordenarPeliculasPorPrecio(double precioMin) {
		Map<Long, Pelicula> peliculasOrdenadas = new TreeMap<Long, Pelicula>();
		Long nextId = 1L;
		
		
		for(Pelicula p : listPeliculas.values()) {
			
			if(p.getPrecio() > precioMin) {
				peliculasOrdenadas.put(nextId, p);
				nextId++;
			}
		}
		
		
		return peliculasOrdenadas;
	}

}
