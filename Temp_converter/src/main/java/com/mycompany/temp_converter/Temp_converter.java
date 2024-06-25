package com.mycompany.temp_converter;

import java.util.Scanner;

public class Temp_converter{

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit + 459.67) * 5 / 9;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin * 9 / 5) - 459.67;
    }

    public static void convertTemperature(double value, String unit) {
        double celsius = 0, fahrenheit = 0, kelvin = 0;

        switch (unit.toLowerCase()) {
            case "c":
                celsius = value;
                fahrenheit = celsiusToFahrenheit(celsius);
                kelvin = celsiusToKelvin(celsius);
                break;
            case "f":
                fahrenheit = value;
                celsius = fahrenheitToCelsius(fahrenheit);
                kelvin = fahrenheitToKelvin(fahrenheit);
                break;
            case "k":
                kelvin = value;
                celsius = kelvinToCelsius(kelvin);
                fahrenheit = kelvinToFahrenheit(kelvin);
                break;
            default:
                System.out.println("Invalid unit. Please use 'C', 'F', or 'K'.");
                return;
        }

        System.out.printf("%.2f %s is equivalent to:\n", value, unit.toUpperCase());
        System.out.printf("%.2f Celsius\n", celsius);
        System.out.printf("%.2f Fahrenheit\n", fahrenheit);
        System.out.printf("%.2f Kelvin\n", kelvin);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature value: ");
        double value = scanner.nextDouble();
        System.out.print("Enter the unit of measurement (C/F/K): ");
        String unit = scanner.next();

        convertTemperature(value, unit);
    }
}
