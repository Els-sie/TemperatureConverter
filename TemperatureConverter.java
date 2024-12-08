import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Welcome to the Temperature Converter!");
        System.out.println("Please choose an option:");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");

        
        int choice = scanner.nextInt();

    
        double inputTemp, convertedTemp;

    
        if (choice == 1) {
            System.out.print("Enter the temperature in Celsius: ");
            inputTemp = scanner.nextDouble();
            convertedTemp = (inputTemp * 9 / 5) + 32;
            System.out.printf("The temperature in Fahrenheit is: %.2f°F%n", convertedTemp);
        } else if (choice == 2) {
            System.out.print("Enter the temperature in Fahrenheit: ");
            inputTemp = scanner.nextDouble();
            convertedTemp = (inputTemp - 32) * 5 / 9;
            System.out.printf("The temperature in Celsius is: %.2f°C%n", convertedTemp);
        } else {
            System.out.println("Invalid choice! Please restart the program and choose a valid option.");
        }

        
        scanner.close();
    }
}
