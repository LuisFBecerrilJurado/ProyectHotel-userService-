package fran.usuarioservice.Exceptions;

/*
 * Class for handling exceptions as part of an API Response.
 ? With @RestControllerAdvice annotation, exceptions thrown by controllers are captured and handled.
 ! The ApiResponse class is called to create a response with custom messages
*/

import fran.usuarioservice.Response.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptions {
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ApiResponse> handlerNotFound(NotFoundException notFoundException){
        String message = notFoundException.getMessage();
        ApiResponse response = new ApiResponse().builder()
                .message(message)
                .success(true)
                .status(HttpStatus.NOT_FOUND)
                .build();
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
}
