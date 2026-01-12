package tut2;

import java.util.Random;

public class Dice {
    private int valueOfDice;

    public void setDiceValue() {
        Random rand = new Random();
        valueOfDice = rand.nextInt(6) + 1;
    }

    public int getDiceValue() {
        return valueOfDice;
    }

    public void printDiceValue() {
        System.out.println("Current Value is " + valueOfDice);
    }
}
