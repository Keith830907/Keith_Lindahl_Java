import java.util.Scanner;

public class Activity63c {

    public static void main(String[] args) {

        int A = 3;
        int B = 4;
        int C = 5;
        int turn = 1;
        String currentPlayer = "";
        Scanner scan = new Scanner(System.in);

        System.out.print("Player 1, enter your name: ");
        String name1 = scan.next();
        System.out.print("Player 2, enter your name: ");
        String name2 = scan.next();
        if (turn % 2 == 0) {
            currentPlayer = name1;
        } else if (turn % 2 > 0) {
            currentPlayer = name2;
            {
                while (A > 0 || B > 0 || C > 0) {
                    System.out.println("A. " + A + "	B. " + B + "	C. " + C);
                    System.out.println();
                    System.out.print(name1 + " , choose a pile: ");
                    String decision = scan.next();

                    System.out.print("How many to remove from pile " + decision + ": ");
                    int tookFromPile = scan.nextInt();

                    if (decision.equals("A")) {
                        A = A - tookFromPile;
                        System.out.println();
                    } else if (decision.equals("B")) {
                        B = B - tookFromPile;
                        System.out.println();
                    } else if (decision.equals("C")) {
                        C = C - tookFromPile;
                        System.out.println();
                    }
                    turn++;
                }
            }
        }

        if (A <= 0 && B <= 0 && C <= 0) {
            if (currentPlayer.equals(name1)) {
                System.out.print(name1 + ", there are no counters left, so you WIN!");
            } else if (currentPlayer.equals(name2)) {
                System.out.print(name2 + ", there are no counters left, so you WIN!");
            }
        }
    }
}



//        Nim is a strategy game between two players.
//
//        Start by placing counters (coins or toothpicks or something) into 3 piles.
//                Player #1 picks a pile, then removes one or more counters from that pile. (It's okay to take the whole pile.)
//        Player #2 picks a pile, then removes one or more counters from that pile.
//        Player #1 plays again. (It's okay to choose a different pile this time.)
//        Whichever player is forced to take the last counter is the LOSER.
//        Write a program that allows two human players to play Nim against each other. The program should detect when the last counter has been taken and declare a winner.
//
//                At first, don't worry about detecting cheating. That is one of the bonus options.
//
//        Sample Output
//        Here is an example game, with starting piles of 3, 4, and 5 counters.
//
//                Player 1, enter your name: Alice
//        Player 2, enter your name: Bob
//
//        A: 3	B: 4	C: 5
//
//        Alice, choose a pile: A
//        How many to remove from pile A: 2
//
//        A: 1	B: 4	C: 5
//
//        Bob, choose a pile: C
//        How many to remove from pile C: 3
//
//        A: 1	B: 4	C: 2
//
//        Alice, choose a pile: B
//        How many to remove from pile B: 1
//
//        A: 1	B: 3	C: 2
//
//        Bob, choose a pile: B
//        How many to remove from pile B: 1
//
//        A: 1	B: 2	C: 2
//
//        Alice, choose a pile: A
//        How many to remove from pile A: 1
//
//        A: 0	B: 2	C: 2
//
//        Bob, choose a pile: B
//        How many to remove from pile B: 1
//
//        A: 0	B: 1	C: 2
//
//        Alice, choose a pile: C
//        How many to remove from pile C: 2
//
//        A: 0	B: 1	C: 0
//
//        Bob, choose a pile: B
//        How many to remove from pile B: 1
//
//        A: 0	B: 0	C: 0
//
//        Alice, there are no counters left, so you WIN!

