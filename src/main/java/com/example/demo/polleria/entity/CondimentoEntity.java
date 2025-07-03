package com.example.demo.polleria.entity;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("CONDIMENTO")
public class CondimentoEntity extends ProductoEntity {
    
    @Column(name = "tipo_condimento")
    private String tipoCondimento;
    
    public CondimentoEntity() {
        super("Condimentos");
    }
    
    public CondimentoEntity(String tipoCondimento) {
        super("Condimentos");
        this.tipoCondimento = tipoCondimento;
    }
    
    @Override
    public String getNombreEspecifico() {
        return tipoCondimento != null ? tipoCondimento : "Condimento";
    }
    
    public String getTipoCondimento() { return tipoCondimento; }
    public void setTipoCondimento(String tipoCondimento) { this.tipoCondimento = tipoCondimento; }
}
