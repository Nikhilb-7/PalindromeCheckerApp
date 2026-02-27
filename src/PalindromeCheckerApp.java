/*
@author Nikhil
@version 1.0
Created class as PalindromeCheckerApp
Application entry point for UC10
Checks Palindrome by using Case-Insensitive & Space-Ignored
*/
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "A man a plan a canal Panama";
        System.out.println("Input : " + input);
        String normalised = input.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        boolean isPalindrome = true;
        for (int i = 0; i < normalised.length() / 2; i++) {
            if (normalised.charAt(i) != normalised.charAt(normalised.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}