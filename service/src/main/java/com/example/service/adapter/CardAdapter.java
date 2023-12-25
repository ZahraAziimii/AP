package com.example.service.adapter;

import com.example.common.dto.CardDto;
import com.example.common.entities.CardEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CardAdapter extends AbstractAdapter<CardEntity, CardDto> {
}
