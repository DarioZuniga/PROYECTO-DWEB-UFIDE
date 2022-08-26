package com.AprendeaProgramar.controller;

import com.AprendeaProgramar.domain.Clases;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.AprendeaProgramar.service.ClasesService;


@Controller
@Slf4j
public class ClasesController {

    @Autowired
    private ClasesService tabHorarioService;

    @Autowired

    @GetMapping("/tabHorario/listado")
    public String inicio(Model model) {       
        var tabHorarioes = tabHorarioService.getTabHorarioes();
        model.addAttribute("tabHorarioes",tabHorarioes);
        return "tabHorario/listado";
    }
    @GetMapping("/tabHorario/nuevo")
    public String nuevoTabHorario(Clases tabHorario){
        return "tabHorario/modificar";
    }
    
    @PostMapping("/tabHorario/guardar")
    public String guardarTabHorario(Clases tabHorario){
        tabHorarioService.save(tabHorario);
        return "redirect:/tabHorario/listado";
    }
    
    @GetMapping("/tabHorario/modificar/{horCodigo}")
    public String modificarTabHorario(Clases tabHorario, Model model){
        tabHorario = tabHorarioService.getTabHorario(tabHorario);
        model.addAttribute("tabHorario", tabHorario);
    
   
        return "tabHorario/modificar";
    }
    
    @GetMapping("/tabHorario/eliminar/{horCodigo}")
    public String eliminarTabHorario(Clases tabHorario){
        tabHorarioService.delete(tabHorario);
        return "redirect:/tabHorario/listado";
    }
    
}
