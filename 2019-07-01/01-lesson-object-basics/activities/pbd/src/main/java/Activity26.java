import java.util.Scanner;

public class Activity26 {



        public static void main(String[] args) {

            Scanner keyboard = new Scanner(System.in);

            System.out.print("Please enter your current weight on Earth: ");
            int weightOnEarth = keyboard.nextInt();

            System.out.println("\nPlease choose one of the following planets by its number:\n 1. Venus 2. Mars 3. Jupiter 4. Saturn 5. Uranus 6. Neptune");

            System.out.print("\nWhich planet are you boxing at? ");
            int planet = keyboard.nextInt();

            if (planet == 1) {
                System.out.println("\nYour weight would be " + weightOnEarth * 0.78 + " pounds on Venus.");
            } else if (planet == 2) {
                System.out.println("\nYour weight would be " + weightOnEarth * .39 + " pounds on Mars.");
            } else if (planet == 3) {
                System.out.println("\nYour weight would be " + weightOnEarth * 2.65 + " pounds on Jupiter.");
            } else if (planet == 4) {
                System.out.println("\nYour weight would be " + weightOnEarth * 1.17 + " pounds on Saturn.");
            } else if (planet == 5) {
                System.out.println("\nYour weight would be " + weightOnEarth * 1.05 + " pounds on Uranus.");
            } else if (planet == 6) {
                System.out.println("\nYour weight would be " + weightOnEarth * 1.23 + " pounds on Neptune.");
            }
        }

    }





//    Julio Cesar Chavez Mark VII is an interplanetary space boxer, who currently holds the championship belts for various weight
//    categories on many different planets within our solar system. However, it is often difficult for him to recall what his
//    "target weight" needs to be on earth in order to make the weight class on other planets.	Write a program to help him keep
//    track of this.
//
//        It should ask him what his earth weight is, and to enter a number for the planet he wants to fight on. It should then
//        compute his weight on the destination planet based on the table below:
//
//        #	Planet	Relative gravity
//        1	Venus	0.78
//        2	Mars	0.39
//        3	Jupiter	2.65
//        4	Saturn	1.17
//        5	Uranus	1.05
//        6	Neptune	1.23
//        So, for example, if Julio weighs 128 lbs. on earth, then he would weigh just under 50 lbs. on Mars, since Mars' gravity
//        is 0.39 times earth's gravity. (128 * 0.39 is 49.92)
//
//        Please enter your current earth weight: 128
//
//        I have information for the following planets:
//        1. Venus   2. Mars    3. Jupiter
//        4. Saturn  5. Uranus  6. Neptune
//
//        Which planet are you visiting? 2
//
//        Your weight would be 49.92 pounds on that planet.




