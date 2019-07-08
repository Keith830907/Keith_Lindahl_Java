import java.util.Scanner;

public class Activity61 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three integers: ");
        int side1 = scan.nextInt();
        int side2 = scan.nextInt();
        while (side2 < side1) {
            System.out.println(side2 + " is smaller than " + side1 + ".Try again");
            System.out.print("Side 2: ");
            side2 = scan.nextInt();
        }
        int side3 = scan.nextInt();
        while (side3 < side2) {
            System.out.println(side3 + " is smaller than " + side2 + ".Try again");
            System.out.print("Side 2: ");
            side3 = scan.nextInt();
        }
        System.out.println("Your three sides are " + side1 + " " + side2 + " " + side3);
        if ((side1 + side2) > side3 && (side1 + side3) > side2 && (side2 + side3) > side1) {
            System.out.println("These sides *do* make a right triangle.  Yippy-skippy!");
        } else {
            System.out.println("NO!  These sides do not make a right triangle!");

        }
    }
}


//    Right Triangle Checker
//        Write a program to allow the user to enter three integers. You must use do-while or while loops to enforce that
//        these integers are in ascending order, though duplicate numbers are allowed.
//
//        Tell the user whether or not these integers would represent the sides of a right triangle.
//
//        Enter three integers:
//        Side 1: 4
//        Side 2: 3
//        3 is smaller than 4.  Try again.
//        Side 2: -9
//        -9 is smaller than 4.  Try again.
//        Side 2: 5
//        Side 3: 1
//        1 is smaller than 5.  Try again.
//        Side 3: 5
//
//        Your three sides are 4 5 5
//        NO!  These sides do not make a right triangle!
//
//
//        Enter three integers:
//        Side 1: 6
//        Side 2: 8
//        Side 3: 10
//
//        Your three sides are 6 8 10
//        These sides *do* make a right triangle.  Yippy-skippy!
