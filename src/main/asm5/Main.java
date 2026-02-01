package main.asm5;

public class Main {
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount("SA01", 10_000_000);
        sa.withdraw(1_000_000);
        sa.printBalance();
        System.out.println("-------------------");

        CheckingAccount ca = new CheckingAccount("AC001", 1_000_000);
        ca.withdraw(1_000_000);
        ca.printBalance();
        ca.withdraw(3_000_000);
        ca.printBalance();
        ca.withdraw(2_000_000);
        ca.printBalance();
        ca.withdraw(1_000_000);
        ca.printBalance();
        System.out.println("-------------------");

        VipAccount va = new VipAccount("VIP01", 5_000_000);
        va.withdraw(6_000_000);
        va.printBalance();
        va.deposit(1_000_000);
        va.printBalance();

    }
}

