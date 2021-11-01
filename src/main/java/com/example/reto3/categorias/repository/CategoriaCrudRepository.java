package com.example.reto3.categorias.repository;

import com.example.reto3.categorias.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaCrudRepository extends JpaRepository<Categoria, Long> {
}
