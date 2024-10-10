package com.campusdual.classroom;

public class Exercise02 {

    public static void calculateCircleArea(double circleRadius, final double CONSTANT_PI) {
        double circleArea = circleRadius * circleRadius * (double) CONSTANT_PI;
        System.out.println("The area of a circle with radius " + circleRadius + "  is: " + circleArea);
    }

    public static void calculateCircleLength(double circleRadius, final double CONSTANT_PI) {
        double lengthCircle = 2 * circleRadius * (double) CONSTANT_PI;
        System.out.println("The length of a circle with radius " + circleRadius + " is: " + lengthCircle);
    }

    public static void main(String[] args) {
        double r = 15;
        final double CONST_PI = Math.PI;
        calculateCircleArea(r,CONST_PI);
        calculateCircleLength(r, CONST_PI);

    }
}
