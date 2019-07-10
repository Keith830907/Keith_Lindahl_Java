import java.util.Scanner;

public class Activity63b {

    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            int A = 3;
            int B = 3;
            int C = 3;

            while(A > 0 || B > 0 || C > 0){
                System.out.println("A. "+ A +"	B. "+ B + "	C. " + C);
                System.out.println();
                System.out.print("Choose a pile: ");
                String decision = scan.next();

                System.out.print("How many to remove from pile " + decision + ": ");
                int tookFromPile = scan.nextInt();

                if(decision.equals("A")){
                    A = A - tookFromPile;
                    System.out.println();
                }else if(decision.equals("B")){
                    B = B - tookFromPile;
                    System.out.println();
                }else if(decision.equals("C")){
                    C = C - tookFromPile;
                    System.out.println();
                }if(A <= 0 && B <= 0 && C <= 0)
                {
                    System.out.println("A. " + A + "	B. " + B + "	C. " + C);
                    System.out.println();
                    System.out.print("All piles are empty. Good job!");
                    System.out.println();
                }
            }
        }
    }

//    Write a program that starts with three "piles" of 3 counters each. Let the player choose piles and remove counters until
//    all the piles are empty.
//
//        Start by placing counters (coins or toothpicks or something) into 3 piles.
//        The player picks a pile, then removes one or more counters from that pile. (It's okay to take the whole pile.)
//        The player picks a new pile, then removes one or more counters from that pile. (It's okay to pick the same pile as before.)
//        Once all piles are empty, the game stops.
//        You do not need to check for errors like a wrong pile name, or if someone tries to take more counters from the pile
//        than the pile has.
//
//        Sample Output
//        Here is an example game, with starting piles of 3 counters.
//
//        A: 3	B: 3	C: 3
//
//        Choose a pile: A
//        How many to remove from pile A: 2
//
//        A: 1	B: 3	C: 3
//
//        Choose a pile: C
//        How many to remove from pile C: 3
//
//        A: 1	B: 3	C: 0
//
//        Choose a pile: B
//        How many to remove from pile B: 1
//
//        A: 1	B: 2	C: 0
//
//        Choose a pile: A
//        How many to remove from pile A: 1
//
//        A: 0	B: 2	C: 0
//
//        Choose a pile: B
//        How many to remove from pile B: 1
//
//        A: 0	B: 1	C: 0
//
//        Choose a pile: C
//        How many to remove from pile C: 2
//
//        A: 0	B: 1	C: -2
//
//        Choose a pile: B
//        How many to remove from pile B: 1
//
//        A: 0	B: 0	C: -2
//
//        All piles are empty. Good job!