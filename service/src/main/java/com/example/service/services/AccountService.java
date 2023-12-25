package com.example.service.services;

import com.example.common.entities.AccountEntity;
import com.example.service.repository.AccountRepository;
import org.springframework.stereotype.Service;

@Service
public class AccountService extends AbstractService<AccountEntity, AccountRepository> {
}
