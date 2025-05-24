package com.soorot.application.controller;

import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soorot.application.config.JwtFilter;
import com.soorot.application.dto.Token;
import com.soorot.application.model.Usuario;
import com.soorot.application.service.UsuariosService;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
@RequestMapping(path="/soorot/login/") //http://localhost:8080/api/login/
public class LoginController {
	private final UsuariosService usuariosService;
	
	@Autowired
	public LoginController(UsuariosService usuariosService) {
		this.usuariosService = usuariosService;
	}//LoginController
	
	@PostMapping	
	public Token loginUser(@RequestBody Usuario usuario) throws ServletException {
		if(usuariosService.validateUser(usuario)) {
			return new Token(generateToken(usuario.getEmail()));
		}//if validateUser
		throw new ServletException("Nombre de usuario o contraseña incorrectos[" +
				usuario.getEmail() + "]");	
	}//loginUser
	
	private String generateToken(String email) {
		Calendar calendar = Calendar.getInstance(); // Fecha y hora del día de hoy
		//calendar.add(Calendar.MINUTE, 30);   // Dato más real
		calendar.add(Calendar.HOUR, 24); // Para pruebas
		
		return Jwts.builder().setSubject(email).claim("role", "user")
				.setIssuedAt(new Date())
				.setExpiration(calendar.getTime())
				.signWith(SignatureAlgorithm.HS256, JwtFilter.secret)
				.compact();
	}//generateToken
	
}//class Login
