package com.example.demo.polleria.model;

public class Papa extends Producto {
    private String tipoPapa;
    
    public Papa() {
        super("Papas");
    }
    
    public Papa(String tipoPapa) {
        super("Papas");
        this.tipoPapa = tipoPapa;
    }
    
    @Override
    public String getNombreEspecifico() {
        return tipoPapa != null ? tipoPapa : "Papa";
    }
    
    public String getTipoPapa() { return tipoPapa; }
    public void setTipoPapa(String tipoPapa) { this.tipoPapa = tipoPapa; }
}
