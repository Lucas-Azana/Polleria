package com.example.demo.polleria.controller;

import com.example.demo.polleria.model.*;
import com.example.demo.polleria.service.ProductoService;
import com.example.demo.polleria.factory.ProductoFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDate;

@Controller
@RequestMapping("/registro-productos")
public class PolleriaController {
    
    @Autowired
    private ProductoService productoService;

    @Autowired
    private ProductoFactory productoFactory;
    
    // pagina principal de registro productos
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("totalProductos", productoService.contarTotal());
        return "record";
    }
    
    // mostrar formulario de pollos
    @GetMapping("/chicken-form")
    public String chickenForm() {
        return "chicken-form";
    }
    
    // mostrar formulario de combustibles
    @GetMapping("/fuel-form")
    public String fuelForm() {
        return "fuel-form";
    }
    
    // mostrar formulario de papas
    @GetMapping("/potatoes-form")
    public String potatoesForm() {
        return "potatoes-form";
    }
    
    // mostrar formulario de aceites
    @GetMapping("/oils-form")
    public String oilsForm() {
        return "oils-form";
    }
    
    // mostrar formulario de condimentos
    @GetMapping("/condiments-form")
    public String condimentsForm() {
        return "condiments-form";
    }
    
    // mostrar formulario de guarniciones
    @GetMapping("/fittings-form")
    public String fittingsForm() {
        return "fittings-form";
    }
    
    // mostrar formulario de salsas
    @GetMapping("/sauces-form")
    public String saucesForm() {
        return "sauces-form";
    }
    
    // mostrar formulario de utensilios
    @GetMapping("/utensils-disposables-form")
    public String utensilsForm() {
        return "utensils-disposables-form";
    }
    
    // procesar registro de productos
    @PostMapping("/registrar")
    public String registrar(@RequestParam String categoria,
                        @RequestParam Double cantidad,
                        @RequestParam LocalDate fechaIngreso,
                        @RequestParam Double precioTotal,
                        @RequestParam(required = false) String tipoPollo,
                        @RequestParam(required = false) String tipoCombustible,
                        @RequestParam(required = false) String tipoPapa,
                        @RequestParam(required = false) String tipoAceite,
                        @RequestParam(required = false) String tipoCondimento,
                        @RequestParam(required = false) String tipoGuarnicion,
                        @RequestParam(required = false) String tipoSalsa,
                        @RequestParam(required = false) String tipoUtensilio,
                        RedirectAttributes redirectAttributes) {
        
        try {
            // crear producto usando factory
            Producto producto = productoFactory.crearProducto(categoria);
            
            // determinar el tipo especifico segun la categoria
            String tipo = null;
            if ("Pollo".equals(categoria)) tipo = tipoPollo;
            else if ("Combustible".equals(categoria)) tipo = tipoCombustible;
            else if ("Papas".equals(categoria)) tipo = tipoPapa;
            else if ("Aceites".equals(categoria)) tipo = tipoAceite;
            else if ("Condimentos".equals(categoria)) tipo = tipoCondimento;
            else if ("Guarniciones".equals(categoria)) tipo = tipoGuarnicion;
            else if ("Salsas".equals(categoria)) tipo = tipoSalsa;
            else if ("Utensilios Desechables".equals(categoria)) tipo = tipoUtensilio;
            
            // asignar tipo especifico
            productoFactory.setTipoEspecifico(producto, tipo);
            
            // asignar datos comunes
            producto.setCantidad(cantidad);
            producto.setFechaIngreso(fechaIngreso);
            producto.setPrecioTotal(precioTotal);
            
            // guardar producto
            productoService.guardar(producto);
            
            redirectAttributes.addFlashAttribute("mensaje", "producto registrado exitosamente");
            
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("error", "error al registrar producto: " + e.getMessage());
        }
        
        return "redirect:/registro-productos/";
    }
    
    // listar productos
    @GetMapping("/lista")
    public String listarProductos(Model model) {
        model.addAttribute("productos", productoService.listarTodos());
        return "lista-productos";
    }
}
