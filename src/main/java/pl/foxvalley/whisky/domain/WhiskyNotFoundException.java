package pl.foxvalley.whisky.domain;

public class WhiskyNotFoundException extends RuntimeException {

    public WhiskyNotFoundException(String message) {
        super(message);
    }
}
