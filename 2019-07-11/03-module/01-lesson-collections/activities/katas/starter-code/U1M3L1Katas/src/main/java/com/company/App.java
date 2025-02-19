package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

    public static int total (List<Integer> numbers) {

        int sum = 0;
        for(int num : numbers) {
            sum += num;
        }

        return sum;
    }

    public static int totalEven (List<Integer> numbers) {

        int sum = 0;
        for(int i = 0; i < numbers.size(); i += 2) {
            sum += numbers.get(i);
        }

        return sum;
    }

    public static List<String> swapFirstAndLast(List<String> strings) {

        String temp = strings.get(0);
        strings.set(0, strings.get(strings.size() - 1));
        strings.set(strings.size() - 1, temp);

        return strings;
    }

    public static List<Integer> reverse(List<Integer> numbers)
    {

        ArrayList<Integer> reversed = new ArrayList<Integer>();
        for (int i = numbers.size() - 1; i >= 0; i--) {

            // Append the elements in reverse order
            reversed.add(numbers.get(i));
        }

        return reversed;
    }

//    public static int[] lessThanFive(int[] numbers) {
//
//        int numLessThanFive = 0;
//
//        for(int num : numbers) {
//            if ( num < 5 ) {
//                numLessThanFive++;
//            }
//        }
//
//        if ( numLessThanFive == 0 ) {
//            return null;
//        }
//
//        int[] lessThan = new int[numLessThanFive];
//
//        for(int num : numbers) {
//            if ( num < 5 ) {
//
//                // subtracting numLessThanFive from length then decrementing numLessThanFive
//                // allows us to go from 0 to length - 1 in order without additional variables
//                lessThan[lessThan.length - numLessThanFive] = num;
//                numLessThanFive--;
//            }
//        }
//
//        return lessThan;
//    }


    public static List<Integer> lessThanFive(List<Integer> numbers) {

       Integer numLessThanFive = 0;

        for(Integer num : numbers) {
            if ( num < 5 ) {
                numLessThanFive++;
            }
        }

        if ( numLessThanFive == 0 ) {
            return null;
        }
        //List<Integer> reversed = new ArrayList<>(numbers.size());
        //int[] lessThan = new int[numLessThanFive];
        ArrayList<Integer> lessThan = new ArrayList<>(numLessThanFive);
        for(Integer num : numbers) {
            if ( num < 5 ) {

                // subtracting numLessThanFive from length then decrementing numLessThanFive
                // allows us to go from 0 to length - 1 in order without additional variables
                lessThan.set(lessThan.size() - numLessThanFive, num);
                numLessThanFive--;
            }
        }

        return lessThan;
    }

    //challenge
    public static int[][] splitAtFive(int[] numbers) {
        int numLessThanFive = 0;
        int numMoreThanFive = 0;

        for(int num : numbers) {
            if ( num < 5 ) {
                numLessThanFive++;
            } else {
                numMoreThanFive++;
            }
        }

        int[] lessThan = new int[numLessThanFive];
        int[] moreThan = new int[numMoreThanFive];


        for(int num : numbers) {

            // subtracting numLessThanFive from length then decrementing numLessThanFive
            // allows us to go from 0 to length - 1 in order without additional variables
            // same with numMoreThanFive
            if ( num < 5 ) {
                lessThan[lessThan.length - numLessThanFive] = num;
                numLessThanFive--;
            } else {
                moreThan[moreThan.length - numMoreThanFive] = num;
                numMoreThanFive--;
            }
        }

        return new int[][] { lessThan, moreThan };
    }

    // Challenge
    public static String[][] evensAndOdds(String[] strings) {

        //leveraging integer division
        String[] odds = new String[ strings.length/2 ];

        // Set evens to null for reassignment below
        String[] evens = null;

        // again leveraging integer division
        // if it's already of even length, we're good
        // but if it's of odd length, there's one more even index than odd
        if (strings.length % 2 == 0) {
            evens = new String[ strings.length/2];
        } else {
            evens = new String[ strings.length/2 + 1];
        }

        for(int i = 0; i < strings.length; i++) {
            int currIndex = i/2;
            if( i % 2 == 0 ) {
                evens[currIndex] = strings[i];
            } else {
                odds[currIndex] = strings[i];
            }
        }

        return new String[][] { evens, odds };
    }
}
