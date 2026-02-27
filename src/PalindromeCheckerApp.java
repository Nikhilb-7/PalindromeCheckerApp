/*
@author Nikhil
@version 1.0
Created class as PalindromeCheckerApp
Application entry point for UC2
Checks Palindrome by using for loop in reverse method
*/
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "radar";
        System.out.println("Input : " + input);
        char[] chars = input.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        boolean isPalindrome = true;
        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
