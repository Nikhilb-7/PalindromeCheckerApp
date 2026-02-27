import java.util.*;

/*
@author Nikhil
@version 1.0
Created class as PalindromeCheckerApp
Application entry point for UC7
Checks Palindrome by using Deque-Based Optimized
*/
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "refer";
        System.out.println("Input : " + input);
        Deque<Character> deque=new ArrayDeque<>();
        for (char c :input.toCharArray()){
            deque.addLast(c);
        }
        boolean isPalindrome = true;
        while (deque.size()>1){
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
