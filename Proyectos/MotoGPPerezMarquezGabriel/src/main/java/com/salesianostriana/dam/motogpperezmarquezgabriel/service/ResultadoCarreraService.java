package com.salesianostriana.dam.motogpperezmarquezgabriel.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.motogpperezmarquezgabriel.model.Carrera;
import com.salesianostriana.dam.motogpperezmarquezgabriel.model.Equipo;
import com.salesianostriana.dam.motogpperezmarquezgabriel.model.Moto;
import com.salesianostriana.dam.motogpperezmarquezgabriel.model.Piloto;
import com.salesianostriana.dam.motogpperezmarquezgabriel.model.ResultadoCarrera;
import com.salesianostriana.dam.motogpperezmarquezgabriel.repository.CarreraRepository;
import com.salesianostriana.dam.motogpperezmarquezgabriel.repository.MotoRepository;
import com.salesianostriana.dam.motogpperezmarquezgabriel.repository.ResultadoCarreraRepository;

@Service
public class ResultadoCarreraService {

	@Autowired
	private ResultadoCarreraRepository resultadoCarreraRepository;
	
	@Autowired
	private CarreraRepository carreraRepository;
	
	@Autowired
	private PilotoService pilotoService; 
	
	@Autowired
	private EquipoService equipoService;
	
	@Autowired
	private MotoRepository motoRepository;
	
	
	public void registrarResultados(Long idCarrera, List<ResultadoCarrera> resultadosInput) {
		
		Carrera carrera = carreraRepository.findById(idCarrera)
				.orElseThrow(() -> new RuntimeException("Carrera no encontrada"));
		
		Piloto pilotoCompleto;
		Moto motoDelPiloto;
		
		List<Piloto> pilotosParaActualizar = new ArrayList<>();
		List<Equipo> equiposParaActualizar = new ArrayList<>();

		if (carrera.isJugada()) {
			throw new RuntimeException("La carrera ya ha sido jugada.");
		}
		
		for (ResultadoCarrera input : resultadosInput) {
			
			pilotoCompleto = pilotoService.findById(input.getPiloto().getId())
					.orElse(null);
			
			if (pilotoCompleto != null) {
				int posicion = input.getPosicion();
				int puntos = calcularPuntos(posicion);
				
				input.setPiloto(pilotoCompleto);
				input.setCarrera(carrera);
				input.setPuntosObtenidos(puntos);
				
				resultadoCarreraRepository.save(input);
				
				pilotoCompleto.setTotalPuntos(pilotoCompleto.getTotalPuntos() + puntos);
				pilotoCompleto.setTotalCarreras(pilotoCompleto.getTotalCarreras() + 1);
				
				if (posicion == 1) {
					pilotoCompleto.setTotalVictorias(pilotoCompleto.getTotalVictorias() + 1);
				}
				if (posicion <= 3) {
					pilotoCompleto.setTotalPodios(pilotoCompleto.getTotalPodios() + 1);
				}
				
				motoDelPiloto = pilotoCompleto.getMoto();
				if (motoDelPiloto != null) {
					int desgasteSufrido = (int) (Math.random() * 11) + 5; 
					double nuevoDesgaste = motoDelPiloto.getPorcentDesgaste() + desgasteSufrido;
	
					if (nuevoDesgaste > 100) {
						nuevoDesgaste = 100;
					}
					
					motoDelPiloto.setPorcentDesgaste(nuevoDesgaste);
					motoRepository.save(motoDelPiloto); 
				}
				
				if (!equiposParaActualizar.contains(pilotoCompleto.getEquipo())) {
					equiposParaActualizar.add(pilotoCompleto.getEquipo());
				}
				
				pilotosParaActualizar.add(pilotoCompleto);
			}
		}

		carrera.setJugada(true);
		carreraRepository.save(carrera);
		
		for(Piloto piloto : pilotosParaActualizar){
			pilotoService.save(piloto);
		}
		
		for(Equipo e : equiposParaActualizar) {
			equipoService.recalcularEstadisticasYGuardar(e.getId());
		}
	}
	
	
	private int calcularPuntos(int posicion) {
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