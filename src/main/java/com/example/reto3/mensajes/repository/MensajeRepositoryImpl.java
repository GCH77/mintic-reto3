package com.example.reto3.mensajes.repository;

import com.example.reto3.mensajes.model.Mensaje;
import com.example.reto3.mensajes.service.MensajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class MensajeRepositoryImpl implements MensajeService {
    private final MensajeCrudRepository mensajeCrudRepository;

    @Autowired
    public MensajeRepositoryImpl(MensajeCrudRepository mensajeCrudRepository) {
        this.mensajeCrudRepository = mensajeCrudRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Mensaje> getAll() {
        return mensajeCrudRepository.findAll();
    }

    @Override
    @Transactional
    public Mensaje saveOrUpdate(Mensaje mensaje) {
        return mensajeCrudRepository.save((mensaje));
    }

    @Override
    @Transactional
    public void delete(Long id) {
        mensajeCrudRepository.deleteById(id);
    }
}
