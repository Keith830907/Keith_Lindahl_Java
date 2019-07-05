import java.util.Arrays;
import java.util.Scanner;

public class ArrayFunUserArray {



        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int[] nums = new int[5];
            for (int i = 0; i < nums.length; i++) {
                System.out.println("Please enter a number:");
                nums[i] = scan.nextInt();
            }
            System.out.println("Your numbers are: " + Arrays.toString(nums));
        }
    }



//    This solution must be contained in a Java file called ArrayFunUserArray. Your code must read 5 ints from the user,
//        put them in an array, and print the array elements to the screen.