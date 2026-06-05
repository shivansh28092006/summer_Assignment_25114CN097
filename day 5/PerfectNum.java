import java.util.Scanner;
public class PerfectNum {
    public static void main(String args[]) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();
        int sum=0;
        
        for(int i=1;i<=n-1;i++)
        {
            
            if(n%i==0)
            {
                sum=sum+i;
            }
                
        }
        if(sum==n){
            System.out.println("The number is a perfect number");
        }
         else{
            System.out.println("The number is not a perfect number");
        }
        
    }  
}
