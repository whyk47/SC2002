package lab1;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice = sc.next().charAt(0);
        sc.close();
        switch (choice) {
            case 'A', 'a': System.out.printf("Action movie fan\n"); break;
            case 'C', 'c': System.out.printf("Comedy movie fan\\n"); break;
            case 'D', 'd': System.out.printf("Drama movie fan\\n"); break;
            default: System.out.printf("Invalid choice\\n");
        }
    }
}
