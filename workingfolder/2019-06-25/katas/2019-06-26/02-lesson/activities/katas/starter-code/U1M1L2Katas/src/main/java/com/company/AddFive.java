package com.company;

import java.util.Scanner;

public class AddFive {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please enter a number: ");
        int num1 = scan.nextInt();
        System.out.println("Please enter a number: ");
        int num2 = scan.nextInt();
        System.out.println("Please enter a number: ");
        int num3 = scan.nextInt();
        System.out.println("Please enter a number: ");
        int num4 = scan.nextInt();
        System.out.println("Please enter a number: ");
        int num5 = scan.nextInt();
        int sum = num1+num2+num3+num4+num5;
        System.out.println("The sum is: " + sum);
    }
}
