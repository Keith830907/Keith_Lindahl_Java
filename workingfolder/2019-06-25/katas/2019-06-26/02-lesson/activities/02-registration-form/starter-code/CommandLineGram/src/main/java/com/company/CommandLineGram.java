package com.company;

import java.util.Scanner;

public class CommandLineGram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please enter you first name: ");
        String fName = scan.nextLine();

        System.out.println("Please enter you Last name: ");
        String lName = scan.nextLine();

        System.out.println("Please enter your email address: ");
        String emailAddress = scan.nextLine();

        System.out.println("Please enter your Twitter handle: ");
        String twitterHandle = scan.nextLine();

        System.out.println("Please enter your age: ");
        String age = scan.nextLine();

        System.out.println("Please enter your country: ");
        String country = scan.nextLine();

        System.out.println("Please enter your profession: ");
        String profession = scan.nextLine();

        System.out.println("Please enter your favorite operating system: ");
        String os = scan.nextLine();

        System.out.println("Please enter your favorite programming language: ");
        String pLanguage = scan.nextLine();

        System.out.println("Please enter your favorite computer scientist: ");
        String cs = scan.nextLine();

        System.out.println("Please enter your favorite keyboard shortcut: ");
        String keyboard = scan.nextLine();

        System.out.println("Have you ever built your own computer?: ");
        String build = scan.nextLine();

        System.out.println("If you could be any superhero, who would it be?: ");
        String superhero = scan.nextLine();

        System.out.println("Hello" + fName + lName);
        System.out.println("Your email is "+ emailAddress);
        System.out.println("Your Twitter handle is " + twitterHandle);
        System.out.println("You are " + age);
        System.out.println("Your country is " + country);
        System.out.println("Your profession is " + profession);
        System.out.println("Your favorite operating system is " + os);
        System.out.println("Your favorite programming language is " + pLanguage);
        System.out.println("Your favorite computer scientist is " + cs);
        System.out.println("Your favorite keyboard shortcut is " + keyboard);
        System.out.println("Have you ever built your own computer: " + build);
        System.out.println("Your favorite superhero is: " + superhero);

    }
}

//## Requirements
//        The purpose of this program is to prompt the user for registration information for a new social media service called CommandLineGram.
//
//        The program must prompt the user for the following information and then display it, nicely formatted, back to the user after all the information has been collected:
//
//        1. First name
//        1. Last name
//        1. Email
//        1. Twitter handle
//        1. Age
//        1. Country
//        1. Profession
//        1. Favorite operating system
//        1. Favorite programming language
//        1. Favorite computer scientist
//        1. Favorite keyboard shortcut
//        1. Have you ever built your own computer?
//        1. If you could be any superhero, who would it be?