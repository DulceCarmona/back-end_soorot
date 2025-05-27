//package com.soorot.application.model;
//
//import javax.persistence.Entity;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "ordenes_has_productos")
//public class Ordenes_has_productos {
//
//    @EmbeddedId
//    private OrdenProductoId id;
//
//    @ManyToOne
//    @MapsId("ordenId")
//    @JoinColumn(name = "orden_id")
//    private Orden orden;
//
//    @ManyToOne
//    @MapsId("productoId")
//    @JoinColumn(name = "producto_id")
//    private ProductosModel producto;
//
//    @Column(nullable = false)
//    private Integer cantidad;
//
//    public OrdenProducto() {}
//
//    public OrdenProducto(Orden orden, ProductosModel producto, Integer cantidad) {
//        this.orden = orden;
//        this.producto = producto;
//        this.cantidad = cantidad;
//        this.id = new OrdenProductoId(orden.getId(), producto.getId());
//    }
//
//    // Getters and setters
//    public OrdenProductoId getId() {
//        return id;
//    }
//
//    public void setId(OrdenProductoId id) {
//        this.id = id;
//    }
//
//    public Orden getOrden() {
//        return orden;
//    }
//
//    public void setOrden(Orden orden) {
//        this.orden = orden;
//    }
//
//    public ProductosModel getProducto() {
//        return producto;
//    }
//
//    public void setProducto(ProductosModel producto) {
//        this.producto = producto;
//    }
//
//    public Integer getCantidad() {
//        return cantidad;
//    }
//
//    public void setCantidad(Integer cantidad) {
//        this.cantidad = cantidad;
//    }
//
//    @Override
//    public String toString() {
//        return "OrdenProducto{" + "ordenId=" + orden.getId() + ", productoId=" + producto.getId() + ", cantidad=" + cantidad +
//                '}';
//    }
//}


