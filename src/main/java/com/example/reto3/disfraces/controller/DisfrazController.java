package com.example.reto3.disfraces.controller;

import com.example.reto3.disfraces.model.Disfraz;
import com.example.reto3.disfraces.service.DisfrazServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Costume")
public class DisfrazController {
    private final DisfrazServiceImpl disfrazService;

    @Autowired
    public DisfrazController(DisfrazServiceImpl disfrazService) {
        this.disfrazService = disfrazService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Disfraz>> getAll() {
        return new ResponseEntity<>(disfrazService.getAll(), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Disfraz> save(@RequestBody Disfraz disfraz) {
        return new ResponseEntity<>(disfrazService.saveOrUpdate(disfraz), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Disfraz> update(@RequestBody Disfraz disfraz) {
        return new ResponseEntity<>(disfrazService.saveOrUpdate(disfraz), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable("id") Long id) {
        return new ResponseEntity<>(disfrazService.delete(id), HttpStatus.OK);
    }
}
