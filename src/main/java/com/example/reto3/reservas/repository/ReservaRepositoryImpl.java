package com.example.reto3.reservas.repository;

import com.example.reto3.reservas.model.Reserva;
import com.example.reto3.reservas.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class ReservaRepositoryImpl implements ReservaService {
    private final ReservaCrudRepository reservaCrudRepository;

    @Autowired
    public ReservaRepositoryImpl(ReservaCrudRepository reservaCrudRepository) {
        this.reservaCrudRepository = reservaCrudRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Reserva> getAll() {
        return reservaCrudRepository.findAll();
    }

    @Override
    @Transactional
    public Reserva saveOrUpdate(Reserva reserva) {
        reserva.setStatus("created");
        return reservaCrudRepository.save(reserva);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        reservaCrudRepository.deleteById(id);
    }
}
