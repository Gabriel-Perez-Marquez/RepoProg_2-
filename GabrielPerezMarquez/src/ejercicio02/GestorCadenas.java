package ejercicio02;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class GestorCadenas {
	
	
	private List<String> listaCadenas;

	public GestorCadenas(List<String> listaCadenas) {
		super();
		this.listaCadenas = listaCadenas;
	}

	public List<String> getListaCadenas() {
		return listaCadenas;
	}

	public void setListaCadenas(List<String> listaCadenas) {
		this.listaCadenas = listaCadenas;
	}

	@Override
	public String toString() {
		return "GestorCadenas [listaCadenas=" + listaCadenas + "]";
	}
	
	
	
	public List<String> ordenarCadenasOrdenAlf(){
	
		return 	listaCadenas.stream()
				.sorted()
				.toList();
	}
	
	
	public List<String> buscarCadena (String cadenaBuscar) {
		
		return listaCadenas.stream().filter(c -> c.equalsIgnoreCase(cadenaBuscar)).toList();
	}
	
	
	
	
	public String crearStringConIniciales () {
		return listaCadenas.stream().map(palabra -> palabra.substring(0, 1)).collect(Collectors.joining());
	}
	
	
	public List<String> borrarCadenasImpares() {
		listaCadenas.removeIf(c -> c.length()%2 !=0);
		return listaCadenas;
	}
	
	
	public List<String> pasarCadenasAMayusculas () {
		return listaCadenas.stream().map(c -> c.toUpperCase()).toList();
	}
	
	
	public boolean validarCadena(String texto, Pattern pattern) {
		Matcher matcher = pattern.matcher(texto);
		
		return matcher.find();
	}
	
	

}
