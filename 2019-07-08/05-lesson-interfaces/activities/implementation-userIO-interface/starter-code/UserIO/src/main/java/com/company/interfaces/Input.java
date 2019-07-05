package com.company.interfaces;

import java.util.Scanner;

public class Input implements UserIO {

    Scanner scan = new Scanner(System.in);

    public int readInt(String prompt) {
        System.out.println("Please enter an Integer: ");
        int userInt = scan.nextInt();
        return userInt;
    }

    public long readLong(String prompt) {
        System.out.println("Please enter a long: ");
        long userLong = scan.nextLong();
        return userLong;
    }


    public double readDouble(String prompt) {
        System.out.println("Please enter a double: ");
        double userDouble = scan.nextDouble();
        return userDouble;
    }


    public float readFloat(String prompt) {
        System.out.println("Please enter a float: ");
        float userFloat = scan.nextFloat();
        return userFloat;
    }


    public String readString(String prompt) {
        System.out.println("Please enter a single word: ");
        String userString = scan.next();
        return userString;
    }
}
