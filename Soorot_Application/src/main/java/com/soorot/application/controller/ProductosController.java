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

import com.soorot.application.model.ProductosModel;
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
	public List<ProductosModel> getProductos(){
		return productoService.getProducts();
	}//getProductos
	
	@GetMapping(path="{prodId}")
	public ProductosModel getProduct(@PathVariable("prodId") Long id) {
	    return productoService.getProduct(id);
	}
	
	@DeleteMapping(path="{prodId}")
	public ProductosModel deleteProduct(@PathVariable("prodId") Long id) {
	    return productoService.deleteProduct(id);
	}
	
	@PostMapping
	public ProductosModel addProducto(@RequestBody ProductosModel producto) {
		return productoService.addProducto(producto);
	}
	
//	@PutMapping(path="{prodId}")
//	public ProductosModel updateProduct(
//			@PathVariable("prodId")Long id,
//			@RequestParam(required=false) String nombre,
//			@RequestParam(required=false) Double precio,
//			@RequestParam(required=false) String descripcion,
//			@RequestParam(required=false) String categoria,
//			@RequestParam(required=false) String imagen){
//			
//		return productoService.updateProduct(id, nombre,precio, descripcion,categoria, imagen);
//	}//updateProducto
	
	
	//Solicitamos asistencia porque no pudimos lograr el metodo put con el código visto en clase (bloque de arriba)
	//En las otras tablas si fue posible correrlo con el código de arriba Atte: Uriel Medina
	@PutMapping(path="{prodId}")
	public ProductosModel updateProduct(
	    @PathVariable("prodId") Long id,
	    @RequestParam(name="nombre", required=false) String nombre,
	    @RequestParam(name="precio", required=false) Double precio,
	    @RequestParam(name="descripcion", required=false) String descripcion,
	    @RequestParam(name="categoria", required=false) String categoria,
	    @RequestParam(name="imagen", required=false) String imagen
	){
	    return productoService.updateProduct(id, nombre, precio, descripcion, categoria, imagen);
	}

	
}//ClassController
