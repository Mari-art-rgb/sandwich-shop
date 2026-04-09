package com.pluralsight;

import java.util.Scanner;

public class sandwichshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double regularsando = 5.45;
        double largesando = 8.95;
        double total = 0;

        System.out.println("For a regular size sandwich enter 1, for a larger sandwich enter 2: ");
        int size = scanner.nextInt();
        scanner.nextLine();


        System.out.println("How old are you, your age will determine your discount: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        if (size == 1) {
            total = regularsando;
        } else if (size == 2) {
            total = largesando;
        }

        if (age <= 17) {
            total *=0.10;
        }
        else if (age >=65) {
            total *=  0.20;
        }

        System.out.println("Your sandwich will be " + total);


    }
}
