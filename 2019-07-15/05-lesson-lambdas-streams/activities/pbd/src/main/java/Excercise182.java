import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Excercise182 {
    private static ArrayList<Integer> getRandomNumbers (int sizearray)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random randomGenerator = new Random();
        for (int index = 0; index < sizearray; index++) {
            list.add(randomGenerator.nextInt(50));
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = getRandomNumbers(10);
        Random random = new Random();
        System.out.print("ArrayList: ");
        for (int j = 0; j < 10; j++) {

            System.out.print(list.get(j) + " ");
        }
        System.out.println("\nValue to find: ");
        int decision = scan.nextInt();
        System.out.println();
        for (int i = 0; i < 10; i++) {
            if (i == decision) {
                System.out.println(decision + " is in the ArrayList.");
            }
        }

    }}



//    Finding a Value in an ArrayList
//    Create an ArrayList that can hold Integers, and fill each slot with a different random value from 1-50. Display those
//    values on the screen, and then prompt the user for an integer. Search through the ArrayList, and if the item is present,
//    say so. It is not necessary to display anything if the value was not found. If the item is in the ArrayList multiple times,
//    it's okay if the program prints the message more than once.
//
//        ArrayList: [45, 39, 32, 12, 44, 50, 26, 42, 16, 20]
//        Value to find: 42
//
//        42 is in the ArrayList.
//
//
//        ArrayList: [45, 39, 32, 12, 44, 50, 26, 42, 16, 20]
//        Value to find: 43
//
//
//
//        ArrayList: [24, 30, 31, 24, 32, 33, 34, 24, 35, 36]
//        Value to find: 24
//
//        24 is in the ArrayList.
//        24 is in the ArrayList.
//        24 is in the ArrayList.