package com.example.reto3.disfraces.repository;

import com.example.reto3.disfraces.model.Disfraz;
import com.example.reto3.disfraces.service.DisfrazService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class DisfrazRepositoryImpl implements DisfrazService {
    private final DisfrazCrudRepository disfrazCrudRepository;

    @Autowired
    public DisfrazRepositoryImpl(DisfrazCrudRepository disfrazCrudRepository) {
        this.disfrazCrudRepository = disfrazCrudRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Disfraz> getAll() {
        return disfrazCrudRepository.findAll();
    }

    @Override
    @Transactional
    public Disfraz saveOrUpdate(Disfraz disfraz) {
        if (disfrazCrudRepository.existsById(disfraz.getId())) {
            Disfraz disfraz1 = disfrazCrudRepository.getById(disfraz.getId());
            disfraz1.setName(disfraz.getName());
            disfraz1.setBrand(disfraz.getBrand());
            disfraz1.setYear(disfraz.getYear());
        }
        return disfrazCrudRepository.save(disfraz);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        disfrazCrudRepository.deleteById(id);
    }
}
