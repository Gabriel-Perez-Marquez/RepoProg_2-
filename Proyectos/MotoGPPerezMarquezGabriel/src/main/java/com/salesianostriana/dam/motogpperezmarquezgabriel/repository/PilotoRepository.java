package com.salesianostriana.dam.motogpperezmarquezgabriel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.dam.motogpperezmarquezgabriel.model.Mecanico;
import com.salesianostriana.dam.motogpperezmarquezgabriel.model.Piloto;

public interface PilotoRepository extends JpaRepository<Piloto, Long> {

    List<Piloto> findAllByOrderByTotalPuntosDesc();
    List<Piloto> findByEquipo_Id(Long id);
    List<Piloto> findByEquipoIsNull();
}