package com.example.demo.polleria.mapper;

import com.example.demo.polleria.entity.*;
import com.example.demo.polleria.model.*;
import org.springframework.stereotype.Component;

@Component
public class ProductoMapper {
    
    // convertir entity a model
    public Producto entityToModel(ProductoEntity entity) {
        if (entity instanceof PolloEntity) {
            PolloEntity polloEntity = (PolloEntity) entity;
            Pollo pollo = new Pollo();
            mapearCamposComunes(polloEntity, pollo);
            pollo.setTipoPollo(polloEntity.getTipoPollo());
            return pollo;
        }
        else if (entity instanceof CombustibleEntity) {
            CombustibleEntity combustibleEntity = (CombustibleEntity) entity;
            Combustible combustible = new Combustible();
            mapearCamposComunes(combustibleEntity, combustible);
            combustible.setTipoCombustible(combustibleEntity.getTipoCombustible());
            return combustible;
        }
        else if (entity instanceof PapaEntity) {
            PapaEntity papaEntity = (PapaEntity) entity;
            Papa papa = new Papa();
            mapearCamposComunes(papaEntity, papa);
            papa.setTipoPapa(papaEntity.getTipoPapa());
            return papa;
        }
        else if (entity instanceof AceiteEntity) {
            AceiteEntity aceiteEntity = (AceiteEntity) entity;
            Aceite aceite = new Aceite();
            mapearCamposComunes(aceiteEntity, aceite);
            aceite.setTipoAceite(aceiteEntity.getTipoAceite());
            return aceite;
        }
        else if (entity instanceof CondimentoEntity) {
            CondimentoEntity condimentoEntity = (CondimentoEntity) entity;
            Condimento condimento = new Condimento();
            mapearCamposComunes(condimentoEntity, condimento);
            condimento.setTipoCondimento(condimentoEntity.getTipoCondimento());
            return condimento;
        }
        else if (entity instanceof GuarnicionEntity) {
            GuarnicionEntity guarnicionEntity = (GuarnicionEntity) entity;
            Guarnicion guarnicion = new Guarnicion();
            mapearCamposComunes(guarnicionEntity, guarnicion);
            guarnicion.setTipoGuarnicion(guarnicionEntity.getTipoGuarnicion());
            return guarnicion;
        }
        else if (entity instanceof SalsaEntity) {
            SalsaEntity salsaEntity = (SalsaEntity) entity;
            Salsa salsa = new Salsa();
            mapearCamposComunes(salsaEntity, salsa);
            salsa.setTipoSalsa(salsaEntity.getTipoSalsa());
            return salsa;
        }
        else if (entity instanceof DesechableEntity) {
            DesechableEntity desechableEntity = (DesechableEntity) entity;
            UtensilioDesechable utensilio = new UtensilioDesechable();
            mapearCamposComunes(desechableEntity, utensilio);
            utensilio.setTipoUtensilio(desechableEntity.getTipoDesechable());
            return utensilio;
        }
        return null;
    }
    
    // convertir model a entity
    public ProductoEntity modelToEntity(Producto model) {
        if (model instanceof Pollo) {
            Pollo pollo = (Pollo) model;
            PolloEntity polloEntity = new PolloEntity();
            mapearCamposComunes(pollo, polloEntity);
            polloEntity.setTipoPollo(pollo.getTipoPollo());
            return polloEntity;
        }
        else if (model instanceof Combustible) {
            Combustible combustible = (Combustible) model;
            CombustibleEntity combustibleEntity = new CombustibleEntity();
            mapearCamposComunes(combustible, combustibleEntity);
            combustibleEntity.setTipoCombustible(combustible.getTipoCombustible());
            return combustibleEntity;
        }
        else if (model instanceof Papa) {
            Papa papa = (Papa) model;
            PapaEntity papaEntity = new PapaEntity();
            mapearCamposComunes(papa, papaEntity);
            papaEntity.setTipoPapa(papa.getTipoPapa());
            return papaEntity;
        }
        else if (model instanceof Aceite) {
            Aceite aceite = (Aceite) model;
            AceiteEntity aceiteEntity = new AceiteEntity();
            mapearCamposComunes(aceite, aceiteEntity);
            aceiteEntity.setTipoAceite(aceite.getTipoAceite());
            return aceiteEntity;
        }
        else if (model instanceof Condimento) {
            Condimento condimento = (Condimento) model;
            CondimentoEntity condimentoEntity = new CondimentoEntity();
            mapearCamposComunes(condimento, condimentoEntity);
            condimentoEntity.setTipoCondimento(condimento.getTipoCondimento());
            return condimentoEntity;
        }
        else if (model instanceof Guarnicion) {
            Guarnicion guarnicion = (Guarnicion) model;
            GuarnicionEntity guarnicionEntity = new GuarnicionEntity();
            mapearCamposComunes(guarnicion, guarnicionEntity);
            guarnicionEntity.setTipoGuarnicion(guarnicion.getTipoGuarnicion());
            return guarnicionEntity;
        }
        else if (model instanceof Salsa) {
            Salsa salsa = (Salsa) model;
            SalsaEntity salsaEntity = new SalsaEntity();
            mapearCamposComunes(salsa, salsaEntity);
            salsaEntity.setTipoSalsa(salsa.getTipoSalsa());
            return salsaEntity;
        }
        else if (model instanceof UtensilioDesechable) {
            UtensilioDesechable utensilio = (UtensilioDesechable) model;
            DesechableEntity desechableEntity = new DesechableEntity();
            mapearCamposComunes(utensilio, desechableEntity);
            desechableEntity.setTipoDesechable(utensilio.getTipoUtensilio());
            return desechableEntity;
        }
        return null;
    }
    
    // metodo helper para campos comunes entity -> model
    private void mapearCamposComunes(ProductoEntity entity, Producto model) {
        model.setId(entity.getId());
        model.setCantidad(entity.getCantidad());
        model.setPrecioTotal(entity.getPrecioTotal());
        model.setFechaIngreso(entity.getFechaIngreso());
        model.setFechaRegistro(entity.getFechaRegistro());
    }
    
    // metodo helper para campos comunes model -> entity
    private void mapearCamposComunes(Producto model, ProductoEntity entity) {
        entity.setId(model.getId());
        entity.setCantidad(model.getCantidad());
        entity.setPrecioTotal(model.getPrecioTotal());
        entity.setFechaIngreso(model.getFechaIngreso());
        entity.setFechaRegistro(model.getFechaRegistro());
    }
}
