package com.udc.emisora_app.repositories;

import com.udc.emisora_app.models.Emisora;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmisoraRepository extends JpaRepository<Emisora, Long> {

}
