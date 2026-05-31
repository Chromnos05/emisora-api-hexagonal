package com.udc.emisora_app.application.services;

import com.udc.emisora_app.domain.models.Usuario;
import com.udc.emisora_app.domain.ports.UsuarioRepositoryPort;

import java.util.List;
import java.util.Optional;

public class UsuarioUseCase {

    private final UsuarioRepositoryPort usuarioRepositoryPort;

    // Inyección de dependencias pura (sin @Autowired)
    public UsuarioUseCase(UsuarioRepositoryPort usuarioRepositoryPort) {
        this.usuarioRepositoryPort = usuarioRepositoryPort;
    }

    public Usuario crearUsuario(Usuario usuario) {
        return usuarioRepositoryPort.save(usuario);
    }

    public Optional<Usuario> obtenerUsuarioPorId(Long id) {
        return usuarioRepositoryPort.findById(id);
    }

    public List<Usuario> listarUsuarios() {
        return usuarioRepositoryPort.findAll();
    }

    public Usuario actualizarUsuario(Long id, Usuario usuarioActualizado) {
        // Primero verificamos si existe (opcional, pero buena práctica)
        return usuarioRepositoryPort.findById(id).map(usuario -> {
            usuarioActualizado.setId(id); // Aseguramos que el ID no cambie
            return usuarioRepositoryPort.save(usuarioActualizado);
        }).orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
    }

    public void eliminarUsuario(Long id) {
        usuarioRepositoryPort.deleteById(id);
    }
}