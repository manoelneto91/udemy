package com.manoel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc =  new Scanner(System.in);

	//ENTRANCE
        System.out.println("Type a number: ");
        int number = sc.nextInt();

        //PROCESSING
        if (number < 0){
            //PRINT
            System.out.println("The number " + number + " is negative");
        }
        else
        {
            //PRINT
            System.out.println("The number " + number + " is positive");
        }
    }
}
