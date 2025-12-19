package ejercicio03;

import java.util.List;
import java.util.Optional;

public class GestionCanciones {
	
	private List<Cancion> playlist;

	public GestionCanciones(List<Cancion> playlist) {
		super();
		this.playlist = playlist;
	}

	public List<Cancion> getPlaylist() {
		return playlist;
	}

	public void setPlaylist(List<Cancion> playlist) {
		this.playlist = playlist;
	}

	@Override
	public String toString() {
		return "GestionCanciones [playlist=" + playlist + "]";
	}
	
	
	public Optional<Cancion> buscarPorNombre (String nombre) {
		return playlist.stream().filter(c -> c.getNombre().equalsIgnoreCase(nombre)).findFirst();
	}
	
	public List<Cancion> buscarPorDuracion(double duracion){
		return playlist.stream().filter(c -> c.getDuracion()>= duracion).toList();
	}
	

}
