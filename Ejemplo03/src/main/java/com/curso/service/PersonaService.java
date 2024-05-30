package com.curso.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.curso.model.Persona;

@Service
public class PersonaService {

	static List<Persona> lista = new ArrayList<Persona>();
	
	static {
		Persona p1 = new Persona("Pepito", "Molina", 23);
		Persona p2 = new Persona("Raul", "Vello", 15);
		
		lista.add(p1);
		lista.add(p2);
	}
	
	public List<Persona> buscarTodas(){
		return lista;
	}	
}
