package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        int miles;
        int gallonsGas;
        Scanner input = new Scanner(System.in);

        double milesPerGallon;

        System.out.println("Enter miles traveled:");
        miles = input.nextInt();
        System.out.println("Enter gallons of gas used:");
        gallonsGas = input.nextInt();
        milesPerGallon = miles / gallonsGas;

        System.out.println("Your miles per gallon was " + milesPerGallon + ".");
    }
}
