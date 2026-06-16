// write a program to write function for perfect number.

import java.util.Scanner;

public class PerfectNumFunc {

    // Function to check perfect number
    static void checkPerfect(int num) {
        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        if (sum == num) {
            System.out.println("Perfect number");
        } else {
            System.out.println("Not a perfect number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        checkPerfect(num);

    }

}