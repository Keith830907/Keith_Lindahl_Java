package com.company;

import java.util.Scanner;

public class SubtractTwo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please enter a number: ");
        int num1 = scan.nextInt();
        System.out.println("Please enter a number: ");
        int num2 = scan.nextInt();
        int answer = (num1 - num2);
        System.out.println("The answer is:" + answer);
    }
    }

