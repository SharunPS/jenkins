import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        // Create a scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Display a welcome message
        System.out.println("Welcome to the Calculator!");

        // Show the available operations
        System.out.println("Select an operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        // Take the operation choice from the user
        int choice = scanner.nextInt();

        // Take two numbers as input
        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();

        double result = 0;  // Variable to store the result

        // Perform the chosen operation
        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error! Division by zero.");
                }
                break;
            default:
                System.out.println("Invalid operation choice.");
        }

        // Close the scanner
        scanner.close();
    }
}