package com.salesianostriana.dam.motogpperezmarquezgabriel.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.motogpperezmarquezgabriel.model.Equipo;
import com.salesianostriana.dam.motogpperezmarquezgabriel.model.Mecanico;
import com.salesianostriana.dam.motogpperezmarquezgabriel.model.Moto;
import com.salesianostriana.dam.motogpperezmarquezgabriel.model.Piloto;
import com.salesianostriana.dam.motogpperezmarquezgabriel.repository.MecanicoRepository;
import com.salesianostriana.dam.motogpperezmarquezgabriel.repository.MotoRepository;

@Service
public class MecanicoService {

	@Autowired
	private MecanicoRepository mecanicoRepository;
	
	@Autowired
	private EquipoService equipoService;
	
	@Autowired
	private MotoRepository motoRepository;
	
	
	public List<Moto> recogerMotosDelEquipo (Long id){
		Equipo equipo = equipoService.findById(id)
				.orElseThrow(() -> new RuntimeException("Equipo no encontrado"));
		List<Moto> motosDelEquipo = equipo.getPilotos().stream()
				.map(Piloto::getMoto)
				.filter(moto -> moto != null && moto.getPorcentDesgaste() > 0)
				.collect(Collectors.toList());
		
		return motosDelEquipo;
	}
	
	
	public double calcularCosteReparacion(Long equipoId) {
		
		List<Mecanico> mecanicos = mecanicoRepository.findByEquipoId(equipoId);
		
		List<Moto> motosDelEquipo = recogerMotosDelEquipo(equipoId);
		
		
		double costeBase;
		double costeVariableTotal = 0.0;
		double plus_bajo = 1500;
        double plus_medio = 3000;
        double plus_alto = 7500;
        double desgasteBajo = 35;
        double desgasteMedio = 50;
        double desgasteAlto = 100;
		
		

		if (mecanicos.isEmpty()) {
			return 0;
		}
		if (motosDelEquipo.isEmpty()) {
			return 0;
		}
		
		
		costeBase = mecanicos.stream()
									.mapToDouble(Mecanico::getCuota)
									.sum();
		
		

		for (Moto moto : motosDelEquipo) {
            double desgaste = moto.getPorcentDesgaste();
            
            System.out.println(desgaste);
            
            if (desgaste <= desgasteAlto && desgaste > desgasteMedio) {
                costeVariableTotal += plus_alto;
            } else if (desgaste <= desgasteMedio && desgaste > desgasteBajo) {
                costeVariableTotal += plus_medio;
            } else {
                costeVariableTotal += plus_bajo;
            }
        }
		
		System.out.println(costeVariableTotal);

		return costeBase + costeVariableTotal;
		
		
	}
	
	
	public void repararMotosDelEquipo (Long equipoId, List<Moto> motosDelEquipo) {
		double costeTotalReparacion = calcularCosteReparacion(equipoId);
		Equipo equipo = equipoService.findById(equipoId).orElse(null);
        double desgasteMotoNueva = 0;
        
		if (equipo.getDinero() < costeTotalReparacion) {
			String errorMsg = String.format("Dinero insuficiente. Coste Total: %.2f€, Disponible: %.2f€", 
											costeTotalReparacion, equipo.getDinero());
			throw new RuntimeException(errorMsg);
		}
		
		
		for(Moto moto : motosDelEquipo) {
			moto.setPorcentDesgaste(desgasteMotoNueva);
			motoRepository.save(moto);
		}
		
		equipo.setDinero(equipo.getDinero() - costeTotalReparacion);
		equipoService.save(equipo);
	}
}