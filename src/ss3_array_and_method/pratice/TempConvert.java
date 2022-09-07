package ss3_array_and_method.pratice;

import java.util.Scanner;

public class TempConvert {
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;

        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(input.nextLine());

            switch (choice){
                case 1:
                    System.out.println("Enter fahrenheit: ");
                    fahrenheit = Double.parseDouble(input.nextLine());
                    System.out.println("Celsius: " + fahrenheitToCelsius(fahrenheit));

                case 2:
                    System.out.println("Enter Celsius: ");
                    celsius = Double.parseDouble(input.nextLine());
                    System.out.println("Fahrenheit: " + celsiusToFahrenheit(celsius));

                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }
}
