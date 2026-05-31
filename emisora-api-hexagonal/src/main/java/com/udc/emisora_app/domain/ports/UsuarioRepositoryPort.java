package com.udc.emisora_app.domain.ports;

import com.udc.emisora_app.domain.models.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioRepositoryPort {
    Usuario save(Usuario usuario);
    Optional<Usuario> findById(Long id);
    List<Usuario> findAll();
    void deleteById(Long id);
}