package com.soorot.application.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soorot.application.model.Usuario;

@Service
public class UsuariosService {
	private final List<Usuario> lista = new ArrayList<Usuario>();
	
	@Autowired
	public UsuariosService() {
		lista.add(new Usuario("Dulce Carmona", "eclud_car_95@gmail.com", "Casd950825MDFRNL/09", "2381015478"));
		lista.add(new Usuario("Emilio Muñoz", "mrhemilio@outlook.com", "HotdogCostco$45", "5585248455"));
		lista.add(new Usuario("Fernando Bartolome", "fbartolomem.98@gmail.com", "Suki0712$", "5610921190"));
		lista.add(new Usuario("Uriel Medina", "urielmedina@ciencias.unam.mx", "Nabopo12.", "5613129854"));
		lista.add(new Usuario("Eduardo Esteva Sarralde", "eestevass@gmail.com", "Enero2001#", "5519135105"));
	}// Constructor
	
	public List<Usuario> getUsuarios(){
		return lista;
	}//getUsuarios

	public Usuario getUsuario(Long id) {
		Usuario tmp = null;
		for (Usuario usuario : lista) {
			if(usuario.getId()==id) {
				tmp = usuario;
				break;
			}//if
		}//foreach
		return tmp;
	}//getUsuario

	public Usuario deleteUsuario(Long id) {
		Usuario tmp = null;
		for (Usuario usuario : lista) {
			if(usuario.getId()==id) {
				tmp = usuario;
				lista.remove(usuario);
				break;
			}//if
		}//foreach
		return tmp;
	}//deleteUsuario

	public Usuario addUsuario(Usuario usuario) {
		lista.add(usuario);
		return usuario;
	}//addUsuario
	
	public Usuario updateUsuario(Long id, String nombre, String email, String password, String telefono) {
		Usuario tmp = null;
		for (Usuario usuario : lista) {
			if(usuario.getId()==id) {
				if(nombre!=null) usuario.setNombre(nombre);
				if(email!=null) usuario.setEmail(email);
				if(password!=null) usuario.setPassword(password);
				if(telefono!=null) usuario.setTelefono(telefono);
				tmp = usuario;
				break;
			}//if
		}//foreach
		return tmp;
	}//updateUsuario
	
}//class UsuariosService
