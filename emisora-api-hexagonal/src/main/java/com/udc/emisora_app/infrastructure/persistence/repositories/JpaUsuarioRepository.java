package com.udc.emisora_app.infrastructure.persistence.repositories;

import com.udc.emisora_app.infrastructure.persistence.entities.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaUsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
}