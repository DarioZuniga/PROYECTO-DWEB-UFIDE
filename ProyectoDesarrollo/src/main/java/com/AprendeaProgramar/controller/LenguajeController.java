package com.AprendeaProgramar.controller;

import com.AprendeaProgramar.domain.Lenguaje;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.AprendeaProgramar.service.LenguajeService;

@Controller
@Slf4j
public class LenguajeController {

    @Autowired
    private LenguajeService tabRutaService;

    @GetMapping("/tabRuta/listado")
    public String inicio(Model model) {       
        var tabRutaes = tabRutaService.getTabRutaes();
        model.addAttribute("tabRutaes",tabRutaes);
        return "tabRuta/listado";
    }
    @GetMapping("/tabRuta/nuevo")
    public String nuevoTabRuta(Lenguaje tabRuta){
        return "tabRuta/modificar";
    }
    
    @PostMapping("/tabRuta/guardar")
    public String guardarTabRuta(Lenguaje tabRuta){
        tabRutaService.save(tabRuta);
        return "redirect:/tabRuta/listado";
    }
    
    @GetMapping("/tabRuta/modificar/{rutId}")
    public String modificarTabRuta(Lenguaje tabRuta, Model model){
        tabRuta = tabRutaService.getTabRuta(tabRuta);
        model.addAttribute("tabRuta", tabRuta);
        return "tabRuta/modificar";
    }
    
    @GetMapping("/tabRuta/eliminar/{rutId}")
    public String eliminarTabRuta(Lenguaje tabRuta,Model model){
        tabRutaService.delete(tabRuta);
        return "redirect:/tabRuta/listado";
    }
    
}
