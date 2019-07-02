import java.util.Scanner;

public class Activity27 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int answCorrect = 0;
        System.out.print("Are, you ready for a quiz? ");
        String answer = scan.next();
        if(answer.equals("Y")){
            System.out.println("Okay, here it comes! ");
            System.out.println();
            System.out.println("Q1) What is the capital of Alaska?");
            System.out.println("            1) Melbourne");
            System.out.println("            2) Anchorage");
            System.out.println("            3) Juneau");
            System.out.println();
            int decision1 = scan.nextInt();
            if(decision1 == 3){
                System.out.println();
                System.out.println("That's right!");
                answCorrect++;
            }else{
                System.out.println();
                System.out.println("Sorry, Juneau is the capital of Alaska.");
            }
            System.out.println();
            System.out.println("Q2) Can you store the value cat in a variable of type int?");
            System.out.println("             1) Yes");
            System.out.println("             2) No");
            System.out.println();
            int decision2 = scan.nextInt();
            if(decision2==1){
                System.out.println();
                System.out.println("Sorry, cat is a String , ints can only be numbers.");
            }else{
                System.out.println();
                System.out.println("That's right!");
                answCorrect++;
            }
            System.out.println();
            System.out.println("Q3) What is the result of 9 + 6 / 3 ? ");
            System.out.println("             1) 5");
            System.out.println("             2) 11");
            System.out.println("             3) 15/3");
            System.out.println();
            int decision3=scan.nextInt();
            if(decision3 == 2){
                System.out.println();
                System.out.println("That's right!");
                answCorrect++;
            }else{
                System.out.println();
                System.out.println("Sorry, 11 is the answCorrect answer.");
            }
            System.out.println();
            if(answCorrect == 3){
                System.out.println("Overall you got all 3 answCorrect.");
            }else{
                System.out.println("Overall you got " + answCorrect + " out of 3 answCorrect.");
            }

        }
        System.out.println("Thanks for playing!");
    }
}

//Write an interactive quiz. It should ask the user three multiple-choice or true/false questions about something. It must keep track
// of how many they get wrong, and print out a "score" at the end.
//
//        Are you ready for a quiz?  N
//        Okay, here it comes!
//
//        Q1) What is the capital of Alaska?
//        1) Melbourne
//        2) Anchorage
//        3) Juneau
//
//        > 3
//
//        That's right!
//
//        Q2) Can you store the value "cat" in a variable of type int?
//        1) yes
//        2) no
//
//        > 1
//
//        Sorry, "cat" is a string. ints can only store numbers.
//
//        Q3) What is the result of 9+6/3?
//        1) 5
//        2) 11
//        3) 15/3
//
//        > 2
//
//        That's correct!
//
//
//        Overall, you got 2 out of 3 correct.
//        Thanks for playing!