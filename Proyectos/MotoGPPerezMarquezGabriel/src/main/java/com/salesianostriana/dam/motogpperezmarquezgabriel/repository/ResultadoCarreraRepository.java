package com.salesianostriana.dam.motogpperezmarquezgabriel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.dam.motogpperezmarquezgabriel.model.ResultadoCarrera;

public interface ResultadoCarreraRepository extends JpaRepository<ResultadoCarrera, Long> {
	
	List<ResultadoCarrera> findByPilotoId(Long pilotoId);

}
