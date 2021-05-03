package com.company;

import entities.CorporatePerson;
import entities.Person;
import entities.PrivatePerson;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Person> list = new ArrayList<>();

        System.out.print("Insert the number of people: ");
        int numberPeople = sc.nextInt();

        for (int i = 0; i < numberPeople; i++) {
            System.out.println("Insert the " + i + "# person data:");
            System.out.println("Corporate or Private (c/p)?");
            char op = sc.next().charAt(0);
            sc.nextLine();
            System.out.println("Insert a name: ");
            String name = sc.nextLine();
            System.out.println("Insert the Annual Income: ");
            double annualIncome = sc.nextDouble();

            sc.nextLine();

            if (op == 'c'){
                System.out.println("Insert the employee number: ");
                int employeeNumber = sc.nextInt();
                list.add(new CorporatePerson(name,annualIncome,employeeNumber));
            }
            else{
                System.out.println("Insert the health bills: ");
                double health = sc.nextDouble();
                list.add(new PrivatePerson(name, annualIncome, health));
            }
            System.out.println("##### TAXES ####");

        }

        for (Person person: list) {
            System.out.println(String.format("%.2f", person.taxes()));
        }

        sc.close();
    }
}
