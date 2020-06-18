package com.company;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//ENTRADA
        Locale.setDefault(new Locale("US"));
        Scanner sc = new Scanner(System.in);
        final double  pi = 3.14159;

        System.out.println("Digite o valor do Raio: ");
        double raio = sc.nextDouble();

        //PROCESSAMENTO E SAIDA
        System.out.printf("Área do circulo: %.4f", pi * Math.pow(raio, 2));

    }
}
