package com.example.reto3.mensajes.controller;

import com.example.reto3.mensajes.model.Mensaje;
import com.example.reto3.mensajes.service.MensajeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Message")
public class MensajeController {
    private final MensajeServiceImpl mensajeService;

    @Autowired
    public MensajeController(MensajeServiceImpl mensajeService) {
        this.mensajeService = mensajeService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Mensaje>> getAll() {
        return new ResponseEntity<>(mensajeService.getAll(), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Mensaje> save(@RequestBody Mensaje mensaje) {
        return new ResponseEntity<>(mensajeService.saveOrUpdate(mensaje), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Mensaje> update(@RequestBody Mensaje mensaje) {
        return new ResponseEntity<>(mensajeService.saveOrUpdate(mensaje), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") Long id) {
        mensajeService.delete(id);
    }
}
