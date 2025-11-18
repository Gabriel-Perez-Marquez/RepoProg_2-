package com.salesianostriana.dam.motogpperezmarquezgabriel.service;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.salesianostriana.dam.motogpperezmarquezgabriel.model.Carrera;
import com.salesianostriana.dam.motogpperezmarquezgabriel.model.Piloto;
import com.salesianostriana.dam.motogpperezmarquezgabriel.model.ResultadoCarrera;
import com.salesianostriana.dam.motogpperezmarquezgabriel.repository.CarreraRepository;
import com.salesianostriana.dam.motogpperezmarquezgabriel.repository.ResultadoCarreraRepository;

@Service
public class ResultadoCarreraService {

	@Autowired
	private ResultadoCarreraRepository resultadoCarreraRepository;
	
	@Autowired
	private CarreraRepository carreraRepository;
	
	@Autowired
	private PilotoService pilotoService; 
	
	
	@Transactional
	public void registrarResultados(Long idCarrera, List<ResultadoCarrera> resultadosInput) {
		
		Carrera carrera = carreraRepository.findById(idCarrera)
			.orElseThrow(() -> new RuntimeException("Carrera no encontrada"));

		List<Long> idsPilotos = new ArrayList<>();
		for(ResultadoCarrera r : resultadosInput) {
			idsPilotos.add(r.getPiloto().getId());
		}
		
		List<Piloto> pilotosCompletos = pilotoService.findAllById(idsPilotos);
		
		List<ResultadoCarrera> nuevosResultados = new ArrayList<>();

		for (ResultadoCarrera input : resultadosInput) {
			
			Piloto pilotoCompleto = null;
			for(Piloto p : pilotosCompletos) {
				if (p.getId().equals(input.getPiloto().getId())) {
					pilotoCompleto = p;
					break;
				}
			}
			
			if (pilotoCompleto != null) {
				int posicion = input.getPosicion();
				int puntosGanados = calcularPuntosPorPosicion(posicion);
	
				input.setCarrera(carrera);
				input.setPiloto(pilotoCompleto);
				input.setPuntosObtenidos(puntosGanados);
				
				nuevosResultados.add(input);
				
				pilotoCompleto.setTotalPuntos(pilotoCompleto.getTotalPuntos() + puntosGanados);
				pilotoCompleto.setTotalCarreras(pilotoCompleto.getTotalCarreras() + 1);
				if (posicion == 1) {
					pilotoCompleto.setTotalVictorias(pilotoCompleto.getTotalVictorias() + 1);
				}
				if (posicion <= 3) {
					pilotoCompleto.setTotalPodios(pilotoCompleto.getTotalPodios() + 1);
				}
			}
		}
		
		resultadoCarreraRepository.saveAll(nuevosResultados);
		
		carrera.setJugada(true);
		carreraRepository.save(carrera);
	}
	
	private int calcularPuntosPorPosicion(int posicion) {
		switch (posicion) {
			case 1: return 25;
			case 2: return 20;
			case 3: return 16;
			case 4: return 13;
			case 5: return 11;
			case 6: return 10;
			case 7: return 9;
			case 8: return 8;
			case 9: return 7;
			case 10: return 6;
			case 11: return 5;
			case 12: return 4;
			case 13: return 3;
			case 14: return 2;
			case 15: return 1;
			default: return 0;
		}
	}
}