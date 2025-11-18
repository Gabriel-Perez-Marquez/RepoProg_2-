package com.salesianostriana.dam.motogpperezmarquezgabriel.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
@Builder
public class ResultadoCarrera {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    private int posicion;
    
    private int puntosObtenidos;

    @ManyToOne
    private Carrera carrera;

    @ManyToOne
    private Piloto piloto;
    
    public ResultadoCarrera(int posicion, int puntosObtenidos, Carrera carrera, Piloto piloto) {
        this.posicion = posicion;
        this.puntosObtenidos = puntosObtenidos;
        this.carrera = carrera;
        this.piloto = piloto;
    }
}