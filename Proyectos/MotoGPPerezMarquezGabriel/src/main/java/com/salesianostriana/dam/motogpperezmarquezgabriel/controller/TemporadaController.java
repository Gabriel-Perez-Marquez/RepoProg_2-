package com.salesianostriana.dam.motogpperezmarquezgabriel.controller;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.salesianostriana.dam.motogpperezmarquezgabriel.model.Equipo;
import com.salesianostriana.dam.motogpperezmarquezgabriel.model.Piloto;
import com.salesianostriana.dam.motogpperezmarquezgabriel.model.Temporada;
import com.salesianostriana.dam.motogpperezmarquezgabriel.service.EquipoService;
import com.salesianostriana.dam.motogpperezmarquezgabriel.service.PilotoService;
import com.salesianostriana.dam.motogpperezmarquezgabriel.service.TemporadaService;

@Controller
@RequestMapping("/temporadas")
public class TemporadaController {

	@Autowired
	private TemporadaService temporadaService;

	@Autowired
	private PilotoService pilotoService;

	@Autowired
	private EquipoService equipoService;
	
	@GetMapping("")
	public String mostrarTodas(Model model) {
		model.addAttribute("temporadas", temporadaService.findAll());
		return "temporadas/temporadas";
	}
	
	@GetMapping("/{id}")
	public String mostrarDetallesTemporada(@PathVariable Long id, Model model) {
		
		Temporada t = temporadaService.findById(id)
				.orElseThrow(() -> new RuntimeException("Temporada no encontrada"));
		
		model.addAttribute("temporada", t);
		model.addAttribute("pilotos", pilotoService.findAll());
		model.addAttribute("equipos", equipoService.findAll());
		return "temporadas/mostrarDetalles";
	}

	@GetMapping("/clasificacion")
	public String verClasificacion(Model model) {
		
		List<Piloto> pilotos = pilotoService.findAll();
		pilotos.sort(Comparator.comparingInt(Piloto::getTotalPuntos).reversed());
		
		List<Equipo> equipos = equipoService.findAll();
		equipos.sort(Comparator.comparingInt(Equipo::getTotalPuntos).reversed());

		model.addAttribute("pilotos", pilotos);
		model.addAttribute("equipos", equipos);
		
		return "temporadas/clasificacion"; 
	}
}