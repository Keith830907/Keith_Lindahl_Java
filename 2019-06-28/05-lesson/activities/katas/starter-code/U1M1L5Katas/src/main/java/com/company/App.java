package com.company;

public class App {

    public static int Subtract(int a, int b) {
        int sum = a - b;
        return sum;
    }

    public static int subtractOrZero(int a, int b) {
        int answer = a - b;

        if (a - b > 0)
            return answer;
        else
            return 0;
    }

    public static int max(int a, int b, int c){
        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;


        return max;
    }

    public static int min(int a, int b, int c){
        int min = a;
        if (b < min)
            min = b;
        if (c < min)
            min = c;


        return min;
    }

    public static boolean isLarger(int first, int second){

        boolean isLarge;
        if (first > second)
            return true;
        else
            return false;
    }


        public static void main(String[] args) {
        int sum = Subtract(5, 3);
        System.out.println(sum);

        int answer = subtractOrZero(4,5);
            System.out.println(answer);

        int max = max(3,5,1);
            System.out.println(max);

        int min = min(2,6,8);
            System.out.println(min);

        boolean isLarge =isLarger(6,4);
            System.out.println(isLarge);
    }
}
