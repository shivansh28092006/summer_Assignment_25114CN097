// Write a program to find the product of digits of a number.

import java.util.Scanner;

public class ProductOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int i = 1;
        while (num > 0) {
            i *= num % 10; // Multiply the last digit with the product
            num /= 10; // Remove the last digit
        }
        System.out.println("The product of the digits is: " + i);
    }
}

