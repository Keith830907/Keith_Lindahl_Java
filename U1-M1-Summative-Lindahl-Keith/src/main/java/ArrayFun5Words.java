import java.util.Arrays;
import java.util.Scanner;

public class ArrayFun5Words {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] words = new String[5];
        for (int i = 0; i < words.length; i++) {
            System.out.println("Please enter Word:");
            words[i] = scan.nextLine();
        }
        System.out.println("Your words are: " + Arrays.toString(words));
        }
    }


//    This solution must be contained in a Java file called ArrayFun5Words. Your code must get 5 words from the user,
//        put them in an array, and print the array elements to the screen.