/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author manoel.inacio
 */
public class EstruturaSequencial {
        
    
    public static void main(String[] args) {
        //DEFININDO O LOCAL
        Locale.setDefault(Locale.US);
        
        //INSTANCIANDO O SCANNER
        Scanner sc = new Scanner(System.in);
        
        final double PI = 3.14159;
        
        //ENTRADA
        System.out.print("Digite um valor para A: ");
        double a = sc.nextDouble();
        System.out.print("Digite um valor para B: ");
        double b = sc.nextDouble();
        System.out.print("Digite um valor para C: ");
        double c = sc.nextDouble();
     
        //PROCESSAMENTO
        System.out.println("");
        System.out.println("----------SAIDAS---------");
        System.out.printf("Area do Triangulo: %.2f\n", (a*c)/2 );
        System.out.printf("Area do circulo: %.2f\n", PI*Math.pow(c, 2));
        System.out.printf("Area do Trapezio: %.2f\n", ((a+b)*c)/2);
        System.out.printf("Area do quadrado: %.2f\n", Math.pow(b, 2));
        System.out.printf("Area do retangulo: %.2f\n", (a*b));
        
        
    }
    
}
