package tut8;

public class Car implements Vehicle, Vehicle2 {
    @Override
    public void start() {
        // resolve conflict by overriding
        System.out.println("Car started");
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.start();
    }
}
