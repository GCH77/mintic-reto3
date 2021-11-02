package com.example.reto3.mensajes.service;

import com.example.reto3.mensajes.model.Mensaje;

import java.util.List;

public interface MensajeService {
    List<Mensaje> getAll();
    Mensaje saveOrUpdate(Mensaje mensaje);
    void delete(Long id);
}
