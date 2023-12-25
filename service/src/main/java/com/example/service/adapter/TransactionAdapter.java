package com.example.service.adapter;

import com.example.common.dto.TransactionDto;
import com.example.common.entities.TransactionEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TransactionAdapter extends AbstractAdapter<TransactionEntity, TransactionDto> {

}
