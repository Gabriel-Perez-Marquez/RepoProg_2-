package com.salesianostriana.dam.motogpperezmarquezgabriel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.salesianostriana.dam.motogpperezmarquezgabriel.service.PilotoService;

@Controller
public class PilotoController {

	@Autowired
	private PilotoService pilotoService;
	
	
	@GetMapping("/pilotos")
	public String mostrarPilotos (Model model) {
		model.addAttribute("pilotos", pilotoService.buscarTodos());
		
		return "pilotos";
		
	}
	
	@GetMapping("/pilotos/{id}")
	public String mostrarDetallesPiloto(@PathVariable Long id, Model model) {
		
		model.addAttribute("piloto", pilotoService.buscarPorID(id).orElse(null));
		
		return "mostrarDetallesPil";
	}
	
}
