package com.backend.musicApp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class ErrorResourceAlreadyExistsDto {

    private  String apiPath;
    private HttpStatus errorCode;
    private  String errorAlreadyExists;
    private LocalDateTime errorTime;
}
