package com.example.service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;



public class AbstractService<E, R extends JpaRepository<E, Long>> {
    @Autowired
    private R repository;

    public E save(E entity) {
        return repository.save(entity);
    }

    public void removeById(Long id) {
        this.repository.deleteById(id);
    }

    public Optional<E> findById(Long id) {
        return repository.findById(id);
    }

    public List<E> findAll() {
        return repository.findAll();
    }

    public List<E> findBySample(E entity) {
        return repository.findAll(Example.of(entity));
    }

}
