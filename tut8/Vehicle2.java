package tut8;

public interface Vehicle2 {
    default void start() { System.out.println("Vehicle started"); }
}
