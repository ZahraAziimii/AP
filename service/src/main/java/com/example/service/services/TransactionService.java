package com.example.service.services;

import com.example.common.entities.TransactionEntity;
import com.example.service.repository.TransactionRepository;
import org.springframework.stereotype.Service;

@Service
public class TransactionService extends AbstractService<TransactionEntity, TransactionRepository> {
}
