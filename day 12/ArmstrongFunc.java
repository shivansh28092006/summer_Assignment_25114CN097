// write a program to write function for armstrong number.

import java.util.Scanner;

public class ArmstrongFunc {

    // Function to check armstrong number
    static void checkArmstrong(int num) {
        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }

        if (original == sum) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        checkArmstrong(num);

    }
}
