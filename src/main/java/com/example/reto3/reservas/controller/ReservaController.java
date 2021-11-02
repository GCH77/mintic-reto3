package com.example.reto3.reservas.controller;

import com.example.reto3.reservas.model.Reserva;
import com.example.reto3.reservas.service.ReservaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Reservation")
public class ReservaController {
    private final ReservaServiceImpl reservaService;

    @Autowired
    public ReservaController(ReservaServiceImpl reservaService) {
        this.reservaService = reservaService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Reserva>> getAll() {
        return new ResponseEntity<>(reservaService.getAll(), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Reserva> save(@RequestBody Reserva reserva) {
        return new ResponseEntity<>(reservaService.saveOrUpdate(reserva), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Reserva> update(@RequestBody Reserva reserva) {
        return new ResponseEntity<>(reservaService.saveOrUpdate(reserva), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") Long id) {
        reservaService.delete(id);
    }
}
