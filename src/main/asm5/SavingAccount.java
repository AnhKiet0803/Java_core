package main.asm5;

public class SavingAccount extends BankAccount{
    public SavingAccount() {
    }

    public SavingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        double fee = amount * 2 / 100;
        double total = amount + fee;

        if (getBalance() >= total) {
            setBalance(getBalance() - total);
            System.out.println("Số tiền rút: " + amount + " vnd");
            System.out.println("Phí rút (2%): " + fee + " vnd");
        } else {
            System.out.println("Số dư không đủ để rút");
        }
    }
}
