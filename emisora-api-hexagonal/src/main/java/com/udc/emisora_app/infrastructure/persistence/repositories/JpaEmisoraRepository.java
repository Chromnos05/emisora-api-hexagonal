package com.udc.emisora_app.infrastructure.persistence.repositories;

import com.udc.emisora_app.infrastructure.persistence.entities.EmisoraEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaEmisoraRepository extends JpaRepository<EmisoraEntity, Long> {
}