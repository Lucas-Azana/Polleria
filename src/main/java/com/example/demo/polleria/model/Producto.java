package com.example.demo.polleria.model;

import java.time.LocalDate;

public abstract class Producto {
    protected Long id;                
    protected String categoria;
    protected Double cantidad;
    protected Double precioTotal;
    protected LocalDate fechaIngreso;
    protected LocalDate fechaRegistro; 
    
    public Producto() {
        this.fechaRegistro = LocalDate.now();
    }
    
    public Producto(String categoria) {
        this.categoria = categoria;
        this.fechaRegistro = LocalDate.now();
    }
    
    // getters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
    
    public Double getCantidad() { return cantidad; }
    public void setCantidad(Double cantidad) { this.cantidad = cantidad; }
    
    public Double getPrecioTotal() { return precioTotal; }
    public void setPrecioTotal(Double precioTotal) { this.precioTotal = precioTotal; }
    
    public LocalDate getFechaIngreso() { return fechaIngreso; }
    public void setFechaIngreso(LocalDate fechaIngreso) { this.fechaIngreso = fechaIngreso; }
    
    public LocalDate getFechaRegistro() { return fechaRegistro; }
    public void setFechaRegistro(LocalDate fechaRegistro) { this.fechaRegistro = fechaRegistro; }
    
    public abstract String getNombreEspecifico();
}
