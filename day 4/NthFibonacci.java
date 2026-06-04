import java.util.Scanner;

public class NthFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the position of the Fibonacci number to display: ");
        int n = scanner.nextInt();
        System.out.println("The " + n + "th Fibonacci number is: " + fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}