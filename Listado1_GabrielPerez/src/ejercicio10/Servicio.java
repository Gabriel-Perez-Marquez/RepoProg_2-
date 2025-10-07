package ejercicio10;

import java.util.List;

public class Servicio {

	public double calcularMediaAreas(List<Figura> figuras) {\
		double sumaAreas;
		for(Figura f : figuras) {
    		if(f instanceof Circulo) {
    			f = (Circulo) f;
    			sumaAreas += f.calcularArea();
    		} else if( f instanceof Cubo) {
    			f = (Cubo) f;
    			sumaAreas += f.calcularArea();
    		}
    	}
	}
	
}
