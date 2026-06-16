// write a program to write function for fibonacci series.

import java.util.Scanner;

public class FibonacciFunc {

    // Function to print Fibonacci series
    static void printFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        printFibonacci(n);
    }
    
}
