import java.util.Random;

public class Activity58 {
    public static void main(String[] args) {

        Random random = new Random();
        System.out.println("HERE COMES THE DICE!");
        System.out.println();
        int roll1, roll2;
        do {
            roll1 = 1 + (int)(Math.random() * 6);
            roll2 = 1 + (int)(Math.random() * 6);
            System.out.println("Roll #1: " + roll1);
            System.out.println("Roll #2: " + roll2);
            int total = roll1 + roll2;
            System.out.print("The total is " + total + "!");
            System.out.println();
            System.out.println();
        } while (roll1 != roll2);
    }
}



//    Redo the Dice Doubles assignment (the dice program with a loop) so that it uses a do-while loop instead of a while loop.
//    Otherwise it should behave exactly the same.
//
//        If you do this correctly, there should be less code in this version.
//
//        HERE COME THE DICE!
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
