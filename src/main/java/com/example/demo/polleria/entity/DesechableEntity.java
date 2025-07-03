package com.example.demo.polleria.entity;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("DESECHABLE")
public class DesechableEntity extends ProductoEntity {
    
    @Column(name = "tipo_desechable")
    private String tipoDesechable;
    
    public DesechableEntity() {
        super("Utensilios y Desechables");
    }
    
    public DesechableEntity(String tipoDesechable) {
        super("Utensilios y Desechables");
        this.tipoDesechable = tipoDesechable;
    }
    
    @Override
    public String getNombreEspecifico() {
        return tipoDesechable != null ? tipoDesechable : "Desechable";
    }
    
    public String getTipoDesechable() { return tipoDesechable; }
    public void setTipoDesechable(String tipoDesechable) { this.tipoDesechable = tipoDesechable; }
}
