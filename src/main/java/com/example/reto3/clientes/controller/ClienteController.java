package com.example.reto3.clientes.controller;

import com.example.reto3.clientes.model.Cliente;
import com.example.reto3.clientes.service.ClienteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClienteController {
    private final ClienteServiceImpl clienteService;

    @Autowired
    public ClienteController(ClienteServiceImpl clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    public ResponseEntity<List<Cliente>> getAll() {
        return new ResponseEntity<>(clienteService.getAll(), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Cliente> save(@RequestBody Cliente cliente) {
        return new ResponseEntity<>(clienteService.saveOrUpdate(cliente), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Cliente> update(@RequestBody Cliente cliente) {
        return new ResponseEntity<>(clienteService.saveOrUpdate(cliente), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable("id") Long id) {
        return new ResponseEntity<>(clienteService.delete(id), HttpStatus.OK);
    }
}
