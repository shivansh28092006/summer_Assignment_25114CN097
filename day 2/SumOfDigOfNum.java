// Write a program to find the sum of digits of a number.

import java.util.Scanner;

public class SumOfDigOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        while (num > 0) {
            sum += num % 10; // Add the last digit to the sum
            num /= 10; // Remove the last digit
        }
        System.out.println("The sum of the digits is: " + sum);
    }
    
}
