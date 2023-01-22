package Task24;

public class BasketEmptyException extends RuntimeException{
    public BasketEmptyException() {
        super("Twój koszyk jest pusty");
    }

    public BasketEmptyException(String message) {
        super(message);
    }
}
