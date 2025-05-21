package com.soorot.application.model;



public class ProductosModel {
	private Long id;
	private String nombre;
	private Double precio;
	private String descripcion;
	private String categoria;
	private String imagen;
	
	private static Long total=Long.valueOf(0);
	
	//1.Constructor
	public ProductosModel(String nombre,Double precio, String descripcion, String categoria,String imagen) {
		this.nombre=nombre;
		this.precio=precio;
		this.descripcion=descripcion;
		this.categoria=categoria;
		this.imagen=imagen;
		ProductosModel.total++;
		this.id = ProductosModel.total;
			
	};
	
	public ProductosModel() {
		ProductosModel.total++;
		this.id = ProductosModel.total;
			
	} //constructor vacío
	
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
	}
	
}
