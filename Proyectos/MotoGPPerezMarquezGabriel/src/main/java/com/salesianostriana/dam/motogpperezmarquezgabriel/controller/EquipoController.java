package com.salesianostriana.dam.motogpperezmarquezgabriel.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.motogpperezmarquezgabriel.model.Equipo;
import com.salesianostriana.dam.motogpperezmarquezgabriel.model.Mecanico;
import com.salesianostriana.dam.motogpperezmarquezgabriel.model.Patrocinadores;
import com.salesianostriana.dam.motogpperezmarquezgabriel.service.CarreraService;
import com.salesianostriana.dam.motogpperezmarquezgabriel.service.EquipoService;
import com.salesianostriana.dam.motogpperezmarquezgabriel.service.MecanicoService;
import com.salesianostriana.dam.motogpperezmarquezgabriel.service.PilotoService;
import com.salesianostriana.dam.motogpperezmarquezgabriel.service.TemporadaService;

@Controller
public class EquipoController {

    @Autowired
    private EquipoService equipoService;

    @Autowired
    private PilotoService pilotoService;

    @Autowired
    private CarreraService carreraService;

    @Autowired
    private TemporadaService temporadaService;
    
    @Autowired
    private MecanicoService mecanicoService;

    @GetMapping("/equipos")
    public String mostrarEquipos(Model model) {
        model.addAttribute("equipos", equipoService.findAll());
        return "equipos/equipos";
    }

    @GetMapping("/equipos/agregar-equipo")
    public String agregarEquipo(Model model) {
        Equipo e = new Equipo();
        model.addAttribute("equipo", e);
        model.addAttribute("pilotos", pilotoService.findPilotosLibres());
        model.addAttribute("carreras", carreraService.findAll());
        model.addAttribute("patrocinadores", Patrocinadores.values());
        model.addAttribute("temporadas", temporadaService.findAll());
        model.addAttribute("mecanicos", mecanicoService.findAll());
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
        if (opt.isEmpty()) {
            return "redirect:/equipos";
        }
        
        model.addAttribute("equipo", opt.get());
        model.addAttribute("pilotos", pilotoService.findAll());
        model.addAttribute("carreras", carreraService.findAll());
        model.addAttribute("patrocinadores", Patrocinadores.values());
        model.addAttribute("temporadas", temporadaService.findAll());
        model.addAttribute("mecanicos", mecanicoService.findAll());
        return "equipos/agregarEquipo";
    }
    
    @GetMapping("/equipos/{id}")
    public String mostrarDetallesEquipo(@PathVariable Long id, Model model) {
    	
    	Equipo e = equipoService.findById(id).orElse(null);
    	
    	model.addAttribute("equipo", e);
    	
    	
    	
    	model.addAttribute("costeTotalReparacion", mecanicoService.calcularCosteReparacion(id));    		
    	
    	return "equipos/mostrarDetallesEquipo";
    	
    }
    
    
    
    @GetMapping("/equipos/delete/{id}")
    public String eliminarEquipo(@PathVariable Long id) {
    	
    	equipoService.deleteById(id);
    	
    	return "redirect:/equipos";
    }
    
    
    
}