package com.salesianostriana.dam.motogpperezmarquezgabriel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.motogpperezmarquezgabriel.model.Equipo;
import com.salesianostriana.dam.motogpperezmarquezgabriel.model.Mecanico;
import com.salesianostriana.dam.motogpperezmarquezgabriel.model.Piloto;
import com.salesianostriana.dam.motogpperezmarquezgabriel.repository.EquipoRepository;
import com.salesianostriana.dam.motogpperezmarquezgabriel.service.base.BaseServiceImp;

@Service
public class EquipoService extends BaseServiceImp<Equipo, Long, EquipoRepository> {
	
	@Autowired
	private EquipoRepository equipoRepository;
	
	@Autowired
	@Lazy
	private MecanicoService mecanicoService;
	
	public List<Equipo> getClasificacionGeneralEquipos() {
		return this.equipoRepository.findAllByOrderByTotalPuntosDesc();
	}

	public void recalcularEstadisticasYGuardar(Long idEquipo) {
		
		Equipo equipo = this.findById(idEquipo)
				.orElseThrow(() -> new RuntimeException("Equipo no encontrado con ID: " + idEquipo));
		
		int totalPuntosEquipo = 0;
		
		for (Piloto p : equipo.getPilotos()) {
			totalPuntosEquipo += p.getTotalPuntos(); 
		}
		
		equipo.setTotalPuntos(totalPuntosEquipo);
		this.save(equipo);
	}
	
	
	public void deleteById(Long id) {
        Equipo equipo = equipoRepository.findById(id).orElse(null);
        Mecanico m;
        
        
        if (equipo != null) {
            m=equipo.getMecanico();
            m.getEquipos().remove(equipo);
            mecanicoService.save(m);
           
            
            equipoRepository.delete(equipo);
        }
    }
}