// Write a program to Print prime numbers in a range.

import java.util.Scanner;

public class PrimeNumRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the start range ");
        int start = sc.nextInt();
        System.out.print("Enter the end range");
        int end = sc.nextInt();
        for (int n = start; n <= end; n++) {
            if (n <= 1)
                continue;
            int c = 0;
            for (int i = 1; i * i <= n; i++) {
                if (n % i == 0) {
                    if (i == n / i)
                        c += 1;
                    else
                        c += 2;
                }
            }
             if (c == 2)
                    System.out.print(n + " ");
        }
    }
}
        
    

