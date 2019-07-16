package ConverterInterface;

public class ConverterIf implements Converter {

    @Override
    public String convertMonth(int monthNumber) {

        if (monthNumber == 1) {
            System.out.println("You chose January");
            return "January";
        } else if (monthNumber == 2) {
            System.out.println("You chose February");
            return "February";
        } else if (monthNumber == 3) {
            System.out.println("You chose March");
            return "March";
        } else if (monthNumber == 4) {
            System.out.println("You chose April");
            return "April";
        } else if (monthNumber == 5) {
            System.out.println("You chose May");
            return "May";
        } else if (monthNumber == 6) {
            System.out.println("You chose June");
            return "June";
        } else if (monthNumber == 7) {
            System.out.println("You chose July");
            return "July";
        } else if (monthNumber == 8) {
            System.out.println("You chose August");
            return "August";
        } else if (monthNumber == 9) {
            System.out.println("You chose September");
            return "September";
        } else if (monthNumber == 10) {
            System.out.println("You chose October");
            return "October";
        } else if (monthNumber == 11) {
            System.out.println("You chose November");
            return "November";
        } else if (monthNumber == 12) {
            System.out.println("You chose December");
            return "December";
        }
        System.out.println("Invalid month");
        return "Invalid month";
    }



    @Override
    public String convertDay(int dayNumber) {
        if (dayNumber == 1) {
            System.out.println("You chose Sunday");
            return "Sunday";
        } else if (dayNumber == 2) {
            System.out.println("You choose Monday");
            return "Sunday";
        } else if (dayNumber == 3) {
            System.out.println("You choose Tuesday");
            return "Sunday";
        } else if (dayNumber == 4) {
            System.out.println("You choose Wednesday");
            return "Sunday";
        } else if (dayNumber == 5) {
            System.out.println("You choose Thursday");
            return "Sunday";
        } else if (dayNumber == 6) {
            System.out.println("You choose Friday");
            return "Sunday";
        } else if (dayNumber == 7) {
            System.out.println("You choose Saturday");
            return "Sunday";
        }
             System.out.println("Invalid day");
            return "Invalid day";
        }
    }

