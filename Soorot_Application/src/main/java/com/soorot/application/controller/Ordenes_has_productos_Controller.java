//package com.soorot.application.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.soorot.application.model.Ordenes_has_productos;
//import com.soorot.application.service.Ordenes_has_productosService;
//
//@RestController
//@RequestMapping(path="/soorot/ordenes_has_productos") //http://localhost:8080/api/productos/
//public class Ordenes_has_productos_Controller {
//	private final Ordenes_has_productos ordenes_has_productos;
//	
//	@Autowired
//	public Ordenes_has_productos_Controller(Ordenes_has_productos ordenes_has_productos) {
//		this.ordenes_has_productosService = ordenes_has_productosService;
//	}//constructor
//	
//	@GetMapping
//	public List<Ordenes_has_productos> getOrdenes_has_productos(){
//		return Ordenes_has_productosService.getOrdenes_has_productos();
//	}//getOrdenes_has_productos
//	
//	@GetMapping(path="{ohpId}") // http://localhost:8080/api/productos/1
//	public Ordenes_has_productos getOrden_has_producto(@PathVariable("ohpId") Long id){
//		return Ordenes_has_productosService.getOrden_has_producto(id);
//	}//getOrden_has_producto
//	
//	@DeleteMapping(path="{ohpId}") // http://localhost:8080/api/productos/1
//	public Ordenes_has_productos deleteOrdenes_has_productos(@PathVariable("ohpId") Long id){
//		return Ordenes_has_productosService.deleteOrdenes_has_productos(id);
//	}//deleteOrdenes_has_producto
//	
//	@PostMapping
//	public Ordenes_has_productos addOrdenes_has_productos(@RequestBody Ordenes_has_productos ordenes_has_productos) {
//		return Ordenes_has_productosService.addOrdenes_has_productos(ordenes_has_productos);
//	}//addOrdenes_has_productos
//		
//}//ProductoController

//@RestController
//@RequestMapping("/ordenes-productos")
//public class OrdenProductoController {
//
//    @Autowired
//    private OrdenProductoService service;
//
//    @GetMapping
//    public List<OrdenProducto> getAll() {
//        return service.getAll();
//    }
//
//    @GetMapping("/{ordenId}/{productoId}")
//    public ResponseEntity<OrdenProducto> getById(@PathVariable Long ordenId, @PathVariable Long productoId) {
//        return service.getById(ordenId, productoId)
//                .map(ResponseEntity::ok)
//                .orElse(ResponseEntity.notFound().build());
//    }
//
//    @PostMapping
//    public OrdenProducto create(@RequestBody OrdenProducto ordenProducto) {
//        return service.save(ordenProducto);
//    }
//
//    @PutMapping("/{ordenId}/{productoId}")
//    public OrdenProducto updateCantidad(@PathVariable Long ordenId, @PathVariable Long productoId,
//                                        @RequestParam Integer cantidad) {
//        return service.updateCantidad(ordenId, productoId, cantidad);
//    }
//
//    @DeleteMapping("/{ordenId}/{productoId}")
//    public ResponseEntity<?> delete(@PathVariable Long ordenId, @PathVariable Long productoId) {
//        service.delete(ordenId, productoId);
//        return ResponseEntity.ok().build();
//    }
//}
