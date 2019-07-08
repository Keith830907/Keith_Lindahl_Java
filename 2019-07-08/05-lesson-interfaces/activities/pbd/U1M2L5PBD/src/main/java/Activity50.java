import java.util.Random;

public class Activity50 {

    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("ROLL THE DICE!");
        System.out.println();
        int roll1 = 1 + (int) (Math.random() * 6);
        int roll2 = 1 + (int) (Math.random() * 6);
        while (roll1 != roll2) {

            System.out.println("Roll #1: " + roll1);
            System.out.println("Roll #2: " + roll2);
            int total = roll1 + roll2;
            System.out.println("The total is " + total);
            System.out.println();
            roll1 = 1 + (int) (Math.random() * 6);
            roll2 = 1 + (int) (Math.random() * 6);
        }



        System.out.println("Roll #1: " + roll1);
        System.out.println("Roll #2: " + roll2);
        int total = roll1 + roll2;
        System.out.println("The total is " + total);
    }


}


//    Modify your dice game from last time so that it keeps rolling until they get doubles (the same number on both dice).
//
//        Notice that since there's no user input, this will happen very quickly (all the rolls will happen one right after
//        the other).
//
//        HERE COMES THE DICE!
//
//        Roll #1: 3
//        Roll #2: 5
//        The total is 8!
//
//        Roll #1: 6
//        Roll #2: 1
//        The total is 7!
//
//        Roll #1: 2
//        Roll #2: 5
//        The total is 7!
//
//        Roll #1: 1
//        Roll #2: 1
//        The total is 2!