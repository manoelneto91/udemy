package com.manoel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // MENU
        System.out.println("*========================================*");
        System.out.println("*********** MANOEL'S SNACK BAR ***********");
        System.out.println("*========================================*");
        System.out.println("* 1 - X-Bacon ------------------ R$ 14,50*");
        System.out.println("* 2 - X-Egg -------------------- R$ 12,50*");
        System.out.println("* 3 - Toast -------------------- R$ 1,50 *");
        System.out.println("* 4 - Can of Soda -------------- R$ 5,00 *");
        System.out.println("*========================================*");

        //ENTRACE
        System.out.print("Type an option: ");
        int option = sc.nextInt();
        System.out.print("Type the quantity: ");
        int quantity = sc.nextInt();

        System.out.println("");
        //PROCESSING
        switch (option){
            case 1:
                System.out.printf("Amount Payable: %.2f", 14.50 * quantity);
                break;
            case 2:
                System.out.printf("Amount payable: %.2f", 12.50 * quantity);
                break;
            case 3:
                System.out.printf("Amount payable: %.2f", 1.50 * quantity);
                break;
            case 4:
                System.out.printf("Amount payable: %.2f", 5.0 * quantity);
                break;
            default:
                System.out.println("Invalid Option!!! Try again!!!");

        }
    }
}
