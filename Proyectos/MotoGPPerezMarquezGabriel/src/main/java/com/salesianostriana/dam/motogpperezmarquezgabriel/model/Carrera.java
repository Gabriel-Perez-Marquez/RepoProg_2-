package com.salesianostriana.dam.motogpperezmarquezgabriel.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Carrera {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombreCircuito;
	private LocalDate fecha;
	private List<Equipo> equipos;
	private boolean jugada;
	private Piloto primer_puesto;
	private Piloto segundo_puesto;
	private Piloto terecer_puesto;

}
