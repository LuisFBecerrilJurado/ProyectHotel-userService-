package fran.usuarioservice.Exceptions.Global;

/*
 * Clase para el manejo de excepciones como parte de la respuesta a la consulta de la API
 ? con la anotación "@RestControllerAdvice" se capturan y manejan las excepciones lanzadas por el controlador
 ? evitando la duplicacion de codigo
 ! Se llama a la clase de ApiResponse para crear una respuesta con los mensajes personalizados
*/

import fran.usuarioservice.Exceptions.NotFoundException;
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
