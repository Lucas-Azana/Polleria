package com.example.demo.polleria.entity;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("GUARNICION")
public class GuarnicionEntity extends ProductoEntity {
    
    @Column(name = "tipo_guarnicion")
    private String tipoGuarnicion;
    
    public GuarnicionEntity() {
        super("Guarniciones");
    }
    
    public GuarnicionEntity(String tipoGuarnicion) {
        super("Guarniciones");
        this.tipoGuarnicion = tipoGuarnicion;
    }
    
    @Override
    public String getNombreEspecifico() {
        return tipoGuarnicion != null ? tipoGuarnicion : "Guarnicion";
    }
    
    public String getTipoGuarnicion() { return tipoGuarnicion; }
    public void setTipoGuarnicion(String tipoGuarnicion) { this.tipoGuarnicion = tipoGuarnicion; }
}
