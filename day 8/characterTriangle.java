/* Write a program to Print character triangle. 
    A 
    A B 
    A B C 
    A B C D 
    A B C D E 

*/

import java.util.Scanner;

public class characterTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the character triangle: ");
        int rows = sc.nextInt();
        for(int i=1;i<=rows;i++){
            char ch=65;
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.print("\n");

        }
        
    }
    
}
