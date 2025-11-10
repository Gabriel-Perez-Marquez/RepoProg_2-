package com.salesianostriana.dam.motogpperezmarquezgabriel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.salesianostriana.dam.motogpperezmarquezgabriel.model.Clasificacion;

@Repository
public interface ClasificacionRepository extends JpaRepository<Clasificacion, Long> {

}
