// Write a program to Find Maximum Occurring Character.

import java.util.Scanner;

public class Ques_92 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        int maxCount = 0;
        char maxChar = ' ';

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxChar = arr[i];
            }
        }

        if (maxCount > 1) {
            System.out.println("Maximum occurring character: " + maxChar + " with count: " + maxCount);
        } else {
            System.out.println("No repeating characters found.");
        }
    }

    
}
