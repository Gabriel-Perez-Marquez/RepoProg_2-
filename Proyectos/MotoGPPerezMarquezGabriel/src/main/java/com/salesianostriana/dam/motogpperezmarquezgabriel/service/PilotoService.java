package com.salesianostriana.dam.motogpperezmarquezgabriel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.motogpperezmarquezgabriel.model.Piloto;
import com.salesianostriana.dam.motogpperezmarquezgabriel.model.ResultadoCarrera;
import com.salesianostriana.dam.motogpperezmarquezgabriel.repository.PilotoRepository;
import com.salesianostriana.dam.motogpperezmarquezgabriel.repository.ResultadoCarreraRepository;
import com.salesianostriana.dam.motogpperezmarquezgabriel.service.base.BaseServiceImp;

@Service
public class PilotoService extends BaseServiceImp<Piloto, Long, PilotoRepository> {

	@Autowired
	private ResultadoCarreraRepository resultadoCarreraRepository;
	
	@Autowired
	private PilotoRepository pilotoRepository;
	
	
	public List<Piloto> findAllById(List<Long> ids) {
		return this.pilotoRepository.findAllById(ids);
	}
	
	
	public List<Piloto> getClasificacionGeneralPilotos() {
		return this.pilotoRepository.findAllByOrderByTotalPuntosDesc();
	}
	
	public Piloto getEstadisticasPiloto(Long idPiloto) {
		
		return pilotoRepository.findById(idPiloto)
				.orElseThrow(() -> new RuntimeException("Piloto no encontrado con ID: " + idPiloto));
	}
	
	
	public void recalcularEstadisticasYGuardar(Long idPiloto) {
		
		Piloto piloto = this.findById(idPiloto)
				.orElseThrow(() -> new RuntimeException("Piloto no encontrado con ID: " + idPiloto));
		
		List<ResultadoCarrera> resultados = resultadoCarreraRepository.findByPilotoId(piloto.getId());
		
		int totalPuntos = 0;
		int totalVictorias = 0;
		int totalPodios = 0;
		int totalCarreras = resultados.size();
		
		for (ResultadoCarrera r : resultados) {
			totalPuntos += r.getPuntosObtenidos();
			
			if (r.getPosicion() == 1) {
				totalVictorias++;
			}
			if (r.getPosicion() <= 3) {
				totalPodios++;
			}
		}
		
		piloto.setTotalPuntos(totalPuntos);
		piloto.setTotalVictorias(totalVictorias);
		piloto.setTotalPodios(totalPodios);
		piloto.setTotalCarreras(totalCarreras);
		
		this.save(piloto);
	}
	
}