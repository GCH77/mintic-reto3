package com.example.reto3.administrativos.repository;

import com.example.reto3.administrativos.model.Administrador;
import com.example.reto3.administrativos.service.AdministrativosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class AdministrativosRepositoryImpl implements AdministrativosService {
    private final AdministrativosCrudRepository adminCrudRepository;

    @Autowired
    public AdministrativosRepositoryImpl(AdministrativosCrudRepository adminCrudRepository) {
        this.adminCrudRepository = adminCrudRepository;
    }


    @Override
    @Transactional(readOnly = true)
    public List<Administrador> getAll() {
        return adminCrudRepository.findAll();
    }

    @Override
    @Transactional
    public Administrador saveOrUpdate(Administrador administrador) {
        return adminCrudRepository.save(administrador);
    }

    @Override
    @Transactional
    public Boolean delete(Long id) {
        if (adminCrudRepository.findById(id).isPresent()) {
            adminCrudRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
