import java.util.Stack;

/*
@author Nikhil
@version 1.0
Created class as PalindromeCheckerApp
Application entry point for UC2
Checks Palindrome by using for loop in reverse method
*/
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "noon";
        System.out.println("Input : " + input);
        Stack<Character> stack=new Stack<>();
        for (char c :input.toCharArray()){
            stack.push(c);
        }
        boolean isPalindrome = true;
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
