package com.example.reto3.clientes.service;

import com.example.reto3.clientes.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl {
    private final ClienteService clienteService;

    @Autowired
    public ClienteServiceImpl(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    public List<Cliente> getAll() {
        return clienteService.getAll();
    }

    public Cliente saveOrUpdate(Cliente cliente) {
        return clienteService.saveOrUpdate(cliente);
    }

    public void delete(Long id) {
        clienteService.delete(id);
    }
}
