package com.example.service.services;

import com.example.common.entities.UserEntity;
import com.example.service.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService extends AbstractService <UserEntity, UserRepository> {
    @Override
    public UserEntity save(UserEntity entity) {
        return super.save(entity);
    }
}
