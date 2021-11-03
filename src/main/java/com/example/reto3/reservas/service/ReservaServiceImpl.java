package com.example.reto3.reservas.service;

import com.example.reto3.reservas.model.Reserva;
import com.example.reto3.reservas.model.StatusReportDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@Service
public class ReservaServiceImpl {
    private final ReservaService reservaService;
    private SimpleDateFormat formatter;

    @Autowired
    public ReservaServiceImpl(ReservaService reservaService) {
        this.reservaService = reservaService;
         this.formatter = new SimpleDateFormat("dd-MM-yyyy");
    }

    public List<Reserva> getAll() {
        return reservaService.getAll();
    }

    public Reserva saveOrUpdate(Reserva reserva) {
        return reservaService.saveOrUpdate(reserva);
    }

    public void delete(Long id) {
         reservaService.delete(id);
    }

    public List<Reserva> getReportBetweenDates(String startDate, String endDate) throws ParseException {

        return reservaService.getReportBetweenDates(formatter.parse(startDate), formatter.parse(endDate));
    }

    public StatusReportDTO getReportStatus() {
        return reservaService.getReportStatus();
    }
}
