package ejercicio05;

import java.util.Arrays;

public class Venta {
	
	
	private LineaDeVenta [] v;
	
	
	
	//Constructor
	public Venta(LineaDeVenta[] v) {
		super();
		this.v = v;
	}



	//Getter and setter
	public LineaDeVenta[] getLista() {
		return v;
	}


	public void setLista(LineaDeVenta[] lista) {
		this.v = lista;
	}

	
	public LineaDeVenta[] getV() {
		return v;
	}


	public void setV(LineaDeVenta[] v) {
		this.v = v;
	}



	//To String 
	@Override
	public String toString() {
		return "Venta [lista=" + Arrays.toString(v) + "]";
	}
	
	
	
	//Metodos 
	public void agregarLineaVenta(LineaDeVenta lv) {
		for(int i=0; i<v.length && v[i]!=null; i++) {
			v[i]=lv;
		}
		
	}
	
	
	
	public double calcularTotal(double iva, double descuento, int topeCantidad) {
		double total=0;
		for(int i=0; i<v.length && v[i]!=null; i++) {
			total+=v[i].calcularSubtotal(iva, descuento, topeCantidad);
		}
		return total;
	}
	
	
	public void imprimirTicket(double iva, double descuento, int topeCaducidad) {
	        System.out.println("\n--------------------TICKET DE COMPRA--------------------");
	        System.out.println("\nArticulo\t\tUd\tPVP\tIVA\tImporte\n");
	        
	        for(int i=0; i<v.length; i++) {
	            System.out.printf("\n%s\t\t%d\t%.2f€\t%.2f\t%.2f€",v[i].getP().getNombre(), v[i].getCantidad(), v[i].getP().calcularPVP(iva, descuento, topeCaducidad), iva, v[i].calcularSubtotal(iva, descuento, topeCaducidad));
	        }
	        System.out.println("\n\n--------------------------------------------------------");
	        System.out.printf("\nSUBTOTAL\t\t\t\t\t%.2f€", calcularTotal(iva, descuento, topeCaducidad));
	        System.out.println("\n\n\t\t GRACIAS POR LA COMPRA");
	        System.out.println("\n\n--------------------------------------------------------");
	    }

	
	
	//Mostrar todos los productos
	
	public void listarTodos() {
		for(int i=0; i<v.length && v[i]!=null; i++) {
			System.out.println(v[i]);
		}
	}
	
	
	
	
	
	
	
	

}
