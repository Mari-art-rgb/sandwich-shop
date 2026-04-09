package com.pluralsight;

import java.util.Scanner;

public class sandwichshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean largersandwich = true;
        boolean underageDiscount = false;
        boolean seniorDiscount = true;

        System.out.println("Do you want a regular or large size sandwich: ");
        scanner.nextLine();
        String regsandwich = scanner.next();
        String largesandwich = scanner.next();
        scanner.nextLine();


        System.out.println("How old are you?");
        int age = scanner.nextInt();
        scanner.nextLine();


    }
}
