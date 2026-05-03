package com.quentin.tech.accounts.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import io.swagger.v3.oas.annotations.media.Schema;

@Data
@Schema(name = "Accounts", description = "Accounts details")
public class AccountsDto {
    @NotEmpty(message = "AccountNumber cannot be null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Account number must be 10 digits")
    @Schema(description = "Account number", example = "1234567890")
    private Long accountNumber;
    @NotEmpty(message = "AccountType can not be a null or empty")
    @Schema(description = "Account type", example = "Savings")
    private String accountType;
    @NotEmpty(message = "BranchAddress can not be a null or empty")
    @Schema(description = "Branch address", example = "123 Main St")
    private String branchAddress;
}