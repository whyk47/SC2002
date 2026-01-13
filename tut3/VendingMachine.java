package tut3;

import java.util.Scanner;

public class VendingMachine
{
    // constructor
    public VendingMachine() {}
    // get the drink selection, and return the cost of the drink
    public double selectDrink() {
        System.out.println("====== Vending Machine ======");
        System.out.println("|1. Buy Beer ($3.00)        |");
        System.out.println("|2. Buy Coke ($1.00)        |");
        System.out.println("|3. Buy Green Tea ($5.00)   |");
        System.out.println("|============================");
        System.out.println("Please enter selection:");
        Scanner sc = new Scanner(System.in);
        int selection = sc.nextInt();
        double drinkCost = 0.0;
        switch (selection) {
            case 1:
                drinkCost = 3.0;
                break;
            case 2:
                drinkCost = 1.0;
                break;
            case 3:
                drinkCost = 5.0;
                break;
            default:
                System.out.println("Invalid selection.");
        }
        return drinkCost;
    }
    // insert the coins and returns the amount inserted
    public double insertCoins(double drinkCost) {
        System.out.println("Please insert coins:");
        System.out.println("========== Coins Input ===========");
        System.out.println("|Enter 'Q' for ten cents input   |");
        System.out.println("|Enter 'T' for twenty cents input|");
        System.out.println("|Enter 'F' for fifty cents input |");
        System.out.println("|Enter 'N' for a dollar input    |");
        System.out.println("==================================");
        double inserted = 0;
        Scanner sc = new Scanner(System.in);
        while (inserted < drinkCost) {
            char c = sc.next().charAt(0);
            switch (c) {
                case 'Q': inserted += 0.1; break;
                case 'T': inserted += 0.2; break;
                case 'F': inserted += 0.5; break;
                case 'N': inserted++; break;
                default: System.out.println("Invalid selection.");
            }
            System.out.printf("Coins inserted: %-3.2f\n", inserted);
        }
        sc.close();
        return inserted;
    }
    // check the change and print the change on screen
    public void checkChange(double amount, double drinkCost) {
        double change = amount - drinkCost;
        System.out.printf("Change: %-3.2f\n", change);
    }
    // print the receipt and collect the drink
    public void printReceipt(){
        System.out.println("Please collect your drink");
        System.out.println("Thank You !!");
    }
}