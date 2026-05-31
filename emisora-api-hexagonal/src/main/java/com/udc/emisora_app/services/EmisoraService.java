package com.udc.emisora_app.services;

import com.udc.emisora_app.models.Emisora;
import com.udc.emisora_app.repositories.EmisoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmisoraService {

    @Autowired
    private EmisoraRepository emisoraRepository;

    // L - List
    public List<Emisora> listarEmisoras() {
        return emisoraRepository.findAll();
    }

    // C y U - Create / Update
    public Emisora guardarEmisora(Emisora emisora) {
        return emisoraRepository.save(emisora);
    }

    // R - Read
    public Emisora obtenerEmisoraPorId(Long id) {
        return emisoraRepository.findById(id).orElse(null);
    }

    // D - Delete
    public void eliminarEmisora(Long id) {
        emisoraRepository.deleteById(id);
    }
}
