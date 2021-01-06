package Task1;

public class NotFiveLetterException extends Exception {
    String message;

    public NotFiveLetterException( String message) {

        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
