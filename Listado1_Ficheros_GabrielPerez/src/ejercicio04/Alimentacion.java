package ejercicio04;

public class Alimentacion extends Producto {
	
	private int diasParaCaduc;
	private boolean refrigerado;
	
	
	
	public Alimentacion(double precioUni, String nombre, int codigoId, int diasParaCaduc, boolean refrigerado) {
		super(precioUni, nombre, codigoId);
		this.diasParaCaduc = diasParaCaduc;
		this.refrigerado = refrigerado;
	}



	
	//getter and setter
	public int getDiasParaCaduc() {
		return diasParaCaduc;
	}


	public void setDiasParaCaduc(int diasParaCaduc) {
		this.diasParaCaduc = diasParaCaduc;
	}


	public boolean isRefrigerado() {
		return refrigerado;
	}


	public void setRefrigerado(boolean refrigerado) {
		this.refrigerado = refrigerado;
	}



	
	//To String 
	@Override
	public String toString() {
		return "Alimentacion [diasParaCaduc=" + diasParaCaduc + ", refrigerado=" + refrigerado + "]";
	}
	
	
	
	
	//Metodos
	public double calcularPVP(double iva, double descuento, int topeCaducidad) {
		if(diasParaCaduc<topeCaducidad) {
			return super.calcularPVP(iva, descuento, topeCaducidad)-(super.calcularPVP(iva, descuento, topeCaducidad)*descuento/100);
		}else {
			return super.calcularPVP(iva, descuento, topeCaducidad);
		}
		
	}


	public void avisarCaducidad(int caducidad ) {
		if(diasParaCaduc<caducidad) {  
			System.out.println("**** A punto de caducar ****");
		}
		
	}
	
	
	
	

}
