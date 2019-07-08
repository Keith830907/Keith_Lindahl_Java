import java.util.Scanner;

public class Activity60 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("SQUARE ROOT!");
        System.out.print("Enter a number: ");
        int n = scan.nextInt();
        while(n <= 0){
            System.out.println("You can\'t take the square root of a negative number, silly.");
            System.out.print("Try again: ");
            n = scan.nextInt();
        }
        double rootednum = Math.sqrt(n);
        System.out.println("The square root of "+ n +" is " + rootednum);
}
}


//    Write a program to take the square root of a number typed in by the user. Your program should use a loop to ensure that
//    the number they typed in is positive. If the number is negative, you should print out some sort of warning and make them
//    type it in again.
//
//        Note that it is possible to do this program with either a while loop or a do-while loop. (Though personally, I think
//        this one is easier with a while loop.)
//
//        You can get the square root of a number n with Math.sqrt(n). Make sure you don't do this until the loop is done and
//        you know for sure you've got a positive number.
//
//        SQUARE ROOT!
//        Enter a number: 9
//        The square root of 9 is 3.0.
//
//
//        SQUARE ROOT!
//        Enter a number: 2
//        The square root of 2 is 1.4142135623730951.
//
//
//        SQUARE ROOT!
//        Enter a number: -9
//        You can't take the square root of a negative number, silly.
//        Try again: -10
//        You can't take the square root of a negative number, silly.
//        Try again: 10
//        The square root of 10 is 3.1622776601683795.