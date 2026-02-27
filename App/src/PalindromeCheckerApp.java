// Version 2.0
// Branch: UC2-HardCodePalindrome
// UseCase: Hardcoded String Palindrome

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker App");

        String input = "madam";
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        System.out.println("Given String: " + input);

        if (input.equalsIgnoreCase(reversed)) {
            System.out.println("Result: It is a Palindrome ✅");
        } else {
            System.out.println("Result: It is NOT a Palindrome ❌");
        }
    }
}