package com.company;

public class FormattedOutput {

    public static void main(String[] args) {


        String age = String.format("%d", 35);
        String name = String.format("%s", "Keith Lindahl");
        System.out.format("My name is " + name + " and I am " + age + " years old.");
    }
}
