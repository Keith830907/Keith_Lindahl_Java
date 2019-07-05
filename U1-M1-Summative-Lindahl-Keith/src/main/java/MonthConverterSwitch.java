import java.util.Scanner;

public class MonthConverterSwitch {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number that corresponds to the month you would like to choose: ");
        System.out.println(" 1 = January, 2 = February, 3 = March, 4 = April, 5 = May, 6 = June, 7 = July ");
        System.out.println(" 8 = August, 9 = September, 10 = October, 11 = November, 12 = December ");
        System.out.println("Please Choose: ");
        int month = scan.nextInt();
        if ((month < 1) || (month > 12)) {
            System.out.println("You have entered an invalid number. You must enter a number between 1 and 12!!! Goodbye");
        }
        String monthString;
        switch (month) {
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            case 5:
                monthString = "May";
                break;
            case 6:
                monthString = "June";
                break;
            case 7:
                monthString = "July";
                break;
            case 8:
                monthString = "August";
                break;
            case 9:
                monthString = "September";
                break;
            case 10:
                monthString = "October";
            case 11:
                monthString = "November";
                break;
            case 12:
                monthString = "December";
                break;
            default:
                monthString = "Invalid month";
                break;
        }
        System.out.println(monthString);
        System.out.println("You entered " + monthString);
    }
}


//    The program must do the following:
////
////
////        Prompt the user to enter a number between 1 and 12.
////        Print out the name of the month corresponding to the number typed in by the user.
////        Print out the following error message if the user enters a number less than 1 or greater
////        than 12: "You have entered an invalid number. You must enter a number between 1 and 12. Goodbye."