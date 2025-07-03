package com.example.demo.polleria.entity;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("PAPA")
public class PapaEntity extends ProductoEntity {
    
    @Column(name = "tipo_papa")
    private String tipoPapa;
    
    public PapaEntity() {
        super("Papas");
    }
    
    public PapaEntity(String tipoPapa) {
        super("Papas");
        this.tipoPapa = tipoPapa;
    }
    
    @Override
    public String getNombreEspecifico() {
        return tipoPapa != null ? tipoPapa : "Papa";
    }
    
    // getters y setters
    public String getTipoPapa() { return tipoPapa; }
    public void setTipoPapa(String tipoPapa) { this.tipoPapa = tipoPapa; }
}
