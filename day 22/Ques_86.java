// write a program to count words in a sentence.

import java.util.Scanner;

public class Ques_86 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        System.out.println("Number of words: " + words.length);
    }
    
}
