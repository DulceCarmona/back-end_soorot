package com.soorot.application.model;
import java.sql.Date;
import java.time.LocalDate;

public class Orden {

		private Long id;
		private LocalDate fechaOrden;
		private Double importe;

		private static Long total=Long.valueOf(0);
		
		//1.Constructor
		public Orden(LocalDate fechaOrden, Double importe) {
			this.fechaOrden=fechaOrden;
			this.importe=importe;
			Orden.total++;
			this.id = Orden.total;
				
		};
		
		public Orden() {
			Orden.total++;
			this.id = Orden.total;
				
		} //constructor vacío
		
		public LocalDate getFechaOrden() {
			return fechaOrden;
		}//return FechaOrden

		public void setFechaOrden(LocalDate fechaOrden) {
			this.fechaOrden = fechaOrden;
		}//set FechaOrden
		
		public Double getImporte() {
			return importe;
		}//getImporte

		public void setImporte(Double importe) {
			this.importe = importe;
		}//setPrecio
		
		public Long getId() {
			return id;
		}//getId

		@Override
		public String toString() {
			return "Orden [id=" + id + ", fecha orden=" + fechaOrden + ", importe=" + importe 
					+ "]";
		}
		
	}


