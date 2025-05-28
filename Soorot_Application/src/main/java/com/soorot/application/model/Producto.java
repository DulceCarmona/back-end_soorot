package com.soorot.application.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table

@Entity  //indica que va a ser una entidad de la base de datos
@Table(name="productos")  //cambia el nombre de Producto a productos
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", unique = true, nullable = false)
	private Long id;
	@Column(nullable = false)
	private String nombre;
	@Column(nullable = false)
	private Double precio;
	@Column(nullable = false)
	private String descripcion;
	@Column(nullable = false)
	private String categoria;
	@Column(nullable = false)
	private String imagen;
	
	
	//1.Constructor
	public Producto(String nombre,Double precio, String descripcion, String categoria,String imagen) {
		this.nombre=nombre;
		this.precio=precio;
		this.descripcion=descripcion;
		this.categoria=categoria;
		this.imagen=imagen;
	}//ConstructorProducto
	
	public Producto() {} //constructor vacío
	
	public String getNombre() {
		return nombre;
	}//getNombre

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//setNombre
	
	public Double getPrecio() {
		return precio;
	}//getPrecio

	public void setPrecio(Double precio) {
		this.precio = precio;
	}//setPrecio

	public String getDescripcion() {
		return descripcion;
	}//getDescripcion

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}//setDescripcion
	
	public String getCategoria() {
		return categoria;
	}//getCategoria

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}//setCategoria

	public String getImagen() {
		return imagen;
	}//getImagen

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}//setImagen

	
	public Long getId() {
		return id;
	}//getId

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", descripcion=" + descripcion + ", categoria="+categoria +", imagen=" + imagen
				+ "]";
	}//toString
	
}//classProducto
