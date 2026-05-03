package com.quentin.tech.accounts.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import io.swagger.v3.oas.annotations.media.Schema;

@Data
@Schema(name = "Response", description = "Response details")
@AllArgsConstructor
public class ResponseDto {
    @Schema(description = "Status code")
    private String statusCode;
    @Schema(description = "Status message")
    private String statusMsg;
}