/*
@author Nikhil
@version 1.0
Created class as PalindromeCheckerApp
Application entry point for UC2
Checks Palindrome by using for loop in reverse method
*/
public class PalindromeCheckerApp {
    public static void main (String[] args) {
        String input = "madam";
        System.out.println("Input text: "+input);
        boolean isPalindrome = true;
        for (int i = input.length()-1; i >=0; i--) {
            if (isPalindrome) {
                System.out.println("Is it a Palindrome? : true");
                break;
            } else {
                System.out.println("Is it a Palindrome? : false");
            }
        }
    }
}
