package com.example.reto3.categorias.service;

import com.example.reto3.categorias.model.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImpl {
    private final CategoriaService categoriaService;

    @Autowired
    public CategoriaServiceImpl(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    public List<Categoria> getAll() {
        return categoriaService.getAll();
    }

    public Categoria saveOrUpdate(Categoria categoria) {
        return categoriaService.saveOrUpdate(categoria);
    }

    public void delete(Long id) {
        categoriaService.delete(id);
    }
}
