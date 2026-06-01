import java.util.Scanner;    
public class CountDigNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to count its digits: ");
        int n = scanner.nextInt();
        int count = 0;

        while (n != 0) {
            n /= 10;
            count++;
        }

        System.out.println("Number of digits in the given number is: " + count);
    }
}
