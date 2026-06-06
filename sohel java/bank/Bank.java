package bank;

public class Bank {
    private double balance;

    private double amount;

    private String accountNo;

    public void deposite(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("your balance is :" + balance);
        } else {
            System.out.println("invalid amount");
        }
        this.amount = amount;

    }

    public void setBalance(double balance) {
        this.balance = balance;

    }

    public double getBalance() {
        return balance;
    }

    public void withdrawl(double amount) {
        if (amount > 0 && amount < balance) {
            balance -= amount;
        } else {
            System.out.println("invalid amount");
        }
        this.amount = amount;
    }

    public void setaccountNo(String accountNo) {
        int x = accountNo.length();
        if (x != 10) {
            System.out.println("invalid account no.");

        } else {
            System.out.println("welcome");
        }
        this.accountNo = accountNo;
    }

    public String getaccountNo() {
        return this.accountNo;
    }

}
