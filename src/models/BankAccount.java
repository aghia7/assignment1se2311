package models;

public class BankAccount {
    private int cents;

    public void deposit(int dollars) {
        cents += dollars * 100;
    }

    public void deposit(int dollars, int cents) {
        this.cents += dollars * 100 + cents;
    }

    public double getBalance() {
        return cents / 100.0;
    }

    public void withdraw(int dollars) {
        if (cents < dollars * 100) {
            throw new RuntimeException("not sufficient balance");
        }

        cents -= dollars * 100;
    }
}
