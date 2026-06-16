// Q40 Write a program to Print character pyramid.
//       A
//      ABA
//     ABCBA
//    ABCDCBA
//   ABCDEDCBA


import java.util.Scanner;

public class CharPyramid {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of rows: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            for (char ch = 65; ch < 65 + i; ch++)
                System.out.print(ch);
            for (char ch = (char) (65 + i - 2); ch >= 65; ch--)
                System.out.print(ch);
            System.out.println();
        }
        
    }
    
}
