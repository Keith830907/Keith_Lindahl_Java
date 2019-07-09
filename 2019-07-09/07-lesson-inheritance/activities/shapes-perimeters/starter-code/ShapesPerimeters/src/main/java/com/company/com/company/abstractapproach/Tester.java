package com.company.com.company.abstractapproach;

public class Tester {
    public static void main(String[] args) {
        Circle circle = new Circle(3.45);
        System.out.println("The area of the circle is: " + circle.area());
        System.out.println("The perimeter of the circle is: " + circle.perimeter());

        System.out.println();

        Square square = new Square(50);
        System.out.println("The area of the square is: " + square.area());
        System.out.println("The perimeter of the square is: " + square.perimeter());

        System.out.println();

        Triangle triangle = new Triangle(35,45,55);
        System.out.println("The area of the triangle is: " + triangle.area());
        System.out.println("The perimeter of the triangle is: " + triangle.perimeter());
    }
}