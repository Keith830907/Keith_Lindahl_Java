import java.util.*;

public class City {

    private String name;
     private int population;

    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public static void main(String[] args) {
         City NewYorkCity = new City("NewYork", 8654321);

        int NewYork = 8654321;
        int LosAngeles = 4563218;
        int  Chicago = 2716520;
        int Denver = 704621;
        int DesMoines = 217521;
        int Atlanta = 486213;
        Map<String, Integer> States = new HashMap<>();

        States.put("NewYork", NewYork);
        States.put("California", LosAngeles);
        States.put("Illinois", Chicago);
        States.put("Colorado", Denver);
        States.put("Iowa", DesMoines);
        States.put("Georgia", Atlanta);

        Set<String> keys = States.keySet();
        for(String key : keys){
            System.out.println("Key = " + key + " : " + "Value = " + States.get(key));
        }

//        Collection<Integer> myValues = States.values();
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Please enter a population minumum: ");
//        Integer populationMin = scan.nextInt();
//        for (Integer value : myValues){
//            System.out.println("MyValues: " + value);
//        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a population minumum: ");
        int populationMin = scan.nextInt();
        if(populationMin > NewYork) {
            System.out.println("New York Population is greater: "+NewYork);
        }
        if(populationMin < LosAngeles){
            System.out.println("Los Angeles Population is greater: "+LosAngeles);
        }
        if(populationMin < Chicago){
            System.out.println("Chicago Population is greater: "+Chicago);
        }
        if(populationMin < Denver){
            System.out.println("Denver Population is greater: "+Denver);
        }
        if(populationMin < DesMoines){
            System.out.println("Des Moines Population is greater: "+DesMoines);
        }
        if(populationMin < Atlanta){
            System.out.println("Atlanta Population is greater: "+Atlanta);
        }
    }
}