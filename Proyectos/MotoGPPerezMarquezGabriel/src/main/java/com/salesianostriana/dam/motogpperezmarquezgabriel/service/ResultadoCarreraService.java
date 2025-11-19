package com.salesianostriana.dam.motogpperezmarquezgabriel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.motogpperezmarquezgabriel.model.Carrera;
import com.salesianostriana.dam.motogpperezmarquezgabriel.model.Equipo;
import com.salesianostriana.dam.motogpperezmarquezgabriel.model.Piloto;
import com.salesianostriana.dam.motogpperezmarquezgabriel.model.ResultadoCarrera;
import com.salesianostriana.dam.motogpperezmarquezgabriel.repository.ResultadoCarreraRepository;
import com.salesianostriana.dam.motogpperezmarquezgabriel.service.base.BaseServiceImp;

@Service
public class ResultadoCarreraService extends BaseServiceImp<ResultadoCarrera, Long, ResultadoCarreraRepository> {

	@Autowired
	private CarreraService carreraService;

	@Autowired
	private PilotoService pilotoService;

	@Autowired
	private EquipoService equipoService;

	public void registrarResultados(Long carreraId, List<ResultadoCarrera> resultadosInput) {
		
		Carrera carrera = carreraService.findById(carreraId)
				.orElseThrow(() -> new RuntimeException("Carrera no encontrada con ID: " + carreraId));

		if (carrera.isJugada()) {
			return;
		}

		for (ResultadoCarrera resultado : resultadosInput) {
			
			resultado.setCarrera(carrera);
			
			int puntos = calcularPuntos(resultado.getPosicion());
			resultado.setPuntosObtenidos(puntos);
			
			this.save(resultado);

			Piloto piloto = pilotoService.findById(resultado.getPiloto().getId())
					.orElseThrow(() -> new RuntimeException("Piloto no encontrado"));

			piloto.setTotalCarreras(piloto.getTotalCarreras() + 1);
			piloto.setTotalPuntos(piloto.getTotalPuntos() + puntos);

			if (resultado.getPosicion() == 1) {
				piloto.setTotalVictorias(piloto.getTotalVictorias() + 1);
			}
			
			if (resultado.getPosicion() <= 3) {
				piloto.setTotalPodios(piloto.getTotalPodios() + 1);
			}
			
			pilotoService.save(piloto);

			if (piloto.getEquipo() != null) {
				Equipo equipo = piloto.getEquipo();
				equipo.setTotalPuntos(equipo.getTotalPuntos() + puntos);
				equipoService.save(equipo);
			}
		}

		carrera.setJugada(true);
		carreraService.save(carrera);
	}

	private int calcularPuntos(int posicion) {
		int puntos = 0;
		switch (posicion) {
			case 1:
				puntos = 25;
				break;
			case 2:
				puntos = 20;
				break;
			case 3:
				puntos = 16;
				break;
			case 4:
				puntos = 13;
				break;
			case 5:
				puntos = 11;
				break;
			case 6:
				puntos = 10;
				break;
			case 7:
				puntos = 9;
				break;
			case 8:
				puntos = 8;
				break;
			case 9:
				puntos = 7;
				break;
			case 10:
				puntos = 6;
				break;
			case 11:
				puntos = 5;
				break;
			case 12:
				puntos = 4;
				break;
			case 13:
				puntos = 3;
				break;
			case 14:
				puntos = 2;
				break;
			case 15:
				puntos = 1;
				break;
			default:
				puntos = 0; 
				break;
		}
		return puntos;
	}
}