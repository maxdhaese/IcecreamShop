package be.intecbrussel.sellers;

public class NoMoreIceCreamException extends Exception {
    //create an exception that checks if there are enough products in stock. If not we get a NoMoreIceCreamException.

    public NoMoreIceCreamException() {
        super();
    }

    public NoMoreIceCreamException(String message) {
        super(message);
    }

    public NoMoreIceCreamException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoMoreIceCreamException(Throwable cause) {
        super(cause);
    }
}
