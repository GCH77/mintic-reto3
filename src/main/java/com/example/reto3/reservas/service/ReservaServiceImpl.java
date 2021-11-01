package com.example.reto3.reservas.service;

import com.example.reto3.reservas.model.Reserva;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaServiceImpl {
    private final ReservaService reservaService;

    @Autowired
    public ReservaServiceImpl(ReservaService reservaService) {
        this.reservaService = reservaService;
    }

    public List<Reserva> getAll() {
        return reservaService.getAll();
    }

    public Reserva saveOrUpdate(Reserva reserva) {
        return reservaService.saveOrUpdate(reserva);
    }

    public Boolean delete(Long id) {
        return reservaService.delete(id);
    }
}
