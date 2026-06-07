// Write a program to Recursive reverse number.

import java.util.Scanner;

public class RecursiveRevNum {
    static int revNum = 0;

    public static int reverseNumber(int num) {
        if (num==0) {
            return revNum;
        }
        else{
            revNum = revNum*10 + num%10;
            return reverseNumber(num/10);

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Reversed number: " + reverseNumber(num));
    }
}