package com.example.service.services.exceptionLogService;

import com.example.service.exceptionhandler.ExceptionLog;
import com.example.service.repository.exceptionLogRepository.ExceptionLogRepository;
import org.springframework.stereotype.Service;

@Service
public class ExceptionLogService {
    private final ExceptionLogRepository repository;

    public ExceptionLogService(ExceptionLogRepository repository) {
        this.repository = repository;
    }

    public void Insert(ExceptionLog log) {

        repository.save(log);
    }
}
