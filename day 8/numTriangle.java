/* Write a program to Print number triangle. 
    1 
    1 2 
    1 2 3 
    1 2 3 4 
    1 2 3 4 5
 */

import java.util.Scanner;

public class numTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the number triangle: ");
        int rows = sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.print("\n");

        }
        
    }
    
}
