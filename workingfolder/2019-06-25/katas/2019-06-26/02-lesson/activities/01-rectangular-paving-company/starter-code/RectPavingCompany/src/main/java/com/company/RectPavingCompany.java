package com.company;

import java.util.Scanner;

public class RectPavingCompany {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please enter a number for width in feet: ");
        int width = scan.nextInt();
        System.out.println("Please enter a number for length in feet: ");
        int length = scan.nextInt();
        int area = length * width;
        System.out.println("The area is: " + area);
        int perimeter = (width + length) * 2;
        System.out.println("The perimeter is: " + perimeter);
        double cement = area * 12.50;
        System.out.format("The cost of the cement is: " + "%.2f", cement);
        double footers = perimeter * 8.25;
        System.out.format("The cost of the footers is: " + "%.2f", footers);



        System.out.println("The perimeter is: " + perimeter);
        System.out.println("Please enter an amount for concrete cost per sq. ft.: ");
        double Cement = scan.nextDouble();
        System.out.println("Please enter an amount for footers cost per sq. ft.: ");
        double Footers = scan.nextDouble();
        double costCement = length * width * Cement;
        System.out.format("The cost of the cement is: " + "%.2f", costCement);
        double costFooters = length * width * Footers;
        System.out.format("The cost of the footers is: " + "%.2f", costFooters);

    }
}
//## Requirements
//        The purpose of the program is to calculate the total cost to pave a driveway.  Here are the requirements:
//
//        1. It must prompt the user for the width of the driveway as an integer (in feet).
//        1. It must prompt the user for the length of the driveway as an integer (in feet).
//        1. It must calculate and display the area of the driveway.
//        1. It must calculate and display the perimeter of the driveway.
//        1. Based on the area and perimeter, it must calculate the total cost of the driveway:
//        - The cement for the driveway cost $12.50/square foot.
//        - The framing/footers for the driveway cost $8.25/linear foot.
//        - The program must calculate and display the subtotal cost of the cement.
//        - The program must calculate and display the subtotal cost of the framing/footers.
//
//        ### Version 2
//        Modify the program so that it does the following:
//
//        1. Prompts the user for the cost of cement
//        1. Prompts the user for the cost of the framing/footers
//        1. Calculates and displays the subtotal cost of the cement and framing/footers as in previous version.