package com.salesianostriana.dam.motogpperezmarquezgabriel.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Moto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String marca;
	private double cilindrada;
	@Column(name = "tipo_motor")
	private String tipoMotor;
	@Column(name = "porcent_desgaste")
	private int porcentDesgaste;
}