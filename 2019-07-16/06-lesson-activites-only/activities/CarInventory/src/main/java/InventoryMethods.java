
import java.util.*;


public class InventoryMethods {


    public static void adder(ArrayList<CarInventory> Cars) {
        try{
        Scanner scan = new Scanner(System.in);
        char quit = 'Y';
        while (quit == 'Y') {

            System.out.println("please enter the year: ");
            int yearOfCar = scan.nextInt();


            System.out.println("please enter the make: ");
            String makeOfCar = scan.next();


            System.out.print("please enter the model: ");
            String modelOfCar = scan.next();


            System.out.print("please enter the color: ");
            String colorOfCar = scan.next();


            System.out.print("please enter the mileage: ");
            int milesOfCar = scan.nextInt();

            Cars.add(new CarInventory(yearOfCar, makeOfCar, modelOfCar, colorOfCar, milesOfCar));
            System.out.print(" Enter Another Record? (Y/N)");
            String word = scan.next();

            quit = word.charAt(0);
        }
        for (CarInventory cars : Cars) {
            System.out.println(cars);
        }

        } catch (InputMismatchException e) {
            System.out.println("Entered wrong input try again: " + e.getMessage());
        }
        return;
    }

    public static void deleter(ArrayList<CarInventory> Cars) {
        try {
            Scanner scan = new Scanner(System.in);
            char quit1 = 'Y';
            while (quit1 == 'Y') {
                System.out.println("please enter the index number beginning by zero to remove car: ");
                int vinNumber = scan.nextInt();
                Cars.remove(vinNumber);
                System.out.print(" Enter Another Record to delete? (Y/N)");
                String word = scan.next();

                quit1 = word.charAt(0);
            }
            for (CarInventory cars : Cars) {
                System.out.println(cars);
            }
        }catch (InputMismatchException e) {
            System.out.println("Entered wrong input try again: " + e.getMessage());
        }
        return;
    }

    public static void lister(ArrayList<CarInventory> Cars) {
        try{
        System.out.println("Number of entries in the array: " + Cars.size());
        for (int i = 0; i < Cars.size(); i++) {
            System.out.println(Cars.get(i));
        }
        } catch (InputMismatchException e) {
            System.out.println("Entered wrong input try again: " + e.getMessage());
        }
        return;
    }

    public static void searchbyMake(ArrayList<CarInventory> Cars) {
        try{
        Scanner scan = new Scanner(System.in);
        char quit = 'Y';
        while (quit == 'Y') {

            System.out.println("Please enter a Car make to filter by: ");
            String carmake = scan.next();
            Cars
                    .stream()
                    .filter(Car -> Car.getMake().equals(carmake))
                    .forEach(Car -> {
                        System.out.println("===============");
                        System.out.println("Year: " + Car.getYear());
                        System.out.println("Make: " + Car.getMake());
                        System.out.println("Model: " + Car.getModel());
                        System.out.println("Color: " + Car.getColor());
                        System.out.println("Odometer: " + Car.getMiles());

                    });
            System.out.print(" Enter Another Record? (Y/N)");
            String word = scan.next();

            quit = word.charAt(0);
        }
        } catch (InputMismatchException e) {
            System.out.println("Entered wrong input try again: " + e.getMessage());
        }
        return;
    }

    public static void searchbyModel(ArrayList<CarInventory> Cars) {
        try{
        Scanner scan = new Scanner(System.in);
        char quit = 'Y';
        while (quit == 'Y') {

            System.out.println("Please enter a Car model to filter by: ");
            String carmodel = scan.next();
            Cars
                    .stream()
                    .filter(Car -> Car.getModel().equals(carmodel))
                    .forEach(Car -> {
                        System.out.println("===============");
                        System.out.println("Year: " + Car.getYear());
                        System.out.println("Make: " + Car.getMake());
                        System.out.println("Model: " + Car.getModel());
                        System.out.println("Color: " + Car.getColor());
                        System.out.println("Odometer: " + Car.getMiles());

                    });
            System.out.print(" Enter Another Record? (Y/N)");
            String word = scan.next();

            quit = word.charAt(0);
        }
        } catch (InputMismatchException e) {
            System.out.println("Entered wrong input try again: " + e.getMessage());
        }
        return;
    }

    public static void searchbyColor(ArrayList<CarInventory> Cars) {
        try{
        Scanner scan = new Scanner(System.in);
        char quit = 'Y';
        while (quit == 'Y') {

            System.out.println("Please enter a Car color to filter by: ");
            String carcolor = scan.next();
            Cars
                    .stream()
                    .filter(Car -> Car.getColor().equals(carcolor))
                    .forEach(Car -> {
                        System.out.println("===============");
                        System.out.println("Year: " + Car.getYear());
                        System.out.println("Make: " + Car.getMake());
                        System.out.println("Model: " + Car.getModel());
                        System.out.println("Color: " + Car.getColor());
                        System.out.println("Odometer: " + Car.getMiles());

                    });
            System.out.print(" Enter Another Record? (Y/N)");
            String word = scan.next();

            quit = word.charAt(0);
        }
        } catch (InputMismatchException e) {
            System.out.println("Entered wrong input try again: " + e.getMessage());
        }
        return;
    }

    public static void searchbyYear(ArrayList<CarInventory> Cars) {
        try{
        Scanner scan = new Scanner(System.in);
        char quit = 'Y';
        while (quit == 'Y') {

            System.out.println("Please enter a Car year to filter by: ");
            int caryear = scan.nextInt();
            Cars
                    .stream()
                    .filter(Car -> Car.getYear() == (caryear))
                    .forEach(Car -> {
                        System.out.println("===============");
                        System.out.println("Year: " + Car.getYear());
                        System.out.println("Make: " + Car.getMake());
                        System.out.println("Model: " + Car.getModel());
                        System.out.println("Color: " + Car.getColor());
                        System.out.println("Odometer: " + Car.getMiles());

                    });
            System.out.print(" Enter Another Record? (Y/N)");
            String word = scan.next();

            quit = word.charAt(0);
        }
        } catch (InputMismatchException e) {
            System.out.println("Entered wrong input try again: " + e.getMessage());
        }
        return;
    }

    public static void searchbylessthanMiles(ArrayList<CarInventory> Cars) {
        try{
        Scanner scan = new Scanner(System.in);
        char quit = 'Y';
        while (quit == 'Y') {

            System.out.println("Please enter a mileage where you want cars with less miles then entered to filter by: ");
            int lessthanmiles = scan.nextInt();
            Cars
                    .stream()
                    .filter(Car -> Car.getMiles() < (lessthanmiles))
                    .forEach(Car -> {
                        System.out.println("===============");
                        System.out.println("Year: " + Car.getYear());
                        System.out.println("Make: " + Car.getMake());
                        System.out.println("Model: " + Car.getModel());
                        System.out.println("Color: " + Car.getColor());
                        System.out.println("Odometer: " + Car.getMiles());

                    });
            System.out.print(" Enter Another Record? (Y/N)");
            String word = scan.next();

            quit = word.charAt(0);
        }
        } catch (InputMismatchException e) {
            System.out.println("Entered wrong input try again: " + e.getMessage());
        }
        return;
    }

    public static void searchbymorethanMiles(ArrayList<CarInventory> Cars) {
        try{
        Scanner scan = new Scanner(System.in);
        char quit = 'Y';
        while (quit == 'Y') {

            System.out.println("Please enter a mileage where you want cars with more then miles entered to filter by: ");
            int morethanmiles = scan.nextInt();
            Cars
                    .stream()
                    .filter(Car -> Car.getMiles() > (morethanmiles))
                    .forEach(Car -> {
                        System.out.println("===============");
                        System.out.println("Year: " + Car.getYear());
                        System.out.println("Make: " + Car.getMake());
                        System.out.println("Model: " + Car.getModel());
                        System.out.println("Color: " + Car.getColor());
                        System.out.println("Odometer: " + Car.getMiles());

                    });
            System.out.print(" Enter Another Record? (Y/N)");
            String word = scan.next();

            quit = word.charAt(0);
        }
        } catch (InputMismatchException e) {
            System.out.println("Entered wrong input try again: " + e.getMessage());
        }
        return;
    }


}


