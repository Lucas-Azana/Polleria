package com.example.demo.polleria.entity;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("POLLO")
public class PolloEntity extends ProductoEntity {
    
    @Column(name = "tipo_pollo")
    private String tipoPollo;
    
    public PolloEntity() {
        super("Pollo");
    }
    
    public PolloEntity(String tipoPollo) {
        super("Pollo");
        this.tipoPollo = tipoPollo;
    }
    
    @Override
    public String getNombreEspecifico() {
        return tipoPollo != null ? tipoPollo : "Pollo";
    }
    
    // getters y setters
    public String getTipoPollo() { return tipoPollo; }
    public void setTipoPollo(String tipoPollo) { this.tipoPollo = tipoPollo; }
}
