package com.example.reto3.mensajes.service;

import com.example.reto3.mensajes.model.Mensaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MensajeServiceImpl {
    private final MensajeService mensajeService;

    @Autowired
    public MensajeServiceImpl(MensajeService mensajeService) {
        this.mensajeService = mensajeService;
    }

    public List<Mensaje> getAll() {
        return mensajeService.getAll();
    }

    public Mensaje saveOrUpdate(Mensaje mensaje) {
        return mensajeService.saveOrUpdate(mensaje);
    }

    public Boolean delete(Long id) {
        return mensajeService.delete(id);
    }
}
