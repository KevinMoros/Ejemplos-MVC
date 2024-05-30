package com.curso.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class Ejemplo02Controller {
	@GetMapping
	public String index(Model model) {
		model.addAttribute("nombre", "Juanito");
		
		model.addAttribute("frutas", List.of("Cambur","Cerezas","Guanabana", "Guayaba"));
		return "index";
	}
	
	@GetMapping("/welcome") //welcome?name=name
	public String welcome(@RequestParam(name ="name", required = false, defaultValue = "Desconocido") String name,Model model) {
		model.addAttribute("name",name);
		return "pagina1";
	}

}
