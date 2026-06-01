// Write a program to reverse a number.

import java.util.Scanner;

public class ReverseNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int num = scanner.nextInt();
        int i = 0;

        while (num > 0) {
            int lastDigit = num % 10; // Get the last digit
            i = i * 10 + lastDigit; // Append the last digit to the reversed number
            num /= 10; // Remove the last digit
        }

        System.out.println("Reversed Number: " + i);
    }
}