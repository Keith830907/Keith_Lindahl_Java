package com.company;


import java.util.Scanner;

public class AgeAgain {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What age are you: ");
        int age = scan.nextInt();

        if(age < 14) {
            System.out.println("What grade are you in: ");
            String grade = scan.next();
            System.out.println("Wow! " + grade + " grade - that sounds exciting!");

        }else if(age >= 14 && age <= 18){
            System.out.println("Do you plan on going to college: ");
            String answer = scan.next();
                if(answer == "yes"){
                  System.out.println("What college do you plan on going to: ");
                  String college = scan.next();
                    System.out.println(college + " is a great school!");
                }else if(answer == "no"){
                    System.out.println("What do you plan to do after high school");
                     String afterSchool = scan.next();
                     System.out.println("Wow" + afterSchool + " sounds like a plan!");
                }
        }
        else {
            System.out.println("What is your job?");
            String job = scan.next();
            System.out.println( job + " sounds like a great job!");
        }
    }
    }



//    1. `AgeAgain`: Write a program that asks for the user's age and then asks a follow-up question based on the value:
//            * Less than 14: Ask what grade they're in and then prints "Wow! [user answer] grade - that sounds exciting!"
//            * Between 14 and 18 (inclusive): Ask if they're planning to go to college.  If the answer is "yes" (all lowercase),
//            ask what college and then print "[user answer] is a great school!".  If the answer is "no" (all lowercase),
//            ask what they want to do after high school, then print "Wow, <user answer> sounds like a plan!"
//            * Greater than 18: Ask what their job is, then print "[user answer] sounds like a great job!"