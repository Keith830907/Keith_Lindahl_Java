import java.util.Random;
import java.util.Scanner;

public class Activity47 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int randomnum = random.nextInt(3) + 1;

        System.out.println("You slide up to Fast Eddie's card table and plop down your cash.");
        System.out.println("He glances at you out of the corner of his eye and starts shuffling.");
        System.out.println("He lays down three cards.");
        System.out.println("Which one is the ace?");
        System.out.println();
        System.out.println(" ##	 ##	 ##");
        System.out.println(" ##	 ##	 ##");
        System.out.println(" 1	 2    3");
        System.out.println();
        int decision = scan.nextInt();

        if(decision!= randomnum){
            System.out.println("Ha! Fast Eddie wins again! The ace was card number " + randomnum);
            System.out.println();
            if(randomnum == 1){
                System.out.println("AA	##	##");
                System.out.println("AA	##	##");
                System.out.println("1	2	 3");
            }else if(randomnum == 2){
                System.out.println("##	AA	##");
                System.out.println("##	AA	##");
                System.out.println("1	2	 3");
            }else if(randomnum == 3){
                System.out.println("##	##	AA");
                System.out.println("##	##	AA");
                System.out.println("1	2	 3");
            }

        }else{
            System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
            System.out.println();
            if(randomnum == 1){
                System.out.println("AA	##	##");
                System.out.println("AA	##	##");
                System.out.println("1	2	 3");
            }else if(randomnum == 2){
                System.out.println("##	AA	##");
                System.out.println("##	AA	##");
                System.out.println("1	2	 3");
            }else if(randomnum == 3){
                System.out.println("##	##	AA");
                System.out.println("##	##	AA");
                System.out.println("1	2	 3");
            }

        }

    }
}



//    This is the original "ball and cups" game where you try to find out which cup has the ball under it. You may play with
//    three cups and a ball, three cards (two jacks and an ace), or three doors and a car. Basically, randomly select a cup
//    to hide the "ball". Let the player guess which cup hides the ball. The player wins if they guess correctly.
//
//        You slide up to Fast Eddie's card table and plop down your cash.
//        He glances at you out of the corner of his eye and starts shuffling.
//        He lays down three cards.
//
//        Which one is the ace?
//
//        ##  ##  ##
//        ##  ##  ##
//        1   2   3
//
//        > 2
//
//        Ha! Fast Eddie wins again! The ace was card number 3.
//
//        ##  ##  AA
//        ##  ##  AA
//        1   2   3
//
//        (Note that this is basically just a number-guessing game with fancy graphics.)
//
//        You slide up to Fast Eddie's card table and plop down your cash.
//        He glances at you out of the corner of his eye and starts shuffling.
//        He lays down three cards.
//
//        Which one is the ace?
//
//        ##  ##  ##
//        ##  ##  ##
//        1   2   3
//
//        > 2
//
//        You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.
//
//        ##  AA  ##
//        ##  AA  ##
//        1   2   3
