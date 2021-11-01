package com.example.reto3.clientes.repository;

import com.example.reto3.clientes.model.Cliente;
import com.example.reto3.clientes.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class ClienteRepositoryImpl implements ClienteService {
    private final ClienteCrudRepository clienteCrudRepository;

    @Autowired
    public ClienteRepositoryImpl(ClienteCrudRepository clienteCrudRepository) {
        this.clienteCrudRepository = clienteCrudRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Cliente> getAll() {
        return clienteCrudRepository.findAll();
    }

    @Override
    @Transactional
    public Cliente saveOrUpdate(Cliente cliente) {
        return clienteCrudRepository.save(cliente);
    }

    @Override
    @Transactional
    public Boolean delete(Long id) {
        if (clienteCrudRepository.findById(id).isPresent()) {
            clienteCrudRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
