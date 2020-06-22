package com.manoel;

import java.awt.desktop.SystemEventListener;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("US"));
        Scanner sc = new Scanner(System.in);

        //ENTRANCE
        System.out.print("Type a number of employee: ");
        int number = sc.nextInt();
        System.out.print("Hour value: ");
        double hourValue = sc.nextDouble();
        System.out.print("Hour quantity: ");
        double hourQuantity = sc.nextDouble();

        System.out.println("");

        //PROCESS AND OUT
        System.out.println("Number: " + number);
        System.out.printf("Salary: %.2f", hourQuantity * hourValue);
    }
}
