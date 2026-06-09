/*   Write a program to Print repeated character pattern. 
     A 
     B B 
     C C C 
     D D D D 
     E E E E E

*/
import java.util.Scanner;

public class RepeatedCharPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        char ch=65;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print(ch + " ");
                
            }
            ch++;
            System.out.println();
        }
    }
    
}
