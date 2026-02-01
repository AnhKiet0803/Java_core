package main.asm5;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount() {
    }

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        if (amount > 0) {
            balance += amount;
        }else {
            System.out.println("Vui lòng nạp số tiền bạn muốn gửi");
        }
    }

    public void withdraw(double amount){
        if (amount <= 0) {
            System.out.println("Số tiền rút không hợp lệ");
        }
        else if (amount <= balance) {
            balance -= amount;
            System.out.println("Số tiền bạn rút: " + amount + " vnd");
        }
        else {
            System.out.println("Số dư không đủ để rút");
        }
    }

    public void printBalance(){
        System.out.println("Số dư còn lại: " + balance+ " vnd");
    }
}
