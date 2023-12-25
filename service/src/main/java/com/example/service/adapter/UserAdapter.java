package com.example.service.adapter;

import com.example.common.dto.UserDto;
import com.example.common.entities.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserAdapter extends AbstractAdapter<UserEntity, UserDto> {
}
