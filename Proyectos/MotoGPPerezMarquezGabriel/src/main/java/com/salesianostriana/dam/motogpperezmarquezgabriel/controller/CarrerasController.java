package com.salesianostriana.dam.motogpperezmarquezgabriel.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.salesianostriana.dam.motogpperezmarquezgabriel.model.Carrera;
import com.salesianostriana.dam.motogpperezmarquezgabriel.model.Equipo;
import com.salesianostriana.dam.motogpperezmarquezgabriel.model.Piloto;
import com.salesianostriana.dam.motogpperezmarquezgabriel.model.ResultadoCarrera;
import com.salesianostriana.dam.motogpperezmarquezgabriel.model.Temporada;
import com.salesianostriana.dam.motogpperezmarquezgabriel.service.*;

@Controller
@RequestMapping("/carreras")
public class CarrerasController {

    private final EquipoService equipoService;

	@Autowired
	private PilotoService pilotoService;
	
	@Autowired
	private CarreraService carreraService;
	
	@Autowired
	private TemporadaService temporadaService;
	
	@Autowired
	private ResultadoCarreraService resultadoCarreraService;


    CarrerasController(EquipoService equipoService) {
        this.equipoService = equipoService;
    }

	
	@GetMapping("")
	public String listarCarrerasPorTemporada(Model model) {
		model.addAttribute("temporadas", temporadaService.findAll());
		return "carreras/carreras";
	}
	
	@GetMapping("/jugar/{id}")
	public String mostrarFormularioJugarCarrera(@PathVariable Long id, Model model) {
		
		Carrera carrera = carreraService.findById(id)
			.orElseThrow(() -> new RuntimeException("Carrera no encontrada"));
		
		if (carrera.isJugada()) {
			return "redirect:/carreras/resultados/" + id;
		}
		
		Temporada temporada = carrera.getTemporada();
		List<Piloto> pilotosParticipantes = new ArrayList<>();
		
		if (temporada != null && temporada.getEquipos() != null) {
			for (Equipo e : temporada.getEquipos()) {
				pilotosParticipantes.addAll(e.getPilotos());
			}
		}
		
		model.addAttribute("carrera", carrera);
		model.addAttribute("pilotos", pilotosParticipantes);
		
		return "carreras/form-jugar-carrera";
	}
	
	@PostMapping("/jugar/{id}")
	public String guardarResultados(
	        @PathVariable("id") Long carreraId, 
	        @RequestParam(name = "pilotoId", required = false) List<Long> pilotoIds, 
	        @RequestParam(name = "posicion", required = false) int [] posiciones) {
		
		if (pilotoIds == null || posiciones == null) {
			return "redirect:/carreras/jugar/" + carreraId;
		}
		
		Piloto p;
		
		ResultadoCarrera res;
		
		double plusEquipo = 2000;
		
		List<Piloto> pilotosOrdenados = pilotoService.findAllById(pilotoIds);;
		
		

		List<ResultadoCarrera> resultadosInput = new ArrayList<>();
		
		
		for (int i = 0; i < pilotoIds.size(); i++) {
			
			
			int posActual = posiciones[i];
			
			if (posActual > 0) { 
				res = new ResultadoCarrera();
				
				p = new Piloto();
				p.setId(pilotoIds.get(i));
				
				res.setPiloto(p);
				res.setPosicion(posActual);
				resultadosInput.add(res);
			}
		}
	
		
		carreraService.repartirPremiosPorClasificacion(pilotosOrdenados, plusEquipo);
		resultadoCarreraService.registrarResultados(carreraId, resultadosInput);
		 
		
		return "redirect:/carreras";
	}
	
	@GetMapping("/resultados/{id}")
	public String verResultadosCarrera(@PathVariable Long id, Model model) {
		
		Carrera carrera = carreraService.findById(id)
			.orElseThrow(() -> new RuntimeException("Carrera no encontrada"));

		if (!carrera.isJugada()) {
			return "redirect:/carreras/jugar/" + id;
		}

		List<ResultadoCarrera> resultados = carrera.getResultados();
		if (resultados != null) {
			resultados.sort(Comparator.comparingInt(ResultadoCarrera::getPosicion));
		}
		
		model.addAttribute("carrera", carrera);
		model.addAttribute("resultados", resultados);
		
		return "carreras/resultados-carrera";
	}
	
	@GetMapping("/new")
	public String mostrarFormularioNuevaCarrera(Model model) {
		model.addAttribute("carrera", new Carrera());
		model.addAttribute("temporadas", temporadaService.findAll());
		return "carreras/form-carrera";
	}
	
	@GetMapping("/edit/{id}")
	public String mostrarFormularioEditarCarrera(@PathVariable Long id, Model model) {
		model.addAttribute("carrera", carreraService.findById(id)
			.orElseThrow(() -> new RuntimeException("Carrera no encontrada")));
		model.addAttribute("temporadas", temporadaService.findAll());
		return "carreras/form-carrera";
	}
	
	@PostMapping("/save")
	public String saveCarrera(@ModelAttribute Carrera carrera) {
		
		Temporada t = temporadaService.findById(carrera.getTemporada().getId())
	            .orElseThrow(() -> new RuntimeException("Temporada no encontrada"));
		
		if (carrera.getEquipos() != null) {
	        carrera.setEquipos(new ArrayList<>(carrera.getEquipos()));
	    }
		
		carrera.setTemporada(t);
		carrera.setEquipos(equipoService.findAll()); 
		
		carreraService.save(carrera);
		return "redirect:/carreras";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteCarrera(@PathVariable Long id) {
		
		Carrera carrera = carreraService.findById(id)
				.orElseThrow(() -> new RuntimeException("Carrera no encontrada"));
		
		if (carrera.isJugada() && carrera.getResultados() != null && !carrera.getResultados().isEmpty()) {
			return "redirect:/carreras/?error=NoSePuedeBorrar";
		}
		
		carreraService.deleteById(id);
		return "redirect:/carreras";
	}
}

