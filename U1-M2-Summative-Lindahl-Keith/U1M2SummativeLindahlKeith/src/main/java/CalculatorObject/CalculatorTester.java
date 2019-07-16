package CalculatorObject;

import java.util.Scanner;

public class CalculatorTester {

    public static void main(String[] args) {


        CalculatorObject ca = new CalculatorObject();
        System.out.print("1 + 1 = ");
        System.out.println(ca.add(1,1));
        System.out.print("23 - 52 = ");
        System.out.println(ca.subtract(23,52));
        System.out.print("34 * 2 = ");
        System.out.println(ca.multiply(34,2));
        System.out.print("12 / 3 = ");
        System.out.println(ca.divide(12,3));
        System.out.print("12 / 7 = ");
        System.out.println(ca.divide(12,7));
        System.out.print("3.4 + 2.3 = ");
        System.out.println(ca.add(3.4,2.3));
        System.out.print("6.7 * 4.4 = ");
        System.out.println(ca.multiply(6.7,4.4));
        System.out.print("5.5 - 0.5 = ");
        System.out.println(ca.subtract(5.5,0.5));
        System.out.print("10.8 / 2.2 = ");
        System.out.println(ca.divide(10.8,2.2));







    }
}