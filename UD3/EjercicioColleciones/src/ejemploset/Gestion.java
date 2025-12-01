package ejemploset;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Gestion {

	
	private Set<Producto> listProductos;

	public Gestion(Set<Producto> listProductos) {
		super();
		this.listProductos = listProductos;
	}

	public Set<Producto> getListProductos() {
		return listProductos;
	}

	public void setListProductos(Set<Producto> listProductos) {
		this.listProductos = listProductos;
	}

	@Override
	public String toString() {
		return "Gestion [listProductos=" + listProductos + "]";
	}
	
	
	public Producto buscarPorId ( Long id ) {
		for(Producto p : listProductos) {
			if( p.getId() == id) {
				return p;	
			}
		}
		return null;
	}
	
	
	public void agregarProducto (Producto p) {
		listProductos.add(p);
	}
	
	public void editarProducto (Long id, Producto p) {
		for(Producto p1 : listProductos) {
			if(p1.getId() == id) {
				
			}
		}
	}
	
	public void eliminarProducto( Long id ) {
		listProductos.remove(buscarPorId(id));
	}
	
	public void mostrarProductos() {
		for(Producto p : listProductos) {
			System.out.println(p);
		}
	}
	
	
	
	public TreeSet<Producto> generarProductosOrdenadosPrecio(){
		 listProductos = new TreeSet<Producto>(Comparator.comparing(Producto::getPrecio));
		 return (TreeSet<Producto>) listProductos;
	}
	
	
	public HashSet<String> filtrarCorreosUnicos(){
		return null;
	}
	
	
	
	
	
}
