package com.salesianostriana.dam.motogpperezmarquezgabriel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.salesianostriana.dam.motogpperezmarquezgabriel.model.Equipo;

public interface EquipoRepository extends JpaRepository<Equipo, Long> {
	
	List<Equipo> findAllByOrderByTotalPuntosDesc();

}