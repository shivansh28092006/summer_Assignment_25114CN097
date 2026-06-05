//Write a program to Print factors of a number.

import java.util.Scanner;
public class FactorOfNum {
    public static void main(String args[]) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();
        
        for(int i=1;i<=n-1;i++)
        {
            
            if(n%i==0)
            {
                System.out.println(i);
            }
                
        
    }
    
}
}
