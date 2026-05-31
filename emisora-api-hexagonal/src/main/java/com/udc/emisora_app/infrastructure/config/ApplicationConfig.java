package com.udc.emisora_app.infrastructure.config;

import com.udc.emisora_app.application.services.EmisoraUseCase;
import com.udc.emisora_app.application.services.UsuarioUseCase;
import com.udc.emisora_app.domain.ports.EmisoraRepositoryPort;
import com.udc.emisora_app.domain.ports.UsuarioRepositoryPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public UsuarioUseCase usuarioUseCase(UsuarioRepositoryPort usuarioRepositoryPort) {
        return new UsuarioUseCase(usuarioRepositoryPort);
    }

    @Bean
    public EmisoraUseCase emisoraUseCase(EmisoraRepositoryPort emisoraRepositoryPort) {
        return new EmisoraUseCase(emisoraRepositoryPort);
    }
}