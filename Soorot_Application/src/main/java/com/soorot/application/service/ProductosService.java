package com.soorot.application.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soorot.application.model.Producto;
import com.soorot.application.repository.ProductosRepository;

@Service
public class ProductosService {
	
	private final ProductosRepository productosRepository; 
	
	@Autowired
	public ProductosService(ProductosRepository productosRepository){
		this.productosRepository=productosRepository;
	}//constructor
	
	public List<Producto> getProductos(){
		return productosRepository.findAll();
	}//getProductos
	
	public Producto getProducto(Long id) {
		return productosRepository.findById(id).orElseThrow(
				() -> new IllegalArgumentException("El producto "
						+ "con el id[" + id
						+ "] no existe."));  //mensaje solo para la consola
	}//getProducto

	public Producto deleteProducto(Long id) {
		Producto tmp=null;
		if (productosRepository.existsById(id)) {
			tmp = productosRepository.findById(id).get();
			productosRepository.deleteById(id);
		}// if exists
		return tmp;
	}//deleteProducto

	public Producto addProducto(Producto producto) {
		Optional<Producto> prod = productosRepository.findByNombre(producto.getNombre());
		if(prod.isEmpty()) {
			productosRepository.save(producto);
		}else  {
			producto = null;
		}//isEmpty
		return producto;
	}//addProducto

	public Producto updateProducto(Long id, String nombre, Double precio, String descripcion, String categoria, String imagen) {
		// TODO Auto-generated method stub
		Producto tmp=null;
			if(productosRepository.existsById(id)) {
				Producto producto = productosRepository.findById(id).get();
				if(nombre!=null) producto.setNombre(nombre);
				if(precio!=null) producto.setPrecio(precio);
				if(descripcion!=null) producto.setDescripcion(descripcion);
				if(categoria!=null) producto.setCategoria(categoria);
				if(imagen!=null) producto.setImagen(imagen);							
				productosRepository.save(producto);		
				tmp=producto;
			}//if	
		return tmp;
	}//updateProducto
}//class ProductoService
