package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name");
        System.out.println("-------------------------");

        // Enter name(s) and trim whitespace
        System.out.println("First Name: ");
        String firstName = input.nextLine().trim();

        System.out.println("Middle Name: ");
        String middleName = input.nextLine().trim();

        System.out.println("Last Name: ");
        String lastName = input.nextLine().trim();

        System.out.println("Suffix: ");
        String suffix = input.nextLine().trim();

        // Combine all inputs
        String fullName = firstName;
        // ! is the logical NOT operator. It inverts a boolean value — true becomes false, and false becomes true
        // I learned this from Claude when it suggested ! as part of suffix.isEmpty()
        if (!middleName.isEmpty()) {
            fullName = fullName + " " + middleName;
        }
        fullName = fullName + " " + lastName;

        if (!suffix.isEmpty()) {
            fullName = fullName + ", " + suffix;
        }
        System.out.println("Full Name: " + fullName);

    }
}
