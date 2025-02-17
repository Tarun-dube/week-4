package NestedTryCatch;

import java.util.Scanner;

public class NestedTryCatchExample {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter index: ");
            int index = scanner.nextInt();

            try {
                System.out.print("Enter divisor: ");
                int divisor = scanner.nextInt();

                int result = array[index] / divisor;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a number.");
        } finally {
            scanner.close();
        }
    }
}