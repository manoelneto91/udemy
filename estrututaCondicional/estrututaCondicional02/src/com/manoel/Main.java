package com.manoel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ENTRANCE
        System.out.println("Type a number: ");
        int number = sc.nextInt();

        //PROCESSING
        if (number % 2 == 0){
            System.out.println("The number " + number + " is even!");
        }
        else{
            System.out.println("The number " + number + " is odd!");
        }

    }
}
