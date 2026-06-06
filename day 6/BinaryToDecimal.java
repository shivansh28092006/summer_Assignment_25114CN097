//Write a program to Convert decimal to binary.

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Binary Number: ");
        int binary = sc.nextInt();
        int decimal = 0;
        int base = 1;
        while (binary > 0) {
            int lastDigit = binary % 10;
            decimal += lastDigit * base;
            base *= 2;
            binary /= 10;
        }
        System.out.println("Decimal Number is : " + decimal);
    }
}
