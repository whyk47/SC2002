package tut8;

public class SwitchTest {
    public static void main(String[] args) {
        int day = 3;
        String dayType = switch (day) {
            case 1, 2, 3, 4, 5 -> "Weekday";
            case 6, 7 -> "Weekend";
            default -> "Invalid day";
        };
        System.out.println(dayType);

        /*
        Advantages:
        No Fall-Through: Eliminates common errors
        Expression Support: Assign result directly to a variable
        Concise and Cleaner Code
        */

        Object obj = new Test(3);
        String result = switch (obj) {
            case Integer i -> "It's an integer: " + i;
            case String s  -> "It's a string: " + s.toUpperCase();
            case Test t    -> "It's a Test object: " + t.value;
            case null      -> "It's null";
            default        -> "Unknown type";
        };

        System.out.println(result);
    }
}
