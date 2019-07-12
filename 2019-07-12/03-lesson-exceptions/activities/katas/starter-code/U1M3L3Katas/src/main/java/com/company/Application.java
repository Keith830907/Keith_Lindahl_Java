

package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;

public class Application {

    public static void main(String[] args) {

            try {
                System.out.println("Current saved animals file:");
                int petIndex = Pets.choosePet();
                Pets.readPetsFromFile();
                String chosenPet = Pets.retrievePet(petIndex);
                Pets.writePetToFile(chosenPet);
                System.out.println("New saved animals file:");
                Pets.readPetsFromFile();
            } catch (FileNotFoundException e) {
                System.out.println("The following file does not seem to exist:" + e.getMessage());
            } catch (NumberFormatException e){
                System.out.println("Please enter a valid number.");
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Please choose an available pet.");
            } catch (IOException e) {
                System.out.println("The following file does not seem to exist:" + e.getMessage());
            } finally {
                System.out.println("Have a nice day!");
            }
        }


    }



