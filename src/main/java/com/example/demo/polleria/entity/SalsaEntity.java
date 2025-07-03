package com.example.demo.polleria.entity;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("SALSA")
public class SalsaEntity extends ProductoEntity {
    
    @Column(name = "tipo_salsa")
    private String tipoSalsa;
    
    public SalsaEntity() {
        super("Salsas");
    }
    
    public SalsaEntity(String tipoSalsa) {
        super("Salsas");
        this.tipoSalsa = tipoSalsa;
    }
    
    @Override
    public String getNombreEspecifico() {
        return tipoSalsa != null ? tipoSalsa : "Salsa";
    }
    
    public String getTipoSalsa() { return tipoSalsa; }
    public void setTipoSalsa(String tipoSalsa) { this.tipoSalsa = tipoSalsa; }
}
