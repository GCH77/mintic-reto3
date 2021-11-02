package com.example.reto3.reservas.service;

import com.example.reto3.reservas.model.Reserva;

import java.util.List;

public interface ReservaService {
    List<Reserva> getAll();
    Reserva saveOrUpdate(Reserva reserva);
    void delete(Long id);
}
