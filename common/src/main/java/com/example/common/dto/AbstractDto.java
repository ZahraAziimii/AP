package com.example.common.dto;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

@Data

public class AbstractDto {
    @CreatedDate
    private Date insertDate;
    @LastModifiedDate
    private Date lastModifiedDate;
}
