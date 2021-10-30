package com.example.reto3.administrativos.service;

import com.example.reto3.administrativos.model.Administrador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministrativosServiceImpl {
    private final AdministrativosService administrativosService;

    @Autowired
    public AdministrativosServiceImpl(AdministrativosService administrativosService) {
        this.administrativosService = administrativosService;
    }

    public List<Administrador> getAll() {
        return administrativosService.getAll();
    }

    public Administrador saveOrUpdate(Administrador administrador) {
        return administrativosService.saveOrUpdate(administrador);
    }

    public Boolean delete(Long id) {
        return administrativosService.delete(id);
    }
}
