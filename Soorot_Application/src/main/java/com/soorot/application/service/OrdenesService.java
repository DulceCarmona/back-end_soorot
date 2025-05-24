package com.soorot.application.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soorot.application.model.Orden;

@Service
public class OrdenesService {

		private final List<Orden> lista=new ArrayList<Orden>();
		
		@Autowired
		public OrdenesService() {
		lista.add(new Orden(LocalDate.parse("2025-05-22"),Double.valueOf(123.99)));
		lista.add(new Orden(LocalDate.parse("2025-05-21"),Double.valueOf(432.99)));
		lista.add(new Orden(LocalDate.parse("2025-05-20"),Double.valueOf(234.49)));
		lista.add(new Orden(LocalDate.parse("2025-05-19"),Double.valueOf(234.70)));
		
		}//constructor
		
		public List<Orden> getOrdenes(){
			return lista;
		}//getOrden
		public Orden getOrden(Long id) {
			Orden tmp=null;
			for(Orden orden:lista) {
				if(orden.getId()==id) {
					tmp=orden;
					break;
				}//if
			}//foreach
			return tmp;
		}//getOrden

		public Orden deleteOrden(Long id) {
			Orden tmp=null;
			for(Orden orden:lista) {
				if(orden.getId()==id) {
					tmp=orden;
					lista.remove(orden);
					break;
				}//if
			}//foreach
			return tmp;
		}//deleteOrden

		public Orden addOrden(Orden orden) {
			lista.add(orden);
			return orden;
		}//addOrden

		public Orden updateOrden(Long id, LocalDate fechaOrden, Double importe) {
			// TODO Auto-generated method stub
			Orden tmp=null;
			for(Orden orden:lista) {
				if(orden.getId()==id) {
					if(fechaOrden!=null) orden.setFechaOrden(fechaOrden);
					if(importe!=null) orden.setImporte(importe);									
					tmp=orden;
					break;
				}//if
			}//foreach
			return tmp;
		}//updateOrden
		}//class OrdenService


