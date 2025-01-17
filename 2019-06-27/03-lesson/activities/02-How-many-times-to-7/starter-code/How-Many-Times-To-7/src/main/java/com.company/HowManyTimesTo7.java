package com.company;

public class HowManyTimesTo7 {
    package com.company;


    public class How-Many-Times-To-7 {

        public static void main(String[] args) {
            Random random = new Random();
            int sevens = 0;

            int diceRollIncrement = 1;

            Scanner scan = new Scanner(System.in);
            System.out.println("How many times do you want to roll the dice?: ");
            int DiceRolls = scan.nextInt();

            while (diceRollIncrement <= DiceRolls) {
                int die1 = random.nextInt(6) + 1;
                int die2 = random.nextInt(6) + 1;
                int total = die1 + die2;

                if (total == 7) {
                    sevens++;
                }

                diceRollIncrement++;



            }

            System.out.println("You rolled seven " + sevens + " times out of " + DiceRolls + " Rolls");

        }

    }

//# How Many Times to 7?
//
//        ## Requirements
//        The purpose of this lab is to learn something about the results of rolling virtual dice.  Here are the requirements:
//
//        1.	The program will "roll" a pair of virtual dice (use the random number generator) 100 times and keep track of the following:
//        -	How many rolls it took to roll the first 7
//        -	The total number of 7s rolled out of the 100 rolls
//        1.	This information must be displayed to the user after it has been calculated.
//
//        ## Bonus
//
//        1.	Prompt the user for the number of times to roll the dice.
//        1.	Keep track of and display this information for all numbers that can be rolled (2–12).
