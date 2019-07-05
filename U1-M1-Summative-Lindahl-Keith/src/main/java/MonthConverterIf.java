import java.util.Scanner;

public class MonthConverterIf {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number that corresponds to the month you would like to choose: ");
        System.out.println(" 1 = January, 2 = February, 3 = March, 4 = April, 5 = May, 6 = June, 7 = July ");
        System.out.println(" 8 = August, 9 = September, 10 = October, 11 = November, 12 = December ");
        System.out.println("Please Choose: ");
        int month = scan.nextInt();
        if((month < 1) || (month > 12)) {
            System.out.println("You have entered an invalid number. You must enter a number between 1 and 12!!! ");
        }
            if (month == 1) {
                System.out.println("You chose January");
            } else if (month == 2) {
                System.out.println("You chose February");
            } else if (month == 3) {
                System.out.println("You chose March");
            } else if (month == 4) {
                System.out.println("You chose April");
            } else if (month == 5) {
                System.out.println("You chose May");
            } else if (month == 6) {
                System.out.println("You chose June");
            } else if (month == 7) {
                System.out.println("You chose July");
            } else if (month == 8) {
                System.out.println("You chose August");
            } else if (month == 9) {
                System.out.println("You chose September");
            } else if (month == 10) {
                System.out.println("You chose October");
            } else if (month == 11) {
                System.out.println("You chose November");
            } else if (month == 12) {
                System.out.println("You chose December");
            }
        System.out.println("Goodbye");
        }

    }



//    The program must do the following:
////
////
////        Prompt the user to enter a number between 1 and 12.
////        Print out the name of the month corresponding to the number typed in by the user.
////        Print out the following error message if the user enters a number less than 1 or greater
////        than 12: "You have entered an invalid number. You must enter a number between 1 and 12. Goodbye."