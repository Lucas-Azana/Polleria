package com.example.demo.polleria.model;

public class Combustible extends Producto {
    private String tipoCombustible;
    
    public Combustible() {
        super("Combustibles");
    }
    
    public Combustible(String tipoCombustible) {
        super("Combustibles");
        this.tipoCombustible = tipoCombustible;
    }
    
    @Override
    public String getNombreEspecifico() {
        return tipoCombustible != null ? tipoCombustible : "Combustible";
    }
    
    // getters y setters
    public String getTipoCombustible() { return tipoCombustible; }
    public void setTipoCombustible(String tipoCombustible) { this.tipoCombustible = tipoCombustible; }
}
