package com.example.reto3.disfraces.service;

import com.example.reto3.disfraces.model.Disfraz;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisfrazServiceImpl {
    private final DisfrazService disfrazService;

    public DisfrazServiceImpl(DisfrazService disfrazService) {
        this.disfrazService = disfrazService;
    }

    public List<Disfraz> getAll() {
        return disfrazService.getAll();
    }

    public Disfraz saveOrUpdate(Disfraz disfraz) {
        return disfrazService.saveOrUpdate(disfraz);
    }

    public void delete(Long id) {
        disfrazService.delete(id);
    }
}
