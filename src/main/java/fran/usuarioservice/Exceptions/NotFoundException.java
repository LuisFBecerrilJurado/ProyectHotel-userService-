package fran.usuarioservice.Exceptions;

public class NotFoundException extends RuntimeException {
    public NotFoundException() {
        super("User not found in the database");
    }

    public NotFoundException(String message) {
        super(message);
    }
}
