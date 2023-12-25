package com.example.service.controllers;

import com.example.common.dto.UserDto;
import com.example.common.entities.UserEntity;
import com.example.service.services.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Transactional(readOnly = true)
@RestController
@RequestMapping("/user")

public class UserControllers extends AbstractControllers<UserEntity, UserDto, UserService> {
    @Override
    @PostMapping("/insert")
    public void save(@RequestBody UserDto user) {
        service.save(adapter.ConvertDto(user));
    }
}
