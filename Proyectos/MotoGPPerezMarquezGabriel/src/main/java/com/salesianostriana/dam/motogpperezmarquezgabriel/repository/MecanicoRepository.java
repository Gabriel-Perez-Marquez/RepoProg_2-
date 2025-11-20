package com.salesianostriana.dam.motogpperezmarquezgabriel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.salesianostriana.dam.motogpperezmarquezgabriel.model.Mecanico;

@Repository
public interface MecanicoRepository extends JpaRepository<Mecanico, Long> {

	List<Mecanico> findByEquipoId(Long equipoId);
	
}
