// Write a program to check whether a number is a palindrome or not.

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a number: ");
        int num = sc.nextInt();
        int originalNum = num;
        int i = 0;

        while (num > 0) {
            i = i * 10 + num % 10;
            num /= 10;
        }

        if (originalNum == i) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }
    }
}