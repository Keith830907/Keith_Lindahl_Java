package ConverterInterface;

import java.util.Scanner;

public class ConverterSwitch implements  Converter {




    @Override
    public String convertMonth(int monthNumber) {

        String month;
        switch (monthNumber) {
            case 1:
                month = "You chose January";
                return month;
                case 2:
                    month = "You chose February";
               return month;
               case 3:
                   month = "You chose March";
                return month;
                case 4:
                    month = "You chose April";
                return month;
                case 5:
                    month = "You chose May";
                return month;
                case 6:
                    month = "You chose June";
                return month;
                case 7:
                    month = "You chose July";
                return month;
                case 8:
                    month = "You chose August";
                return month;
                case 9:
                    month = "You chose September";
                return month;
                case 10:
                    month = "You chose October";
                return month;
                case 11:
                    month = "You chose November";
                return month;
                case 12:
                    month = "You chose December";
                return month;
                default:
                    month = "You chose an invalid month";
               return month;

        }
    }

    @Override
    public String convertDay(int dayNumber) {

        String day;
        switch (dayNumber) {
            case 1:
               day = "You chose Sunday";
                return day;
                case 2:
                    day = "You chose Monday";
                return day;
                case 3:
                    day = "You chose Tuesday";
                return day;
                case 4:
                    day = "You chose Wednesday";
                return day;
                case 5:
                    day = "You chose Thursday";
                return day;
                case 6:
                    day = "You chose Friday";
                return day;
                case 7:
                    day = "You chose Saturday";
                return day;
                default:
                    day = "You chose an invalid day";
                return day;

        }
    }
}
