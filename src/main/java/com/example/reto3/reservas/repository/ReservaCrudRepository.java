package com.example.reto3.reservas.repository;

import com.example.reto3.reservas.model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface ReservaCrudRepository extends JpaRepository<Reserva, Long> {

    @Query("select r from Reserva r where r.startDate >= ?1 and r.devolutionDate <= ?2")
    Optional<List<Reserva>> findReservasBetweenDates(Date startDate, Date endDate);

    Integer countByStatus(String status);
}
