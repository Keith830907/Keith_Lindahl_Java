import java.util.Random;

public class BabyBlackJack {

    public static void main(String[] args) {
        Random random = new Random();
        int myFirstCard = random.nextInt(10) + 1;
        int mySecondCard = random.nextInt(10) + 1;
        int mySum = myFirstCard + mySecondCard;
        int dealerFirstCard = random.nextInt(10) + 1;
        int dealerSecondCard = random.nextInt(10) + 1;
        int dealerSum = dealerFirstCard + dealerSecondCard;
        System.out.println("Baby Blackjack!");
        System.out.println();
        System.out.println("You drew " + myFirstCard + " and " + mySecondCard +".");
        System.out.println("Your total is " + mySum + ".");
        System.out.println();
        System.out.println("The dealer has " + dealerFirstCard + " and " + dealerSecondCard + ".");
        System.out.println("Dealer's total is " + dealerSum + ".");
        System.out.println();
        if (mySum > dealerSum) {
            System.out.println("YOU WIN!");
        } else if (mySum < dealerSum) {
            System.out.println("YOU LOSE!");
        } else {
            System.out.println("IT'S A TIE I GUESS IT HAPPENS");
        }

    }
}


//    Baby Blackjack
//    Write a program that allows a human user to play a single hand of "blackjack" against a dealer.
//
//        Pick two values from 1-10 for the player. These are the player's "cards".
//        Pick two more values from 1-10 for the dealer.
//        Whoever has the highest total is the winner.
//        There is no betting, no busting, and no hitting. Save that for real blackjack.
//        Baby Blackjack!
//
//        You drew 6 and 5.
//        Your total is 11.
//
//        The dealer has 7 and 3.
//        Dealer's total is 10.
//
//        YOU WIN!