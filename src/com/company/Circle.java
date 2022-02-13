package com.company;

public class Circle {
    private static double PI;
    private static double radius;

    static void area() {
        double i = PI * (radius * radius);
        System.out.println("Площадь area: " + i);
    }

    static void circumference() {
        double i = (PI * 2 * radius);
        System.out.println("Длина radius: " + i);
    }

    public Circle() {
    }

    public Circle(double PI, double radius) {
        this.PI = PI;
        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }

    public void setPI(double PI) {
        this.PI = PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
