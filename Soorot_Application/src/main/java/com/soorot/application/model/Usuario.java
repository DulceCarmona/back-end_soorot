package com.soorot.application.model;

public class Usuario {
	private Long id;
	private String nombre;
	private String email;
	private String password;
	private String telefono;
	private static Long total = Long.valueOf(0);
	//Constructor
	public Usuario(String nombre, String email, String password, String telefono) {
		this.nombre = nombre;
		this.email = email;
		this.password = password;
		this.telefono = telefono;
		Usuario.total++;
		this.id = Usuario.total;
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
