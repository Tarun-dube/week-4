package MultipleCatchBlock;

import java.util.Scanner;

public class ArrayOperations {

    public static void main(String[] args) {
        // Scanner to get input from user
        Scanner scanner = new Scanner(System.in);

        // Accepting an integer array and an index number from the user
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();

        int[] array = new int[size];

        // Accepting elements for the array
        System.out.println("Enter " + size + " integer values for the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Accepting an index to retrieve the value
        System.out.println("Enter the index to retrieve the value:");
        int index = scanner.nextInt();

        // Perform array operation with exception handling
        try {
            if (array == null) {
                throw new NullPointerException();
            }
            // Retrieve and print the value at the specified index
            System.out.println("Value at index " + index + ": " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle invalid index
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            // Handle null array
            System.out.println("Array is not initialized!");
        }

        // Close the scanner
        scanner.close();
    }
}
