package ejercicio;

import java.util.List;

public class GestionUsuarios {
	
	
	private List<Usuario> usuarios;

	
	public GestionUsuarios(List<Usuario> usuarios) {
		super();
		this.usuarios = usuarios;
	}


	public List<Usuario> getUsuarios() {
		return usuarios;
	}


	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	

	@Override
	public String toString() {
		return "GestionUsuarios [usuarios=" + usuarios + "]";
	}
	
	
	public boolean crearUsuario(Usuario u) {
		return usuarios.add(u);
	}
	
	
	public void mostrarUsuarios () {
		usuarios.stream()
		.forEach(u -> System.out.println(u));
	}


	public boolean validarNombre(String nombre, int longitudValida) throws TextoInvalidoException {
		
		if(nombre.length() < longitudValida) {
			throw new TextoInvalidoException("El nombre debe de tener " + longitudValida + " o más caracteres");
		}
		
		if(nombre.length() == 0) {
			throw new TextoInvalidoException("El nombre no puede estar vacio");
		}
		
		return true;
	}
	
	
	public boolean validarEmail(String email) throws TextoInvalidoException {
		if(!email.contains("@")) {
			throw new TextoInvalidoException("El email debe contener el carácter @ para ser valido");
		}else {
			return true;			
		}
	}
	
	
	public boolean validarEdad(int edad, int edadMinima) throws CalculoInvalidoException {
		if(edad < edadMinima) {
			throw new CalculoInvalidoException("El usuario debe de tener más de " + edadMinima + " años");
		}
		
		return true;
	}
	
	

}
