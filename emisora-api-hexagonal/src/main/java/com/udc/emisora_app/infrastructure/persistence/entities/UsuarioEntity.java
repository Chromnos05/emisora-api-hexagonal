package com.udc.emisora_app.infrastructure.persistence.entities;

import com.udc.emisora_app.domain.models.Usuario;
import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class UsuarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String email;
    private String password;

    public UsuarioEntity() {}

    // Convertir de Modelo de Dominio a Entidad JPA
    public static UsuarioEntity fromDomain(Usuario usuario) {
        UsuarioEntity entity = new UsuarioEntity();
        entity.id = usuario.getId();
        entity.nombre = usuario.getNombre();
        entity.email = usuario.getEmail();
        entity.password = usuario.getPassword();
        return entity;
    }

    // Convertir de Entidad JPA a Modelo de Dominio
    public Usuario toDomain() {
        return new Usuario(id, nombre, email, password);
    }

    // (Añade aquí los Getters y Setters estándar para id, nombre, email, password)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
}