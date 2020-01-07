package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main (String[] args) {
        double radius;
        Scanner input = new Scanner (System.in);

        do {
            System.out.println("Enter the radius (must be a positive number): ");
            while(!input.hasNextDouble()) {
                System.out.println("Not a number. Must be a positive number:");
                input.next();
            }
            radius = input.nextDouble();
        } while (radius <= 0);
        input.close();
        System.out.println("A circle with radius " + radius + " has an area of " + Circle.getArea(radius) + ".");
    }
}
