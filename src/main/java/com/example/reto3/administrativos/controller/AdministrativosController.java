package com.example.reto3.administrativos.controller;

import com.example.reto3.administrativos.model.Administrador;
import com.example.reto3.administrativos.repository.AdministrativosRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdministrativosController {
    private final AdministrativosRepositoryImpl adminServiceImpl;

    @Autowired
    public AdministrativosController(AdministrativosRepositoryImpl adminServiceImpl) {
        this.adminServiceImpl = adminServiceImpl;
    }

    @GetMapping
    public ResponseEntity<List<Administrador>> getAll() {
        return new ResponseEntity<>(adminServiceImpl.getAll(), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Administrador> save(@RequestBody Administrador administrador) {
        return new ResponseEntity<>(adminServiceImpl.saveOrUpdate(administrador), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Administrador> update(@RequestBody Administrador administrador) {
        return new ResponseEntity<>(adminServiceImpl.saveOrUpdate(administrador), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable("id") Long id) {
        return new ResponseEntity<>(adminServiceImpl.delete(id), HttpStatus.OK);
    }
}
