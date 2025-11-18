package com.salesianostriana.dam.motogpperezmarquezgabriel.model;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Piloto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private double dinero;
    
	@ManyToOne
	private Moto moto;
    
	@ManyToOne
	@JoinColumn(foreignKey = @ForeignKey(name = "fk_piloto_equipo"))
	private Equipo equipo;

    @OneToMany(mappedBy = "piloto")
    @ToString.Exclude
    private List<ResultadoCarrera> resultados;
	
	private int totalPuntos;
	
	private int totalVictorias;
	
	private int totalPodios;
	
	private int totalCarreras;
	
	
}



