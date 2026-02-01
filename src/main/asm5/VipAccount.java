package main.asm5;

public class VipAccount extends BankAccount{
    public VipAccount() {
    }

    public VipAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount + amount * 1 / 100);
        System.out.println("Tổng số tiền gửi của bạn:"+amount);
    }
}
