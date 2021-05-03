package com.company;

import models.entities.Account;
import models.entities.DomainException;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Type the account number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Type the holder name: ");
        String holder = sc.nextLine();
        System.out.print("Type the initial balance: ");
        double balance = sc.nextDouble();
        System.out.print("Tyoe the withdraw limit: ");
        double withdrawLimit = sc.nextDouble();

        System.out.println();
        Account acc = new Account(number, holder, balance, withdrawLimit);

        System.out.println("Type a amount for deposit: ");
        double depositAmount = sc.nextDouble();

        System.out.print("Type a amount for withdraw: ");
        double amount = sc.nextDouble();

        try{
            acc.withdraw(amount);
            System.out.println("New Balance: " + String.format("%.2f", acc.getBalance()));
        }
        catch (DomainException e){
            System.out.println("Withdraw error: " + e.getMessage());
        }

        sc.close();
    }
}
