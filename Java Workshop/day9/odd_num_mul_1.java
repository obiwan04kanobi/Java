package day9;
import java.util.Scanner;

public class odd_num_mul_1 {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter the size of the array
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        // Declare and initialize an array of integers
        int[] arr = new int[n];

        // Ask the user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Declare and initialize a variable to store the product of odd numbers
        int product = 1;

        // Loop through the array and multiply the odd numbers
        for (int num : arr) {
            if (num % 2 != 0) { // Check if the number is odd
                product *= num; // Multiply the number with the product
            }
        }

        // Print the product of odd numbers
        System.out.println("The product of odd numbers in the array is: " + product);
    }
}