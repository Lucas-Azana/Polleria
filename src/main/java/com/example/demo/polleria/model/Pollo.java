package com.example.demo.polleria.model;

public class Pollo extends Producto {
    private String tipoPollo;
    
    public Pollo() {
        super("Pollo");
    }
    
    public Pollo(String tipoPollo) {
        super("Pollo");
        this.tipoPollo = tipoPollo;
    }
    
    @Override
    public String getNombreEspecifico() {
        return tipoPollo != null ? tipoPollo : "Pollo";
    }
    
    // getter y setter específico
    public String getTipoPollo() { return tipoPollo; }
    public void setTipoPollo(String tipoPollo) { this.tipoPollo = tipoPollo; }
}
