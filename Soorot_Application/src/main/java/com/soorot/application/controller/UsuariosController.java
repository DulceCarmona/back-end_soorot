package com.soorot.application.controller;

import java.util.List;

import com.soorot.application.dto.ChangePassword;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soorot.application.model.Usuario;
import com.soorot.application.service.UsuariosService;

@RestController
@RequestMapping(path="/soorot/usuarios/")
public class UsuariosController {
	private final UsuariosService usuariosService;
	
	@Autowired
	public UsuariosController(UsuariosService usuariosService) {
		this.usuariosService = usuariosService;
	}//constructor
	
	@GetMapping
	public List<Usuario> getUsuarios(){
		return usuariosService.getUsuarios();
	}//getUsuarios

	@GetMapping(path="{usuid}")
	public Usuario getUsuario(@PathVariable("usuid") Long id) {
		return usuariosService.getUsuario(id);
	}//getUsuario
	
	@DeleteMapping(path="{usuid}") // http://localhost:8080/soorot/usuarios/1
	public Usuario deleteUsuario(@PathVariable("usuid") Long id) {
		return usuariosService.deleteUsuario(id);
	}//deleteUsuario
	
	@PostMapping
	public Usuario addUsuario(@RequestBody Usuario usuario) {
		return usuariosService.addUsuario(usuario);
	}//addUsuario
	
	@PutMapping(path="{usuid}")
	public Usuario updateUsuario(@PathVariable("usuid") Long id, 
			@RequestBody ChangePassword changePassword) {
		return usuariosService.updateUsuario(id, changePassword);
	}//updateUsuario 
	
}//classController
