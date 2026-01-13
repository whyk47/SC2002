package tut4;

public class UnknownOperatorException extends Exception {
    public UnknownOperatorException(String message) {
        super(message);
    }

    public UnknownOperatorException() {
        super("Unknown operator!");
    }

    public UnknownOperatorException(char op) {
        super(String.valueOf(op));
    }
}
