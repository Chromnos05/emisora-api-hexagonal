package com.udc.emisora_app.infrastructure.web.controllers;

import com.udc.emisora_app.application.services.EmisoraUseCase;
import com.udc.emisora_app.domain.models.Emisora;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emisoras")
public class EmisoraRestController {

    private final EmisoraUseCase emisoraUseCase;

    public EmisoraRestController(EmisoraUseCase emisoraUseCase) {
        this.emisoraUseCase = emisoraUseCase;
    }

    @PostMapping
    public ResponseEntity<Emisora> crear(@RequestBody Emisora emisora) {
        return ResponseEntity.ok(emisoraUseCase.crearEmisora(emisora));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Emisora> obtenerPorId(@PathVariable Long id) {
        return emisoraUseCase.obtenerEmisoraPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<Emisora>> listar() {
        return ResponseEntity.ok(emisoraUseCase.listarEmisoras());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Emisora> actualizar(@PathVariable Long id, @RequestBody Emisora emisora) {
        try {
            return ResponseEntity.ok(emisoraUseCase.actualizarEmisora(id, emisora));
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        emisoraUseCase.eliminarEmisora(id);
        return ResponseEntity.noContent().build(); // Devuelve 204 No Content
    }
}