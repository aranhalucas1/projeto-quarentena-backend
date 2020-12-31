package com.projeto.quarentena.controller.exception;

import com.projeto.quarentena.services.exception.ObjectNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException e, HttpServletRequest request) {
        StandardError error = new StandardError(ZonedDateTime.now().format(DateTimeFormatter.ISO_INSTANT),
                                                HttpStatus.NOT_FOUND.value(),
                                                "Não encontrado",
                                                e.getMessage(),
                                                request.getRequestURI());

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);

    }
}
