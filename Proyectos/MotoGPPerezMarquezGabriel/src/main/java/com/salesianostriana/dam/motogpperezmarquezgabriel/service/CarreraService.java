package com.salesianostriana.dam.motogpperezmarquezgabriel.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.motogpperezmarquezgabriel.model.Carrera;
import com.salesianostriana.dam.motogpperezmarquezgabriel.model.Equipo;
import com.salesianostriana.dam.motogpperezmarquezgabriel.model.Piloto;
import com.salesianostriana.dam.motogpperezmarquezgabriel.repository.CarreraRepository;
import com.salesianostriana.dam.motogpperezmarquezgabriel.repository.PilotoRepository;
import com.salesianostriana.dam.motogpperezmarquezgabriel.service.base.BaseServiceImp;

@Service
public class CarreraService extends BaseServiceImp<Carrera, Long, CarreraRepository> {

	@Autowired
	private PilotoService pilotoService;
	
	@Autowired
	private EquipoService equipoService;
	
	
	private Double obtenerPremioSegunPosicion(int posicion) {
	    switch (posicion) {
	        case 1: return 100000.0; 
	        case 2: return 50000.0;  
	        case 3: return 25000.0;  
	        case 4: return 10000.0;  
	        case 5: return 5000.0;   
	        default: return 1000.0;  
	    }
	}
	
	
	public void repartirPremiosPorClasificacion(List<Piloto> pilotosOrdenados, Double plusFijoEquipo) {

	    

	    List<Equipo> equiposParaActualizar = new ArrayList<>();



	    for (int i = 0; i < pilotosOrdenados.size(); i++) {

	        Piloto piloto = pilotosOrdenados.get(i);

	        int posicion = i + 1;

	        double premioPiloto = obtenerPremioSegunPosicion(posicion);

	        

	        double dineroActualPiloto = (piloto.getDinero() != 0) ? piloto.getDinero() : 0.0;

	        piloto.setDinero(dineroActualPiloto + premioPiloto);



	        if (piloto.getEquipo() != null) {

	            Equipo equipoActual = piloto.getEquipo();

	            boolean encontrado = false;



	            for (Equipo equipoLista : equiposParaActualizar) {

	                if (equipoLista.getId().equals(equipoActual.getId())) {

	                    double presupuesto = (equipoLista.getDinero() != 0) ? equipoLista.getDinero() : 0.0;

	                    equipoLista.setDinero(presupuesto + premioPiloto);

	                    encontrado = true;

	                    break;

	                }

	            }



	            if (!encontrado) {

	                double presupuesto = (equipoActual.getDinero() != 0) ? equipoActual.getDinero() : 0.0;

	                equipoActual.setDinero(presupuesto + premioPiloto + plusFijoEquipo);

	                equiposParaActualizar.add(equipoActual);

	            }

	        }

	    }


	    for(Piloto p : pilotosOrdenados) {
	    	pilotoService.save(p);
	    }
	    
	    for(Equipo e : equiposParaActualizar) {
	    	equipoService.save(e);
	    }


	} 
	
}
