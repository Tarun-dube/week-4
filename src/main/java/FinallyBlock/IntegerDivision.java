package FinallyBlock;

import java.util.Scanner;

public class IntegerDivision {

    public static void main(String[] args) {
        // Scanner to get input from user
        Scanner scanner = new Scanner(System.in);

        // Accept two integers from the user
        System.out.println("Enter the first integer:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second integer:");
        int num2 = scanner.nextInt();

        try {
            // Perform the division
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle division by zero
            System.out.println("Error: Cannot divide by zero.");
        } finally {
            // This block will always execute
            System.out.println("Operation completed");
        }

        // Close the scanner
        scanner.close();
    }
}
