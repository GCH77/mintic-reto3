package com.example.reto3.mensajes.repository;

import com.example.reto3.mensajes.model.Mensaje;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MensajeCrudRepository extends JpaRepository<Mensaje, Long> {
}
