package com.salesianostriana.dam.motogpperezmarquezgabriel.model;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Temporada {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;

	@OneToMany(mappedBy = "temporada", fetch = FetchType.EAGER)
    @ToString.Exclude
	private List<Equipo> equipos;

	@OneToMany(mappedBy = "temporada", fetch = FetchType.EAGER)
    @ToString.Exclude
	private List<Carrera> carreras;
}