package com.example.reto3.administrativos.repository;

import com.example.reto3.administrativos.model.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdministrativosCrudRepository extends JpaRepository<Administrador, Long> {
}
