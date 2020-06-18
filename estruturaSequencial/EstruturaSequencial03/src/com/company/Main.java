package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// ENTRADA
        Locale.setDefault(new Locale("US"));
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int a = sc.nextInt();
        System.out.print("Digite o valor de B: ");
        int b = sc.nextInt();
        System.out.print("Digite o valor de C: ");
        int c = sc.nextInt();
        System.out.print("Digite o valor de D: ");
        int d = sc.nextInt();

        //PROCESSAMENTO E SAIDA
        System.out.println("Valor da diferença: " + (a * b - c * d));
    }
}
