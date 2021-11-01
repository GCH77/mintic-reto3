package com.example.reto3.clientes.repository;

import com.example.reto3.clientes.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteCrudRepository extends JpaRepository<Cliente, Long> {
}
