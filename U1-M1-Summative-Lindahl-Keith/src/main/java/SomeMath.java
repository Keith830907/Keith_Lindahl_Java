import java.util.Scanner;

import static java.lang.Math.max;

public class SomeMath {

    public static int total5(int num1, int num2, int num3, int num4, int num5){
        int sum = num1 + num2 + num3 + num4 + num5;
        return sum;
    }

    public static double average5(int a, int b, int c, int d, int e ){
        int sum = (a+b+c+d+e);
        double average = (double)sum/5;

        return average;
    }

    public static double largest5(double a, double b, double c, double d, double e){
        double largest = 0;
        if (a > b && a > c && a > d && a > e)
             largest = a;
        else if (b > a && b > c && b > d && b > e)
            largest = b;
        else if (c > a && c > b && c > d && c > e)
            largest = c;
        else if (d > a && d > b && d > c && d > e)
            largest = d;
        else if (e > a && e > b && e > c && e > d)
            largest = e;
        return largest;
    }

    public static void main(String[] args) {
        int sum = total5(1,2,3,4,5);
        System.out.println(sum);

        double average = average5(1,3,5,7,9);
        System.out.println(average);

    double largest =largest5(42.0,35.1,2.3,40.2,15.6);
        System.out.println(largest);
    }
}


//Create a method called total5.  This method must take 5 int parameters and return the total. You must call the method with the
//following parameters and print the returned total to the screen: 1, 2, 3, 4, 5.
//Create a method called average5. This method must take 5 int parameters and return the average of the numbers as a double.
//You must call the method with the following parameters and print the returned average to the screen: 1, 3, 5, 7, 9.
//Create a method called largest5. This method must take 5 double parameters and return the largest. You must call the
//method with the following parameters and print the returned value to the screen: 42.0, 35.1, 2.3, 40.2, 15.6.