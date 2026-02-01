package main.asm5;

public class CheckingAccount extends BankAccount{

    public CheckingAccount() {
    }

    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Số tiền rút không hợp lệ");
            return;
        }

        if (getBalance() - amount >= -5_000_000) {
            setBalance(getBalance() - amount);
            System.out.println("Số tiền bạn rút: " + amount + " vnd");
            System.out.println("Bạn còn có thể rút thêm: " + (getBalance() + 5_000_000) + " vnd");
        } else {
            System.out.println("Bạn không được rút tiền quá hạn mức cho phép (-5tr)");
        }
    }
}
