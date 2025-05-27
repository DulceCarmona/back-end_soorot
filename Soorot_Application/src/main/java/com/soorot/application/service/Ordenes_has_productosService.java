//package com.soorot.application.service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.soorot.application.model.Ordenes_has_productos;
//
//@Service
//public class Ordenes_has_productosService {
//	private final List<Ordenes_has_productos> lista = new ArrayList()<Ordenes_has_productos>();
//	
//	@Autowired
//	public Ordenes_has_productosService() {
//		lista.add(new Ordenes_has_productos(001, 001, 2));
//		lista.add(new Ordenes_has_productos(1, 2, 1));
//		lista.add(new Ordenes_has_productos(2, 1, 2));
//		lista.add(new Ordenes_has_productos(2, 3, 1));
//		lista.add(new Ordenes_has_productos(2, 2, 2));
//	}//Ordenes_has_productosService
//	
//	public List<Ordenes_has_productos> getOrdenes_has_productos(){
//		return lista;
//	}//getOrdenes_has_productos
//	
//	public Ordenes_has_productos getOrden_has_producto() {
//		Ordenes_has_productos tmp = null;
//		for (Ordenes_has_productos orden : lista) {
//			if(orden.getOrdenId()==ordenId) {
//				tmp=orden;
//				break;
//			}//if
//		}//foreach
//		return tmp;
//	}//getOrdenHasProducto
//	
//	public Ordenes_has_productos deleteOrden_has_producto(){
//		Ordenes_has_productos tmp = null;
//		for (Ordenes_has_productos orden : lista) {
//			if(orden.getOrdenId()==ordenId) {
//				tmp=orden;
//				lista.remove(orden);
//				break;
//			}//if
//		}//foreach
//		return tmp;
//	}//deleteOrdenHasProducto
//	
//	public Ordenes_has_productos addOrden_has_producto(Ordenes_has_productos orden) {
//		lista.add(orden);
//		return orden;
//	}//addOrdenHasProducto
//	
//	public Ordenes_has_productos updateOrden_has_producto(Long ordenId,  Integer cantidad) {
//		Ordenes_has_productos tmp = null;
//		for (Ordenes_has_productos ordenes_has_productos : lista) {
//			if(orden.getOrdenId()==ordenId) {
//				if(cantidad!=null) orden.setCantidad(cantidad);
//				tmp=orden;
//				break;
//			}//if
//		}//foreach
//		return tmp;
//	}//updateProduct
//	
//}//Class OrdenesHasProductosService


//@Service
//public class OrdenProductoService {
//
//    @Autowired
//    private OrdenProductoRepository repository;
//
//    public List<OrdenProducto> getAll() {
//        return repository.findAll();
//    }
//
//    public Optional<OrdenProducto> getById(Long ordenId, Long productoId) {
//        return repository.findById(new OrdenProductoId(ordenId, productoId));
//    }
//
//    public OrdenProducto save(OrdenProducto op) {
//        return repository.save(op);
//    }
//
//    public void delete(Long ordenId, Long productoId) {
//        repository.deleteById(new OrdenProductoId(ordenId, productoId));
//    }
//
//    public OrdenProducto updateCantidad(Long ordenId, Long productoId, Integer nuevaCantidad) {
//        OrdenProducto op = repository.findById(new OrdenProductoId(ordenId, productoId))
//                .orElseThrow(() -> new RuntimeException("Not found"));
//        op.setCantidad(nuevaCantidad);
//        return repository.save(op);
//    }
//}
