// Write a program to Count Vowels and Consonants.

import java.util.Scanner;

public class Ques_83 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        int vowel = 0;
        int consonant= 0;
        for (int i=0;i<str.length();i++) {
            char ch=str.toLowerCase().charAt(i);
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                vowel++;
            } 
            else if (ch >= 'a' && ch <= 'z') {
                consonant++;
            }
        }

        System.out.println("Number of vowels: " + vowel);
        System.out.println("Number of consonants: " + consonant);
    }
}
