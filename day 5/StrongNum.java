// Write a program to Check strong number. n = in.nextInt();

import java.util.Scanner;
public class StrongNum {
    public static void main(String args[]) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();
        int sum=0;
        int temp=n;
        
        while(temp>0)
        {
            int rem=temp%10;
            int fact=1;
            for(int i=1;i<=rem;i++)
            {
                fact=fact*i;
            }
            sum=sum+fact;
            temp=temp/10;
        }
        if(sum==n)
        {
            System.out.println("The number is a strong number");
        }
        else
        {
            System.out.println("The number is not a strong number");
        }
    }
}
