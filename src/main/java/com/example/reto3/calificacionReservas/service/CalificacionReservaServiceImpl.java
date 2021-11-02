package com.example.reto3.calificacionReservas.service;

import com.example.reto3.calificacionReservas.model.CalificacionReserva;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalificacionReservaServiceImpl {
    private final CalificacionReservaService calificacionReservaService;

    @Autowired
    public CalificacionReservaServiceImpl(CalificacionReservaService calificacionReservaService) {
        this.calificacionReservaService = calificacionReservaService;
    }

    public List<CalificacionReserva> getAll() {
        return calificacionReservaService.getAll();
    }

    public CalificacionReserva saveOrUpdate(CalificacionReserva calificacionReserva) {
        return calificacionReservaService.saveOrUpdate(calificacionReserva);
    }

    public void delete(Long id) {
        calificacionReservaService.delete(id);
    }
}
