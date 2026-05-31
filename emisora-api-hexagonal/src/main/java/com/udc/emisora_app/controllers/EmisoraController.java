package com.udc.emisora_app.controllers;

import com.udc.emisora_app.models.Emisora;
import com.udc.emisora_app.services.EmisoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/emisoras")
public class EmisoraController {

    @Autowired
    private EmisoraService emisoraService;

    // L - Listar emisoras
    @GetMapping
    public String listar(Model model) {
        model.addAttribute("emisoras", emisoraService.listarEmisoras());
        return "emisoras/lista"; // Buscará el HTML en templates/emisoras/lista.html
    }

    // C - Formulario para agregar una emisora
    @GetMapping("/nuevo")
    public String mostrarFormularioCrear(Model model) {
        model.addAttribute("emisora", new Emisora());
        return "emisoras/formulario";
    }

    // C y U - Procesar guardado o actualización
    @PostMapping("/guardar")
    public String guardar(@ModelAttribute("emisora") Emisora emisora) {
        emisoraService.guardarEmisora(emisora);
        return "redirect:/emisoras";
    }

    // U - Formulario para editar una emisora existente
    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditar(@PathVariable("id") Long id, Model model) {
        Emisora emisora = emisoraService.obtenerEmisoraPorId(id);
        if (emisora != null) {
            model.addAttribute("emisora", emisora);
            return "emisoras/formulario";
        }
        return "redirect:/emisoras";
    }

    // D - Eliminar una emisora
    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable("id") Long id) {
        emisoraService.eliminarEmisora(id);
        return "redirect:/emisoras";
    }
}