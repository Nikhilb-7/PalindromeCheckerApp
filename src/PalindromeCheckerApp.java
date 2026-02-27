/*
@author Nikhil
@version 1.0
Created class as PalindromeCheckerApp
Application entry point for UC11
Checks Palindrome by using Object-Oriented Palindrome Service
*/
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "racecar";
        System.out.println("Input : " + input);
        int start=0;
        int end=input.length()-1;
        boolean isPalindrome=true;
        while(start<end){
            if (input.charAt(start) != input.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}