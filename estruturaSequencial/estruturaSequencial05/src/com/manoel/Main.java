package com.manoel;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("US"));
        Scanner sc = new Scanner(System.in);

        //ENTRANCE
        System.out.print("Type the code of first part: ");
        int code1 = sc.nextInt();
        System.out.print("Quantity: ");
        int quantity1 = sc.nextInt();
        System.out.print("Value: ");
        double value1 = sc.nextDouble();

        System.out.print("Type the code of second part: ");
        int code2 = sc.nextInt();
        System.out.print("Quantity: ");
        int quantity2 = sc.nextInt();
        System.out.print("Value: ");
        double value2 = sc.nextDouble();


        System.out.println("");
        //PROCESSING AND PRINT
        System.out.printf("amount payable = %.2f", (value1*quantity1) + (value2*quantity2));
    }
}
