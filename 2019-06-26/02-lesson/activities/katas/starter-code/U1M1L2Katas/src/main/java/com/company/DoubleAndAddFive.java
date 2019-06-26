package com.company;

import java.util.Scanner;

public class DoubleAndAddFive {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please enter a number: ");
        int  num1 = scan.nextInt();
        int doubleAndAddFive = (num1 * 2)+ 5;
        System.out.println(doubleAndAddFive);
    }
}
