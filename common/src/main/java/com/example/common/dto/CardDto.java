package com.example.common.dto;

import com.example.common.validation.GeneralValidationGroup;
import com.example.common.validation.NotNullGroup;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CardDto extends AbstractDto {
    private Long id;
    @NotNull(groups = NotNullGroup.class,message = "cardNumber.cvv2.invalid.notnull")
    @Size(groups = GeneralValidationGroup.class,max = 4,message = "cardNumber.cvv2.size")
    private Integer cvv2;
    @NotNull(groups = NotNullGroup.class)
    private String expireDate;
    @Size(groups = GeneralValidationGroup.class,max = 20,message = "cardNumber.invalid.size")
    private String cardNumber;
}

