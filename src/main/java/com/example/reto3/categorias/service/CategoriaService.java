package com.example.reto3.categorias.service;

import com.example.reto3.categorias.model.Categoria;

import java.util.List;

public interface CategoriaService {
    List<Categoria> getAll();
    Categoria saveOrUpdate(Categoria categoria);
    Boolean delete(Long id);
}
