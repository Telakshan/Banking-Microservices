package com.quentin.tech.accounts.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import io.swagger.v3.oas.annotations.media.Schema;

@Data
@Schema(name = "Customer", description = "Customer details")
public class CustomerDto {
    @Schema(description = "Name of the customer", example = "John Doe")
    @NotEmpty(message = "Name cannot be null or empty")
    @Size(min = 5, max = 30, message = "The length of the customer name must be between 5 and 30")
    private String name;
    @Schema(description = "Email address of the customer", example = "john.doe@example.com")
    @NotEmpty(message = "Email address can not be null or empty")
    @Email(message = "Email address should be a valid value")
    private String email;
    @Schema(description = "Mobile number of the customer", example = "1234567890")
    @NotEmpty(message = "Mobile number cannot be null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    private String mobileNumber;
    @Schema(description = "Accounts of the customer")
    private AccountsDto accountsDto;
}
