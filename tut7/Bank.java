package tut7;

public class Bank {
    public double cashCheck(Check theCheck) {
        double amount = theCheck.getAmount();
        double balance = theCheck.issuer.getBalance();

        if (balance < amount) {
            theCheck.issuer.addInsufficientFundFee();
            theCheck.issuer.noteReturnedCheck(theCheck);
            returnCheck(theCheck);
            return -1;
        }
        int checkNumber = theCheck.getCheckNo();
        theCheck.issuer.addDebitTransaction(checkNumber, amount);
        theCheck.issuer.storePhotoOfCheck(theCheck);
        return amount;
        
    }

    public void returnCheck(Check theCheck) {}
}