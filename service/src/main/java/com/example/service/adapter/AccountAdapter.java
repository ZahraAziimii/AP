package com.example.service.adapter;

import com.example.common.dto.AccountDto;
import com.example.common.entities.AccountEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AccountAdapter extends AbstractAdapter<AccountEntity, AccountDto> {
}
