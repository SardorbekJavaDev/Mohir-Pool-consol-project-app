package company.exp;

public class FullNameNotValidException extends RuntimeException {
    public FullNameNotValidException(String message) {
        super(message);
    }
}
