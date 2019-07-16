import java.util.*;


public class CarInventory {


    private int year;
    private String make;
    private String model;
    private String color;
    private int miles;

    public CarInventory(int year, String make, String model, String color, int miles) {
        this.year = year;
        this.make = make;
        this.model = model;
        this.color = color;
        this.miles = miles;
    }

    public CarInventory() {
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    @Override
    public String toString() {
        return "CarInventory{" +
                "year='" + year + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", miles='" + miles + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<CarInventory> Cars = new ArrayList<>();


        while (true) {
            System.out.println("------------------------------------------------------------------------------");
            System.out.println("A = Add Car ||| D = Delete Car ||| L = List All Cars ||| SY = Search by Year");
            System.out.println("SMAKE = Search by make ||| SMODEL = Search by model ||| SC = Search by color");
            System.out.println("SLESSMILES = Search for Cars with less  miles then entered ||| SMOREMILES = Search for Cars with more miles then ");
            System.out.println("E = Exit the Program");
            System.out.println("Please enter a decision to continue in all caps: ");
            String choice = scan.next();
            switch (choice) {
                case "A":
                    InventoryMethods.adder(Cars);
                    break;
                case "D":
                    InventoryMethods.deleter(Cars);
                    break;
                case "L":
                    InventoryMethods.lister(Cars);
                    break;
                case "SMAKE":
                    InventoryMethods.searchbyMake(Cars);
                    break;
                case "SMODEL":
                    InventoryMethods.searchbyModel(Cars);
                    break;
                case "SC":
                    InventoryMethods.searchbyColor(Cars);
                    break;
                case "SY":
                    InventoryMethods.searchbyYear(Cars);
                    break;
                case "SMOREMILES":
                    InventoryMethods.searchbymorethanMiles(Cars);
                    break;
                case "SLESSMILES":
                    InventoryMethods.searchbylessthanMiles(Cars);
                    break;
                case "E":
                    System.out.println("Thank You and Have A Great Day");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid decision");
            }

        }
    }
}


//    Car Inventory Design and Build Activity
//In this activity you will design and build a simple application based on the specification below. This specification is intentionally vague, this exercise is meant to force you to think about the design of the application and to ask good questions about the requirements.
//        Requirements
//        This application must keep track of an inventory of cars.
//        It must track the following data about the cars in inventory:
//        Make
//        Model
//        Year
//        Color
//        Miles on the odometer
//        The application must allow the user to do the following:
//        Add a car to inventory
//        Delete a car from inventory
//        List all the cars in inventory
//        Search for cars by:
//        Make
//        Model
//        Year
//        Color
//        Less than a certain number of miles
//        The user interface for this application must be the command line
//        The initial version of this application must store all data in memory, a later version must persist the data to file using one of the techniques shown in class
//You are to use Collections, Lists, Maps, lambdas, streams and everything else you've learned thus far in the course to solve this problem.
//        Collapse



