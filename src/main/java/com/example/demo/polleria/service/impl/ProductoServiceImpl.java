package com.example.demo.polleria.service.impl;

import com.example.demo.polleria.entity.ProductoEntity;
import com.example.demo.polleria.mapper.ProductoMapper;
import com.example.demo.polleria.model.Producto;
import com.example.demo.polleria.repository.ProductoRepository;
import com.example.demo.polleria.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductoServiceImpl implements ProductoService {
    
    @Autowired
    private ProductoRepository productoRepository;
    
    @Autowired
    private ProductoMapper productoMapper;
    
    @Override
    public Producto guardar(Producto producto) {
        // convierte model a entity
        ProductoEntity entity = productoMapper.modelToEntity(producto);
        
        // guarda en la bd
        ProductoEntity savedEntity = productoRepository.save(entity);
        
        // convierte entity a model y lo regresa
        return productoMapper.entityToModel(savedEntity);
    }
    
    @Override
    public List<Producto> listarTodos() {
        List<ProductoEntity> entities = productoRepository.findAll();
        return entities.stream()
                .map(productoMapper::entityToModel)
                .collect(Collectors.toList());
    }
    
    @Override
    public List<Producto> listarPorCategoria(String categoria) {
        List<ProductoEntity> entities = productoRepository.findByCategoria(categoria);
        return entities.stream()
                .map(productoMapper::entityToModel)
                .collect(Collectors.toList());
    }
    
    @Override
    public Producto buscarPorId(Long id) { 
        return productoRepository.findById(id)
                .map(productoMapper::entityToModel)
                .orElse(null);
    }
    
    @Override
    public void eliminar(Long id) {
        productoRepository.deleteById(id);
    }
    
    @Override
    public Long contarTotal() {
        return productoRepository.count();
    }
    
    @Override
    public Long contarPorCategoria(String categoria) {
        return productoRepository.findByCategoria(categoria)
                .stream()
                .count();
    }
}
