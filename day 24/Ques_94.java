// write a program to compress a string.

import java.util.Scanner;

public class Ques_94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        StringBuilder compressed = new StringBuilder();

        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i));
                compressed.append(count);
                count = 1;
            }
        }

        String compressedStr = compressed.toString();
        if (compressedStr.length() < str.length()) {
            System.out.println("Compressed string: " + compressedStr);
        } else {
            System.out.println("Compressed string is not shorter than the original string.");
        }
    }
}