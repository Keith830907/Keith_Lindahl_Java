import java.util.Random;
import java.util.Scanner;

public class Activity43 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int i = 1 + random.nextInt(10);
        System.out.print("I'm thinking of a number from 1 to 10.");
        System.out.println();
        System.out.print("Your guess: ");
        int guess = scan.nextInt();
        System.out.println();
        if(guess==i){
            System.out.print("That's right!  My secret number was "+ i + "!");
        }else{
            System.out.println("Sorry, but I was really thinking of "+ i + ".");
        }
    }
}

//    Modify your incredibly stupid number-guessing game to actually pick a random number from 1 to 10 and have the user try to
//    guess that. Tell them if they get it right or wrong, and if they get it wrong, show them what the random number was.
//
//        They will still only get one try.
//
//        I'm thinking of a number from 1 to 10.
//        Your guess: 3
//
//        Sorry, but I was really thinking of 4.
//
//
//        I'm thinking of a number from 1 to 10.
//        Your guess: 4
//
//        Sorry, but I was really thinking of 7.
//
//
//        I'm thinking of a number from 1 to 10.
//        Your guess: 2
//
//        That's right!  My secret number was 2!