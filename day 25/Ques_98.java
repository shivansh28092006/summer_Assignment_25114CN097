// Write a program to Find Common Characters in Strings.

import java.util.Scanner;

public class Ques_98 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for first string
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();

        // Input for second string
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();

        // Finding common characters
        String commonChars = findCommonCharacters(str1, str2);

        // Displaying the common characters
        System.out.println("Common Characters: " + commonChars);
    }

    public static String findCommonCharacters(String str1, String str2) {
        StringBuilder common = new StringBuilder();
        boolean[] charSet = new boolean[256]; // Assuming ASCII character set

        // Mark characters present in the first string
        for (char c : str1.toCharArray()) {
            charSet[c] = true;
        }

        // Check for common characters in the second string
        for (char c : str2.toCharArray()) {
            if (charSet[c]) {
                common.append(c);
                charSet[c] = false; // Avoid duplicates
            }
        }

        return common.toString();
    }
}
