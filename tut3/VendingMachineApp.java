package tut3;

public class VendingMachineApp {
    public static void main(String[] args) {
        VendingMachine v = new VendingMachine();
        double cost = v.selectDrink();
        double amount = v.insertCoins(cost);
        v.checkChange(amount, cost);
        v.printReceipt();
    }
}

/* 
a) Discuss the design of the VendingMachine class and how it can be improved.
Instance variables can be used to store the cost of the drink and the amount inserted.
b) What will be a relevant class to relate to the VendingMachine class?
A Drink class can be used to store the name and cost of the drink.
c) Suggest how the application can be re-designed to involve the class in (b)?
Use an instance variable drink to store the drink selected.
*/