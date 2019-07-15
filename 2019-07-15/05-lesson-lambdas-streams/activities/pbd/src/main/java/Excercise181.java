import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Excercise181 {

    public static void main(String[] args) {
        Random random = new Random();

        ArrayList<Integer> arrayone = new ArrayList<>(10);
        ArrayList<Integer> arraytwo = new ArrayList<>(10);

        System.out.print("ArrayList 1: ");
        for (int j = 0; j < 10; j++) {
            System.out.print(random.nextInt(50) + " ");

        }
        //arrayone.set(9, -7);


        System.out.println();
        System.out.print("ArrayList 2: ");
        for (int j = 0; j < 10; j++) {
            System.out.print(random.nextInt(50) + " ");
        }
        Collections.copy(arraytwo, arrayone);
    }
}

//    Copying ArrayLists
//    Write a program that creates an ArrayList of Integers. It should put ten random numbers from 1 to 100 in the ArrayList.
//    It should copy all the elements of that ArrayList into another ArrayList of the same size. Then display the contents of
//    both ArrayLists in any way you like.
//
//        Create an ArrayList of Integers
//        Fill the ArrayList with ten random numbers (1-100)
//        Copy each value from the ArrayList into another ArrayList of the same capacity
//        Change the last value in the first ArrayList to a -7
//        Display the contents of both ArrayLists
//        ArrayList 1: [45, 87, 39, 32, 93, 86, 12, 44, 75, -7]
//        ArrayList 2: [45, 87, 39, 32, 93, 86, 12, 44, 75, 50]