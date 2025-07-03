package com.example.demo.polleria.model;

public class Combustible extends Producto {
    private String tipoCombustible;
    
    public Combustible() {
        super("Combustible");
    }
    
    public Combustible(String tipoCombustible) {
        super("Combustible");
        this.tipoCombustible = tipoCombustible;
    }
    
    @Override
    public String getNombreEspecifico() {
        return tipoCombustible != null ? tipoCombustible : "Combustible";
    }
    
    public String getTipoCombustible() { return tipoCombustible; }
    public void setTipoCombustible(String tipoCombustible) { this.tipoCombustible = tipoCombustible; }
}
