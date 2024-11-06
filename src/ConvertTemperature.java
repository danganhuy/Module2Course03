import java.util.Scanner;

public class ConvertTemperature {
    public static double celsiusToFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;

        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            double fah, cel;
            switch (choice) {
                case 1:
                    System.out.print("Enter Fahrenheit: ");
                    fah = sc.nextFloat();
                    cel = fahrenheitToCelsius(fah);
                    System.out.println("To Celsius: " + cel);
                    break;
                case 2:
                    System.out.print("Enter Celsius: ");
                    cel = sc.nextFloat();
                    fah = celsiusToFahrenheit(cel);
                    System.out.println("To Fahrenheit: " + fah);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Unknown choice.");
                    break;
            }
        } while (choice != 0);
    }
}
