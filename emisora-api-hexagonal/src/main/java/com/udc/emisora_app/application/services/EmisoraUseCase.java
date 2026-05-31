package com.udc.emisora_app.application.services;

import com.udc.emisora_app.domain.models.Emisora;
import com.udc.emisora_app.domain.ports.EmisoraRepositoryPort;

import java.util.List;
import java.util.Optional;

public class EmisoraUseCase {

    private final EmisoraRepositoryPort emisoraRepositoryPort;

    public EmisoraUseCase(EmisoraRepositoryPort emisoraRepositoryPort) {
        this.emisoraRepositoryPort = emisoraRepositoryPort;
    }

    public Emisora crearEmisora(Emisora emisora) {
        return emisoraRepositoryPort.save(emisora);
    }

    public Optional<Emisora> obtenerEmisoraPorId(Long id) {
        return emisoraRepositoryPort.findById(id);
    }

    public List<Emisora> listarEmisoras() {
        return emisoraRepositoryPort.findAll();
    }

    public Emisora actualizarEmisora(Long id, Emisora emisoraActualizada) {
        return emisoraRepositoryPort.findById(id).map(emisora -> {
            emisoraActualizada.setId(id);
            return emisoraRepositoryPort.save(emisoraActualizada);
        }).orElseThrow(() -> new RuntimeException("Emisora no encontrada"));
    }

    public void eliminarEmisora(Long id) {
        emisoraRepositoryPort.deleteById(id);
    }
}