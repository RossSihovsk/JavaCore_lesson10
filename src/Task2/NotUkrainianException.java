package Task2;

public class NotUkrainianException extends Exception {
    String message;

    public NotUkrainianException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
