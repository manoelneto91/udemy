package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	    //ENTRADA
        System.out.print("Digite o valor de N1: ");
        int n1 = sc.nextInt();
        System.out.print("Digine o valor de N2: ");
        int n2 = sc.nextInt();

        //PROCESSAMENTO E SAIDA
        System.out.println("===========");
        System.out.printf("Soma: %d" , n1 + n2);

    }
}
