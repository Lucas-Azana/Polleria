package com.example.demo.polleria.model;

public class Guarnicion extends Producto {
    private String tipoGuarnicion;
    
    public Guarnicion() {
        super("Guarniciones");
    }
    
    @Override
    public String getNombreEspecifico() {
        return tipoGuarnicion != null ? tipoGuarnicion : "Guarnicion";
    }
    
    public String getTipoGuarnicion() { return tipoGuarnicion; }
    public void setTipoGuarnicion(String tipoGuarnicion) { this.tipoGuarnicion = tipoGuarnicion; }
}
