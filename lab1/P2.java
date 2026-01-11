package lab1;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Salary ($): ");
        int salary = sc.nextInt();
        System.out.print("Merit: ");
        int merit = sc.nextInt();
        if (salary < 600 || (salary <= 649 && merit < 10)) {
            System.out.println("Grade C");
        } else if (salary < 700 || (salary <= 799 && merit < 20)) {
            System.out.println("Grade B");
        } else if (salary <= 899) {
            System.out.println("Grade A");
        } else {
            System.out.println("Invalid Input");
        }
        sc.close();
    }
}
