package com.example.demo.polleria.mapper;

import com.example.demo.polleria.entity.ProductoEntity;
import com.example.demo.polleria.entity.PolloEntity;
import com.example.demo.polleria.model.Producto;
import com.example.demo.polleria.model.Pollo;
import org.springframework.stereotype.Component;

@Component
public class ProductoMapper {
    
    // convertir entity a model
    public Producto entityToModel(ProductoEntity entity) {
        if (entity instanceof PolloEntity) {
            PolloEntity polloEntity = (PolloEntity) entity;
            Pollo pollo = new Pollo();
            pollo.setId(polloEntity.getId());
            pollo.setCantidad(polloEntity.getCantidad());
            pollo.setPrecioTotal(polloEntity.getPrecioTotal());
            pollo.setFechaIngreso(polloEntity.getFechaIngreso());
            pollo.setFechaRegistro(polloEntity.getFechaRegistro());
            pollo.setTipoPollo(polloEntity.getTipoPollo());
            return pollo;
        }
        // agregar mas conversiones aqui para otros tipos
        return null;
    }
    
    // convertir model a entity
    public ProductoEntity modelToEntity(Producto model) {
        if (model instanceof Pollo) {
            Pollo pollo = (Pollo) model;
            PolloEntity polloEntity = new PolloEntity();
            polloEntity.setId(pollo.getId());
            polloEntity.setCantidad(pollo.getCantidad());
            polloEntity.setPrecioTotal(pollo.getPrecioTotal());
            polloEntity.setFechaIngreso(pollo.getFechaIngreso());
            polloEntity.setFechaRegistro(pollo.getFechaRegistro());
            polloEntity.setTipoPollo(pollo.getTipoPollo());
            return polloEntity;
        }
        // agregar mas conversiones aqui
        return null;
    }
}
