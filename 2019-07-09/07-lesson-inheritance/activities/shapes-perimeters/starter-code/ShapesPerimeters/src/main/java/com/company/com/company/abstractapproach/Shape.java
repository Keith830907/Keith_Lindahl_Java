package com.company.com.company.abstractapproach;

public abstract class Shape {

        private String name;
        private String color;
        private double x_coordinate;
        private double y_coordinate;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public double getX_coordinate() {
            return x_coordinate;
        }

        public void setX_coordinate(double x_coordinate) {
            this.x_coordinate = x_coordinate;
        }

        public double getY_coordinate() {
            return y_coordinate;
        }

        public void setY_coordinate(double y_coordinate) {
            this.y_coordinate = y_coordinate;
        }

        public Shape(String name, String color, double x_coordinate, double y_coordinate) {
            this.name = name;
            this.color = color;
            this.x_coordinate = x_coordinate;
            this.y_coordinate = y_coordinate;
        }

        public Shape(){};


    public abstract double perimeter();


    public abstract double area();

}