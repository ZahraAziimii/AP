package com.example.common.dto;

import com.example.common.entities.AccountEntity;
import com.example.common.validation.GeneralValidationGroup;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto extends AbstractDto {
    private Long id;
    @NotNull(groups = NotBlank.class, message = "user.name.isnull")
    @Size(groups = GeneralValidationGroup.class, max = 50, message = "user.name.invalid.saiz")
    private String name;
    @NotNull(groups = NotBlank.class, message = "user.lastname.isnull")
    @Size(groups = GeneralValidationGroup.class, max = 50, message = "user.lastname.invalid.saiz")
    private String lastName;
    @NotNull(groups = NotBlank.class, message = "user.national_code.isnull")
    @Size(groups = GeneralValidationGroup.class, min = 10, max = 10, message = "user.national_code.invalid.saiz")
    private String national_Code;
    private List<AccountDto> account;
}

