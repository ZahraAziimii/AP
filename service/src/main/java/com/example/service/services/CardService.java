package com.example.service.services;

import com.example.common.entities.CardEntity;
import com.example.service.repository.CardRepository;
import org.springframework.stereotype.Service;

@Service
public class CardService extends AbstractService<CardEntity, CardRepository> {
}
