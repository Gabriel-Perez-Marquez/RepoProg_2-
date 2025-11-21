package com.salesianostriana.dam.motogpperezmarquezgabriel.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.motogpperezmarquezgabriel.model.Piloto;
import com.salesianostriana.dam.motogpperezmarquezgabriel.service.EquipoService;
import com.salesianostriana.dam.motogpperezmarquezgabriel.service.MotoService;
import com.salesianostriana.dam.motogpperezmarquezgabriel.service.PilotoService;

@Controller
public class PilotoController {


	@Autowired
	private PilotoService pilotoService;
	
	
	@Autowired
	private MotoService motoService;
	
	@Autowired
	private EquipoService equipoService;
	
	
	@GetMapping("/pilotos")
	public String mostrarPilotos (Model model) {
		model.addAttribute("pilotos", pilotoService.findAll());
		
		return "pilotos/pilotos";
		
	}
	
	@GetMapping("/pilotos/{id}")
	public String mostrarDetallesPiloto(@PathVariable Long id, Model model) {
		
		model.addAttribute("piloto", pilotoService.findById(id).orElse(null));
		
		return "pilotos/mostrarDetallesPil";
	}
	
	@GetMapping("/pilotos/new")
	public String crearPiloto(Model model) {
		Piloto p = new Piloto();
		
		
		model.addAttribute("piloto", p);
		model.addAttribute("motos", motoService.findAll());
		model.addAttribute("equipos", equipoService.findAll());
		
		return "pilotos/pilotoForm";
	}
	
	@PostMapping("/pilotos/save")
	public String guardarPiloto(@ModelAttribute Piloto p) {
		pilotoService.save(p);
		return "redirect:/pilotos";
		
	}
	
	@GetMapping("/pilotos/edit/{id}")
	public String editarPiloto(@PathVariable Long id, Model model) {
		
		Optional<Piloto> posiblePiloto = pilotoService.findById(id);
		
		if (posiblePiloto.isPresent()) {
			model.addAttribute("piloto", posiblePiloto.get());
			
			model.addAttribute("motos", motoService.findAll());
			model.addAttribute("equipos", equipoService.findAll());
			
			return "pilotos/pilotoForm";
		} else {
			return "redirect:/pilotos";
		}
	}
	
	
	
	
	
}
