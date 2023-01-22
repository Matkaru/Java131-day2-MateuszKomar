package Task24;

public class BasketFullException extends Exception{
    public BasketFullException() {
        super("Twój koszyk jest pełny");
    }

    public BasketFullException(String message) {
        super(message);
    }
}
