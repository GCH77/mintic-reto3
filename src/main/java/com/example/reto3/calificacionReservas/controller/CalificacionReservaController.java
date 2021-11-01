package com.example.reto3.calificacionReservas.controller;

import com.example.reto3.calificacionReservas.model.CalificacionReserva;
import com.example.reto3.calificacionReservas.service.CalificacionReservaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/calificacion-reserva")
public class CalificacionReservaController{

    private final CalificacionReservaServiceImpl calificacionReservaService;

    @Autowired
    public CalificacionReservaController(CalificacionReservaServiceImpl calificacionReservaService) {
        this.calificacionReservaService = calificacionReservaService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<CalificacionReserva>> getAll() {
        return new ResponseEntity<>(calificacionReservaService.getAll(), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<CalificacionReserva> save(@RequestBody CalificacionReserva calificacionReserva) {
        return new ResponseEntity<>(calificacionReservaService.saveOrUpdate(calificacionReserva), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<CalificacionReserva> update(@RequestBody CalificacionReserva calificacionReserva) {
        return new ResponseEntity<>(calificacionReservaService.saveOrUpdate(calificacionReserva), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable("id") Long id) {
        return new ResponseEntity<>(calificacionReservaService.delete(id), HttpStatus.OK);
    }
}
