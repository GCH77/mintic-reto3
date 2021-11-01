package com.example.reto3.disfraces.service;

import com.example.reto3.disfraces.model.Disfraz;

import java.util.List;

public interface DisfrazService {
    List<Disfraz> getAll();
    Disfraz saveOrUpdate(Disfraz disfraz);
    void delete(Long id);
}
