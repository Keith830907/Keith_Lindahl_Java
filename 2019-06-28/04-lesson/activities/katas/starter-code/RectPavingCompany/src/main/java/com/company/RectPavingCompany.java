package com.company;
import java.util.Scanner;

public class RectPavingCompany {

//    public static int promptDimension(String msg){
//
//        Scanner scan = new Scanner(System.in);
//        System.out.format("What is the %s of the driveway in feet? ", msg);
//        return Integer.parseInt(scan.nextLine());
//    }
//
//    public static void outputDimension(String name, int value){
//        System.out.format("The %s of the driveway is %d square foot?%n ", name, value);
//    }
//
//    public static float getCostConcrete(String msg){
//        Scanner scan = new Scanner(System.in);
//        System.out.format("What is the cost of the %s: ", msg);
//        return Float.parseFloat(scan.nextLine());
//    }
//
//    public  static void outputFinalCost(String name, float value){
//        System.out.format("The cost of the %s is: %.2f %n", name, value);
//
//    }




//    public static void main(String[] args) {
//        int width = promptDimension("width");
//        System.out.println("Width: " + width);
//
//        int length = promptDimension("length");
//        System.out.println("Length: " + length);
//
//        float cementCost = 12.5f;
//        float framingCost = 8.25f;
//
//        int area = length * width;
//        int perimeter = (width + length) * 2;
//
//        outputDimension("area", area);
//        outputDimension("perimeter", perimeter);
//
//        float cemCost =getCostConcrete("cement");
//        System.out.println("Cement Cost is: " + cemCost);
//
//        float footCost = getCostConcrete("framing/footers");
//        System.out.println("Framing/footers Cost is:" + footCost);
//
//        float finalCemCost = area * cemCost;
//        float finalFootCost = perimeter * footCost;
//
//        outputFinalCost("cement", finalCemCost);
//        outputFinalCost("framing/footers", finalFootCost);
//
//
//
//    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("What is the width of the driveway in feet? ");
        int width = Integer.parseInt(scan.nextLine());

        System.out.print("What is the length of the driveway in feet? ");
        int length = Integer.parseInt(scan.nextLine());

        float cementCost = 0.0f;
        float framingCost = 0.0f;

        System.out.print("What is the cost of cement per square foot? ");
        cementCost = Float.parseFloat(scan.nextLine());

        System.out.print("What is the cost of framing/footers per linear foot? ");
        cementCost = Float.parseFloat(scan.nextLine());

        int area = length * width;
        int perimeter = (width + length) * 2;//Perimeter should be (width + length) * 2;

        System.out.format("The area of the driveway is %d square feet.%n", area);
        System.out.format("The perimeter of the driveway is %d square feet.%n", perimeter);

        System.out.format("The cost of the cement is %.2f.%n", area * cementCost);//needs changed to %.2f
        System.out.format("The cost of the framing/footers is %.2f %n", perimeter + framingCost);//needs changed to %.2f
    }
}
//line 83 needs to be changed to perimeter = (width + length) *2
//line 88 and 89 needs the format changed to %.2f
//all in methods up above commented out