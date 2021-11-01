package com.example.reto3.calificacionReservas.repository;

import com.example.reto3.calificacionReservas.model.CalificacionReserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalificacionReservaCrudRepository extends JpaRepository<CalificacionReserva, Long> {
}
