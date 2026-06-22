// write a program to remove spaces from string.

import java.util.Scanner;

public class Ques_88 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string:");
        String str = sc.nextLine();
        String noSpaces = str.replaceAll(" ", "");
        System.out.println("String without spaces: " + noSpaces);
    }
    
}
