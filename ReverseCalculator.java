import java.util.Scanner;

public class ReverseCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Reverse the number using while loop
        int reversedNumberWhile = 0;
        int originalNumberWhile = number;
        while (originalNumberWhile != 0) {
            int digit = originalNumberWhile % 10;
            reversedNumberWhile = reversedNumberWhile * 10 + digit;
            originalNumberWhile /= 10;
        }
        
        // Reverse the number using for loop
        int reversedNumberFor = 0;
        int originalNumberFor = number;
        for (; originalNumberFor != 0; originalNumberFor /= 10) {
            int digit = originalNumberFor % 10;
            reversedNumberFor = reversedNumberFor * 10 + digit;
        }
        
        // Reverse the number using do-while loop
        int reversedNumberDoWhile = 0;
        int originalNumberDoWhile = number;
        do {
            int digit = originalNumberDoWhile % 10;
            reversedNumberDoWhile = reversedNumberDoWhile * 10 + digit;
            originalNumberDoWhile /= 10;
        } while (originalNumberDoWhile != 0);
        
        // Output the results
        System.out.println("Output(while loop):");
        System.out.println("Reversed number (while loop): " + reversedNumberWhile);
        
        System.out.println("\nOutput(for loop):");
        System.out.println("Reversed number (for loop): " + reversedNumberFor);
        
        System.out.println("\nOutput(do-while loop):");
        System.out.println("Reversed number (do-while loop): " + reversedNumberDoWhile);
        
        scanner.close();
    }
}
