package com.example.demo.polleria.factory;

import com.example.demo.polleria.model.*;
import org.springframework.stereotype.Component;

@Component
public class ProductoFactory {
    
    public Producto crearProducto(String categoria) {
        switch (categoria) {
            case "Pollo": return new Pollo();
            case "Combustible": return new Combustible();
            case "Papas": return new Papa();
            case "Aceites": return new Aceite();
            case "Condimentos": return new Condimento();
            case "Guarniciones": return new Guarnicion();
            case "Salsas": return new Salsa();
            case "Utensilios Desechables": return new UtensilioDesechable();
            default: throw new IllegalArgumentException("categoria no valida: " + categoria);
        }
    }
    
    public void setTipoEspecifico(Producto producto, String tipo) {
        if (producto instanceof Pollo) {
            ((Pollo) producto).setTipoPollo(tipo);
        } else if (producto instanceof Combustible) {
            ((Combustible) producto).setTipoCombustible(tipo);
        } else if (producto instanceof Papa) {
            ((Papa) producto).setTipoPapa(tipo);
        } else if (producto instanceof Aceite) {
            ((Aceite) producto).setTipoAceite(tipo);
        } else if (producto instanceof Condimento) {
            ((Condimento) producto).setTipoCondimento(tipo);
        } else if (producto instanceof Guarnicion) {
            ((Guarnicion) producto).setTipoGuarnicion(tipo);
        } else if (producto instanceof Salsa) {
            ((Salsa) producto).setTipoSalsa(tipo);
        } else if (producto instanceof UtensilioDesechable) {
            ((UtensilioDesechable) producto).setTipoUtensilio(tipo);
        }
    }
}
