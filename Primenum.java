import java.util.Scanner;
public class Primenum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get the range of numbers from the user
        System.out.println("Enter the starting number:");
        int start = scanner.nextInt();
        System.out.println("Enter the ending number:");
        int end = scanner.nextInt();
        // Print the prime numbers in the given range
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}