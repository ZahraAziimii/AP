package com.example.common.dto;

import com.example.common.entities.CardEntity;
import com.example.common.validation.GeneralValidationGroup;
import com.example.common.validation.NotNullGroup;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountDto extends AbstractDto {
    private Long id;
    private CardDto card;
    @NotNull(groups = NotNullGroup.class,message = "account.accountnumber.notnull")
    private Long accountNumber;
    @Max(groups = GeneralValidationGroup.class, value = 100, message = "account.balance.max")
    @Min(groups = GeneralValidationGroup.class, value = 100, message = "account.balance.min")
    private Long balance;


}
