import java.util.Scanner;

public class ValidNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number between 1-10: ");
        int numInput = scan.nextInt();
        while ((numInput < 1) || (numInput > 10)) {
            System.out.println("You must enter a number between 1 and 10, please try again.");
             numInput = scan.nextInt();

        }
        System.out.println("You entered " + numInput);
    }
}


//    The program must do the following:
//
//
//        Prompt the user to enter a number between 1 and 10.
//        If the user enters a number less than 1 or greater than 10, display the following error message and prompt
//        the user for another entry: "You must enter a number between 1 and 10, please try again."
//        When the user enters a valid number, print the number to the screen and exit.