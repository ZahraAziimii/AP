package com.example.service.repository.exceptionLogRepository;

import com.example.service.exceptionhandler.ExceptionLog;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExceptionLogRepository extends MongoRepository<ExceptionLog,Long> {
}
