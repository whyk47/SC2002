package tut2;

import java.util.Scanner;

public class DiceApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dice d = new Dice();
        System.out.println("Press <key> to roll the first dice");
        sc.next();
        d.setDiceValue();
        int v1 = d.getDiceValue();
        d.printDiceValue();
        System.out.println("Press <key> to roll the second dice");
        sc.next();
        d.setDiceValue();
        int v2 = d.getDiceValue();
        d.printDiceValue();
        System.out.println("Your total number is: " + (v1+v2));
        sc.close();
    }
}
