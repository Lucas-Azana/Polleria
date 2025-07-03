package com.example.demo.polleria.service;

import com.example.demo.polleria.model.Producto;
import java.util.List;

public interface ProductoService {
    Producto guardar(Producto producto);
    List<Producto> listarTodos();
    List<Producto> listarPorCategoria(String categoria);
    Producto buscarPorId(Long id);
    void eliminar(Long id);
    Long contarTotal();
    Long contarPorCategoria(String categoria);
}
