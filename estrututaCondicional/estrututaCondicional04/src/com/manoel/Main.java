package com.manoel;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("US"));
        Scanner sc = new Scanner(System.in);

        // ENTRANCE
        System.out.print("Type your income: ");
        double income = sc.nextDouble();

        System.out.println("");
        //PROCESSING
        if (income > 0.0 && income <= 2000.00){
            System.out.println("TAXES: FREE");
        }
        else if(income > 2000.00 && income <= 3000.00){
            System.out.printf("TAXES: %.2f", (income - 2000.0) * 0.08);
        }
        else if (income > 3000.00 && income <= 4500.00){
            System.out.printf("TAXES: %.2f", (income - 3000.0) * 0.18 + 1000.0 * 0.08);
        }
        else if (income > 4500){
            System.out.printf("TAXES: %.2f", (income - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08);
        }
        else{
            System.out.println("Incorrect Value!!! Try Again!!!");
        }
    }
}
