package com.udc.emisora_app.infrastructure.persistence.adapters;

import com.udc.emisora_app.domain.models.Emisora;
import com.udc.emisora_app.domain.ports.EmisoraRepositoryPort;
import com.udc.emisora_app.infrastructure.persistence.entities.EmisoraEntity;
import com.udc.emisora_app.infrastructure.persistence.repositories.JpaEmisoraRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class EmisoraRepositoryAdapter implements EmisoraRepositoryPort {

    private final JpaEmisoraRepository jpaRepository;

    public EmisoraRepositoryAdapter(JpaEmisoraRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public Emisora save(Emisora emisora) {
        // 1. Convertir Dominio -> Entidad JPA
        EmisoraEntity entity = EmisoraEntity.fromDomain(emisora);
        
        // 2. Guardar en Base de Datos
        EmisoraEntity savedEntity = jpaRepository.save(entity);
        
        // 3. Convertir Entidad JPA -> Dominio y retornar
        return savedEntity.toDomain();
    }

    @Override
    public Optional<Emisora> findById(Long id) {
        return jpaRepository.findById(id).map(EmisoraEntity::toDomain);
    }

    @Override
    public List<Emisora> findAll() {
        return jpaRepository.findAll().stream()
                .map(EmisoraEntity::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteById(Long id) {
        jpaRepository.deleteById(id);
    }
}