package com.example.reto3.reservas.repository;

import com.example.reto3.reservas.model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaCrudRepository extends JpaRepository<Reserva, Long> {
}
