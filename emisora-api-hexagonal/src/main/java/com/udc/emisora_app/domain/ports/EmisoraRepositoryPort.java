package com.udc.emisora_app.domain.ports;

import com.udc.emisora_app.domain.models.Emisora;

import java.util.List;
import java.util.Optional;

public interface EmisoraRepositoryPort {
    Emisora save(Emisora emisora);
    Optional<Emisora> findById(Long id);
    List<Emisora> findAll();
    void deleteById(Long id);
}