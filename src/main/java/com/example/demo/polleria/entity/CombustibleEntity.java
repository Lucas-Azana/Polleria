package com.example.demo.polleria.entity;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("COMBUSTIBLE")
public class CombustibleEntity extends ProductoEntity {
    
    @Column(name = "tipo_combustible")
    private String tipoCombustible;
    
    public CombustibleEntity() {
        super("Combustibles");
    }
    
    public CombustibleEntity(String tipoCombustible) {
        super("Combustibles");
        this.tipoCombustible = tipoCombustible;
    }
    
    @Override
    public String getNombreEspecifico() {
        return tipoCombustible != null ? tipoCombustible : "Combustible";
    }
    
    // getters y setters
    public String getTipoCombustible() { return tipoCombustible; }
    public void setTipoCombustible(String tipoCombustible) { this.tipoCombustible = tipoCombustible; }
}
