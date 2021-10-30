package com.example.reto3.administrativos.service;

import com.example.reto3.administrativos.model.Administrador;

import java.util.List;

public interface AdministrativosService {
    List<Administrador> getAll();
    Administrador saveOrUpdate(Administrador administrador);
    Boolean delete(Long id);
}
