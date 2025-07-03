package com.example.demo.polleria.entity;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("ACEITE")
public class AceiteEntity extends ProductoEntity {
    
    @Column(name = "tipo_aceite")
    private String tipoAceite;
    
    public AceiteEntity() {
        super("Aceites");
    }
    
    public AceiteEntity(String tipoAceite) {
        super("Aceites");
        this.tipoAceite = tipoAceite;
    }
    
    @Override
    public String getNombreEspecifico() {
        return tipoAceite != null ? tipoAceite : "Aceite";
    }
    
    // getters y setters
    public String getTipoAceite() { return tipoAceite; }
    public void setTipoAceite(String tipoAceite) { this.tipoAceite = tipoAceite; }
}
