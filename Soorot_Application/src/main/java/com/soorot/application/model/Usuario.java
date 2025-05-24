package com.soorot.application.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  //indica que va a ser una entidad de la base de datos
@Table(name="usuarios")  //cambia el nombre de Usuarios a usuario en u minuscula

public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long id;
	@Column(nullable = false)
	private String nombre;
	@Column(nullable = false)
	private String email;
	@Column(nullable = false)
	private String password;
	@Column(nullable = false)
	private String telefono;
	
	//Constructor
	public Usuario(String nombre, String email, String password, String telefono) {
		this.nombre = nombre;
		this.email = email;
		this.password = password;
		this.telefono = telefono;
		
	}//Constructor Usuarios	
		//Constructor vacío
		public Usuario() {}
		
		//Getters & Setters
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getTelefono() {
			return telefono;
		}
		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}
		public Long getId() {
			return id;
		}

		@Override
		public String toString() {
			return "Usuario [id=" + id + ", nombre=" + nombre + ", email=" + email + ", password=" + password
					+ ", telefono=" + telefono + "]";
		}
	
}//class Usuarios
