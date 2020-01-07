package exercises;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        int length;
        int width;
        Scanner input = new Scanner(System.in);

        int area;

        System.out.println("Enter the rectangle length in cm:");
        length = input.nextInt();
        System.out.println("Enter the rectangle width in cm:");
        width = input.nextInt();
        input.close();

        area = length * width;
        System.out.println("The rectangle's area is " + area + " cm.");
    }
}
