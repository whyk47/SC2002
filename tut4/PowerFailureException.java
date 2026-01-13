package tut4;

public class PowerFailureException extends Exception {
    PowerFailureException(String message) {
        super(message);
    }

    PowerFailureException() {
        super("Power failure!");
    }

    public static void main(String[] args) throws PowerFailureException {
        try {
            throw new PowerFailureException();
        } catch (PowerFailureException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
        try {
            throw new PowerFailureException("No Power!");
        } catch (PowerFailureException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
