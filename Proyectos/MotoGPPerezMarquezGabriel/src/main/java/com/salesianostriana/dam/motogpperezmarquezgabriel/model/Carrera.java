package com.salesianostriana.dam.motogpperezmarquezgabriel.model;

import java.time.LocalDate;
import java.util.List;
import jakarta.persistence.Entity;
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
public class Carrera {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombreCircuito;
	private LocalDate fecha;
	private boolean jugada;
    
	@ManyToMany(mappedBy = "carreras") 
	@ToString.Exclude
	private List<Equipo> equipos;
    
	@ManyToOne 
	@ToString.Exclude
	private Temporada temporada;

    @OneToMany(mappedBy = "carrera")
    @ToString.Exclude
    private List<ResultadoCarrera> resultados;
}