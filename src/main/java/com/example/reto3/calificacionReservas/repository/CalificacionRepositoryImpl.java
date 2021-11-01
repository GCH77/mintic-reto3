package com.example.reto3.calificacionReservas.repository;

import com.example.reto3.calificacionReservas.model.CalificacionReserva;
import com.example.reto3.calificacionReservas.service.CalificacionReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class CalificacionRepositoryImpl implements CalificacionReservaService {
    private final CalificacionReservaCrudRepository calificacionCrudRepository;

    @Autowired
    public CalificacionRepositoryImpl(CalificacionReservaCrudRepository calificacionCrudRepository) {
        this.calificacionCrudRepository = calificacionCrudRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<CalificacionReserva> getAll() {
        return calificacionCrudRepository.findAll();
    }

    @Override
    @Transactional
    public CalificacionReserva saveOrUpdate(CalificacionReserva calificacionReserva) {
        return calificacionCrudRepository.save(calificacionReserva);
    }

    @Override
    @Transactional
    public Boolean delete(Long id) {
        if (calificacionCrudRepository.findById(id).isPresent()) {
            calificacionCrudRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
