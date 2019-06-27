package com.company;
import java.util.Scanner;

public class LoanCalculator
{

    public static void main(String Args[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double principal = scan.nextDouble();

        // Annual interest rate
        System.out.print("Enter Yearly Interest Rate: ");
        double rate = scan.nextDouble();

        // Monthly interest rate
        rate = rate/100/12;

        // Term in years
        System.out.print("Enter Term (years): ");
        double term = scan.nextDouble();

        // Term in months
        term = term * 12;
        //P = L[c(1 + c)n]/[(1 + c)n - 1]
        double payment = (principal * rate) / (Math.pow(1 + rate, -term)-1);
        //P = L[c(1 + c)n]/[(1 + c)n - 1]

        // round to two decimals
        payment = (double)Math.round(payment * 100) / 100;

        System.out.format("Loan total: " + "%.2f", payment);



    }
}



//        P = L[c(1 + c)n]/[(1 + c)n - 1]
//        i = IRR
//        L = Loan amount
//        F = Points and all other lender fees
//        P = Monthly payment
//        n = Month when the balance is paid in full
//        Bn = Balance in month n
//# Loan Calculator
//
//        ## Structure
//
//        - Complete the below requirements in the `LoanCalculator` project found in the `starter-code` directory.
//        - All code must be contained within the `main` method of the `LoanCalculator` class.
//        - The requirements must be implemented in the order found below.
//        - Once your code has been written, it can be tested using `LoanCalculatorTest`.
//
//        ## Requirements
//
//        Write a Java program that calculates and displays the mortgage payment amount given the following:
//
//        - The amount of the mortgage
//        - The term of the mortgage
//        - The annual interest rate of the mortgage
//
//        For the formula to calculate the payment, use the first formula [found here](https://www.mtgprofessor.com/formulas.htm).
//
//        ## Hints
//
//        * Remember to divide the annual interest rate by 100. For example, if the annual interest rate is 12%, you must use .12 in your calculation.
//        * The monthly interest rate is equal to the annual interest rate divided by 12.
//
//        ---

