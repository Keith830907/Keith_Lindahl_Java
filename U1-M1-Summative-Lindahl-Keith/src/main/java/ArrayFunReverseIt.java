import java.util.Arrays;

public class ArrayFunReverseIt {

        public static void reverse(int a[], int n)
        {
            int[] b = new int[n];
            int j = n;
            for (int i = 0; i < n; i++) {
                b[j - 1] = a[i];
                j = j - 1;
            }

            System.out.println("Reversed array is: ");
            for (int k = 0; k < n; k++) {
                System.out.print( b[k] + " ");
            }
        }

        public static void main(String[] args)
        {
            int [] OriginalArray = {1, 2, 3, 4, 5};
            reverse(OriginalArray, OriginalArray.length);


            System.out.println(" \nOriginal array is: \n" + Arrays.toString(OriginalArray));
        }
    }



//    This solution must be contained in a Java file called ArrayFunReverseIt. Your code must declare the following
//array [1, 2, 3, 4, 5], create another array of equal length, and fill that array with values from the original array
//        but in reverse order. Finally, your code must print the contents of both arrays to the screen.