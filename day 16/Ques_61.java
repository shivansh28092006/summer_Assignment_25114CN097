// Write a program to Find Missing Number in Array.

import java.util.Scanner;

public class Ques_61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" please Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find the missing number
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int i = 0; i < n; i++) {
            actualSum += arr[i];
        }

        int missingNumber = expectedSum - actualSum;

        System.out.println("Missing number is: " + missingNumber);

    }
}
