package com.salesianostriana.dam.motogpperezmarquezgabriel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.salesianostriana.dam.motogpperezmarquezgabriel.service.MecanicoService;

@Controller
@RequestMapping("/mecanicos")
public class MecanicoController {
	
	
	@Autowired
	private MecanicoService mecanicoService;

	@PostMapping("/reparar/{equipoId}")
	public String arreglarMotos(@PathVariable("equipoId") Long id) {
		
		mecanicoService.repararMotosDelEquipo(id, mecanicoService.recogerMotosDelEquipo(id));
		
		return "redirect:/equipos/" + id;
		
	}
	
	
	
}
