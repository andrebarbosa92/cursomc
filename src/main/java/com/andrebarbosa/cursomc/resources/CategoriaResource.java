package com.andrebarbosa.cursomc.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	@GetMapping
	public String listar() {
		return "Está funcionando!";
	}
	
	@GetMapping(value="/1")
	public String listarUm() {
		return "Listando apenas um!";
	}
}
