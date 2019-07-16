package ConverterInterface;

import java.util.Scanner;

public class ConverterApplication {

    public static void main(String[] args) {

        ConverterIf converterif = new ConverterIf();
        ConverterIf converterif2 = new ConverterIf();

        converterif.convertMonth(1);
        converterif.convertDay(3);
        System.out.println();
        converterif2.convertMonth(11);
        converterif2.convertDay(5);
        System.out.println();
        converterif.convertMonth(0);
        converterif2.convertDay(8);





        System.out.println();


        ConverterSwitch converterSwitch = new ConverterSwitch();
        ConverterSwitch converterSwitch1 = new ConverterSwitch();

        System.out.println(converterSwitch.convertMonth(3));
        System.out.println(converterSwitch.convertDay(4));
        System.out.println();
        System.out.println(converterSwitch1.convertMonth(12));
        System.out.println(converterSwitch1.convertDay(6));
        System.out.println();
        System.out.println(converterSwitch.convertMonth(13));
        System.out.println(converterSwitch1.convertDay(8));

    }
}
