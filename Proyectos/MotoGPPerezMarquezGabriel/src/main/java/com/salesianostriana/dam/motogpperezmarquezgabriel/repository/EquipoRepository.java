package com.salesianostriana.dam.motogpperezmarquezgabriel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.salesianostriana.dam.motogpperezmarquezgabriel.model.Equipo;

@Repository
public interface EquipoRepository extends JpaRepository<Equipo, Long> {

}
