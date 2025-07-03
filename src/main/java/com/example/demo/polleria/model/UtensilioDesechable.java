package com.example.demo.polleria.model;

public class UtensilioDesechable extends Producto {
    private String tipoUtensilio;
    
    public UtensilioDesechable() {
        super("Utensilios Desechables");
    }
    
    @Override
    public String getNombreEspecifico() {
        return tipoUtensilio != null ? tipoUtensilio : "Utensilio Desechable";
    }
    
    public String getTipoUtensilio() { return tipoUtensilio; }
    public void setTipoUtensilio(String tipoUtensilio) { this.tipoUtensilio = tipoUtensilio; }
}
