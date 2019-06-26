package com.company;

import java.util.Scanner;

public class MultiplyThree {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please enter a number: ");
        int num1 = scan.nextInt();
        System.out.println("Please enter a number: ");
        int num2 = scan.nextInt();
        System.out.println("Please enter a number: ");
        int num3 = scan.nextInt();
        int sum = num1 * num2 * num3;
        System.out.println(sum);
    }
}