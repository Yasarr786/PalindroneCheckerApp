// Version 3.0
// Branch: UC3-NumberPalindrome
// UseCase: Number Palindrome

import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Palindrome Checker App");
        System.out.print("Enter a number: ");

        int number = scanner.nextInt();
        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number = number / 10;
        }

        if (originalNumber == reversedNumber) {
            System.out.println("Result: It is a Palindrome Number ✅");
        } else {
            System.out.println("Result: It is NOT a Palindrome Number ❌");
        }

        scanner.close();
    }
}