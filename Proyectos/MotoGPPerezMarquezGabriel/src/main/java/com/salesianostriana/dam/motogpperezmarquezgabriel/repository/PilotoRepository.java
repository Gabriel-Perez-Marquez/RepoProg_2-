package com.salesianostriana.dam.motogpperezmarquezgabriel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.salesianostriana.dam.motogpperezmarquezgabriel.model.Piloto;


@Repository
public interface PilotoRepository extends JpaRepository<Piloto, Long>{

}
