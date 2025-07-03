package com.example.demo.polleria.model;

public class Aceite extends Producto {
    private String tipoAceite;
    
    public Aceite() {
        super("Aceites");
    }
    
    @Override
    public String getNombreEspecifico() {
        return tipoAceite != null ? tipoAceite : "Aceite";
    }
    
    public String getTipoAceite() { return tipoAceite; }
    public void setTipoAceite(String tipoAceite) { this.tipoAceite = tipoAceite; }
}
