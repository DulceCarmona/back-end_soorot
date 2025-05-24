package com.soorot.application.controller;
import java.sql.Date;
import java.time.LocalDate;
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

import com.soorot.application.model.Orden;
import com.soorot.application.service.OrdenesService;

@RestController
@RequestMapping(path="/soorot/ordenes/")//http://localhost:8080/soorot/ordenes/
public class OrdenesController {
	
		
		private final OrdenesService ordenService;
		
		@Autowired
		public OrdenesController(OrdenesService ordenService) {
			this.ordenService = ordenService;
		}//ProductController

		
		
		@GetMapping
		public List<Orden> getOrdenes(){
			return ordenService.getOrdenes();
		}//getProductos
		
		@GetMapping(path="{ordId}")
		public Orden getOrden(@PathVariable("ordId") Long id) {
		    return ordenService.getOrden(id);
		}
		
		@DeleteMapping(path="{ordId}")
		public Orden deleteOrden(@PathVariable("ordId") Long id) {
		    return ordenService.deleteOrden(id);
		}
		
		@PostMapping
		public Orden addProducto(@RequestBody Orden orden) {
			return ordenService.addOrden(orden);
		}
		

		
		@PutMapping(path="{ordId}")
		public Orden updateOrden(
		    @PathVariable("ordId") Long id,
		    @RequestParam(name="fechaOrden", required=false) LocalDate fechaOrden,
		    @RequestParam(name="importe", required=false) Double importe
		){
		    return ordenService.updateOrden(id, fechaOrden, importe);
		}

		
	}//ClassController

