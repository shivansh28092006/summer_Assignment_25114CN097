//write a program to find LCM of two numbers.

import java.util.Scanner;
public class LcmOfTwoNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();
        int lcm = lcm(a, b);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }

    public static int lcm(int x, int y) {
        return (x * y) / gcd(x, y);
    }

    public static int gcd(int x, int y) {
        if (y == 0)
            return x;
        return gcd(y, x % y);
    }
    
}
