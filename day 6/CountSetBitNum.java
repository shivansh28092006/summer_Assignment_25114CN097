// Write a program to Count set bits in a number.

import java.util.Scanner;

public class CountSetBitNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Decimal Number: ");
        int n = sc.nextInt();
        int c = 0;
        while (n > 0) {
            c += n % 2;
            n /= 2;
        }
        System.out.println("Set Bits = " + c);
    }
}
