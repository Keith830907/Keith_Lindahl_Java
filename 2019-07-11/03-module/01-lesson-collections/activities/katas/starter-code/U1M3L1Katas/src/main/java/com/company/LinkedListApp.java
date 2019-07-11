package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListApp {

    public static int total (LinkedList<Integer> numbers) {

        int sum = 0;
        for(int num : numbers) {
            sum += num;
        }

        return sum;
    }

    public static int totalEven (LinkedList<Integer> numbers) {

        int sum = 0;
        for(int i = 0; i < numbers.size(); i += 2) {
            sum += numbers.get(i);
        }

        return sum;
    }

    public static LinkedList<String> swapFirstAndLast(LinkedList<String> strings) {

        String temp = strings.get(0);
        strings.set(0, strings.get(strings.size() - 1));
        strings.set(strings.size() - 1, temp);

        return strings;
    }

    public static LinkedList<Integer> reverse(LinkedList<Integer> numbers)
    {

       LinkedList<Integer> reversed = new LinkedList<Integer>();
        for (int i = numbers.size() - 1; i >= 0; i--) {

            // Append the elements in reverse order
            reversed.add(numbers.get(i));
        }

        return reversed;
    }
}

