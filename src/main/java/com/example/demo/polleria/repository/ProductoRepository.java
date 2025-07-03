package com.example.demo.polleria.repository;

import com.example.demo.polleria.entity.ProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<ProductoEntity, Long> {
    
    // buscar por categoria
    List<ProductoEntity> findByCategoria(String categoria);
    
    // contar total de productos
    @Query("SELECT COUNT(p) FROM ProductoEntity p")
    Long contarTodos();
    
    // buscar por fecha
    List<ProductoEntity> findByFechaIngreso(LocalDate fecha);
    
    // buscar por rango de fechas
    @Query("SELECT p FROM ProductoEntity p WHERE p.fechaIngreso BETWEEN :inicio AND :fin")
    List<ProductoEntity> findByRangoFechas(@Param("inicio") LocalDate inicio, @Param("fin") LocalDate fin);
}
