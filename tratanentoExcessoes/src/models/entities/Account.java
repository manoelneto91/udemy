package models.entities;

public class Account {
    private int number;
    private String Holder;
    private double balance;
    private double withdrawLimit;

    public Account(){

    }

    public Account(int number, String holder, double balance, double withdrawLimit){
        this.setNumber(number);
        this.setHolder(holder);
        this.setBalance(balance);
        this.setWithdrawLimit(withdrawLimit);


    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHolder() {
        return Holder;
    }

    public void setHolder(String holder) {
        Holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double depositAmount){
        balance = balance + depositAmount;
    }

    public void withdraw(double amount){
        if (amount > withdrawLimit){
            throw new DomainException("The amount exceeds the withdraw limit: ");
        }
        if(amount > balance){
            throw new DomainException("Not enough balance");
        }
        balance = balance - amount;
    }


}
