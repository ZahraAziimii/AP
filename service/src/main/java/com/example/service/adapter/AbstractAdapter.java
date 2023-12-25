package com.example.service.adapter;

import org.mapstruct.MapperConfig;
import org.mapstruct.MappingInheritanceStrategy;

import java.util.List;

public interface AbstractAdapter<E, D> {
    E ConvertDto(D dto);

    List<E> ConvertDto(List<D> dto);

    D ConvertEntity(E dto);

    List<D> ConvertEntity(List<E> dto);
}
