package com.example.service.controllers;

import com.example.common.dto.AccountDto;
import com.example.common.entities.AccountEntity;
import com.example.service.services.AccountService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Transactional(readOnly = true)
@RestController
@RequestMapping("/account")
public class AccountControllers extends AbstractControllers<AccountEntity, AccountDto, AccountService> {
}
