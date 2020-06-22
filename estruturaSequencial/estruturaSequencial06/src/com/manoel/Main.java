package com.manoel;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("US"));
        Scanner sc = new Scanner(System.in);

        final double pi = 3.14159;

        //ENTRANCE
        System.out.print("Type a number for A: ");
        double a = sc.nextDouble();
        System.out.print("Type a number for B: ");
        double b = sc.nextDouble();
        System.out.print("Type a number for C: ");
        double c = sc.nextDouble();

        System.out.println("");

        //PROCESSING AND PRINT
        System.out.printf("Triangle = %.2f \n", (a * c) / 2);
        System.out.printf("Circle = %.2f \n", pi * Math.pow(c,2));
        System.out.printf("Trapeze: %.2f \n", ((a+b) * c)/2);
        System.out.printf("Square: %.2f \n", b*b);
        System.out.printf("Rectangle: %.2f \n", a*b);


    }
}
