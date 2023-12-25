package com.example.common.dto;

import com.example.common.entities.AccountEntity;
import com.example.common.entities.enums.DealType;
import com.example.common.validation.GeneralValidationGroup;
import com.example.common.validation.NotNullGroup;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionDto extends AbstractDto {
    private Long id;
    @NotNull(groups = NotNullGroup.class,message = "transaction.transactionDate.notnull")
    private Date transactionDate;
    private AccountEntity account;
    @Size(groups = GeneralValidationGroup.class,max = 100000000,message = "transaction.amount.size")
    private Long amount;
    private DealType dealType;
    @NotNull(groups = NotNullGroup.class,message = "transaction.trackingcode.is null")
    private String trackingCode;
}
