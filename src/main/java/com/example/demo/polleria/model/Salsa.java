package com.example.demo.polleria.model;

public class Salsa extends Producto {
    private String tipoSalsa;
    
    public Salsa() {
        super("Salsas");
    }
    
    @Override
    public String getNombreEspecifico() {
        return tipoSalsa != null ? tipoSalsa : "Salsa";
    }
    
    public String getTipoSalsa() { return tipoSalsa; }
    public void setTipoSalsa(String tipoSalsa) { this.tipoSalsa = tipoSalsa; }
}
