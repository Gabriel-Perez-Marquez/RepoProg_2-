package com.salesianostriana.dam.motogpperezmarquezgabriel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.motogpperezmarquezgabriel.model.Equipo;
import com.salesianostriana.dam.motogpperezmarquezgabriel.model.Piloto;
import com.salesianostriana.dam.motogpperezmarquezgabriel.repository.EquipoRepository;
import com.salesianostriana.dam.motogpperezmarquezgabriel.service.base.BaseServiceImp;

@Service
public class EquipoService extends BaseServiceImp<Equipo, Long, EquipoRepository> {
	
	@Autowired
	private EquipoRepository equipoRepository;
	
	public List<Equipo> getClasificacionGeneralEquipos() {
		return this.equipoRepository.findAllByOrderByTotalPuntosDesc();
	}

	public void recalcularEstadisticasYGuardar(Long idEquipo) {
		
		Equipo equipo = this.findById(idEquipo)
				.orElseThrow(() -> new RuntimeException("Equipo no encontrado con ID: " + idEquipo));
		
		int totalPuntosEquipo = 0;
		
		// Un equipo suma los puntos de todos sus pilotos
		for (Piloto p : equipo.getPilotos()) {
			totalPuntosEquipo += p.getTotalPuntos(); // Leemos los puntos ya calculados del piloto
		}
		
		equipo.setTotalPuntos(totalPuntosEquipo);
		this.save(equipo);
	}
}