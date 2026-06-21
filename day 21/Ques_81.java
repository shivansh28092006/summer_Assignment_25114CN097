// Write a program to Find String Length without length().

import java.util.Scanner;

public class Ques_81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        int length = 0;
        for (char c : str.toCharArray()) {
            length++;
        }
        System.out.println("Length of the string: " + length);
    }
}