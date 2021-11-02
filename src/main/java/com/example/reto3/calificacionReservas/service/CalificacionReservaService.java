package com.example.reto3.calificacionReservas.service;


import com.example.reto3.calificacionReservas.model.CalificacionReserva;

import java.util.List;

public interface CalificacionReservaService {
    List<CalificacionReserva> getAll();
    CalificacionReserva saveOrUpdate(CalificacionReserva calificacionReserva);
    void delete(Long id);
}
