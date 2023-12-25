package com.example.service.controllers;

import com.example.common.dto.TransactionDto;
import com.example.common.entities.TransactionEntity;
import com.example.service.services.TransactionService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Transactional(readOnly = true)
@RestController
@RequestMapping("/transaction")
public class TransactionControllers extends AbstractControllers<TransactionEntity, TransactionDto, TransactionService> {
}
