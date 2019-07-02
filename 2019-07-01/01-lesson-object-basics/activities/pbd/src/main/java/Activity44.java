import java.util.Random;

public class Activity44 {

    public static void main(String[] args){
        Random random = new Random();
        int i = 1 + random.nextInt(6);
        int num1 = 1 + random.nextInt(54);
        int num2 = 1 + random.nextInt(54);
        int num3 = 1 + random.nextInt(54);
        int num4 = 1 + random.nextInt(54);
        int num5 = 1 + random.nextInt(54);
        int num6 = 1 + random.nextInt(54);
        System.out.print("Fortune cookie says: ");
        if(i==1){
            System.out.println("You will be fortunate enough to succeed today.");
            System.out.print(num1 + " - " + num2 + " - " + num3 + " - " + num4 + " - " + num5 + " - " + num6);
        }else if(i==2){
            System.out.println("You will get through the day.");
            System.out.print(num1 + " - " + num2 + " - " + num3 + " - " + num4 + " - " + num5 + " - " + num6);
        }else if(i==3){
            System.out.println("You will be alright somehow.");
            System.out.print(num1 + " - " + num2 + " - " + num3 + " - " + num4 + " - " + num5 + " - " + num6);
        }else if(i==4){
            System.out.println("You will make it through this class.");
            System.out.print(num1 + " - " + num2 + " - " + num3 + " - " + num4 + " - " + num5 + " - " + num6);
        }else if(i==5){
            System.out.println("You will be rich someday.");
            System.out.print(num1 + " - " + num2 + " - " + num3 + " - " + num4 + " - " + num5 + " - " + num6);
        }else if(i==6){
            System.out.println("You will be in trouble soon.");
            System.out.print(num1 + " - " + num2 + " - " + num3 + " - " + num4 + " - " + num5 + " - " + num6);
        }
    }
}

//    Write a program that simulates a random fortune from a fortune cookie. You must have at least six fortunes.
//
//        For bonus points, also add randomly-chosen lotto numbers to the fortune. In Texas, the lotto chooses 6 numbers, each from 1-54.
//
//        Fortune cookie says: "You will find happiness with a new love."
//        Bonus output:
//
//        Fortune cookie says: "Stick with your wife."
//        13 - 44 - 19 - 37 - 29 - 17