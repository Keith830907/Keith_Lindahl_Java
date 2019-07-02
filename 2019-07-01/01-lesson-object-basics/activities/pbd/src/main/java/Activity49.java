import java.util.Random;
import java.util.Scanner;

public class Activity49 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int i = 1 + random.nextInt(10);
        System.out.println("I'm thinking of a number from 1 to 10.");
        int guess = 0;
        while(guess != i){
            System.out.print("Your guess: ");
            guess = scan.nextInt();
            if(guess == i){
                System.out.print("That's right! You're a good guesser.");
            }else{
                System.out.println("That is incorrect. Guess again.");
            }
        }
    }
}

//    Modify your previous number-guessing game so that they can guess until they get it right. That means it will keep looping as long
//    as the guess is different from the secret number. Use a while loop.
//
//        I have chosen a number between 1 and 10. Try to guess it.
//        Your guess: 5
//        That is incorrect. Guess again.
//        Your guess: 4
//        That is incorrect. Guess again.
//        Your guess: 8
//        That is incorrect. Guess again.
//        Your guess: 6
//        That's right! You're a good guesser.