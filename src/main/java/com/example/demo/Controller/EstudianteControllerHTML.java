package com.example.demo.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EstudianteControllerHTML {
    private final JdbcTemplate jdbcTemplate;

    public EstudianteControllerHTML(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping("/estudiante")
    public String listarEstudiantes(Model model) {
        List<Map<String, Object>> estudiantes = jdbcTemplate.queryForList(
            "SELECT * FROM estudiante"
        );
        model.addAttribute("estudiantes", estudiantes);
        return "estudiantes";
    }
    
    @GetMapping("/listarestudiantes")
    public String listarEstudiantes2(Model model) {
        List<Map<String, Object>> estudiantes = jdbcTemplate.queryForList(
            "SELECT * FROM estudiante"
        );
        model.addAttribute("estudiantes", estudiantes);
        model.addAttribute("productos", null);
        return "estudiantes-jsp";     
    }
    
    @GetMapping("/listaestudiantes")
    public String listarEstudiantes3(Model model) {
        List<Map<String, Object>> estudiantes = jdbcTemplate.queryForList(
            "SELECT * FROM estudiante"
        );
        model.addAttribute("estudiantes", estudiantes);
        return "estudiante_fmt";     
    }

    @GetMapping("/listaestudiante")
    public String listarEstudiantes4(Model model) {
        return "dataestudiante";     
    }

}