// Q39 Write a program to Print number pyramid.
//     1
//    121
//   12321
//  1234321
// 123454321


import java.util.Scanner;

public class NumPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            for (int num = 1; num <= i; num++)
                System.out.print(num);
            for (int num = i - 1; num >= 1; num--)
                System.out.print(num);
            System.out.println();
        }
    }
    
}
