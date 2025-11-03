package com.salesianostriana.dam.motogpperezmarquezgabriel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String bienvenida () {
		return "index";
	}
	
}
