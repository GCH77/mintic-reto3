package com.example.reto3.clientes.service;

import com.example.reto3.clientes.model.Cliente;

import java.util.List;

public interface ClienteService {
    List<Cliente> getAll();
    Cliente saveOrUpdate(Cliente cliente);
    Boolean delete(Long id);
}
