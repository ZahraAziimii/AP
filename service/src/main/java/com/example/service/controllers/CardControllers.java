package com.example.service.controllers;

import com.example.common.dto.CardDto;
import com.example.common.entities.CardEntity;
import com.example.service.services.CardService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Transactional(readOnly = true)
@RestController
@RequestMapping("/card")
public class CardControllers extends AbstractControllers<CardEntity, CardDto, CardService> {
}
