package com.salesianostriana.dam.motogpperezmarquezgabriel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.salesianostriana.dam.motogpperezmarquezgabriel.model.Temporada;

@Repository
public interface TemporadaRepository extends JpaRepository<Temporada, Long> {

}
