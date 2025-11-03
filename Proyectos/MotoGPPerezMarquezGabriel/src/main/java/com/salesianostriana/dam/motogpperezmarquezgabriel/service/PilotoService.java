package com.salesianostriana.dam.motogpperezmarquezgabriel.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.motogpperezmarquezgabriel.model.Piloto;
import com.salesianostriana.dam.motogpperezmarquezgabriel.repository.PilotoRepository;

@Service
public class PilotoService {

	@Autowired
	private PilotoRepository pilotoRepository;
	
	
	public List<Piloto> buscarTodos(){
		return pilotoRepository.findAll();
	}
	
	public Optional<Piloto> buscarPorID (Long id) {
		return pilotoRepository.findById(id);
	}
	
}
