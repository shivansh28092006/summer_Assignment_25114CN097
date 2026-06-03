// Write a program to find GCD of two numbers.

import java.util.Scanner;
public class GcdOfTwoNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Please enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Please enter the second number: ");
        int b = scanner.nextInt();
        int gcd = gcd(a, b);
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
    }

    public static int gcd(int x, int y) {
        if (y == 0)
            return x;
        return gcd(y, x % y);
    }

    
}
