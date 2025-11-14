package com.salesianostriana.dam.motogpperezmarquezgabriel.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Equipo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private double dinero;
	@Enumerated(EnumType.STRING)
	private Patrocinadores patrocinador;
	@OneToMany
	@ToString.Exclude
	private List<Piloto> pilotos;
	@ManyToMany
	@ToString.Exclude
	private List<Carrera> carreras;
	@ManyToOne
	@ToString.Exclude
	private Clasificacion clasificacion;
	private int puntos;

}
