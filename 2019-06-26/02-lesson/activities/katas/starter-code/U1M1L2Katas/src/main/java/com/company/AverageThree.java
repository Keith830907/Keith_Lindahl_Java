package com.company;

import java.util.Scanner;

public class AverageThree {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please enter a number: ");
        double num1 = scan.nextDouble();
        System.out.println("Please enter a number: ");
        double num2 = scan.nextDouble();
        System.out.println("Please enter a number: ");
        double num3 = scan.nextDouble();
        double sum = (num1 + num2 + num3) / 3;
        System.out.format("The average is: " + "%.2f", sum);
    }
}
