package Practical4;


interface Converter {
    double convert(double value);
}

public class LambdaConversions {
    public static void main(String[] args) {
        System.out.println("~~~~~~~~~~ Umang 153 ~~~~~~~~~~\n");

        Converter fahrenheitToCelsius = f -> (f - 32) * 5.0 / 9.0;

        Converter kmToMeters = km -> km * 1000.0;

        double fahrenheit = 98.6;
        double celsius = fahrenheitToCelsius.convert(fahrenheit);
        System.out.printf("%.1f Fahrenheit = %.2f Celsius\n", fahrenheit, celsius);

        double km = 4.5;
        double meters = kmToMeters.convert(km);
        System.out.printf("%.2f Kilometers = %.2f Meters\n", km, meters);
    }
}