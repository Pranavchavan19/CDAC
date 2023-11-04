/*10.Create an array of integers and initialize it with some values.
i)Calculate the sum and average of the array elements.
ii)Find the maximum and minimum values in the array.
//iii)Print the result*/



package Assignment_weekly_java;

import java.util.Scanner;

public class Q_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of the specified size
        int[] a = new int[size];

        // Input array elements
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at index " + i + ": ");
            a[i] = scanner.nextInt();
        }

        // Display the entered array elements
        System.out.println("Entered array elements:");

        for (int i = 0; i < size; i++) {
            System.out.println("Element at index " + i + ": " + a[i]);
        }

        // Calculate and print the sum and average
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum =sum+ a[i];
        }
        double average = (double) sum / size;

        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);

        // Find and print the maximum and minimum values
        int max = a[0];
        int min = a[0];

        for (int i = 1; i < size; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
