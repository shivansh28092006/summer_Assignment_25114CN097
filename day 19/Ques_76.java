// Write a program to Find diagonal sum. 

import java.util.Scanner;

public class Ques_76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns: ");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Finding the sum of  diagonal elements
        int Sum = 0;
        for (int i = 0; i < n; i++) {
            Sum += arr[i][i];
        }

        System.out.println("Sum of diagonal elements: " + Sum);
    }
}
