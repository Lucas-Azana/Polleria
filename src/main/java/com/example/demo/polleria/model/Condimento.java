package com.example.demo.polleria.model;

public class Condimento extends Producto {
    private String tipoCondimento;
    
    public Condimento() {
        super("Condimentos");
    }
    
    @Override
    public String getNombreEspecifico() {
        return tipoCondimento != null ? tipoCondimento : "Condimento";
    }
    
    public String getTipoCondimento() { return tipoCondimento; }
    public void setTipoCondimento(String tipoCondimento) { this.tipoCondimento = tipoCondimento; }
}
