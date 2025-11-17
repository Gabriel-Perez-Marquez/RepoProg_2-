package com.salesianostriana.dam.motogpperezmarquezgabriel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.salesianostriana.dam.motogpperezmarquezgabriel.model.Equipo;
import com.salesianostriana.dam.motogpperezmarquezgabriel.model.Patrocinadores;
import com.salesianostriana.dam.motogpperezmarquezgabriel.service.CarreraService;
import com.salesianostriana.dam.motogpperezmarquezgabriel.service.ClasificacionService;
import com.salesianostriana.dam.motogpperezmarquezgabriel.service.EquipoService;
import com.salesianostriana.dam.motogpperezmarquezgabriel.service.PilotoService;

import java.util.Optional;

@Controller
public class EquipoController {

    @Autowired
    private EquipoService equipoService;

    @Autowired
    private PilotoService pilotoService;

    @Autowired
    private CarreraService carreraService;

    @Autowired
    private ClasificacionService clasificacionService;

    @GetMapping("/equipos")
    public String mostrarEquipos(Model model) {
        model.addAttribute("equipos", equipoService.findAll());
        return "equipos/equipos";
    }

    @GetMapping("/equipos/agregar-equipo")
    public String agregarEquipo(Model model) {
        Equipo e = new Equipo();
        model.addAttribute("equipo", e);
        model.addAttribute("pilotos", pilotoService.findAll());
        model.addAttribute("carreras", carreraService.findAll());
        model.addAttribute("patrocinadores", Patrocinadores.values());
        model.addAttribute("clasificaciones", clasificacionService.findAll());
        return "equipos/agregarEquipo";
    }

    @PostMapping("/equipos/save")
    public String guardarEquipo(@ModelAttribute Equipo e) {
        equipoService.save(e); 
        return "redirect:/equipos";
    }

    
    @GetMapping("/equipos/edit/{id}")
    public String editarEquipo(@PathVariable Long id, Model model) {
        Optional<Equipo> opt = equipoService.findById(id);
        Equipo e;
        if (opt.isEmpty()) {
            return "redirect:/equipos";
        } else {
        	e = opt.get();
        }
        
        model.addAttribute("equipo", e);
        model.addAttribute("pilotos", pilotoService.findAll());
        model.addAttribute("carreras", carreraService.findAll());
        model.addAttribute("patrocinadores", Patrocinadores.values());
        model.addAttribute("clasificaciones", clasificacionService.findAll());
        return "equipos/agregarEquipo";
    }
    
    @GetMapping("/equipos/{id}")
    public String mostrarDetallesEquipo(@PathVariable Long id, Model model) {
    	
    	model.addAttribute("equipo", equipoService.findById(id).orElse(null));
    	
    	return "equipos/mostrarDetallesEquipo";
    	
    }
}