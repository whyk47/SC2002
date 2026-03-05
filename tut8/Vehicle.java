package tut8;

public interface Vehicle {
    default void start() {
        System.out.println("Vehicle started");
    }

    default void stop() {
        // Can add new method to interface without breaking existing code
        System.out.println("Vehicle stopped");
    }
} 
