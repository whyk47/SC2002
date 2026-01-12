package lab1;

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Height: ");
        int height = sc.nextInt();
        sc.close();
        if (height < 1) {
            System.out.println("Invalid height.");
            return;
        }
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                String val = ((j + i) % 2 == 0) ? "AA" : "BB";
                System.out.print(val);
            }
            System.out.println();
        }
    }
}
