package com.udc.emisora_app.services;

import com.udc.emisora_app.models.Usuario;
import com.udc.emisora_app.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    // L - List (Listar todos)
    public List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll();
    }

    // C y U - Create / Update (Guardar o actualizar)
    public Usuario guardarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    // R - Read (Leer uno solo por su ID)
    public Usuario obtenerUsuarioPorId(Long id) {
        Optional<Usuario> usuario = usuarioRepository.findById(id);
        return usuario.orElse(null); // Retorna nulo si no lo encuentra
    }

    // D - Delete (Eliminar)
    public void eliminarUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }
}
