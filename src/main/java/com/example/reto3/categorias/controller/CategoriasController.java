package com.example.reto3.categorias.controller;

import com.example.reto3.categorias.model.Categoria;
import com.example.reto3.categorias.service.CategoriaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Category")
public class CategoriasController {
    private final CategoriaServiceImpl categoriaService;

    @Autowired
    public CategoriasController(CategoriaServiceImpl categoriaService) {
        this.categoriaService = categoriaService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Categoria>> getAll() {
        return new ResponseEntity<>(categoriaService.getAll(), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Categoria> save(@RequestBody Categoria categoria) {
        return new ResponseEntity<>(categoriaService.saveOrUpdate(categoria), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Categoria> update(@RequestBody Categoria categoria) {
        return new ResponseEntity<>(categoriaService.saveOrUpdate(categoria), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        categoriaService.delete(id);
    }
}
