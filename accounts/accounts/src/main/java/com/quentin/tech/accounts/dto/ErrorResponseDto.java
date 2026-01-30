package com.quentin.tech.accounts.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Schema(name = "ErrorResponseDto", description = "Error response details")
public class ErrorResponseDto {
    @Schema(description = "API path")
    private String apiPath;
    @Schema(description = "Error code")
    private HttpStatus errorCode;
    @Schema(description = "Error message")
    private String errorMessage;
    @Schema(description = "Error time")
    private LocalDateTime errorTime;
}
