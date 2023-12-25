package com.example.service.controllers;

import com.example.common.validation.GeneralValidationGroup;
import com.example.common.validation.NotNullGroup;
import com.example.service.adapter.AbstractAdapter;
import com.example.service.services.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


public class AbstractControllers<E, D, S extends AbstractService<E, ?>> {
    @Autowired
    protected S service;
    @Autowired
    protected AbstractAdapter<E, D> adapter;

    @PostMapping()
    @Transactional
    public void save(@RequestBody @Validated({NotNullGroup.class, GeneralValidationGroup.class}) D dto) {
        service.save(adapter.ConvertDto(dto));
    }

    @Transactional
    @DeleteMapping("/{id}")
    public void remove(@PathVariable Long id) {
        service.removeById(id);
    }

    @GetMapping("/{id}")
    public D findById(@PathVariable Long id) {
        return adapter.ConvertEntity(service.findById(id).orElse(null));
    }

    @GetMapping("/")
    public List<D> findByAll() {
        return adapter.ConvertEntity(service.findAll());

    }

    @PostMapping("/search")
    public List<D> findByExample(@Validated(GeneralValidationGroup.class) @RequestBody D dto) {
        return adapter.ConvertEntity(service.findBySample(adapter.ConvertDto(dto)));
    }
}


