package com.example.reto3.reservas.service;

import com.example.reto3.reservas.model.Reserva;
import com.example.reto3.reservas.model.StatusReportDTO;

import java.util.Date;
import java.util.List;

public interface ReservaService {
    List<Reserva> getAll();
    Reserva saveOrUpdate(Reserva reserva);
    void delete(Long id);
    List<Reserva> getReportBetweenDates(Date startDate, Date endDate);
    StatusReportDTO getReportStatus();
}
