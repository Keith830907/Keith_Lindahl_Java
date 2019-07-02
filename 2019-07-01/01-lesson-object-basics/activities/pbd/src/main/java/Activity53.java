import java.util.Random;
import java.util.Scanner;

public class Activity53 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int lowNum = 1;
        int highNum = 10;
        int actualNum = random.nextInt(highNum-lowNum) + lowNum;
        System.out.println("I have chosen a number between 1 and 10.  Try to guess it.");
        int numTries = 1;
        System.out.print("Your guess: ");
        int guess = scan.nextInt();
        while(guess != actualNum){
            if(guess != actualNum){
                System.out.println("That is incorrect. Guess again.");
                System.out.print("Your guess: ");
                guess = scan.nextInt();
                numTries++;
            }
        }
        System.out.println("That's right!  You're a good guesser.");
        System.out.println("It took you " + numTries + " tries.");
    }
}

//    Modify your previous number-guessing game so that they can guess until they get it right AND count the number of tries
//    it takes them to guess it.
//
//        I have chosen a number between 1 and 10.  Try to guess it.
//        Your guess: 5
//        That is incorrect.  Guess again.
//        Your guess: 4
//        That is incorrect.  Guess again.
//        Your guess: 8
//        That is incorrect.  Guess again.
//        Your guess: 6
//        That's right!  You're a good guesser.
//        It only took you 4 tries.