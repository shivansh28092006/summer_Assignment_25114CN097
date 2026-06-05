//Write a program to find the largest prime factor of a given number.

import java.util.Scanner;

public class LargePrimeFactor {
     public static void main(String args[]) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();
        int a=0;
        
        for(int i=1;i<=n-1;i++)
        {
            
            if(n%i==0)
            {
                a=i;
            }
                
        
    }
    System.out.println("the largest prime factor is:" +a);
    }
}