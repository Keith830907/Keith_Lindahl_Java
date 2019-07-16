import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Excercise185 {

    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            int j = random.nextInt(100);
            j += 1;
            numbers.add(j);
        }
        System.out.println("Array List: " + numbers);
        Object max = Collections.max(numbers);
        System.out.println("The largest value is " + max);
    }
}


//    Getting the Largest Value in an ArrayList
//        Write a program that creates an ArrayList which can hold Integers. Fill the ArrayList with random numbers from 1 to 100. Display the values in the ArrayList on the screen. Then use a linear search to find the largest value in the ArrayList, and display that value.
//
//        ArrayList: [45, 87, 39, 32, 93, 86, 12, 44, 75, 50]
//
//        The largest value is 93
