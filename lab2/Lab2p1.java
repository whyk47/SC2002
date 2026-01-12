package lab2;

import java.util.Scanner;

public class Lab2p1 {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Perform the following methods:");
            System.out.println("1: multiplication test");
            System.out.println("2: quotient using division by subtraction");
            System.out.println("3: remainder using division by subtraction");
            System.out.println("4: count the number of digits");
            System.out.println("5: position of a digit");
            System.out.println("6: extract all odd digits");
            System.out.println("7: quit");
            choice = sc.nextInt();
            int m, n;
            switch (choice) {
                case 1: /* add mulTest() call */
                mulTest();
                break;
                case 2: /* add divide() call */
                System.out.print("m = ");
                m = sc.nextInt();
                System.out.print("n = ");
                n = sc.nextInt();
                int quotient = divide(m, n);
                System.out.println(m + "/" + n + " = " + quotient);
                break;
                case 3: /* add modulus() call */
                System.out.print("m = ");
                m = sc.nextInt();
                System.out.print("n = ");
                n = sc.nextInt();
                int remainder = modulus(m, n);
                System.out.println(m + " % " + n + " = " + remainder);
                break;
                case 4: /* add countDigits() call */
                System.out.print("n: ");
                n = sc.nextInt();
                int digits = countDigits(n);
                System.out.println("count = " + digits);
                break;
                case 5: /* add position() call */
                System.out.print("n: ");
                n = sc.nextInt();
                System.out.print("digit: ");
                m = sc.nextInt();
                int pos = position(n, m);
                System.out.println("Position = " + pos);
                break;
                case 6: /* add extractOddDigits() call */
                System.out.print("n: ");
                n = sc.nextInt();
                long result = extractOddDigits(n);
                System.out.println("oddDigits  = " + result);
                break;
                case 7: System.out.println("Program terminating ….");
            }
        } while (choice < 7);
        sc.close();
    }
/* add method code here */
    private static void mulTest() {
        Scanner sc = new Scanner(System.in);
        final int NUM_QNS = 5;
        int score = 0;
        for (int i = 0; i < NUM_QNS; i++) {
            int n1 = (int) (Math.random() * 10);
            int n2 = (int) (Math.random() * 10);
            System.out.print("How much is " + n1 + " times " + n2 + "? ");
            int ans = sc.nextInt();
            if (ans == n1 * n2) {
                score++;
            }
        }
        System.out.println(score + " answers out of " + NUM_QNS + " are correct.");
    }

    public static int divide(int m, int n) {
        int quotient = 0;
        while (m >= n) {
            m -= n;
            quotient++;
        }
        return quotient;
    }

    public static int modulus(int m, int n) {
        while (m >= n) {
            m -= n;
        }
        return m;
    }

    public static int countDigits(int n) {
        if (n <= 0) {
            System.out.println("Invalid number");
        }
        int digits = 0;
        while (n > 0) {
            n /= 10;
            digits++;
        }
        return digits;
    }

    public static int position(int n, int digit) {
        int pos = 1;
        while (n > 0) {
            if (n % 10 == digit) {
                return pos;
            }
            n /= 10;
            pos++;
        }
        return -1;
    }

    public static long extractOddDigits(long n) {
        int result = 0;
        int power = 0;
        if (n <= 0) {
            System.out.println("Invalid number.");
        }
        while (n > 0) {
            int digit = (int) n % 10;
            if (digit % 2 == 1) {
                result += (int) digit * Math.pow(10, power);
                power++;
            }
            n /= 10;
        }
        if (result > 0) {
            return result;
        }
        return -1;
    }
}
