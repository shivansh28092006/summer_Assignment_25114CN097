// Write a program to Convert decimal to binary.

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Decimal Number: ");
        int decimal = sc.nextInt();
        String binary = "";
        while (decimal > 0) {
            int lastDigit = decimal % 2;
            binary = lastDigit + binary;
            decimal /= 2;
        }
        System.out.println("Binary Number: " + binary);
    }
    
}
