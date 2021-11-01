package com.example.reto3.categorias.repository;

import com.example.reto3.categorias.model.Categoria;
import com.example.reto3.categorias.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class CategoriaRepositoryImpl implements CategoriaService {
    private final CategoriaCrudRepository categoriaCrudRepository;

    @Autowired
    public CategoriaRepositoryImpl(CategoriaCrudRepository categoriaCrudRepository) {
        this.categoriaCrudRepository = categoriaCrudRepository;
    }


    @Override
    @Transactional(readOnly = true)
    public List<Categoria> getAll() {
        return categoriaCrudRepository.findAll();
    }

    @Override
    @Transactional
    public Categoria saveOrUpdate(Categoria categoria) {
        return categoriaCrudRepository.save(categoria);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        categoriaCrudRepository.deleteById(id);
    }
}
