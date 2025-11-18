package com.salesianostriana.dam.motogpperezmarquezgabriel.controller;
import com.salesianostriana.dam.motogpperezmarquezgabriel.service.TemporadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.salesianostriana.dam.motogpperezmarquezgabriel.repository.TemporadaRepository;

@Controller
@RequestMapping("/clasificaciones")
public class TemporadaController {


	
	@Autowired
	private TemporadaRepository temporadaRepository;

	@Autowired
    private TemporadaService temporadaService;
	
	
	@GetMapping("")
	public String mostrarTodas(Model model) {

		model.addAttribute("temporadas", temporadaService.findAll());
		
		return "temporadas/temporadas";
		
	}
	
	@GetMapping("/{id}")
	public String mostrarDetallesTemporada(@PathVariable Long id, Model model) {
		
		model.addAttribute("temporada",temporadaService.findById(id));
		
		return "temporadas/mostrarDetalles";
	}
	
}
