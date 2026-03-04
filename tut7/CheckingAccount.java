package tut7;

import java.util.ArrayList;

public class CheckingAccount {
    private double balance = 0;
    private ArrayList<Check> returned_checks = new ArrayList<>();
    private ArrayList<Integer> issued_check_nos = new ArrayList<>();
    private ArrayList<Object> check_photos = new ArrayList<>();

    public double getBalance() {
        return balance;
    }

    public void addInsufficientFundFee() {
        balance--;
    }

    public void noteReturnedCheck(Check check) {
        returned_checks.add(check);
    }

    public void addDebitTransaction(int checkNumber, double amount) {
        balance -= amount;
        issued_check_nos.add(checkNumber);
    }

    public void storePhotoOfCheck(Object photo) {
        check_photos.add(photo);
    }


}