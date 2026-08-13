import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Temperature Conversion Program");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");

        System.out.print("Enter the original unit (1/2/3): ");
        int choice = sc.nextInt();

        System.out.print("Enter the temperature value: ");
        double temperature = sc.nextDouble();

        if (choice == 1) {
            double fahrenheit = (temperature * 9 / 5) + 32;
            double kelvin = temperature + 273.15;

            System.out.printf("Fahrenheit: %.2f °F%n", fahrenheit);
            System.out.printf("Kelvin: %.2f K%n", kelvin);

        } else if (choice == 2) {
            double celsius = (temperature - 32) * 5 / 9;
            double kelvin = celsius + 273.15;

            System.out.printf("Celsius: %.2f °C%n", celsius);
            System.out.printf("Kelvin: %.2f K%n", kelvin);

        } else if (choice == 3) {
            double celsius = temperature - 273.15;
            double fahrenheit = (celsius * 9 / 5) + 32;

            System.out.printf("Celsius: %.2f °C%n", celsius);
            System.out.printf("Fahrenheit: %.2f °F%n", fahrenheit);

        } else {
            System.out.println("Invalid unit selection.");
        }

        sc.close();
    }
}
