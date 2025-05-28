package com.soorot.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.soorot.application.model.Producto;
import com.soorot.application.service.ProductosService;


@RestController
@RequestMapping(path="/soorot/productos/")//http://localhost:8080
public class ProductosController {
	
	private final ProductosService productoService;
	
	@Autowired
	public ProductosController(ProductosService productoService) {
		this.productoService = productoService;
	}//ProductController
	
	@GetMapping
	public List<Producto> getProductos(){
		return productoService.getProductos();
	}//getProductos
	
	@GetMapping(path="{prodId}")
	public Producto getProducto(@PathVariable("prodId") Long id) {
	    return productoService.getProducto(id);
	}//getProducto
	
	@DeleteMapping(path="{prodId}")
	public Producto deleteProducto(@PathVariable("prodId") Long id) {
	    return productoService.deleteProducto(id);
	}//deleteProducto
	
	@PostMapping
	public Producto addProducto(@RequestBody Producto producto) {
		return productoService.addProducto(producto);
	}//addProducto
			
	@PutMapping(path="{prodId}")
	public Producto updateProducto(
		    @PathVariable("prodId") Long id,
		    @RequestParam(required=false) String nombre,
		    @RequestParam(required=false) Double precio,
		    @RequestParam(required=false) String descripcion,
		    @RequestParam(required=false) String categoria,
		    @RequestParam(required=false) String imagen){
	    return productoService.updateProducto(id, nombre, precio, descripcion, categoria, imagen);
	}//updateProducto
    //@RequestParam(name="imagen", required=false) String imagen
	
}//ClassController
