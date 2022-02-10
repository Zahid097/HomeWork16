package com.company;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle();

        circle.setPI(15.14);
        circle.setRadius(56.12);

        Circle.area();
        Circle.circumference();
    }
}
