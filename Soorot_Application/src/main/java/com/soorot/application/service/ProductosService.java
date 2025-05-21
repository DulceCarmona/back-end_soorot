package com.soorot.application.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soorot.application.model.ProductosModel;

@Service
public class ProductosService {
	private final List<ProductosModel> lista=new ArrayList<ProductosModel>();
	
	@Autowired
	public ProductosService() {
	lista.add(new ProductosModel("Mochila para escalar",Double.valueOf(600.90),"Mochila grande en color azul y verde que se puede replegar dependiendo de lo que necesite","Exploracion","Mochila.jpg"));
	lista.add(new ProductosModel("Arnes",Double.valueOf(399.99),"Arnes de seguridad para subir montañas", "Escalada","Arnes.jpg"));
	lista.add(new ProductosModel("Botas para escalar",Double.valueOf(600.50),"Botas para escalar con casquillo cafes","Escalada","Botas.jpg"));
	lista.add(new ProductosModel("Casco de seguridad", Double.valueOf(753.53), "Casco especial para la cabeza con linterna color rojo", "Alpinismo","Casco.jpg"));
	}//constructor
	
	public List<ProductosModel> getProducts(){
		return lista;
	}//getProducts
	public ProductosModel getProduct(Long id) {
		ProductosModel tmp=null;
		for(ProductosModel producto:lista) {
			if(producto.getId()==id) {
				tmp=producto;
				break;
			}//if
		}//foreach
		return tmp;
	}//getProduct

	public ProductosModel deleteProduct(Long id) {
		ProductosModel tmp=null;
		for(ProductosModel producto:lista) {
			if(producto.getId()==id) {
				tmp=producto;
				lista.remove(producto);
				break;
			}//if
		}//foreach
		return tmp;
	}//deleteProduct

	public ProductosModel addProducto(ProductosModel producto) {
		lista.add(producto);
		return producto;
	}//addProducto

	public ProductosModel updateProduct(Long id, String nombre, Double precio, String descripcion, String categoria, String imagen) {
		// TODO Auto-generated method stub
		ProductosModel tmp=null;
		for(ProductosModel producto:lista) {
			if(producto.getId()==id) {
				if(nombre!=null) producto.setNombre(nombre);
				if(precio!=null) producto.setPrecio(precio);	
				if(descripcion!=null) producto.setDescripcion(descripcion);
				if(categoria!=null) producto.setCategoria(categoria);				
				if(imagen!=null) producto.setImagen(imagen);
							
				tmp=producto;
				break;
			}//if
		}//foreach
		return tmp;
	}//updateProduct
	}//class ProductoService

