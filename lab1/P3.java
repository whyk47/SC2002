package lab1;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        final int ROW_LEN = 14;
        final float USD_TO_SGD = 1.82f;
        Scanner sc = new Scanner(System.in);
        System.out.print("Starting: ");
        float starting = sc.nextFloat();
        System.out.print("Ending: ");
        float ending = sc.nextFloat();
        System.out.print("Increment: ");
        float increment = sc.nextFloat();
        System.out.println("US$" + " ".repeat(ROW_LEN - 5) + "S$");
        System.out.println("-".repeat(ROW_LEN));
        for (float i = starting; i <= ending; i += increment) {
            String usd = String.valueOf(Math.round(i * 100.0) / 100.0);
            System.out.print(usd);
            System.out.print(" ".repeat(ROW_LEN - usd.length() - 2));
            System.out.printf("%-14.2f\n", i * USD_TO_SGD);
        }
        sc.close();
    }
}
