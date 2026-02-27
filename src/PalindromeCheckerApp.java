/*
@author Nikhil
@version 1.0
Created class as PalindromeCheckerApp
Application entry point for UC13
Checks Palindrome by using Performance Comparison
*/
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "level";
        long startTime = System.nanoTime();
        boolean result = true;
        int left = 0;
        int right = input.length() - 1;
        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                result = false;
                break;
            }
            left++;
            right--;
        }
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
        System.out.println("Execution Time : "+executionTime+" ns");
    }
}