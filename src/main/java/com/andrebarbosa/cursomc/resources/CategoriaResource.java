package com.andrebarbosa.cursomc.resources;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andrebarbosa.cursomc.domain.Categoria;
import com.andrebarbosa.cursomc.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	@Autowired
	CategoriaService service;
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Categoria> find(@PathVariable Integer id) {
		
		Categoria obj = service.buscar(id);
		
		return ResponseEntity.ok().body(obj);
	}
}
