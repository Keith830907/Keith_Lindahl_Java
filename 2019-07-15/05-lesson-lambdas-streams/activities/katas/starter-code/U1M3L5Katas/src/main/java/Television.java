

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Television {

                private String brand;
                private String model;
                private String price;
                private int screenSize;

        public Television() {
        }

        public Television(String brand, String model, String price, int screenSize) {
            this.brand = brand;
            this.model = model;
            this.price = price;
            this.screenSize = screenSize;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public int getScreenSize() {
            return screenSize;
        }

        public void setScreenSize(int screenSize) {
            this.screenSize = screenSize;
        }

        @Override
        public String toString() {
            return "Television{" +
                    "brand='" + brand + '\'' +
                    ", model='" + model + '\'' +
                    ", price='" + price + '\'' +
                    ", screenSize='" + screenSize + '\'' +
                    '}';
        }

        public static void main(String[] args) {
            try {
                ObjectMapper mapper = new ObjectMapper();
                List<Television> televisionList;
                televisionList = mapper.readValue(new File("televisions.json"), new TypeReference<List<Television>>(){});
                for (Television television : televisionList) {
                    System.out.println("================");
                    System.out.println(television.getBrand());
                    System.out.println(television.getModel());
                    System.out.println(television.getPrice());
                    System.out.println(television.getScreenSize());
                }



                int screen = 60;
                televisionList
                        .stream()
                        .filter(television -> television.getScreenSize() > screen)
                        .forEach(television -> {
                            System.out.println("===============");
                            System.out.println("-----------------Tv's above 60 inches-------------");
                            System.out.println("Brand: " + television.getBrand());
                            System.out.println("Model: " + television.getModel());
                            System.out.println("Price: " + television.getPrice());
                            System.out.println("ScreenSize: " + television.getScreenSize());

                        });


                System.out.println("---------------GroupedByBrand----------------");
                Map<String, List<Television>> groupedTelevisions =
                        televisionList
                                .stream()
                                .collect(Collectors.groupingBy(b -> b.getBrand()));

                Set<String> keys = groupedTelevisions.keySet();
                for (String key : keys) {
                    System.out.println(key);
                }
                System.out.println("---------------------------------------------");
                // Print the average horsepower of the motorcycles in inventory
                double avgScreensize =
                        televisionList
                                .stream()
                                .mapToInt(b -> b.getScreenSize())
                                .average()
                                .getAsDouble();
                System.out.println();
                System.out.println("Average Screensize is: " + avgScreensize);
                System.out.println();
                int LargestScreen =
                        televisionList
                                .stream()
                                .mapToInt(television -> television.getScreenSize())
                                .max()
                                .getAsInt();

                System.out.println("The largest screen size is: " + LargestScreen);
                System.out.println();
                System.out.println("Televisions sorted by screensize:");
                televisionList.sort((Television s1, Television s2)->s1.getScreenSize()-s2.getScreenSize());
                televisionList.forEach((s)->System.out.println(s));

            } catch (IOException e) {
                System.out.println("ERROR: Problem encountered reading JSON file - " + e.getMessage());
            }
        }



    }

