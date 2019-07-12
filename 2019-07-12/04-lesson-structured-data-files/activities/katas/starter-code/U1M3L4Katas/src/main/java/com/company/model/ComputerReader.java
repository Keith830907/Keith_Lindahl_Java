package com.company.model;

import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.*;
import java.util.List;

public class ComputerReader {
    public static void main(String[] args) {


        try {
            List<Computer> computerList = new CsvToBeanBuilder<Computer>(new FileReader("computers.csv")).withType(Computer.class).build().parse();
            computerList.add(new Computer("Dell", "XPS 13 9360", "i7-8660U", "16", "512"));
            computerList.add(new Computer("Lenovo", "X1 Carbon", "i7-8550U", "16", "512"));
            computerList.add(new Computer("HP", "Spectre x360-13t", "i5-8250U", "12", "256"));
            computerList.add(new Computer("Samsung", "NP950SBE-K01US", "i7-8550U", "16", "512"));
            computerList.add(new Computer("Microsoft", "FUX-00001", "�i7-8650U", "16", "512"));
            computerList.add(new Computer("LG", "17Z990-RAAS8U1", "i7 8565U", "16", "512"));
            computerList.add(new Computer("ASUS", "UX330UA-AH55", "i5-8250U", "8", "256"));
            computerList.add(new Computer("Acer", "E5-576G-5762", "i5-8250U", "8", "256"));
            computerList.add(new Computer("MSI", "GS75", "i7-8750H", "32", "2000"));
            computerList.add(new Computer("Razer", "RZ09-02810E71-R3U1", "i7-8565U", "8", "256"));
            computerList.add(new Computer("Sager", "NP8956", "i7-8750H", "8", "500"));
            for (Computer computer : computerList) {
                System.out.println("=================================");
                System.out.println(computer.getBrand());
                System.out.println(computer.getModel());
                System.out.println(computer.getCPU());
                System.out.println(computer.getRAM());
                System.out.println(computer.getStorageSize());


                Writer writer = new FileWriter("new_computer_file.csv");
                StatefulBeanToCsv beanToCsv = new StatefulBeanToCsvBuilder(writer).build();
                beanToCsv.write(computerList);
                writer.close();
            }
        } catch (
                FileNotFoundException e) {
            System.out.println("Could not find CSV file: " + e.getMessage());
        } catch (IOException | CsvDataTypeMismatchException | CsvRequiredFieldEmptyException e) {
            System.out.println("ERROR: Something went wrong writing your CSV file: " + e.getMessage());
        }
    }
}

