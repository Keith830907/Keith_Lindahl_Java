import java.util.Random;

public class Activity45 {

    public static void main(String[] args){
        System.out.println("Here comes the Dice!");
        System.out.println();
        Random random = new Random();
        int i = 1 + random.nextInt(6);

        int roll = 1+random.nextInt(6);
        System.out.print("Roll 1: "+roll);
        System.out.println();

        int roll2 = 1+random.nextInt(6);
        System.out.print("Roll 2: "+roll2);
        int total = roll+roll2;
        System.out.println();
        System.out.print("The roll came to: "+total+"!!!!!");
    }
}

//    Write a program that simulates a dice roll by picking a random number from 1-6 and then picking a second random number from 1-6.
//    Add the two values together, and display the total.
//
//        HERE COMES THE DICE!
//
//        Roll #1: 3
//        Roll #2: 5
//        The total is 8!
//
//
//        HERE COMES THE DICE!
//
//        Roll #1: 4
//        Roll #2: 2
//        The total is 6!